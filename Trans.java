import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

class CTX {
    static private Map<ParserRuleContext, Map<String, List<String>>> context = new HashMap<ParserRuleContext, Map<String, List<String>>>();
    static private Map<ParserRuleContext, List<String>> cache = new HashMap<ParserRuleContext, List<String>>();

    static public void create(ParserRuleContext ctx) {
        if(context.get(ctx) == null) {
            context.put(
                    ctx,
                    new HashMap<String, List<String>>());
            System.out.printf("Created context %s%s\n", ctx.getClass().getSimpleName(), ctx);
        }
    }

    static public void register(ParserRuleContext ctx, String key, List<String> types) {
        Map<String, List<String>> kv = getContext(ctx);
        if(kv.containsKey(key)) {
            throw new RuntimeException(String.format("\n\tLine %d: %s is already defined\n", ctx.getStart().getLine(), key));
        }
        kv.put(key, types);
        System.out.printf("Defined %s as %s\n", key, types);
    }

    static public List<String> query(ParserRuleContext ctx, String key) {
        Map<String, List<String>> kv = getContext(ctx);
        List<String> ls = kv.get(key);
        if(ls == null) {
            throw new RuntimeException(String.format("%s is not defined yet", key));
        }
        return ls;
    }

    static private Map<String, List<String>> getContext(ParserRuleContext ctx) {
        ParserRuleContext _ctx = ctx;
        do {
            if(context.containsKey(_ctx)) {
                return context.get(_ctx);
            }
        } while((_ctx = _ctx.getParent()) != null);
        throw new RuntimeException(String.format("Failed to find context for %s", ctx));
    }


    static public void newCache(ParserRuleContext ctx) {
        if(cache.containsKey(ctx)) {
            throw new RuntimeException(String.format("%s has already created cache \"%s\"", ctx.getClass().getSimpleName(), cache.get(ctx)));
        }
        List<String> ls = new ArrayList<String>();
        cache.put(ctx, ls);
    }

    static public List<String> dumpCache(ParserRuleContext ctx) {
        List<String> ls = cache.get(ctx);
        if(ls == null) {
            throw new RuntimeException(String.format("Failed to find cache %s", ctx.getClass().getSimpleName()));
        }
        return ls;
    }

    static public void submitText(ParserRuleContext ctx, String msg) {
        ParseTree _ctx = ctx.getParent();
        do {
            if(cache.containsKey(_ctx)) {
                cache.get(_ctx).add(msg);
                return;
            }
        } while((_ctx = _ctx.getParent()) != null);
        throw new RuntimeException(String.format("Failed to find cache for %s", ctx.getClass().getSimpleName()));
    }
}

class Util {
    static public boolean isChar(String key) {
        return key.startsWith("\"") && key.endsWith("\"");
    }

    static public boolean isInt(String key) {
        try {
            String _key = key.toLowerCase();
            if(_key.startsWith("0x")) {
                Integer.parseInt(_key.substring(2), 16);
            } else {
                Integer.valueOf(_key);
            }
            return true;
        } catch(Exception e) {
            //empty 
        }
        return false;
    }

    static public void checkInt(ParserRuleContext ctx, String key) {
        if(isInt(key)) {
            return;
        }

        if(isChar(key)) {
            throw new RuntimeException(String.format("%s is a string other than integer in %s", key, ctx.getClass().getSimpleName()));
        }

        List<String> tt = null;
        try {
            tt = CTX.query(ctx, key);
        } catch(Exception e2) {
            try {
                CTX.query(ctx, "(" + key);
            } catch(Exception e3) {
                throw new RuntimeException(String.format("\"%s\" is undefined in %s", key, ctx.getClass().getSimpleName()));
            }
            throw new RuntimeException(String.format("Function \"%s\" is not properly called %s", key, ctx.getClass().getSimpleName()));
        } 
        if(! "int".equals(tt.get(0))) {
            throw new RuntimeException(String.format("Incompatible %s variable %s is assigned to int type", tt.get(0), key));
        } 
    }

    static public void checkStr(ParserRuleContext ctx, String key) {
        if(isChar(key)) {
            return;
        } 

        if(isInt(key)) {
            throw new RuntimeException(String.format("%s is an integer other than string in %s", key, ctx.getClass().getSimpleName()));
        }

        List<String> tt = null;
        try {
            tt = CTX.query(ctx, key);
        } catch(Exception e2) {
            try {
                CTX.query(ctx, "(" + key);
            } catch(Exception e3) {
                throw new RuntimeException(String.format("\"%s\" is undefined in %s", key, ctx.getClass().getSimpleName()));
            }
            throw new RuntimeException(String.format("Function \"%s\" is not properly called %s", key, ctx.getClass().getSimpleName()));
        } 
        if(! "char".equals(tt.get(0))) {
            throw new RuntimeException(String.format("Incompatible %s variable %s is assigned to char type", tt.get(0), key));
        } 
    }
}

class CtfListener extends ctfBaseListener{
    @Override public void enterCompilationUnit(ctfParser.CompilationUnitContext ctx) {
        CTX.create(ctx);
    }
    @Override public void enterMethodDeclaration(ctfParser.MethodDeclarationContext ctx) { 
        String key = "(" + ctx.IDENTIFIER().getText();
        List<String> types = new ArrayList<String>();
        types.add(ctx.typeTypeOrVoid().getText());
        if(ctx.formalParameters().formalParameterList() != null) {
            for(ctfParser.FormalParameterContext _ctx : ctx.formalParameters().formalParameterList().formalParameter()) {
                types.add(_ctx.primitiveType().getText());
            }
        }

        CTX.register(ctx, key, types);
        CTX.create(ctx);

        if(ctx.formalParameters().formalParameterList() != null) {
            for(ctfParser.FormalParameterContext _ctx : ctx.formalParameters().formalParameterList().formalParameter()) {
                String type = _ctx.primitiveType().getText();
                String id = _ctx.variableDeclaratorId().id.getText();
                if(id.equals(_ctx.variableDeclaratorId().getText())) {
                    CTX.register(_ctx, id, Arrays.asList(type));
                } else {
                    CTX.register(_ctx, id, Arrays.asList("[" + type));
                }
            }
        }
    }

    @Override public void enterMethodCall(ctfParser.MethodCallContext ctx) {
        String id = "(" + ctx.IDENTIFIER().getText();
        CTX.submitText(ctx, id);

        CTX.newCache(ctx);
    }

    @Override public void exitMethodCall(ctfParser.MethodCallContext ctx) { 
        String id = "(" + ctx.IDENTIFIER().getText();
        List<String> types = new ArrayList<String>(CTX.query(ctx, id)); // must copy
        types.remove(0);    // remove return type of the method
        List<String> tt = CTX.dumpCache(ctx); 

        if(types.size() != tt.size()) {
            throw new RuntimeException(String.format("Incorrect number of arguments supplied to %s(%s)\n", id, types.toString().replace("[", "").replace("]", "")));
        }

        for(int i = 0; i < types.size(); i++) {
            switch(types.get(i)) {
                case "int":
                    Util.checkInt(ctx, tt.get(i));
                    break;
                case "char":
                    Util.checkStr(ctx, tt.get(i));
                    break;
                default:
                    throw new RuntimeException(String.format("____Unsupported type check for %s in %s\n", types.get(i), ctx.getClass().getSimpleName()));
            }
        }

    }


    @Override public void enterStatement(ctfParser.StatementContext ctx) { 
        CTX.newCache(ctx);
    }

    @Override public void enterExpression(ctfParser.ExpressionContext ctx) { 
        CTX.newCache(ctx);
    }

    @Override public void exitExpression(ctfParser.ExpressionContext ctx) { 
        List<String> ids = CTX.dumpCache(ctx);
        String preTyp = "";
        String curTyp = "";
        for(String id : ids) {
            if(Util.isChar(id)) {
                curTyp = "char";
            } else if(Util.isInt(id)) {
                curTyp = "int";
            } else {
                curTyp = CTX.query(ctx, id).get(0);
            }

            if(preTyp.isEmpty()) {
                preTyp = curTyp;
            }

            if(! preTyp.equals(curTyp)) {
                throw new RuntimeException(String.format("Variable %s has an unique type %s other than %s in %s\n", id, curTyp, preTyp, ctx.getText()));
            } 
        }

        if("char".equals(preTyp)) {
            if(ids.size() > 1) {
                throw new RuntimeException(String.format("Can not connect string from %s\n", ids));
            }
        }

        CTX.submitText(ctx, ids.get(0));
    }

    @Override public void enterVariableDeclaration(ctfParser.VariableDeclarationContext ctx) { 
        String type = ctx.primitiveType().getText();
        String id = ctx.variableDeclaratorId().id.getText();
        if(id.equals(ctx.variableDeclaratorId().getText())) {
            CTX.register(ctx, id, Arrays.asList(type));
        } else {
            CTX.register(ctx, id, Arrays.asList("[" + type));
        }

        CTX.newCache(ctx);
    }
    @Override public void exitVariableDeclaration(ctfParser.VariableDeclarationContext ctx) {
        List<String> syms = CTX.dumpCache(ctx);

        String id = ctx.variableDeclaratorId().id.getText();
        String type = CTX.query(ctx, id).get(0);
        switch(type) {
            case "int":
                for(String key : syms) {
                    Util.checkInt(ctx, key);
                }
                break;
            case "char":
                if(syms.size() > 1) {
                    throw new RuntimeException(String.format("Can not connect string from %s\n", syms));
                }
                for(String key : syms) {
                    Util.checkStr(ctx, key);
                }
                break;
            default:
                throw new RuntimeException(String.format("Unsupported type check for %s\n", type));

        }
    }

    @Override public void enterPrimary(ctfParser.PrimaryContext ctx) {
        if(ctx.literal() != null) { 
            CTX.submitText(ctx, ctx.literal().getText());
        }
        if(ctx.IDENTIFIER() != null) { 
            CTX.submitText(ctx, ctx.IDENTIFIER().getText());
        }
    }

    @Override public void visitTerminal(TerminalNode node) { 
        //System.out.println(node.getText());
    }

    @Override public void enterVariableInitializer(ctfParser.VariableInitializerContext ctx) { 
    }

    @Override public void visitErrorNode(ErrorNode node) {
        CommonToken tk = (CommonToken)node.getPayload();
        throw new RuntimeException(String.format("Syntax error at Line %d\n", tk.getLine()));
    }
}


public class Trans{
    public static void main(String[] args) {

        try {
            CharStream ctf = fromFileName("A.java");  //load the file
            ctfLexer lexer = new ctfLexer(ctf);  //instantiate a lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
            ctfParser parser = new ctfParser(tokens);  //parse the tokens

            ctfParser.CompilationUnitContext tree = parser.compilationUnit(); // parse a compilationUnit
            CtfListener listener = new CtfListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}

