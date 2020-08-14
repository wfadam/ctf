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
    static private Map<ParserRuleContext, Map<String, Integer>> arrayLen = new HashMap<ParserRuleContext, Map<String, Integer>>();
    static private Map<ParserRuleContext, List<String>> cache = new HashMap<ParserRuleContext, List<String>>();

    final public static void create(ParserRuleContext ctx) {
        if(context.get(ctx) == null) {
            context.put(
                    ctx,
                    new HashMap<String, List<String>>());
            arrayLen.put(
                    ctx,
                    new HashMap<String, Integer>());
            //System.out.printf("Created context %s%s\n", ctx.getClass().getSimpleName(), ctx);
        }
    }

    final public static void register(ParserRuleContext ctx, String key, List<String> types) {
        Map<String, List<String>> kv = getContext(ctx);
        if(kv.containsKey(key)) {
            throw new RuntimeException(String.format("\n\tLine %d: %s is already defined", ctx.getStart().getLine(), key));
        }
        kv.put(key, types);
        //System.out.printf("Defined %s as %s\n", key, types);
    }

    final public static void registerLength(ParserRuleContext ctx, String key, int len) {
        Map<String, Integer> kv = arrayLen.get(getCover(ctx));
        if(kv.containsKey(key)) {
            throw new RuntimeException(String.format("\n\tLine %d: %s is already defined with length", ctx.getStart().getLine(), key));
        }
        kv.put(key, len);
        //System.out.printf("Recorded %s with length %d\n", key, len);
    }

    final private static List<String> unboxType(List<String> ls, String cover) {
        List<String> __ls = new ArrayList<String>(ls);
        String type = __ls.get(0);
        if(type.startsWith(cover)) {
            __ls.set(0, type.substring(1));
            return __ls;
        }
        throw new RuntimeException(String.format("unboxing invalid %s type", type));
    }

    final public static List<String> query(ParserRuleContext ctx, String key) {
        Map<String, List<String>> kv = getContext(ctx);

        // for variables
        List<String> ls = kv.get(key);
        if(ls != null) {
            return new ArrayList<String>(ls); //defensive copy
        }

        // for arrays and functions
        ls = kv.get(key.substring(1));  
        if(ls != null) {
            switch(key.substring(0, 1)) {
                case "(": return unboxType(ls, "(");
                case "[": return unboxType(ls, "[");
                default: break;
            }
        }

        throw new RuntimeException(String.format("\n\tLine %d: %s is not defined yet", ctx.getStart().getLine(), key));
    }

    static public Integer queryLength(ParserRuleContext ctx, String key) {
        query(ctx, key);
        Map<String, Integer> kv = arrayLen.get(getCover(ctx));
        if(! kv.containsKey(key)) {
            throw new RuntimeException(String.format("%s is not recored length yet", key));
        }
        return kv.get(key);
    }

    static private ParserRuleContext getCover(ParserRuleContext ctx) {
        ParserRuleContext _ctx = ctx;
        do {
            if(context.containsKey(_ctx)) {
                return _ctx;
            }
        } while((_ctx = _ctx.getParent()) != null);
        throw new RuntimeException(String.format("Failed to find context for %s", ctx));
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

    // --------------------------------------------------------------- //

    static public void newCache(ParserRuleContext ctx) {
        if(cache.containsKey(ctx)) {
            throw new RuntimeException(String.format("%s has already created cache \"%s\"", ctx.getText(), cache.get(ctx)));
        }
        List<String> ls = new ArrayList<String>();
        cache.put(ctx, ls);
    }

    static public void newCache(ParserRuleContext ctx, String id) {
        if(cache.containsKey(ctx)) {
            throw new RuntimeException(String.format("%s has already created cache \"%s\"", ctx.getText(), cache.get(ctx)));
        }
        List<String> ls = new ArrayList<String>();
        ls.add(id);
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
                //Util.pp("submitText by %s with %s\n", ctx.getClass(), msg);
                return;
            }
        } while((_ctx = _ctx.getParent()) != null);
        throw new RuntimeException(String.format("Failed to find cache for %s", ctx.getClass().getSimpleName()));
    }

}

class Util {
    final public static boolean isChar(String key) {
        return key.startsWith("\"") && key.endsWith("\"");
    }

    final public static boolean isInt(String key) {
        try {
            String _key = key.toLowerCase();
            if(_key.startsWith("0x")) {
                Integer.parseInt(_key.substring(2), 16);
            } else {
                Integer.valueOf(_key);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    final public static int toInt(String key) {
        String _key = key.toLowerCase();
        if(_key.startsWith("0x")) {
            return Integer.parseInt(_key.substring(2), 16);
        } else {
            return Integer.valueOf(_key);
        }
    }

    final public static void checkInt(ParserRuleContext ctx, String expTyp, String key) {
        String errmsg = String.format("%s is assigned to %s type in %s", key, expTyp, ctx.getText());
        if(isChar(key)) {
            throw new RuntimeException(errmsg);
        }

        if(isInt(key)) { 
            if(! "int".equals(expTyp)) {
                throw new RuntimeException(errmsg);
            }
        } else {
            List<String> tt = CTX.query(ctx, key);
            if(! expTyp.equals(tt.get(0))) {
                throw new RuntimeException(String.format("%s with %s type is assigned to %s type in %s", key, tt.get(0), expTyp, ctx.getText()));
            }
        }
    }

    final public static void checkStr(ParserRuleContext ctx, String expTyp, String key) {
        String errmsg = String.format("%s is assigned to %s type in %s", key, expTyp, ctx.getText());
        if(isInt(key)) {
            throw new RuntimeException(errmsg);
        }

        if(isChar(key)) { 
            if(! "char".equals(expTyp)) {
                throw new RuntimeException(errmsg);
            }
        } else {
            List<String> tt = CTX.query(ctx, key);
            if(! expTyp.equals(tt.get(0))) {
                throw new RuntimeException(String.format("%s with %s type is assigned to %s type in %s", key, tt.get(0), expTyp, ctx.getText()));
            } 
        }
    }

    final public static void pp(String fmt, Object...args) {
        if(args.length > 0) System.out.printf(fmt, args);
        else System.out.println(fmt);
    }

    final public static void pp(Object obj) {
        System.out.println(obj);
    }

}

class CtfListener extends ctfBaseListener{
    @Override public void enterCompilationUnit(ctfParser.CompilationUnitContext ctx) {
        CTX.create(ctx);
    }
    @Override public void enterMethodDeclaration(ctfParser.MethodDeclarationContext ctx) { 
        String key = ctx.IDENTIFIER().getText();
        List<String> types = new ArrayList<String>();
        types.add("(" + ctx.typeTypeOrVoid().getText());
        if(ctx.formalParameters().formalParameterList() != null) {
            for(ctfParser.FormalParameterContext _ctx : ctx.formalParameters().formalParameterList().formalParameter()) {
                String type = _ctx.primitiveType().getText();
                String id = _ctx.variableDeclaratorId().IDENTIFIER().getText();
                if(id.equals(_ctx.variableDeclaratorId().getText())) {
                    types.add(type);
                } else {
                    types.add("[" + type);
                }
            }
        }

        CTX.register(ctx, key, types);
        CTX.create(ctx);

        if(ctx.formalParameters().formalParameterList() != null) {
            for(ctfParser.FormalParameterContext _ctx : ctx.formalParameters().formalParameterList().formalParameter()) {
                String type = _ctx.primitiveType().getText();
                String id = _ctx.variableDeclaratorId().id.getText();
                if(! id.equals(_ctx.variableDeclaratorId().getText())) {
                    type = "[" + type;
                } 
                CTX.register(_ctx, id, Arrays.asList(type));
            }
        }

        if(! types.get(0).endsWith("void")) {
            List<ctfParser.BlockStatementContext> stmts = ctx.methodBody().block().blockStatement();
            if(stmts.size() > 0) {
                ctfParser.StatementContext obj = stmts.get(stmts.size() - 1).statement();
                if(obj != null && obj.RETURN() != null) {
                    CTX.newCache(obj, types.get(0));
                } else {
                    throw new RuntimeException(String.format("Missing return statement in function %s\n", key));
                }
            }
        }
    }

    @Override public void exitMethodDeclaration(ctfParser.MethodDeclarationContext ctx) { 
        String key = ctx.IDENTIFIER().getText();
        List<String> types = CTX.query(ctx.getParent(), key);
        if(! types.get(0).endsWith("void")) {
            List<ctfParser.BlockStatementContext> stmts = ctx.methodBody().block().blockStatement();
            if(stmts.size() > 0) {
                ctfParser.StatementContext obj = stmts.get(stmts.size() - 1).statement();
                if(obj != null && obj.RETURN() != null) {
                    List<String> ids = CTX.dumpCache(obj);
                    String preTyp = ids.get(0);
                    ids.remove(0);
                    String curTyp = "";
                    for(String id : ids) {
                        if(Util.isChar(id)) {
                            curTyp = "char";
                        } else if(Util.isInt(id)) {
                            curTyp = "int";
                        } else { // query type for an id
                            curTyp = CTX.query(ctx, id).get(0);
                        }

                        if(! preTyp.endsWith(curTyp)) {
                            throw new RuntimeException(String.format("Returning %s with %s type, but function %s returns %s type", id, curTyp, key, preTyp));
                        } 
                    }
                } 
            }
        }
    }

    @Override public void enterMethodCall(ctfParser.MethodCallContext ctx) {
        CTX.submitText(ctx, "(" + ctx.IDENTIFIER().getText());
        CTX.newCache(ctx);
    }

    @Override public void exitMethodCall(ctfParser.MethodCallContext ctx) { 
        String id = ctx.IDENTIFIER().getText();
        List<String> types = new ArrayList<String>(CTX.query(ctx, id)); // must copy
        types.remove(0);    // remove return type of the method
        List<String> tt = CTX.dumpCache(ctx); 

        if(types.size() != tt.size()) {
            throw new RuntimeException(String.format("Incorrect number of arguments supplied to %s(%s)\n", id, types));
        }

        for(int i = 0; i < types.size(); i++) {
            if(types.get(i).endsWith("int")) {
                Util.checkInt(ctx, types.get(i), tt.get(i));
            }
            if(types.get(i).endsWith("char")) {
                Util.checkStr(ctx, types.get(i), tt.get(i));
            }
        }

    }

    @Override public void enterStatement(ctfParser.StatementContext ctx) { 
        if(ctx.RETURN() == null) {
            CTX.newCache(ctx);
        }
    }

    @Override public void enterExpression(ctfParser.ExpressionContext ctx) { 
        if(ctx.IDENTIFIER() != null) {
            CTX.newCache(ctx, "[" + ctx.IDENTIFIER().getText());
        } else {
            CTX.newCache(ctx);
        }
    }

    @Override public void exitExpression(ctfParser.ExpressionContext ctx) { 
        List<String> ids = CTX.dumpCache(ctx);
        String preTyp = "";
        String preId = "";
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
                preId = id;
            }

            if(! preTyp.equals(curTyp)) {
                throw new RuntimeException(String.format("%s is %s type, incompatible with %s type of %s in %s", id, curTyp, preTyp, preId, ctx.getText()));
            } 
        }

        if("char".equals(preTyp)) {
            if(ctx.assignOp == null && ctx.bop != null) {
                if(ids.size() > 1) {
                    throw new RuntimeException(String.format("Can not connect string from %s in %s", ids, ctx.getText()));
                }
            }
        }

        ParserRuleContext parent = ctx.getParent();
        if(parent.getClass() == ctfParser.ExpressionContext.class) {
            ctfParser.ExpressionContext _parent = (ctfParser.ExpressionContext)parent;
            if(_parent.idx == ctx) {
                if(! "int".equals(preTyp)) {
                    throw new RuntimeException(String.format("Line %d: %s \n\tShould use an integer as the array index\n", ctx.getStart().getLine(), _parent.getText()));
                }

                if(Util.isInt(ctx.getText())) {
                    int initLen = CTX.queryLength(ctx,  _parent.IDENTIFIER().getText());
                    int len = Util.toInt(ctx.getText());
                    if(0 <= len && len < initLen) {
                        //empty
                    } else {
                        throw new RuntimeException(String.format("Line %d: %s \n\tArray index out of range", ctx.getStart().getLine(), _parent.getText()));
                    }
                } else {
                    // skip checking boundary when a variable is used as an index
                }
                return; // avoid index expression to contaminate parent cache 
            }
        }

        CTX.submitText(ctx, ids.get(0));
    }

    @Override public void enterVariableDeclaratorId(ctfParser.VariableDeclaratorIdContext ctx) { 
        CTX.newCache(ctx);  // to avoid array length expression evaluation 
    }

    @Override public void enterVariableDeclaration(ctfParser.VariableDeclarationContext ctx) { 
        String type = ctx.primitiveType().getText();
        String id = ctx.variableDeclaratorId().IDENTIFIER().getText();
        if(id.equals(ctx.variableDeclaratorId().getText())) {
            CTX.register(ctx, id, Arrays.asList(type));
        } else {
            CTX.register(ctx, id, Arrays.asList("[" + type));

            int defLen = 0;
            if(ctx.variableDeclaratorId().expression().size() > 0) {
                try {
                    defLen = Util.toInt(ctx.variableDeclaratorId().expression().get(0).getText());
                } catch(Exception e) {
                    throw new RuntimeException(String.format("%s can not define the length of %s\n", ctx.variableDeclaratorId().expression().get(0).getText(), id));
                }
            }

            int initLen = 0;
            if(ctx.variableInitializer() != null && ctx.variableInitializer().arrayInitializer() != null) {
                initLen = ctx.variableInitializer().arrayInitializer().variableInitializer().size();
            }

            int len = 0;
            if(defLen == 0 && initLen > 0) {        // int arr[] = {3};
                len = initLen;
            } else if(defLen > 0 && initLen == 0) { // int arr[1]; or int arr[1] = {};
                len = defLen;
            } else if(defLen == initLen) {          // int arr[1] = {3};
                len = defLen;
            } else {                                // int arr[1] = {2, 3};
                throw new RuntimeException(String.format("%s[%d] is defined but initialized with %d elements\n", id, defLen, initLen));
            }

            CTX.registerLength(ctx, id, len);
        }

        CTX.newCache(ctx);
    }

    @Override public void exitVariableDeclaration(ctfParser.VariableDeclarationContext ctx) {
        String type = ctx.primitiveType().getText();
        String id = ctx.variableDeclaratorId().IDENTIFIER().getText();
        if(! id.equals(ctx.variableDeclaratorId().getText())) {
            id = "[" + id;
        }

        List<String> syms = CTX.dumpCache(ctx);
        if(type.endsWith("int")) {
            for(String key : syms) {
                Util.checkInt(ctx, type, key);
            }
        } 
        if(type.endsWith("char")) {
            for(String key : syms) {
                Util.checkStr(ctx, type, key);
            }
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

    @Override public void visitErrorNode(ErrorNode node) {
        CommonToken tk = (CommonToken)node.getPayload();
        throw new RuntimeException(String.format("Syntax error at Line %d", tk.getLine()));
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

