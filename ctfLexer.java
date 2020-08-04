// Generated from ctf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ctfLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FOR", "IF", "INT", "RETURN", "VOID", "WHILE", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "BINARY_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", "HexDigits", 
			"HexDigit", "Digits", "LetterOrDigit", "Letter"
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


	public ctfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ctf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u00f9\n\22\3\22\6\22\u00fc\n\22\r\22\16\22\u00fd\3\22"+
		"\5\22\u0101\n\22\5\22\u0103\n\22\3\22\5\22\u0106\n\22\3\23\3\23\3\23\3"+
		"\23\7\23\u010c\n\23\f\23\16\23\u010f\13\23\3\23\5\23\u0112\n\23\3\23\5"+
		"\23\u0115\n\23\3\24\3\24\3\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e\13"+
		"\24\3\24\5\24\u0121\n\24\3\24\5\24\u0124\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u012f\n\25\3\26\3\26\3\26\5\26\u0134\n\26\3"+
		"\26\3\26\3\27\3\27\3\27\7\27\u013b\n\27\f\27\16\27\u013e\13\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3"+
		"=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\6C\u01b0"+
		"\nC\rC\16C\u01b1\3C\3C\3D\3D\3D\3D\7D\u01ba\nD\fD\16D\u01bd\13D\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\7E\u01c8\nE\fE\16E\u01cb\13E\3E\3E\3F\3F\7F\u01d1"+
		"\nF\fF\16F\u01d4\13F\3G\3G\5G\u01d8\nG\3G\3G\3H\3H\3H\3H\5H\u01e0\nH\3"+
		"H\5H\u01e3\nH\3H\3H\3H\6H\u01e8\nH\rH\16H\u01e9\3H\3H\3H\3H\3H\5H\u01f1"+
		"\nH\3I\3I\3I\7I\u01f6\nI\fI\16I\u01f9\13I\3I\5I\u01fc\nI\3J\3J\3K\3K\7"+
		"K\u0202\nK\fK\16K\u0205\13K\3K\5K\u0208\nK\3L\3L\5L\u020c\nL\3M\3M\3\u01bb"+
		"\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\3\2\26\3\2\63;\4\2"+
		"NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\4\2DDdd\3\2\62\63\4\2\62\63aa\6"+
		"\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4"+
		"\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\3\2\62;\4\2\62;a"+
		"a\6\2&&C\\aac|\2\u0226\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\3\u009b\3\2\2\2\5\u00a3\3\2\2\2\7\u00a9\3\2\2\2\t\u00ae\3\2\2"+
		"\2\13\u00b3\3\2\2\2\r\u00b9\3\2\2\2\17\u00bf\3\2\2\2\21\u00c8\3\2\2\2"+
		"\23\u00d0\3\2\2\2\25\u00d3\3\2\2\2\27\u00d8\3\2\2\2\31\u00dc\3\2\2\2\33"+
		"\u00df\3\2\2\2\35\u00e3\3\2\2\2\37\u00ea\3\2\2\2!\u00ef\3\2\2\2#\u0102"+
		"\3\2\2\2%\u0107\3\2\2\2\'\u0116\3\2\2\2)\u012e\3\2\2\2+\u0130\3\2\2\2"+
		"-\u0137\3\2\2\2/\u0141\3\2\2\2\61\u0146\3\2\2\2\63\u0148\3\2\2\2\65\u014a"+
		"\3\2\2\2\67\u014c\3\2\2\29\u014e\3\2\2\2;\u0150\3\2\2\2=\u0152\3\2\2\2"+
		"?\u0154\3\2\2\2A\u0156\3\2\2\2C\u0158\3\2\2\2E\u015a\3\2\2\2G\u015c\3"+
		"\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2\2\2Q\u0166"+
		"\3\2\2\2S\u0169\3\2\2\2U\u016c\3\2\2\2W\u016f\3\2\2\2Y\u0172\3\2\2\2["+
		"\u0175\3\2\2\2]\u0178\3\2\2\2_\u017b\3\2\2\2a\u017e\3\2\2\2c\u0180\3\2"+
		"\2\2e\u0182\3\2\2\2g\u0184\3\2\2\2i\u0186\3\2\2\2k\u0188\3\2\2\2m\u018a"+
		"\3\2\2\2o\u018c\3\2\2\2q\u018e\3\2\2\2s\u0191\3\2\2\2u\u0194\3\2\2\2w"+
		"\u0197\3\2\2\2y\u019a\3\2\2\2{\u019d\3\2\2\2}\u01a0\3\2\2\2\177\u01a3"+
		"\3\2\2\2\u0081\u01a6\3\2\2\2\u0083\u01aa\3\2\2\2\u0085\u01af\3\2\2\2\u0087"+
		"\u01b5\3\2\2\2\u0089\u01c3\3\2\2\2\u008b\u01ce\3\2\2\2\u008d\u01d5\3\2"+
		"\2\2\u008f\u01f0\3\2\2\2\u0091\u01f2\3\2\2\2\u0093\u01fd\3\2\2\2\u0095"+
		"\u01ff\3\2\2\2\u0097\u020b\3\2\2\2\u0099\u020d\3\2\2\2\u009b\u009c\7d"+
		"\2\2\u009c\u009d\7q\2\2\u009d\u009e\7q\2\2\u009e\u009f\7n\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2\u00a2\4\3\2\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7m\2\2\u00a8\6\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\b\3\2\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7j\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2\n\3\2\2\2\u00b3"+
		"\u00b4\7e\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7u\2\2"+
		"\u00b7\u00b8\7u\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q"+
		"\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\16"+
		"\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7w\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7\20\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7"+
		"g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7v\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\26\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7t\2\2\u00db\30\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7h\2\2\u00de\32\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\34\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\36\3\2\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7f\2\2\u00ee \3\2\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7j\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4\"\3\2\2\2\u00f5"+
		"\u0103\7\62\2\2\u00f6\u0100\t\2\2\2\u00f7\u00f9\5\u0095K\2\u00f8\u00f7"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u00fc\7a\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\5\u0095K\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106$\3\2\2\2\u0107\u0108\7\62\2\2\u0108\u0109\t\4\2\2"+
		"\u0109\u0111\t\5\2\2\u010a\u010c\t\6\2\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\t\5\2\2\u0111\u010d\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0115\t\3\2\2\u0114\u0113\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115&\3\2\2\2\u0116\u0117\7\62\2\2\u0117\u0118\t\7\2\2"+
		"\u0118\u0120\t\b\2\2\u0119\u011b\t\t\2\2\u011a\u0119\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0121\t\b\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124(\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2\2\u0127"+
		"\u0128\7w\2\2\u0128\u012f\7g\2\2\u0129\u012a\7h\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7n\2\2\u012c\u012d\7u\2\2\u012d\u012f\7g\2\2\u012e\u0125"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012f*\3\2\2\2\u0130\u0133\7)\2\2\u0131\u0134"+
		"\n\n\2\2\u0132\u0134\5\u008fH\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0136\7)\2\2\u0136,\3\2\2\2\u0137\u013c\7"+
		"$\2\2\u0138\u013b\n\13\2\2\u0139\u013b\5\u008fH\2\u013a\u0138\3\2\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7$\2\2\u0140"+
		".\3\2\2\2\u0141\u0142\7p\2\2\u0142\u0143\7w\2\2\u0143\u0144\7n\2\2\u0144"+
		"\u0145\7n\2\2\u0145\60\3\2\2\2\u0146\u0147\7*\2\2\u0147\62\3\2\2\2\u0148"+
		"\u0149\7+\2\2\u0149\64\3\2\2\2\u014a\u014b\7}\2\2\u014b\66\3\2\2\2\u014c"+
		"\u014d\7\177\2\2\u014d8\3\2\2\2\u014e\u014f\7]\2\2\u014f:\3\2\2\2\u0150"+
		"\u0151\7_\2\2\u0151<\3\2\2\2\u0152\u0153\7=\2\2\u0153>\3\2\2\2\u0154\u0155"+
		"\7.\2\2\u0155@\3\2\2\2\u0156\u0157\7\60\2\2\u0157B\3\2\2\2\u0158\u0159"+
		"\7?\2\2\u0159D\3\2\2\2\u015a\u015b\7@\2\2\u015bF\3\2\2\2\u015c\u015d\7"+
		">\2\2\u015dH\3\2\2\2\u015e\u015f\7#\2\2\u015fJ\3\2\2\2\u0160\u0161\7\u0080"+
		"\2\2\u0161L\3\2\2\2\u0162\u0163\7A\2\2\u0163N\3\2\2\2\u0164\u0165\7<\2"+
		"\2\u0165P\3\2\2\2\u0166\u0167\7?\2\2\u0167\u0168\7?\2\2\u0168R\3\2\2\2"+
		"\u0169\u016a\7>\2\2\u016a\u016b\7?\2\2\u016bT\3\2\2\2\u016c\u016d\7@\2"+
		"\2\u016d\u016e\7?\2\2\u016eV\3\2\2\2\u016f\u0170\7#\2\2\u0170\u0171\7"+
		"?\2\2\u0171X\3\2\2\2\u0172\u0173\7(\2\2\u0173\u0174\7(\2\2\u0174Z\3\2"+
		"\2\2\u0175\u0176\7~\2\2\u0176\u0177\7~\2\2\u0177\\\3\2\2\2\u0178\u0179"+
		"\7-\2\2\u0179\u017a\7-\2\2\u017a^\3\2\2\2\u017b\u017c\7/\2\2\u017c\u017d"+
		"\7/\2\2\u017d`\3\2\2\2\u017e\u017f\7-\2\2\u017fb\3\2\2\2\u0180\u0181\7"+
		"/\2\2\u0181d\3\2\2\2\u0182\u0183\7,\2\2\u0183f\3\2\2\2\u0184\u0185\7\61"+
		"\2\2\u0185h\3\2\2\2\u0186\u0187\7(\2\2\u0187j\3\2\2\2\u0188\u0189\7~\2"+
		"\2\u0189l\3\2\2\2\u018a\u018b\7`\2\2\u018bn\3\2\2\2\u018c\u018d\7\'\2"+
		"\2\u018dp\3\2\2\2\u018e\u018f\7-\2\2\u018f\u0190\7?\2\2\u0190r\3\2\2\2"+
		"\u0191\u0192\7/\2\2\u0192\u0193\7?\2\2\u0193t\3\2\2\2\u0194\u0195\7,\2"+
		"\2\u0195\u0196\7?\2\2\u0196v\3\2\2\2\u0197\u0198\7\61\2\2\u0198\u0199"+
		"\7?\2\2\u0199x\3\2\2\2\u019a\u019b\7(\2\2\u019b\u019c\7?\2\2\u019cz\3"+
		"\2\2\2\u019d\u019e\7~\2\2\u019e\u019f\7?\2\2\u019f|\3\2\2\2\u01a0\u01a1"+
		"\7`\2\2\u01a1\u01a2\7?\2\2\u01a2~\3\2\2\2\u01a3\u01a4\7\'\2\2\u01a4\u01a5"+
		"\7?\2\2\u01a5\u0080\3\2\2\2\u01a6\u01a7\7>\2\2\u01a7\u01a8\7>\2\2\u01a8"+
		"\u01a9\7?\2\2\u01a9\u0082\3\2\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac\7@\2"+
		"\2\u01ac\u01ad\7?\2\2\u01ad\u0084\3\2\2\2\u01ae\u01b0\t\f\2\2\u01af\u01ae"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\bC\2\2\u01b4\u0086\3\2\2\2\u01b5\u01b6\7\61"+
		"\2\2\u01b6\u01b7\7,\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\13\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7,\2\2\u01bf"+
		"\u01c0\7\61\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bD\3\2\u01c2\u0088\3\2"+
		"\2\2\u01c3\u01c4\7\61\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c9\3\2\2\2\u01c6"+
		"\u01c8\n\r\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01cd\bE\3\2\u01cd\u008a\3\2\2\2\u01ce\u01d2\5\u0099M\2\u01cf\u01d1\5"+
		"\u0097L\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u008c\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7"+
		"\t\16\2\2\u01d6\u01d8\t\17\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2"+
		"\u01d8\u01d9\3\2\2\2\u01d9\u01da\5\u0095K\2\u01da\u008e\3\2\2\2\u01db"+
		"\u01dc\7^\2\2\u01dc\u01f1\t\20\2\2\u01dd\u01e2\7^\2\2\u01de\u01e0\t\21"+
		"\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\t\22\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3"+
		"\2\2\2\u01e4\u01f1\t\22\2\2\u01e5\u01e7\7^\2\2\u01e6\u01e8\7w\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5\u0093J\2\u01ec\u01ed\5\u0093J\2"+
		"\u01ed\u01ee\5\u0093J\2\u01ee\u01ef\5\u0093J\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01db\3\2\2\2\u01f0\u01dd\3\2\2\2\u01f0\u01e5\3\2\2\2\u01f1\u0090\3\2"+
		"\2\2\u01f2\u01fb\5\u0093J\2\u01f3\u01f6\5\u0093J\2\u01f4\u01f6\7a\2\2"+
		"\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fc\5\u0093J\2\u01fb\u01f7\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0092"+
		"\3\2\2\2\u01fd\u01fe\t\5\2\2\u01fe\u0094\3\2\2\2\u01ff\u0207\t\23\2\2"+
		"\u0200\u0202\t\24\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\u0208\t\23\2\2\u0207\u0203\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0096\3"+
		"\2\2\2\u0209\u020c\5\u0099M\2\u020a\u020c\t\23\2\2\u020b\u0209\3\2\2\2"+
		"\u020b\u020a\3\2\2\2\u020c\u0098\3\2\2\2\u020d\u020e\t\25\2\2\u020e\u009a"+
		"\3\2\2\2!\2\u00f8\u00fd\u0100\u0102\u0105\u010d\u0111\u0114\u011c\u0120"+
		"\u0123\u012e\u0133\u013a\u013c\u01b1\u01bb\u01c9\u01d2\u01d7\u01df\u01e2"+
		"\u01e9\u01f0\u01f5\u01f7\u01fb\u0203\u0207\u020b\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}