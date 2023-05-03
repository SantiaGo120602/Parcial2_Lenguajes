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
public class squealParser extends Parser {
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
	public static final int
		RULE_parse_prog = 0, RULE_statement = 1, RULE_create_statement = 2, RULE_insert_statement = 3, 
		RULE_read_statement = 4, RULE_update_statement = 5, RULE_delete_statement = 6, 
		RULE_drop_statement = 7, RULE_read_expression = 8, RULE_columndef = 9, 
		RULE_data_type = 10, RULE_column_name = 11, RULE_table_name = 12, RULE_expression = 13, 
		RULE_and_condition = 14, RULE_condition = 15, RULE_operand = 16, RULE_summand = 17, 
		RULE_factor = 18, RULE_term = 19, RULE_compare = 20, RULE_alias = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse_prog", "statement", "create_statement", "insert_statement", "read_statement", 
			"update_statement", "delete_statement", "drop_statement", "read_expression", 
			"columndef", "data_type", "column_name", "table_name", "expression", 
			"and_condition", "condition", "operand", "summand", "factor", "term", 
			"compare", "alias"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public squealParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_progContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(squealParser.EOF, 0); }
		public Parse_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitParse_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_progContext parse_prog() throws RecognitionException {
		Parse_progContext _localctx = new Parse_progContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			statement();
			setState(45);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(squealParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(squealParser.SEMICOLON, i);
		}
		public List<Create_statementContext> create_statement() {
			return getRuleContexts(Create_statementContext.class);
		}
		public Create_statementContext create_statement(int i) {
			return getRuleContext(Create_statementContext.class,i);
		}
		public List<Read_statementContext> read_statement() {
			return getRuleContexts(Read_statementContext.class);
		}
		public Read_statementContext read_statement(int i) {
			return getRuleContext(Read_statementContext.class,i);
		}
		public List<Update_statementContext> update_statement() {
			return getRuleContexts(Update_statementContext.class);
		}
		public Update_statementContext update_statement(int i) {
			return getRuleContext(Update_statementContext.class,i);
		}
		public List<Delete_statementContext> delete_statement() {
			return getRuleContexts(Delete_statementContext.class);
		}
		public Delete_statementContext delete_statement(int i) {
			return getRuleContext(Delete_statementContext.class,i);
		}
		public List<Drop_statementContext> drop_statement() {
			return getRuleContexts(Drop_statementContext.class);
		}
		public Drop_statementContext drop_statement(int i) {
			return getRuleContext(Drop_statementContext.class,i);
		}
		public List<Insert_statementContext> insert_statement() {
			return getRuleContexts(Insert_statementContext.class);
		}
		public Insert_statementContext insert_statement(int i) {
			return getRuleContext(Insert_statementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35190816178176L) != 0) {
				{
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(47);
					create_statement();
					}
					break;
				case READ:
					{
					setState(48);
					read_statement();
					}
					break;
				case UPDATE:
					{
					setState(49);
					update_statement();
					}
					break;
				case DELETE:
					{
					setState(50);
					delete_statement();
					}
					break;
				case DROP:
					{
					setState(51);
					drop_statement();
					}
					break;
				case INSERT:
					{
					setState(52);
					insert_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55);
				match(SEMICOLON);
				}
				}
				setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_statementContext extends ParserRuleContext {
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
	 
		public Create_statementContext() { }
		public void copyFrom(Create_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Create_stateContext extends Create_statementContext {
		public TerminalNode CREATE() { return getToken(squealParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(squealParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAR() { return getToken(squealParser.LEFT_PAR, 0); }
		public List<ColumndefContext> columndef() {
			return getRuleContexts(ColumndefContext.class);
		}
		public ColumndefContext columndef(int i) {
			return getRuleContext(ColumndefContext.class,i);
		}
		public TerminalNode RIGHT_PAR() { return getToken(squealParser.RIGHT_PAR, 0); }
		public List<TerminalNode> COMA() { return getTokens(squealParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(squealParser.COMA, i);
		}
		public Create_stateContext(Create_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitCreate_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_statement);
		int _la;
		try {
			_localctx = new Create_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CREATE);
			setState(63);
			match(TABLE);
			setState(64);
			table_name();
			setState(65);
			match(LEFT_PAR);
			setState(66);
			columndef();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(67);
				match(COMA);
				setState(68);
				columndef();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(RIGHT_PAR);
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
	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
	 
		public Insert_statementContext() { }
		public void copyFrom(Insert_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stateContext extends Insert_statementContext {
		public TerminalNode INSERT() { return getToken(squealParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(squealParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAR() { return getTokens(squealParser.LEFT_PAR); }
		public TerminalNode LEFT_PAR(int i) {
			return getToken(squealParser.LEFT_PAR, i);
		}
		public List<TerminalNode> RIGHT_PAR() { return getTokens(squealParser.RIGHT_PAR); }
		public TerminalNode RIGHT_PAR(int i) {
			return getToken(squealParser.RIGHT_PAR, i);
		}
		public TerminalNode VALUES() { return getToken(squealParser.VALUES, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(squealParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(squealParser.COMA, i);
		}
		public Insert_stateContext(Insert_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitInsert_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insert_statement);
		int _la;
		try {
			_localctx = new Insert_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(INSERT);
			setState(77);
			match(INTO);
			setState(78);
			table_name();
			setState(79);
			match(LEFT_PAR);
			{
			setState(80);
			column_name();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(81);
				match(COMA);
				setState(82);
				column_name();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(88);
			match(RIGHT_PAR);
			setState(89);
			match(VALUES);
			setState(90);
			match(LEFT_PAR);
			{
			setState(91);
			term();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(92);
				match(COMA);
				setState(93);
				term();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(99);
			match(RIGHT_PAR);
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
	public static class Read_statementContext extends ParserRuleContext {
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
	 
		public Read_statementContext() { }
		public void copyFrom(Read_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Read_stateContext extends Read_statementContext {
		public TerminalNode READ() { return getToken(squealParser.READ, 0); }
		public Read_expressionContext read_expression() {
			return getRuleContext(Read_expressionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(squealParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(squealParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(squealParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(squealParser.ALL, 0); }
		public Read_stateContext(Read_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitRead_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read_statement);
		int _la;
		try {
			_localctx = new Read_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(READ);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(105);
			read_expression();
			setState(106);
			match(FROM);
			setState(107);
			table_name();
			setState(108);
			match(WHERE);
			setState(109);
			expression();
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
	public static class Update_statementContext extends ParserRuleContext {
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
	 
		public Update_statementContext() { }
		public void copyFrom(Update_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Update_stateContext extends Update_statementContext {
		public TerminalNode UPDATE() { return getToken(squealParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(squealParser.SET, 0); }
		public TerminalNode WHERE() { return getToken(squealParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(squealParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(squealParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(squealParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(squealParser.DOUBLE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(squealParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(squealParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(squealParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(squealParser.BOOL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(squealParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(squealParser.COMA, i);
		}
		public Update_stateContext(Update_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitUpdate_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update_statement);
		int _la;
		try {
			_localctx = new Update_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(UPDATE);
			setState(112);
			table_name();
			setState(113);
			match(SET);
			{
			setState(114);
			column_name();
			setState(115);
			match(T__0);
			setState(116);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 844424946941952L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(117);
				match(COMA);
				setState(118);
				column_name();
				setState(119);
				match(T__0);
				setState(120);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 844424946941952L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(127);
			match(WHERE);
			setState(128);
			expression();
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
	public static class Delete_statementContext extends ParserRuleContext {
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
	 
		public Delete_statementContext() { }
		public void copyFrom(Delete_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stateContext extends Delete_statementContext {
		public TerminalNode DELETE() { return getToken(squealParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(squealParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(squealParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Delete_stateContext(Delete_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitDelete_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete_statement);
		int _la;
		try {
			_localctx = new Delete_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DELETE);
			setState(131);
			match(FROM);
			setState(132);
			table_name();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(133);
				match(WHERE);
				setState(134);
				expression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_statementContext extends ParserRuleContext {
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
	 
		public Drop_statementContext() { }
		public void copyFrom(Drop_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Drop_stateContext extends Drop_statementContext {
		public TerminalNode DROP() { return getToken(squealParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(squealParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_stateContext(Drop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitDrop_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop_statement);
		try {
			_localctx = new Drop_stateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DROP);
			setState(138);
			match(TABLE);
			setState(139);
			table_name();
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
	public static class Read_expressionContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(squealParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(squealParser.AS, i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(squealParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(squealParser.COMA, i);
		}
		public Read_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitRead_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(141);
				match(T__1);
				}
				break;
			case NAME:
				{
				{
				setState(142);
				column_name();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(143);
					match(AS);
					setState(144);
					alias();
					}
				}

				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(147);
					match(COMA);
					setState(148);
					column_name();
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(149);
						match(AS);
						setState(150);
						alias();
						}
					}

					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumndefContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode NULL() { return getToken(squealParser.NULL, 0); }
		public TerminalNode PRIMARY_KEY() { return getToken(squealParser.PRIMARY_KEY, 0); }
		public TerminalNode NOT() { return getToken(squealParser.NOT, 0); }
		public ColumndefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columndef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitColumndef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumndefContext columndef() throws RecognitionException {
		ColumndefContext _localctx = new ColumndefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columndef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			column_name();
			setState(161);
			data_type();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(162);
					match(NOT);
					}
				}

				setState(165);
				match(NULL);
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY_KEY) {
				{
				setState(168);
				match(PRIMARY_KEY);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(squealParser.BOOL, 0); }
		public TerminalNode LEFT_PAR() { return getToken(squealParser.LEFT_PAR, 0); }
		public TerminalNode INT() { return getToken(squealParser.INT, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(squealParser.RIGHT_PAR, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(171);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(172);
				match(T__3);
				}
				break;
			case T__4:
				{
				{
				setState(173);
				match(T__4);
				setState(174);
				match(LEFT_PAR);
				setState(175);
				match(INT);
				setState(176);
				match(RIGHT_PAR);
				}
				}
				break;
			case T__5:
				{
				setState(177);
				match(T__5);
				}
				break;
			case BOOL:
				{
				setState(178);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(squealParser.NAME, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NAME);
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
	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(squealParser.NAME, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(NAME);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<And_conditionContext> and_condition() {
			return getRuleContexts(And_conditionContext.class);
		}
		public And_conditionContext and_condition(int i) {
			return getRuleContext(And_conditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(squealParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(squealParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			and_condition();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(OR);
					setState(187);
					and_condition();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_conditionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(squealParser.AND, 0); }
		public And_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitAnd_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_conditionContext and_condition() throws RecognitionException {
		And_conditionContext _localctx = new And_conditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			condition();
			{
			setState(194);
			match(AND);
			setState(195);
			condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAR() { return getToken(squealParser.LEFT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(squealParser.RIGHT_PAR, 0); }
		public TerminalNode NOT() { return getToken(squealParser.NOT, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode IS() { return getToken(squealParser.IS, 0); }
		public TerminalNode NULL() { return getToken(squealParser.NULL, 0); }
		public TerminalNode BETWEEN() { return getToken(squealParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(squealParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(squealParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(squealParser.IN, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(squealParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(squealParser.COMA, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(197);
				match(LEFT_PAR);
				setState(198);
				expression();
				setState(199);
				match(RIGHT_PAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(201);
				match(NOT);
				setState(202);
				expression();
				}
				}
				break;
			case 3:
				{
				{
				setState(203);
				operand();
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					{
					setState(204);
					match(IS);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(205);
						match(NOT);
						}
					}

					setState(208);
					match(NULL);
					}
					}
					break;
				case 2:
					{
					{
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(209);
						match(NOT);
						}
					}

					setState(212);
					match(BETWEEN);
					setState(213);
					operand();
					setState(214);
					match(AND);
					setState(215);
					operand();
					}
					}
					break;
				case 3:
					{
					{
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(217);
						match(NOT);
						}
					}

					setState(220);
					match(LIKE);
					setState(221);
					operand();
					}
					}
					break;
				case 4:
					{
					{
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(222);
						match(NOT);
						}
					}

					setState(225);
					match(IN);
					{
					setState(226);
					operand();
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(227);
						match(COMA);
						setState(228);
						operand();
						}
						}
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					break;
				case 5:
					{
					{
					setState(234);
					compare();
					setState(235);
					operand();
					}
					}
					break;
				}
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public SummandContext summand() {
			return getRuleContext(SummandContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			summand();
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
	public static class SummandContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitSummand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_summand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			factor();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				factor();
				}
				}
				setState(250);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			term();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__8) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				term();
				}
				}
				setState(258);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(squealParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(squealParser.INT, 0); }
		public TerminalNode STRING() { return getToken(squealParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(squealParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(squealParser.NULL, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode LEFT_PAR() { return getToken(squealParser.LEFT_PAR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(squealParser.RIGHT_PAR, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				{
				setState(259);
				match(DOUBLE);
				}
				}
				break;
			case INT:
				{
				{
				setState(260);
				match(INT);
				}
				}
				break;
			case STRING:
				{
				{
				setState(261);
				match(STRING);
				}
				}
				break;
			case BOOL:
				{
				{
				setState(262);
				match(BOOL);
				}
				}
				break;
			case NULL:
				{
				{
				setState(263);
				match(NULL);
				}
				}
				break;
			case NAME:
				{
				{
				setState(264);
				column_name();
				}
				}
				break;
			case LEFT_PAR:
				{
				{
				setState(265);
				match(LEFT_PAR);
				setState(266);
				operand();
				setState(267);
				match(RIGHT_PAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31746L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(squealParser.NAME, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof squealVisitor ) return ((squealVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NAME);
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
		"\u0004\u00014\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"_\b\u0003\n\u0003\f\u0003b\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0092"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0005\b\u009a\b"+
		"\b\n\b\f\b\u009d\t\b\u0003\b\u009f\b\b\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00a4\b\t\u0001\t\u0003\t\u00a7\b\t\u0001\t\u0003\t\u00aa\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b4"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00bd\b\r\n\r\f\r\u00c0\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00cf\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00db\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e0\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e6\b\u000f\n\u000f\f\u000f"+
		"\u00e9\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ee\b"+
		"\u000f\u0003\u000f\u00f0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00f7\b\u0011\n\u0011\f\u0011\u00fa\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ff\b\u0012\n\u0012"+
		"\f\u0012\u0102\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u010e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0005\u0002\u0000"+
		"\u0016\u0016!!\u0003\u0000\u000f\u000f\u0018\u001801\u0001\u0000\u0007"+
		"\b\u0002\u0000\u0002\u0002\t\t\u0002\u0000\u0001\u0001\n\u000e\u0128\u0000"+
		",\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004>\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000"+
		"\u0000\no\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e"+
		"\u0089\u0001\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012"+
		"\u00a0\u0001\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016"+
		"\u00b5\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a"+
		"\u00b9\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000\u001e"+
		"\u00ef\u0001\u0000\u0000\u0000 \u00f1\u0001\u0000\u0000\u0000\"\u00f3"+
		"\u0001\u0000\u0000\u0000$\u00fb\u0001\u0000\u0000\u0000&\u010d\u0001\u0000"+
		"\u0000\u0000(\u010f\u0001\u0000\u0000\u0000*\u0111\u0001\u0000\u0000\u0000"+
		",-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000"+
		"\u0000\u0000/6\u0003\u0004\u0002\u000006\u0003\b\u0004\u000016\u0003\n"+
		"\u0005\u000026\u0003\f\u0006\u000036\u0003\u000e\u0007\u000046\u0003\u0006"+
		"\u0003\u00005/\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u000051\u0001"+
		"\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005+\u0000\u0000"+
		"8:\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0003\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?@\u0005"+
		",\u0000\u0000@A\u0003\u0018\f\u0000AB\u0005)\u0000\u0000BG\u0003\u0012"+
		"\t\u0000CD\u0005\u0017\u0000\u0000DF\u0003\u0012\t\u0000EC\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JK\u0005*\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0005\u0010\u0000"+
		"\u0000MN\u0005\u0011\u0000\u0000NO\u0003\u0018\f\u0000OP\u0005)\u0000"+
		"\u0000PU\u0003\u0016\u000b\u0000QR\u0005\u0017\u0000\u0000RT\u0003\u0016"+
		"\u000b\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005*\u0000\u0000YZ\u0005\u0012\u0000\u0000"+
		"Z[\u0005)\u0000\u0000[`\u0003&\u0013\u0000\\]\u0005\u0017\u0000\u0000"+
		"]_\u0003&\u0013\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cd\u0005*\u0000\u0000d\u0007\u0001\u0000"+
		"\u0000\u0000eg\u0005\u0013\u0000\u0000fh\u0007\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0003\u0010\b\u0000jk\u0005\u001d\u0000\u0000kl\u0003\u0018\f\u0000"+
		"lm\u0005\u001e\u0000\u0000mn\u0003\u001a\r\u0000n\t\u0001\u0000\u0000"+
		"\u0000op\u0005\u0014\u0000\u0000pq\u0003\u0018\f\u0000qr\u0005\u0015\u0000"+
		"\u0000rs\u0003\u0016\u000b\u0000st\u0005\u0001\u0000\u0000t|\u0007\u0001"+
		"\u0000\u0000uv\u0005\u0017\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0005"+
		"\u0001\u0000\u0000xy\u0007\u0001\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zu\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u001e\u0000\u0000\u0080\u0081\u0003"+
		"\u001a\r\u0000\u0081\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001f"+
		"\u0000\u0000\u0083\u0084\u0005\u001d\u0000\u0000\u0084\u0087\u0003\u0018"+
		"\f\u0000\u0085\u0086\u0005\u001e\u0000\u0000\u0086\u0088\u0003\u001a\r"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005 \u0000\u0000"+
		"\u008a\u008b\u0005,\u0000\u0000\u008b\u008c\u0003\u0018\f\u0000\u008c"+
		"\u000f\u0001\u0000\u0000\u0000\u008d\u009f\u0005\u0002\u0000\u0000\u008e"+
		"\u0091\u0003\u0016\u000b\u0000\u008f\u0090\u0005\u001b\u0000\u0000\u0090"+
		"\u0092\u0003*\u0015\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u009b\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u0017\u0000\u0000\u0094\u0097\u0003\u0016\u000b\u0000\u0095\u0096"+
		"\u0005\u001b\u0000\u0000\u0096\u0098\u0003*\u0015\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u009a\u009d\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u008d\u0001\u0000\u0000\u0000\u009e\u008e\u0001"+
		"\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003"+
		"\u0016\u000b\u0000\u00a1\u00a6\u0003\u0014\n\u0000\u00a2\u00a4\u0005#"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005$\u0000"+
		"\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005(\u0000\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00b4\u0005\u0003\u0000\u0000"+
		"\u00ac\u00b4\u0005\u0004\u0000\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000"+
		"\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b0\u00051\u0000\u0000\u00b0\u00b4"+
		"\u0005*\u0000\u0000\u00b1\u00b4\u0005\u0006\u0000\u0000\u00b2\u00b4\u0005"+
		"\u0018\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0015\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005.\u0000\u0000\u00b6\u0017\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005.\u0000\u0000\u00b8\u0019\u0001\u0000\u0000"+
		"\u0000\u00b9\u00be\u0003\u001c\u000e\u0000\u00ba\u00bb\u0005\u0019\u0000"+
		"\u0000\u00bb\u00bd\u0003\u001c\u000e\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u001b\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f"+
		"\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f"+
		"\u0000\u00c4\u001d\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005)\u0000\u0000"+
		"\u00c6\u00c7\u0003\u001a\r\u0000\u00c7\u00c8\u0005*\u0000\u0000\u00c8"+
		"\u00f0\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca\u00f0"+
		"\u0003\u001a\r\u0000\u00cb\u00ed\u0003 \u0010\u0000\u00cc\u00ce\u0005"+
		"\"\u0000\u0000\u00cd\u00cf\u0005#\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ee\u0005$\u0000\u0000\u00d1\u00d3\u0005#\u0000\u0000"+
		"\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005%\u0000\u0000\u00d5"+
		"\u00d6\u0003 \u0010\u0000\u00d6\u00d7\u0005\u001a\u0000\u0000\u00d7\u00d8"+
		"\u0003 \u0010\u0000\u00d8\u00ee\u0001\u0000\u0000\u0000\u00d9\u00db\u0005"+
		"#\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005&\u0000"+
		"\u0000\u00dd\u00ee\u0003 \u0010\u0000\u00de\u00e0\u0005#\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\'\u0000\u0000\u00e2\u00e7"+
		"\u0003 \u0010\u0000\u00e3\u00e4\u0005\u0017\u0000\u0000\u00e4\u00e6\u0003"+
		" \u0010\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0003(\u0014\u0000\u00eb\u00ec\u0003 \u0010\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ed\u00d2\u0001\u0000\u0000\u0000\u00ed\u00da\u0001\u0000\u0000\u0000"+
		"\u00ed\u00df\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00c5\u0001\u0000\u0000\u0000"+
		"\u00ef\u00c9\u0001\u0000\u0000\u0000\u00ef\u00cb\u0001\u0000\u0000\u0000"+
		"\u00f0\u001f\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\"\u0011\u0000\u00f2"+
		"!\u0001\u0000\u0000\u0000\u00f3\u00f8\u0003$\u0012\u0000\u00f4\u00f5\u0007"+
		"\u0002\u0000\u0000\u00f5\u00f7\u0003$\u0012\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9#\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u0100\u0003&\u0013\u0000"+
		"\u00fc\u00fd\u0007\u0003\u0000\u0000\u00fd\u00ff\u0003&\u0013\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"%\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u010e"+
		"\u00050\u0000\u0000\u0104\u010e\u00051\u0000\u0000\u0105\u010e\u0005\u000f"+
		"\u0000\u0000\u0106\u010e\u0005\u0018\u0000\u0000\u0107\u010e\u0005$\u0000"+
		"\u0000\u0108\u010e\u0003\u0016\u000b\u0000\u0109\u010a\u0005)\u0000\u0000"+
		"\u010a\u010b\u0003 \u0010\u0000\u010b\u010c\u0005*\u0000\u0000\u010c\u010e"+
		"\u0001\u0000\u0000\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u0104"+
		"\u0001\u0000\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u0106"+
		"\u0001\u0000\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010d\u0108"+
		"\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010e\'\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0007\u0004\u0000\u0000\u0110)\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005.\u0000\u0000\u0112+\u0001\u0000\u0000\u0000"+
		"\u001b5;GU`g|\u0087\u0091\u0097\u009b\u009e\u00a3\u00a6\u00a9\u00b3\u00be"+
		"\u00ce\u00d2\u00da\u00df\u00e7\u00ed\u00ef\u00f8\u0100\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}