// Generated from ctf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ctfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, CASE=3, CHAR=4, CLASS=5, CONST=6, CONTINUE=7, DEFAULT=8, 
		DO=9, ELSE=10, FOR=11, IF=12, INT=13, RETURN=14, VOID=15, WHILE=16, DECIMAL_LITERAL=17, 
		HEX_LITERAL=18, BINARY_LITERAL=19, BOOL_LITERAL=20, CHAR_LITERAL=21, STRING_LITERAL=22, 
		NULL_LITERAL=23, LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, LBRACK=28, 
		RBRACK=29, SEMI=30, COMMA=31, DOT=32, ASSIGN=33, GT=34, LT=35, BANG=36, 
		TILDE=37, QUESTION=38, COLON=39, EQUAL=40, LE=41, GE=42, NOTEQUAL=43, 
		AND=44, OR=45, INC=46, DEC=47, ADD=48, SUB=49, MUL=50, DIV=51, BITAND=52, 
		BITOR=53, CARET=54, MOD=55, ADD_ASSIGN=56, SUB_ASSIGN=57, MUL_ASSIGN=58, 
		DIV_ASSIGN=59, AND_ASSIGN=60, OR_ASSIGN=61, XOR_ASSIGN=62, MOD_ASSIGN=63, 
		LSHIFT_ASSIGN=64, RSHIFT_ASSIGN=65, WS=66, COMMENT=67, LINE_COMMENT=68, 
		IDENTIFIER=69;
	public static final int
		RULE_compilationUnit = 0, RULE_methodDeclaration = 1, RULE_methodBody = 2, 
		RULE_typeTypeOrVoid = 3, RULE_variableDeclaration = 4, RULE_variableDeclaratorId = 5, 
		RULE_variableInitializer = 6, RULE_arrayInitializer = 7, RULE_formalParameters = 8, 
		RULE_formalParameterList = 9, RULE_formalParameter = 10, RULE_literal = 11, 
		RULE_integerLiteral = 12, RULE_block = 13, RULE_blockStatement = 14, RULE_statement = 15, 
		RULE_forControl = 16, RULE_enhancedForControl = 17, RULE_parExpression = 18, 
		RULE_expressionList = 19, RULE_methodCall = 20, RULE_expression = 21, 
		RULE_primary = 22, RULE_primitiveType = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"variableDeclaration", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "formalParameters", "formalParameterList", "formalParameter", 
			"literal", "integerLiteral", "block", "blockStatement", "statement", 
			"forControl", "enhancedForControl", "parExpression", "expressionList", 
			"methodCall", "expression", "primary", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'break'", "'case'", "'char'", "'class'", "'const'", 
			"'continue'", "'default'", "'do'", "'else'", "'for'", "'if'", "'int'", 
			"'return'", "'void'", "'while'", null, null, null, null, null, null, 
			"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
			"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "ELSE", "FOR", "IF", "INT", "RETURN", "VOID", "WHILE", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "BINARY_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ctf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ctfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ctfParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE))) != 0) || _la==IDENTIFIER) {
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(48);
						methodDeclaration();
						}
						break;
					case 2:
						{
						setState(49);
						variableDeclaration();
						}
						break;
					case 3:
						{
						setState(50);
						statement();
						}
						break;
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			typeTypeOrVoid();
			setState(60);
			match(IDENTIFIER);
			setState(61);
			formalParameters();
			setState(62);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ctfParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodBody);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ctfParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeTypeOrVoid);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				primitiveType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ctfParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(ctfParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			primitiveType();
			setState(73);
			variableDeclaratorId();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(74);
				match(ASSIGN);
				setState(75);
				variableInitializer();
				}
			}

			setState(78);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ctfParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ctfParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ctfParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ctfParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((VariableDeclaratorIdContext)_localctx).id = match(IDENTIFIER);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(81);
				match(LBRACK);
				setState(82);
				match(RBRACK);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableInitializer);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				arrayInitializer();
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ctfParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ctfParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ctfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ctfParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (LBRACE - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
				{
				setState(93);
				variableInitializer();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(COMMA);
						setState(95);
						variableInitializer();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(101);
					match(COMMA);
					}
				}

				}
			}

			setState(106);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ctfParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ctfParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LPAREN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0)) {
				{
				setState(109);
				formalParameterList();
				}
			}

			setState(112);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ctfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ctfParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			formalParameter();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				formalParameter();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			primitiveType();
			setState(123);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(ctfParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ctfParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(ctfParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ctfParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				integerLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ctfParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ctfParser.HEX_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ctfParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ctfParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ctfParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LBRACE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << BINARY_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(135);
				blockStatement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				variableDeclaration();
				}
				break;
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case RETURN:
			case WHILE:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case BANG:
			case TILDE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(ctfParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ctfParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(ctfParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ctfParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ctfParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(ctfParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ctfParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(ctfParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(ctfParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ctfParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(ctfParser.CONTINUE, 0); }
		public TerminalNode COLON() { return getToken(ctfParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(IF);
				setState(149);
				parExpression();
				setState(150);
				statement();
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(151);
					match(ELSE);
					setState(152);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(FOR);
				setState(156);
				match(LPAREN);
				setState(157);
				forControl();
				setState(158);
				match(RPAREN);
				setState(159);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(WHILE);
				setState(162);
				parExpression();
				setState(163);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(DO);
				setState(166);
				statement();
				setState(167);
				match(WHILE);
				setState(168);
				parExpression();
				setState(169);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(RETURN);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(172);
					expression(0);
					}
				}

				setState(175);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(BREAK);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(177);
					match(IDENTIFIER);
					}
				}

				setState(180);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(CONTINUE);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(182);
					match(IDENTIFIER);
					}
				}

				setState(185);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(188);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(190);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(191);
				match(COLON);
				setState(192);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forInit;
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ctfParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ctfParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forControl);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				enhancedForControl();
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case SEMI:
			case BANG:
			case TILDE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(196);
					((ForControlContext)_localctx).forInit = expressionList();
					}
				}

				setState(199);
				match(SEMI);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(200);
					expression(0);
					}
				}

				setState(203);
				match(SEMI);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(204);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ctfParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			primitiveType();
			setState(210);
			variableDeclaratorId();
			setState(211);
			match(COLON);
			setState(212);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ctfParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ctfParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LPAREN);
			setState(215);
			expression(0);
			setState(216);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ctfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ctfParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expression(0);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				expression(0);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ctfParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ctfParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(LPAREN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DECIMAL_LITERAL - 17)) | (1L << (HEX_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (CHAR_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
				{
				setState(228);
				expressionList();
				}
			}

			setState(231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token arrayid;
		public ExpressionContext idx;
		public Token prefix;
		public Token bop;
		public Token assignOp;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ctfParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ctfParser.RBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(ctfParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ctfParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(ctfParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ctfParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ctfParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(ctfParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ctfParser.SUB, 0); }
		public TerminalNode LE() { return getToken(ctfParser.LE, 0); }
		public TerminalNode GE() { return getToken(ctfParser.GE, 0); }
		public TerminalNode GT() { return getToken(ctfParser.GT, 0); }
		public TerminalNode LT() { return getToken(ctfParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(ctfParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ctfParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(ctfParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(ctfParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(ctfParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(ctfParser.AND, 0); }
		public TerminalNode OR() { return getToken(ctfParser.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(ctfParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ctfParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ctfParser.SUB_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ctfParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ctfParser.OR_ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(234);
				primary();
				}
				break;
			case 2:
				{
				setState(235);
				((ExpressionContext)_localctx).arrayid = match(IDENTIFIER);
				setState(236);
				match(LBRACK);
				setState(237);
				((ExpressionContext)_localctx).idx = expression(0);
				setState(238);
				match(RBRACK);
				}
				break;
			case 3:
				{
				setState(240);
				methodCall();
				}
				break;
			case 4:
				{
				setState(241);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				expression(11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(252);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(255);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(258);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(259);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(262);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(265);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(268);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(271);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(273);
						((ExpressionContext)_localctx).assignOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN))) != 0)) ) {
							((ExpressionContext)_localctx).assignOp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public Token id;
		public TerminalNode LPAREN() { return getToken(ctfParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ctfParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ctfParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(LPAREN);
				setState(281);
				expression(0);
				setState(282);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BINARY_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((PrimaryContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode BOOLEAN() { return getToken(ctfParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(ctfParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(ctfParser.INT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ctfListener ) ((ctfListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((PrimitiveTypeContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0)) ) {
				((PrimitiveTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4E\n\4\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t"+
		"\7\tc\n\t\f\t\16\tf\13\t\3\t\5\ti\n\t\5\tk\n\t\3\t\3\t\3\n\3\n\5\nq\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0085\n\r\3\16\3\16\3\17\3\17\7\17\u008b\n\17\f\17"+
		"\16\17\u008e\13\17\3\17\3\17\3\20\3\20\5\20\u0094\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009c\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b0\n\21\3\21"+
		"\3\21\3\21\5\21\u00b5\n\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\22\3\22\5\22\u00c8\n\22"+
		"\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\5\22\u00d0\n\22\5\22\u00d2\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00e0"+
		"\n\25\f\25\16\25\u00e3\13\25\3\26\3\26\3\26\5\26\u00e8\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0116\n\27\f\27\16\27\u0119\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0121\n\30\3\31\3\31\3\31\2\3,\32\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\2\n\3\2\23\25\3\2&\'\4\2\64\6599\3\2\62\63\4"+
		"\2$%+,\4\2**--\5\2##:;>?\5\2\3\3\6\6\17\17\2\u0143\2;\3\2\2\2\4=\3\2\2"+
		"\2\6D\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fR\3\2\2\2\16\\\3\2\2\2\20^\3\2\2"+
		"\2\22n\3\2\2\2\24t\3\2\2\2\26|\3\2\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2"+
		"\2\34\u0088\3\2\2\2\36\u0093\3\2\2\2 \u00c3\3\2\2\2\"\u00d1\3\2\2\2$\u00d3"+
		"\3\2\2\2&\u00d8\3\2\2\2(\u00dc\3\2\2\2*\u00e4\3\2\2\2,\u00f5\3\2\2\2."+
		"\u0120\3\2\2\2\60\u0122\3\2\2\2\62\66\5\4\3\2\63\66\5\n\6\2\64\66\5 \21"+
		"\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28<\3\2\2\29\67\3\2\2\2:<\7\2\2\3;\67\3\2\2\2;:\3\2\2\2<\3"+
		"\3\2\2\2=>\5\b\5\2>?\7G\2\2?@\5\22\n\2@A\5\6\4\2A\5\3\2\2\2BE\5\34\17"+
		"\2CE\7 \2\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FI\5\60\31\2GI\7\21\2\2HF\3"+
		"\2\2\2HG\3\2\2\2I\t\3\2\2\2JK\5\60\31\2KN\5\f\7\2LM\7#\2\2MO\5\16\b\2"+
		"NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7 \2\2Q\13\3\2\2\2RW\7G\2\2ST\7\36\2"+
		"\2TV\7\37\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2"+
		"\2\2Z]\5\20\t\2[]\5,\27\2\\Z\3\2\2\2\\[\3\2\2\2]\17\3\2\2\2^j\7\34\2\2"+
		"_d\5\16\b\2`a\7!\2\2ac\5\16\b\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2gi\7!\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2j_\3\2\2"+
		"\2jk\3\2\2\2kl\3\2\2\2lm\7\35\2\2m\21\3\2\2\2np\7\32\2\2oq\5\24\13\2p"+
		"o\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\33\2\2s\23\3\2\2\2ty\5\26\f\2uv\7!\2"+
		"\2vx\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\25\3\2\2\2{y\3"+
		"\2\2\2|}\5\60\31\2}~\5\f\7\2~\27\3\2\2\2\177\u0085\5\32\16\2\u0080\u0085"+
		"\7\27\2\2\u0081\u0085\7\30\2\2\u0082\u0085\7\26\2\2\u0083\u0085\7\31\2"+
		"\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\31\3\2\2\2\u0086\u0087\t\2\2\2\u0087"+
		"\33\3\2\2\2\u0088\u008c\7\34\2\2\u0089\u008b\5\36\20\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\35\2\2\u0090\35\3\2\2"+
		"\2\u0091\u0094\5\n\6\2\u0092\u0094\5 \21\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\37\3\2\2\2\u0095\u00c4\5\34\17\2\u0096\u0097\7\16\2\2\u0097"+
		"\u0098\5&\24\2\u0098\u009b\5 \21\2\u0099\u009a\7\f\2\2\u009a\u009c\5 "+
		"\21\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00c4\3\2\2\2\u009d"+
		"\u009e\7\r\2\2\u009e\u009f\7\32\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7"+
		"\33\2\2\u00a1\u00a2\5 \21\2\u00a2\u00c4\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4"+
		"\u00a5\5&\24\2\u00a5\u00a6\5 \21\2\u00a6\u00c4\3\2\2\2\u00a7\u00a8\7\13"+
		"\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5&\24\2\u00ab"+
		"\u00ac\7 \2\2\u00ac\u00c4\3\2\2\2\u00ad\u00af\7\20\2\2\u00ae\u00b0\5,"+
		"\27\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00c4\7 \2\2\u00b2\u00b4\7\4\2\2\u00b3\u00b5\7G\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c4\7 \2\2\u00b7\u00b9"+
		"\7\t\2\2\u00b8\u00ba\7G\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00c4\7 \2\2\u00bc\u00c4\7 \2\2\u00bd\u00be\5,\27"+
		"\2\u00be\u00bf\7 \2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c2"+
		"\7)\2\2\u00c2\u00c4\5 \21\2\u00c3\u0095\3\2\2\2\u00c3\u0096\3\2\2\2\u00c3"+
		"\u009d\3\2\2\2\u00c3\u00a3\3\2\2\2\u00c3\u00a7\3\2\2\2\u00c3\u00ad\3\2"+
		"\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00d2\5$\23\2"+
		"\u00c6\u00c8\5(\25\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cb\7 \2\2\u00ca\u00cc\5,\27\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7 \2\2\u00ce\u00d0\5(\25"+
		"\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c5"+
		"\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\5\60\31\2\u00d4"+
		"\u00d5\5\f\7\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\5,\27\2\u00d7%\3\2\2\2\u00d8"+
		"\u00d9\7\32\2\2\u00d9\u00da\5,\27\2\u00da\u00db\7\33\2\2\u00db\'\3\2\2"+
		"\2\u00dc\u00e1\5,\27\2\u00dd\u00de\7!\2\2\u00de\u00e0\5,\27\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		")\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e7\7\32\2\2"+
		"\u00e6\u00e8\5(\25\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea+\3\2\2\2\u00eb\u00ec\b\27\1\2\u00ec"+
		"\u00f6\5.\30\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\5,"+
		"\27\2\u00f0\u00f1\7\37\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f6\5*\26\2\u00f3"+
		"\u00f4\t\3\2\2\u00f4\u00f6\5,\27\r\u00f5\u00eb\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0117\3\2\2\2\u00f7"+
		"\u00f8\f\f\2\2\u00f8\u00f9\t\4\2\2\u00f9\u0116\5,\27\r\u00fa\u00fb\f\13"+
		"\2\2\u00fb\u00fc\t\5\2\2\u00fc\u0116\5,\27\f\u00fd\u00fe\f\n\2\2\u00fe"+
		"\u00ff\t\6\2\2\u00ff\u0116\5,\27\13\u0100\u0101\f\t\2\2\u0101\u0102\t"+
		"\7\2\2\u0102\u0116\5,\27\n\u0103\u0104\f\b\2\2\u0104\u0105\7\66\2\2\u0105"+
		"\u0116\5,\27\t\u0106\u0107\f\7\2\2\u0107\u0108\78\2\2\u0108\u0116\5,\27"+
		"\b\u0109\u010a\f\6\2\2\u010a\u010b\7\67\2\2\u010b\u0116\5,\27\7\u010c"+
		"\u010d\f\5\2\2\u010d\u010e\7.\2\2\u010e\u0116\5,\27\6\u010f\u0110\f\4"+
		"\2\2\u0110\u0111\7/\2\2\u0111\u0116\5,\27\5\u0112\u0113\f\3\2\2\u0113"+
		"\u0114\t\b\2\2\u0114\u0116\5,\27\4\u0115\u00f7\3\2\2\2\u0115\u00fa\3\2"+
		"\2\2\u0115\u00fd\3\2\2\2\u0115\u0100\3\2\2\2\u0115\u0103\3\2\2\2\u0115"+
		"\u0106\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u010f\3\2"+
		"\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118-\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\32\2\2"+
		"\u011b\u011c\5,\27\2\u011c\u011d\7\33\2\2\u011d\u0121\3\2\2\2\u011e\u0121"+
		"\5\30\r\2\u011f\u0121\7G\2\2\u0120\u011a\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121/\3\2\2\2\u0122\u0123\t\t\2\2\u0123\61\3\2\2\2!\65"+
		"\67;DHNW\\dhjpy\u0084\u008c\u0093\u009b\u00af\u00b4\u00b9\u00c3\u00c7"+
		"\u00cb\u00cf\u00d1\u00e1\u00e7\u00f5\u0115\u0117\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}