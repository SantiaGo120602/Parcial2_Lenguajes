// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class punto3GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7;
	public static final int
		RULE_punto3Grammar = 0, RULE_s = 1, RULE_sprima = 2, RULE_a = 3, RULE_b = 4, 
		RULE_c = 5, RULE_cuatro = 6, RULE_cinco = 7, RULE_seis = 8, RULE_dos = 9, 
		RULE_tres = 10, RULE_uno = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"punto3Grammar", "s", "sprima", "a", "b", "c", "cuatro", "cinco", "seis", 
			"dos", "tres", "uno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cuatro'", "'cinco'", "'seis'", "'dos'", "'tres'", "'uno'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public punto3GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Punto3GrammarContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public Punto3GrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto3Grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterPunto3Grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitPunto3Grammar(this);
		}
	}

	public final Punto3GrammarContext punto3Grammar() throws RecognitionException {
		Punto3GrammarContext _localctx = new Punto3GrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_punto3Grammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			s();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SprimaContext sprima() {
			return getRuleContext(SprimaContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			a();
			setState(27);
			b();
			setState(28);
			c();
			setState(29);
			sprima();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SprimaContext extends ParserRuleContext {
		public UnoContext uno() {
			return getRuleContext(UnoContext.class,0);
		}
		public SprimaContext sprima() {
			return getRuleContext(SprimaContext.class,0);
		}
		public SprimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterSprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitSprima(this);
		}
	}

	public final SprimaContext sprima() throws RecognitionException {
		SprimaContext _localctx = new SprimaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sprima);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				uno();
				setState(32);
				sprima();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ParserRuleContext {
		public DosContext dos() {
			return getRuleContext(DosContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_a);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				dos();
				setState(38);
				b();
				setState(39);
				c();
				}
				break;
			case EOF:
			case T__0:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class BContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TresContext tres() {
			return getRuleContext(TresContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				c();
				setState(45);
				tres();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public CuatroContext cuatro() {
			return getRuleContext(CuatroContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				cuatro();
				setState(51);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuatroContext extends ParserRuleContext {
		public CuatroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuatro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterCuatro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitCuatro(this);
		}
	}

	public final CuatroContext cuatro() throws RecognitionException {
		CuatroContext _localctx = new CuatroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cuatro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CincoContext extends ParserRuleContext {
		public CincoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterCinco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitCinco(this);
		}
	}

	public final CincoContext cinco() throws RecognitionException {
		CincoContext _localctx = new CincoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cinco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeisContext extends ParserRuleContext {
		public SeisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterSeis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitSeis(this);
		}
	}

	public final SeisContext seis() throws RecognitionException {
		SeisContext _localctx = new SeisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_seis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DosContext extends ParserRuleContext {
		public DosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterDos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitDos(this);
		}
	}

	public final DosContext dos() throws RecognitionException {
		DosContext _localctx = new DosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TresContext extends ParserRuleContext {
		public TresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterTres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitTres(this);
		}
	}

	public final TresContext tres() throws RecognitionException {
		TresContext _localctx = new TresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tres);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnoContext extends ParserRuleContext {
		public UnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).enterUno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof punto3GrammarListener ) ((punto3GrammarListener)listener).exitUno(this);
		}
	}

	public final UnoContext uno() throws RecognitionException {
		UnoContext _localctx = new UnoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_uno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__5);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007E\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002$\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u00057\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0000<\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000"+
		"\u0000\b0\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f8\u0001"+
		"\u0000\u0000\u0000\u000e:\u0001\u0000\u0000\u0000\u0010<\u0001\u0000\u0000"+
		"\u0000\u0012>\u0001\u0000\u0000\u0000\u0014@\u0001\u0000\u0000\u0000\u0016"+
		"B\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c"+
		"\u0003\b\u0004\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e\u0003"+
		"\u0004\u0002\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0003\u0016"+
		"\u000b\u0000 !\u0003\u0004\u0002\u0000!$\u0001\u0000\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0003\u0012\t\u0000&\'\u0003\b"+
		"\u0004\u0000\'(\u0003\n\u0005\u0000(+\u0001\u0000\u0000\u0000)+\u0001"+
		"\u0000\u0000\u0000*%\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+\u0007\u0001\u0000\u0000\u0000,-\u0003\n\u0005\u0000-.\u0003\u0014\n"+
		"\u0000.1\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000,\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u000023\u0003"+
		"\f\u0006\u000034\u0003\b\u0004\u000047\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000062\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u000b\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u00009\r\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0002\u0000\u0000;\u000f\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0003\u0000\u0000=\u0011\u0001\u0000\u0000\u0000>?\u0005\u0004"+
		"\u0000\u0000?\u0013\u0001\u0000\u0000\u0000@A\u0005\u0005\u0000\u0000"+
		"A\u0015\u0001\u0000\u0000\u0000BC\u0005\u0006\u0000\u0000C\u0017\u0001"+
		"\u0000\u0000\u0000\u0004#*06";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}