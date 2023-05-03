// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class squealLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, INSERT=16, 
		INTO=17, VALUES=18, READ=19, UPDATE=20, SET=21, DISTINCT=22, COMA=23, 
		BOOL=24, OR=25, AND=26, AS=27, QUOTE=28, FROM=29, WHERE=30, DELETE=31, 
		DROP=32, ALL=33, IS=34, NOT=35, NULL=36, BETWEEN=37, LIKE=38, IN=39, PRIMARY_KEY=40, 
		LEFT_PAR=41, RIGHT_PAR=42, SEMICOLON=43, TABLE=44, CREATE=45, NAME=46, 
		DIGIT=47, DOUBLE=48, INT=49, ALPHA=50, WS=51, OTHER=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "INSERT", "INTO", 
			"VALUES", "READ", "UPDATE", "SET", "DISTINCT", "COMA", "BOOL", "OR", 
			"AND", "AS", "QUOTE", "FROM", "WHERE", "DELETE", "DROP", "ALL", "IS", 
			"NOT", "NULL", "BETWEEN", "LIKE", "IN", "PRIMARY_KEY", "LEFT_PAR", "RIGHT_PAR", 
			"SEMICOLON", "TABLE", "CREATE", "NAME", "DIGIT", "DOUBLE", "INT", "ALPHA", 
			"WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'int'", "'double'", "'varchar'", "'date'", "'+'", 
			"'-'", "'/'", "'<='", "'>='", "'<'", "'>'", "'!='", null, "'INSERT'", 
			"'INTO'", "'VALUES'", "'READ'", "'UPDATE'", "'SET'", "'DISTINCT'", "','", 
			null, "'OR'", "'AND'", "'AS'", "'''", "'FROM'", "'WHERE'", "'DELETE'", 
			"'DROP'", "'ALL'", "'IS'", "'NOT'", "'NULL'", "'BETWEEN'", "'LIKE'", 
			"'IN'", "'PRIMARY KEY'", "'('", "')'", "';'", "'TABLE'", "'CREATE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "INSERT", "INTO", "VALUES", "READ", "UPDATE", 
			"SET", "DISTINCT", "COMA", "BOOL", "OR", "AND", "AS", "QUOTE", "FROM", 
			"WHERE", "DELETE", "DROP", "ALL", "IS", "NOT", "NULL", "BETWEEN", "LIKE", 
			"IN", "PRIMARY_KEY", "LEFT_PAR", "RIGHT_PAR", "SEMICOLON", "TABLE", "CREATE", 
			"NAME", "DIGIT", "DOUBLE", "INT", "ALPHA", "WS", "OTHER"
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


	public squealLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "squeal.g4"; }

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
		"\u0004\u00004\u0176\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009d\b\u000e\n\u000e\f\u000e"+
		"\u00a0\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0001\u000e\u0003"+
		"\u000e\u00ad\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00e6\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0005-\u014d\b-\n-\f-\u0150\t-\u0001.\u0001.\u0001"+
		"/\u0003/\u0155\b/\u0001/\u0004/\u0158\b/\u000b/\f/\u0159\u0001/\u0001"+
		"/\u0004/\u015e\b/\u000b/\f/\u015f\u0003/\u0162\b/\u00010\u00030\u0165"+
		"\b0\u00010\u00040\u0168\b0\u000b0\f0\u0169\u00011\u00011\u00012\u0004"+
		"2\u016f\b2\u000b2\f2\u0170\u00012\u00012\u00013\u00013\u0000\u00004\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4\u0001\u0000\u0005\u0003\u0000\n\n\r\r\""+
		"\"\u0001\u000009\u0001\u0000..\u0003\u0000AZ__az\u0003\u0000\t\n\r\r "+
		" \u0184\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O"+
		"\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000"+
		"\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000"+
		"\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000"+
		"\u0000g\u0001\u0000\u0000\u0000\u0001i\u0001\u0000\u0000\u0000\u0003k"+
		"\u0001\u0000\u0000\u0000\u0005m\u0001\u0000\u0000\u0000\u0007q\u0001\u0000"+
		"\u0000\u0000\tx\u0001\u0000\u0000\u0000\u000b\u0080\u0001\u0000\u0000"+
		"\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000\u0000"+
		"\u0011\u0089\u0001\u0000\u0000\u0000\u0013\u008b\u0001\u0000\u0000\u0000"+
		"\u0015\u008e\u0001\u0000\u0000\u0000\u0017\u0091\u0001\u0000\u0000\u0000"+
		"\u0019\u0093\u0001\u0000\u0000\u0000\u001b\u0095\u0001\u0000\u0000\u0000"+
		"\u001d\u00ac\u0001\u0000\u0000\u0000\u001f\u00ae\u0001\u0000\u0000\u0000"+
		"!\u00b5\u0001\u0000\u0000\u0000#\u00ba\u0001\u0000\u0000\u0000%\u00c1"+
		"\u0001\u0000\u0000\u0000\'\u00c6\u0001\u0000\u0000\u0000)\u00cd\u0001"+
		"\u0000\u0000\u0000+\u00d1\u0001\u0000\u0000\u0000-\u00da\u0001\u0000\u0000"+
		"\u0000/\u00e5\u0001\u0000\u0000\u00001\u00e7\u0001\u0000\u0000\u00003"+
		"\u00ea\u0001\u0000\u0000\u00005\u00ee\u0001\u0000\u0000\u00007\u00f1\u0001"+
		"\u0000\u0000\u00009\u00f3\u0001\u0000\u0000\u0000;\u00f8\u0001\u0000\u0000"+
		"\u0000=\u00fe\u0001\u0000\u0000\u0000?\u0105\u0001\u0000\u0000\u0000A"+
		"\u010a\u0001\u0000\u0000\u0000C\u010e\u0001\u0000\u0000\u0000E\u0111\u0001"+
		"\u0000\u0000\u0000G\u0115\u0001\u0000\u0000\u0000I\u011a\u0001\u0000\u0000"+
		"\u0000K\u0122\u0001\u0000\u0000\u0000M\u0127\u0001\u0000\u0000\u0000O"+
		"\u012a\u0001\u0000\u0000\u0000Q\u0136\u0001\u0000\u0000\u0000S\u0138\u0001"+
		"\u0000\u0000\u0000U\u013a\u0001\u0000\u0000\u0000W\u013c\u0001\u0000\u0000"+
		"\u0000Y\u0142\u0001\u0000\u0000\u0000[\u0149\u0001\u0000\u0000\u0000]"+
		"\u0151\u0001\u0000\u0000\u0000_\u0154\u0001\u0000\u0000\u0000a\u0164\u0001"+
		"\u0000\u0000\u0000c\u016b\u0001\u0000\u0000\u0000e\u016e\u0001\u0000\u0000"+
		"\u0000g\u0174\u0001\u0000\u0000\u0000ij\u0005=\u0000\u0000j\u0002\u0001"+
		"\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u0004\u0001\u0000\u0000\u0000"+
		"mn\u0005i\u0000\u0000no\u0005n\u0000\u0000op\u0005t\u0000\u0000p\u0006"+
		"\u0001\u0000\u0000\u0000qr\u0005d\u0000\u0000rs\u0005o\u0000\u0000st\u0005"+
		"u\u0000\u0000tu\u0005b\u0000\u0000uv\u0005l\u0000\u0000vw\u0005e\u0000"+
		"\u0000w\b\u0001\u0000\u0000\u0000xy\u0005v\u0000\u0000yz\u0005a\u0000"+
		"\u0000z{\u0005r\u0000\u0000{|\u0005c\u0000\u0000|}\u0005h\u0000\u0000"+
		"}~\u0005a\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\n\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005d\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082"+
		"\u0083\u0005t\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\f\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005+\u0000\u0000\u0086\u000e\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005-\u0000\u0000\u0088\u0010\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005/\u0000\u0000\u008a\u0012\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005<\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d\u0014"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005>\u0000\u0000\u008f\u0090\u0005"+
		"=\u0000\u0000\u0090\u0016\u0001\u0000\u0000\u0000\u0091\u0092\u0005<\u0000"+
		"\u0000\u0092\u0018\u0001\u0000\u0000\u0000\u0093\u0094\u0005>\u0000\u0000"+
		"\u0094\u001a\u0001\u0000\u0000\u0000\u0095\u0096\u0005!\u0000\u0000\u0096"+
		"\u0097\u0005=\u0000\u0000\u0097\u001c\u0001\u0000\u0000\u0000\u0098\u009e"+
		"\u0005\"\u0000\u0000\u0099\u009d\b\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\"\u0000\u0000\u009b\u009d\u0005\"\u0000\u0000\u009c\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00ad\u0005\"\u0000\u0000\u00a2\u00a8\u0005\'\u0000"+
		"\u0000\u00a3\u00a7\b\u0000\u0000\u0000\u00a4\u00a5\u0005\"\u0000\u0000"+
		"\u00a5\u00a7\u0005\"\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0005\'\u0000\u0000\u00ac\u0098\u0001\u0000\u0000\u0000\u00ac\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ad\u001e\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005I\u0000\u0000\u00af\u00b0\u0005N\u0000\u0000\u00b0\u00b1\u0005S"+
		"\u0000\u0000\u00b1\u00b2\u0005E\u0000\u0000\u00b2\u00b3\u0005R\u0000\u0000"+
		"\u00b3\u00b4\u0005T\u0000\u0000\u00b4 \u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005I\u0000\u0000\u00b6\u00b7\u0005N\u0000\u0000\u00b7\u00b8\u0005T"+
		"\u0000\u0000\u00b8\u00b9\u0005O\u0000\u0000\u00b9\"\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005V\u0000\u0000\u00bb\u00bc\u0005A\u0000\u0000\u00bc"+
		"\u00bd\u0005L\u0000\u0000\u00bd\u00be\u0005U\u0000\u0000\u00be\u00bf\u0005"+
		"E\u0000\u0000\u00bf\u00c0\u0005S\u0000\u0000\u00c0$\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005R\u0000\u0000\u00c2\u00c3\u0005E\u0000\u0000\u00c3"+
		"\u00c4\u0005A\u0000\u0000\u00c4\u00c5\u0005D\u0000\u0000\u00c5&\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005U\u0000\u0000\u00c7\u00c8\u0005P\u0000"+
		"\u0000\u00c8\u00c9\u0005D\u0000\u0000\u00c9\u00ca\u0005A\u0000\u0000\u00ca"+
		"\u00cb\u0005T\u0000\u0000\u00cb\u00cc\u0005E\u0000\u0000\u00cc(\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005S\u0000\u0000\u00ce\u00cf\u0005E\u0000"+
		"\u0000\u00cf\u00d0\u0005T\u0000\u0000\u00d0*\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005D\u0000\u0000\u00d2\u00d3\u0005I\u0000\u0000\u00d3\u00d4\u0005"+
		"S\u0000\u0000\u00d4\u00d5\u0005T\u0000\u0000\u00d5\u00d6\u0005I\u0000"+
		"\u0000\u00d6\u00d7\u0005N\u0000\u0000\u00d7\u00d8\u0005C\u0000\u0000\u00d8"+
		"\u00d9\u0005T\u0000\u0000\u00d9,\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		",\u0000\u0000\u00db.\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005T\u0000"+
		"\u0000\u00dd\u00de\u0005r\u0000\u0000\u00de\u00df\u0005u\u0000\u0000\u00df"+
		"\u00e6\u0005e\u0000\u0000\u00e0\u00e1\u0005F\u0000\u0000\u00e1\u00e2\u0005"+
		"a\u0000\u0000\u00e2\u00e3\u0005l\u0000\u0000\u00e3\u00e4\u0005s\u0000"+
		"\u0000\u00e4\u00e6\u0005e\u0000\u0000\u00e5\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e60\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005O\u0000\u0000\u00e8\u00e9\u0005R\u0000\u0000\u00e92\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005A\u0000\u0000\u00eb\u00ec\u0005N\u0000"+
		"\u0000\u00ec\u00ed\u0005D\u0000\u0000\u00ed4\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005A\u0000\u0000\u00ef\u00f0\u0005S\u0000\u0000\u00f06\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\'\u0000\u0000\u00f28\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005F\u0000\u0000\u00f4\u00f5\u0005R\u0000\u0000"+
		"\u00f5\u00f6\u0005O\u0000\u0000\u00f6\u00f7\u0005M\u0000\u0000\u00f7:"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005W\u0000\u0000\u00f9\u00fa\u0005"+
		"H\u0000\u0000\u00fa\u00fb\u0005E\u0000\u0000\u00fb\u00fc\u0005R\u0000"+
		"\u0000\u00fc\u00fd\u0005E\u0000\u0000\u00fd<\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005D\u0000\u0000\u00ff\u0100\u0005E\u0000\u0000\u0100\u0101\u0005"+
		"L\u0000\u0000\u0101\u0102\u0005E\u0000\u0000\u0102\u0103\u0005T\u0000"+
		"\u0000\u0103\u0104\u0005E\u0000\u0000\u0104>\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005D\u0000\u0000\u0106\u0107\u0005R\u0000\u0000\u0107\u0108\u0005"+
		"O\u0000\u0000\u0108\u0109\u0005P\u0000\u0000\u0109@\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005A\u0000\u0000\u010b\u010c\u0005L\u0000\u0000\u010c"+
		"\u010d\u0005L\u0000\u0000\u010dB\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"I\u0000\u0000\u010f\u0110\u0005S\u0000\u0000\u0110D\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005N\u0000\u0000\u0112\u0113\u0005O\u0000\u0000\u0113"+
		"\u0114\u0005T\u0000\u0000\u0114F\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"N\u0000\u0000\u0116\u0117\u0005U\u0000\u0000\u0117\u0118\u0005L\u0000"+
		"\u0000\u0118\u0119\u0005L\u0000\u0000\u0119H\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005B\u0000\u0000\u011b\u011c\u0005E\u0000\u0000\u011c\u011d\u0005"+
		"T\u0000\u0000\u011d\u011e\u0005W\u0000\u0000\u011e\u011f\u0005E\u0000"+
		"\u0000\u011f\u0120\u0005E\u0000\u0000\u0120\u0121\u0005N\u0000\u0000\u0121"+
		"J\u0001\u0000\u0000\u0000\u0122\u0123\u0005L\u0000\u0000\u0123\u0124\u0005"+
		"I\u0000\u0000\u0124\u0125\u0005K\u0000\u0000\u0125\u0126\u0005E\u0000"+
		"\u0000\u0126L\u0001\u0000\u0000\u0000\u0127\u0128\u0005I\u0000\u0000\u0128"+
		"\u0129\u0005N\u0000\u0000\u0129N\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"P\u0000\u0000\u012b\u012c\u0005R\u0000\u0000\u012c\u012d\u0005I\u0000"+
		"\u0000\u012d\u012e\u0005M\u0000\u0000\u012e\u012f\u0005A\u0000\u0000\u012f"+
		"\u0130\u0005R\u0000\u0000\u0130\u0131\u0005Y\u0000\u0000\u0131\u0132\u0005"+
		" \u0000\u0000\u0132\u0133\u0005K\u0000\u0000\u0133\u0134\u0005E\u0000"+
		"\u0000\u0134\u0135\u0005Y\u0000\u0000\u0135P\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005(\u0000\u0000\u0137R\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		")\u0000\u0000\u0139T\u0001\u0000\u0000\u0000\u013a\u013b\u0005;\u0000"+
		"\u0000\u013bV\u0001\u0000\u0000\u0000\u013c\u013d\u0005T\u0000\u0000\u013d"+
		"\u013e\u0005A\u0000\u0000\u013e\u013f\u0005B\u0000\u0000\u013f\u0140\u0005"+
		"L\u0000\u0000\u0140\u0141\u0005E\u0000\u0000\u0141X\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005C\u0000\u0000\u0143\u0144\u0005R\u0000\u0000\u0144"+
		"\u0145\u0005E\u0000\u0000\u0145\u0146\u0005A\u0000\u0000\u0146\u0147\u0005"+
		"T\u0000\u0000\u0147\u0148\u0005E\u0000\u0000\u0148Z\u0001\u0000\u0000"+
		"\u0000\u0149\u014e\u0003c1\u0000\u014a\u014d\u0003c1\u0000\u014b\u014d"+
		"\u0003].\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\\\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0007\u0001\u0000"+
		"\u0000\u0152^\u0001\u0000\u0000\u0000\u0153\u0155\u0005-\u0000\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155"+
		"\u0157\u0001\u0000\u0000\u0000\u0156\u0158\u0003].\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0161\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0007\u0002\u0000\u0000\u015c\u015e\u0003"+
		"].\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015b\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162`\u0001\u0000\u0000\u0000"+
		"\u0163\u0165\u0005-\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166"+
		"\u0168\u0003].\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016ab\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0003"+
		"\u0000\u0000\u016cd\u0001\u0000\u0000\u0000\u016d\u016f\u0007\u0004\u0000"+
		"\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u00062\u0000\u0000"+
		"\u0173f\u0001\u0000\u0000\u0000\u0174\u0175\t\u0000\u0000\u0000\u0175"+
		"h\u0001\u0000\u0000\u0000\u0010\u0000\u009c\u009e\u00a6\u00a8\u00ac\u00e5"+
		"\u014c\u014e\u0154\u0159\u015f\u0161\u0164\u0169\u0170\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}