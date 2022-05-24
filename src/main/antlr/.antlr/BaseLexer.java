// Generated from /home/jd/Projects/CISC471/blc/src/main/antlr/Base.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACKET=5, RBRACKET=6, DOT=7, 
		COMMA=8, COLON=9, SEMICOLON=10, CONJ=11, DISJ=12, EQUAL=13, EQUAL_EQUAL=14, 
		BANG_EQUAL=15, BANG=16, PLUS=17, MINUS=18, STAR=19, SLASH=20, PERCENT=21, 
		ARROW=22, FUN=23, IF=24, ELSE=25, STRUCT=26, WHILE=27, RETURN=28, VAR=29, 
		LESS=30, LESS_EQUAL=31, GREATER=32, GREATER_EQUAL=33, TRUE=34, FALSE=35, 
		UNIT=36, IDENTIFIER=37, INT_LITERAL=38, STRING_LITERAL=39, DelimitedComment=40, 
		LineComment=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "DOT", "COMMA", "COLON", "SEMICOLON", "CONJ", "DISJ", "EQUAL", 
			"EQUAL_EQUAL", "BANG_EQUAL", "BANG", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "ARROW", "FUN", "IF", "ELSE", "STRUCT", "WHILE", "RETURN", 
			"VAR", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "TRUE", "FALSE", 
			"UNIT", "IDENTIFIER", "INT_LITERAL", "STRING_LITERAL", "DelimitedComment", 
			"LineComment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", 
			"';'", "'&&'", "'||'", "'='", "'=='", "'!='", "'!'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'->'", "'fun'", "'if'", "'else'", "'struct'", "'while'", 
			"'return'", "'var'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'", 
			"'unit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"DOT", "COMMA", "COLON", "SEMICOLON", "CONJ", "DISJ", "EQUAL", "EQUAL_EQUAL", 
			"BANG_EQUAL", "BANG", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "ARROW", 
			"FUN", "IF", "ELSE", "STRUCT", "WHILE", "RETURN", "VAR", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "TRUE", "FALSE", "UNIT", "IDENTIFIER", "INT_LITERAL", 
			"STRING_LITERAL", "DelimitedComment", "LineComment", "WS"
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


	public BaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Base.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u00d1\n(\3(\3(\3(\7(\u00d6\n(\f(\16("+
		"\u00d9\13(\3)\5)\u00dc\n)\3)\6)\u00df\n)\r)\16)\u00e0\3*\3*\3*\3*\7*\u00e7"+
		"\n*\f*\16*\u00ea\13*\3*\3*\3+\3+\3+\3+\3+\7+\u00f3\n+\f+\16+\u00f6\13"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0101\n,\f,\16,\u0104\13,\3,\3,\3-\3-"+
		"\3-\3-\4\u00e8\u00f4\2.\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27"+
		"\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31"+
		"\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,\3\2\6\3\2\62"+
		";\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u0113\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2"+
		"\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21"+
		"i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2"+
		"\35v\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0083\3"+
		"\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u0090\3\2\2\2\65\u0094\3\2\2\2\67\u0097\3\2\2\29\u009c"+
		"\3\2\2\2;\u00a3\3\2\2\2=\u00a9\3\2\2\2?\u00b0\3\2\2\2A\u00b4\3\2\2\2C"+
		"\u00b6\3\2\2\2E\u00b9\3\2\2\2G\u00bb\3\2\2\2I\u00be\3\2\2\2K\u00c3\3\2"+
		"\2\2M\u00c9\3\2\2\2O\u00d0\3\2\2\2Q\u00db\3\2\2\2S\u00e2\3\2\2\2U\u00ed"+
		"\3\2\2\2W\u00fc\3\2\2\2Y\u0107\3\2\2\2[\\\t\2\2\2\\\4\3\2\2\2]^\t\3\2"+
		"\2^\6\3\2\2\2_`\7*\2\2`\b\3\2\2\2ab\7+\2\2b\n\3\2\2\2cd\7]\2\2d\f\3\2"+
		"\2\2ef\7_\2\2f\16\3\2\2\2gh\7}\2\2h\20\3\2\2\2ij\7\177\2\2j\22\3\2\2\2"+
		"kl\7\60\2\2l\24\3\2\2\2mn\7.\2\2n\26\3\2\2\2op\7<\2\2p\30\3\2\2\2qr\7"+
		"=\2\2r\32\3\2\2\2st\7(\2\2tu\7(\2\2u\34\3\2\2\2vw\7~\2\2wx\7~\2\2x\36"+
		"\3\2\2\2yz\7?\2\2z \3\2\2\2{|\7?\2\2|}\7?\2\2}\"\3\2\2\2~\177\7#\2\2\177"+
		"\u0080\7?\2\2\u0080$\3\2\2\2\u0081\u0082\7#\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7-\2\2\u0084(\3\2\2\2\u0085\u0086\7/\2\2\u0086*\3\2\2\2\u0087\u0088\7"+
		",\2\2\u0088,\3\2\2\2\u0089\u008a\7\61\2\2\u008a.\3\2\2\2\u008b\u008c\7"+
		"\'\2\2\u008c\60\3\2\2\2\u008d\u008e\7/\2\2\u008e\u008f\7@\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7w\2\2\u0092\u0093\7p\2\2\u0093"+
		"\64\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096\66\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2"+
		"\u009b8\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2"+
		"\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7v\2\2\u00a2:\3\2"+
		"\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7g\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7p\2\2\u00af>\3\2\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3@\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5B\3\2\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b7\u00b8\7?\2\2\u00b8D\3\2\2\2\u00b9\u00ba\7@\2\2\u00baF\3"+
		"\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bdH\3\2\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"J\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8L\3\2\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7v\2\2\u00cdN\3\2\2\2\u00ce"+
		"\u00d1\5\5\3\2\u00cf\u00d1\7a\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d6\5\5\3\2\u00d3\u00d6\5\3\2\2\u00d4"+
		"\u00d6\7a\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"P\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7/\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5\3\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"R\3\2\2\2\u00e2\u00e8\7$\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e7\7$\2\2\u00e5"+
		"\u00e7\13\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ecT\3\2\2\2\u00ed\u00ee\7\61\2\2"+
		"\u00ee\u00ef\7,\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00f3\5U+\2\u00f1\u00f3"+
		"\13\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\b+\2\2\u00fbV\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7\61\2\2"+
		"\u00fe\u0102\3\2\2\2\u00ff\u0101\n\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\b,\2\2\u0106X\3\2\2\2\u0107\u0108\t\5\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b-\2\2\u010aZ\3\2\2\2\r\2\u00d0\u00d5\u00d7"+
		"\u00db\u00e0\u00e6\u00e8\u00f2\u00f4\u0102\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}