// Generated from /Users/joeymac/Desktop/P2/Grammar.g4 by ANTLR 4.7.1

     import java.util.HashMap; 
     import java.lang.Math;
     import java.util.Scanner;
     
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PROGRAM=7, VAR=8, TRUE=9, 
		FALSE=10, BOOLEAN=11, AND=12, OR=13, NOT=14, MOD=15, SQRT=16, LN=17, EXP=18, 
		SIN=19, COS=20, REAL=21, IF=22, THEN=23, ELSE=24, CASE=25, OF=26, BEGIN=27, 
		END=28, LPAREN=29, RPAREN=30, MULT=31, DIV=32, ADD=33, SUBT=34, EQ=35, 
		GT=36, LT=37, GTE=38, LTE=39, NEQ=40, DELIM=41, ID=42, STRING_LITERAL=43, 
		NUM=44, WS=45, COMMENT_1=46, COMMENT_2=47;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_varBlock = 2, RULE_varDecs = 3, 
		RULE_varDec = 4, RULE_block = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_varAssign = 8, RULE_readLn = 9, RULE_writeLn = 10, RULE_line = 11, 
		RULE_ifStatement = 12, RULE_condBlock = 13, RULE_stateBlock = 14, RULE_expr = 15, 
		RULE_element = 16;
	public static final String[] ruleNames = {
		"start", "program", "varBlock", "varDecs", "varDec", "block", "statements", 
		"statement", "varAssign", "readLn", "writeLn", "line", "ifStatement", 
		"condBlock", "stateBlock", "expr", "element"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "':'", "':='", "'readln'", "'writeln'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'('", "')'", "'*'", "'/'", 
		"'+'", "'-'", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PROGRAM", "VAR", "TRUE", "FALSE", 
		"BOOLEAN", "AND", "OR", "NOT", "MOD", "SQRT", "LN", "EXP", "SIN", "COS", 
		"REAL", "IF", "THEN", "ELSE", "CASE", "OF", "BEGIN", "END", "LPAREN", 
		"RPAREN", "MULT", "DIV", "ADD", "SUBT", "EQ", "GT", "LT", "GTE", "LTE", 
		"NEQ", "DELIM", "ID", "STRING_LITERAL", "NUM", "WS", "COMMENT_1", "COMMENT_2"
	};
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    Scanner io = new Scanner(System.in);

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			program();
			setState(35);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(GrammarParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PROGRAM);
			setState(38);
			match(ID);
			setState(39);
			match(T__0);
			setState(40);
			varBlock();
			setState(41);
			block();
			setState(42);
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

	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public VarDecsContext varDecs() {
			return getRuleContext(VarDecsContext.class,0);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varBlock);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(VAR);
				setState(46);
				varDecs();
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

	public static class VarDecsContext extends ParserRuleContext {
		public static HashMap<String,String> localMap = new HashMap<String, String>();;
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public VarDecsContext varDecs() {
			return getRuleContext(VarDecsContext.class,0);
		}
		public VarDecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecs; }
	}

	public final VarDecsContext varDecs() throws RecognitionException {
		VarDecsContext _localctx = new VarDecsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecs);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				varDec();
				setState(51);
				varDecs();
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

	public static class VarDecContext extends ParserRuleContext {
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
	 
		public VarDecContext() { }
		public void copyFrom(VarDecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDecContext extends VarDecContext {
		public Token type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public InitDecContext(VarDecContext ctx) { copyFrom(ctx); }
	}
	public static class NormDecContext extends VarDecContext {
		public Token type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public NormDecContext(VarDecContext ctx) { copyFrom(ctx); }
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDec);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(ID);
				setState(56);
				match(T__2);
				setState(57);
				((InitDecContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==REAL) ) {
					((InitDecContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				match(EQ);
				setState(59);
				expr(0);
				setState(60);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new NormDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__2);
				setState(64);
				((NormDecContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==REAL) ) {
					((NormDecContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(T__0);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(BEGIN);
				setState(70);
				statements();
				setState(71);
				match(END);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
			case T__5:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				statement();
				setState(77);
				statements();
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
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReadLnContext readLn() {
			return getRuleContext(ReadLnContext.class,0);
		}
		public WriteLnContext writeLn() {
			return getRuleContext(WriteLnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				varAssign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				ifStatement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				readLn();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				writeLn();
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

	public static class VarAssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(88);
			match(T__3);
			setState(89);
			expr(0);
			setState(90);
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

	public static class ReadLnContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ReadLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readLn; }
	}

	public final ReadLnContext readLn() throws RecognitionException {
		ReadLnContext _localctx = new ReadLnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_readLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__4);
			setState(93);
			match(LPAREN);
			setState(94);
			match(ID);
			setState(95);
			match(RPAREN);
			setState(96);
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

	public static class WriteLnContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(GrammarParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GrammarParser.DELIM, i);
		}
		public WriteLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeLn; }
	}

	public final WriteLnContext writeLn() throws RecognitionException {
		WriteLnContext _localctx = new WriteLnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writeLn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__5);
			setState(99);
			match(LPAREN);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				line();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELIM) {
					{
					setState(101);
					match(DELIM);
					}
				}

				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << SQRT) | (1L << LN) | (1L << EXP) | (1L << SIN) | (1L << COS) | (1L << LPAREN) | (1L << SUBT) | (1L << ID) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) );
			setState(108);
			match(RPAREN);
			setState(109);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLineContext extends LineContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLineContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class StrLineContext extends LineContext {
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public StrLineContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_line);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NOT:
			case SQRT:
			case LN:
			case EXP:
			case SIN:
			case COS:
			case LPAREN:
			case SUBT:
			case ID:
			case NUM:
				_localctx = new ExprLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				expr(0);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(STRING_LITERAL);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(GrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(GrammarParser.IF, i);
		}
		public List<CondBlockContext> condBlock() {
			return getRuleContexts(CondBlockContext.class);
		}
		public CondBlockContext condBlock(int i) {
			return getRuleContext(CondBlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(GrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(GrammarParser.ELSE, i);
		}
		public StateBlockContext stateBlock() {
			return getRuleContext(StateBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			condBlock();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					match(ELSE);
					setState(118);
					match(IF);
					setState(119);
					condBlock();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
				match(ELSE);
				setState(126);
				stateBlock();
				}
			}

			setState(129);
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

	public static class CondBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public StateBlockContext stateBlock() {
			return getRuleContext(StateBlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public CondBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBlock; }
	}

	public final CondBlockContext condBlock() throws RecognitionException {
		CondBlockContext _localctx = new CondBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(131);
				match(LPAREN);
				}
				break;
			}
			setState(134);
			expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(135);
				match(RPAREN);
				}
			}

			setState(138);
			match(THEN);
			setState(139);
			stateBlock();
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

	public static class StateBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateBlock; }
	}

	public final StateBlockContext stateBlock() throws RecognitionException {
		StateBlockContext _localctx = new StateBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stateBlock);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ELSE:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				block();
				}
				break;
			case T__4:
			case T__5:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public TerminalNode SUBT() { return getToken(GrammarParser.SUBT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ElementExprContext extends ExprContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext lEx;
		public Token op;
		public ExprContext rEx;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUBT() { return getToken(GrammarParser.SUBT, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EquationExprContext extends ExprContext {
		public Token type;
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SQRT() { return getToken(GrammarParser.SQRT, 0); }
		public TerminalNode LN() { return getToken(GrammarParser.LN, 0); }
		public TerminalNode EXP() { return getToken(GrammarParser.EXP, 0); }
		public TerminalNode SIN() { return getToken(GrammarParser.SIN, 0); }
		public TerminalNode COS() { return getToken(GrammarParser.COS, 0); }
		public EquationExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext lEx;
		public ExprContext rEx;
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultExprContext extends ExprContext {
		public ExprContext lEx;
		public Token op;
		public ExprContext rEx;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExprContext extends ExprContext {
		public ExprContext lEx;
		public Token op;
		public ExprContext rEx;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(GrammarParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CompareExprContext extends ExprContext {
		public ExprContext lEx;
		public Token op;
		public ExprContext rEx;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTE() { return getToken(GrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(GrammarParser.GTE, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext lEx;
		public ExprContext rEx;
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
			case LN:
			case EXP:
			case SIN:
			case COS:
				{
				_localctx = new EquationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				((EquationExprContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << LN) | (1L << EXP) | (1L << SIN) | (1L << COS))) != 0)) ) {
					((EquationExprContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				match(LPAREN);
				setState(148);
				expr(0);
				setState(149);
				match(RPAREN);
				}
				break;
			case SUBT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(SUBT);
				setState(152);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NOT);
				setState(154);
				expr(8);
				}
				break;
			case TRUE:
			case FALSE:
			case LPAREN:
			case ID:
			case NUM:
				{
				_localctx = new ElementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						((MultExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MULT) | (1L << DIV))) != 0)) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						((MultExprContext)_localctx).rEx = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBT) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						((AddExprContext)_localctx).rEx = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						((CompareExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						((CompareExprContext)_localctx).rEx = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						((EqualityExprContext)_localctx).rEx = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(AND);
						setState(172);
						((AndExprContext)_localctx).rEx = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						match(OR);
						setState(175);
						((OrExprContext)_localctx).rEx = expr(3);
						}
						break;
					}
					} 
				}
				setState(180);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdElementContext extends ElementContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdElementContext(ElementContext ctx) { copyFrom(ctx); }
	}
	public static class RealElementContext extends ElementContext {
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public RealElementContext(ElementContext ctx) { copyFrom(ctx); }
	}
	public static class BoolElementContext extends ElementContext {
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public BoolElementContext(ElementContext ctx) { copyFrom(ctx); }
	}
	public static class ParElementContext extends ElementContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ParElementContext(ElementContext ctx) { copyFrom(ctx); }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_element);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(LPAREN);
				setState(182);
				expr(0);
				setState(183);
				match(RPAREN);
				}
				break;
			case ID:
				_localctx = new IdElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUM:
				_localctx = new RealElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3"+
		"\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\5\fi\n\f\6\fk\n\f\r\f\16\fl\3\f\3\f\3\f\3\r\3\r\5\rt\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\7\16{\n\16\f\16\16\16~\13\16\3\16\3\16\5\16\u0082"+
		"\n\16\3\16\3\16\3\17\5\17\u0087\n\17\3\17\3\17\5\17\u008b\n\17\3\17\3"+
		"\17\3\17\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u009f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b3\n\21"+
		"\f\21\16\21\u00b6\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bf"+
		"\n\22\3\22\2\3 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\t\4\2\r"+
		"\r\27\27\3\2\22\26\4\2\21\21!\"\3\2#$\3\2&)\4\2%%**\3\2\13\f\2\u00cb\2"+
		"$\3\2\2\2\4\'\3\2\2\2\6\61\3\2\2\2\b\67\3\2\2\2\nD\3\2\2\2\fK\3\2\2\2"+
		"\16Q\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24^\3\2\2\2\26d\3\2\2\2\30s\3\2\2"+
		"\2\32u\3\2\2\2\34\u0086\3\2\2\2\36\u0091\3\2\2\2 \u009e\3\2\2\2\"\u00be"+
		"\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2\'(\7\t\2\2()\7,\2\2)*\7\3\2\2"+
		"*+\5\6\4\2+,\5\f\7\2,-\7\4\2\2-\5\3\2\2\2.\62\3\2\2\2/\60\7\n\2\2\60\62"+
		"\5\b\5\2\61.\3\2\2\2\61/\3\2\2\2\62\7\3\2\2\2\638\3\2\2\2\64\65\5\n\6"+
		"\2\65\66\5\b\5\2\668\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\28\t\3\2\2\29:"+
		"\7,\2\2:;\7\5\2\2;<\t\2\2\2<=\7%\2\2=>\5 \21\2>?\7\3\2\2?E\3\2\2\2@A\7"+
		",\2\2AB\7\5\2\2BC\t\2\2\2CE\7\3\2\2D9\3\2\2\2D@\3\2\2\2E\13\3\2\2\2FL"+
		"\3\2\2\2GH\7\35\2\2HI\5\16\b\2IJ\7\36\2\2JL\3\2\2\2KF\3\2\2\2KG\3\2\2"+
		"\2L\r\3\2\2\2MR\3\2\2\2NO\5\20\t\2OP\5\16\b\2PR\3\2\2\2QM\3\2\2\2QN\3"+
		"\2\2\2R\17\3\2\2\2SX\5\22\n\2TX\5\32\16\2UX\5\24\13\2VX\5\26\f\2WS\3\2"+
		"\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\21\3\2\2\2YZ\7,\2\2Z[\7\6\2\2[\\\5"+
		" \21\2\\]\7\3\2\2]\23\3\2\2\2^_\7\7\2\2_`\7\37\2\2`a\7,\2\2ab\7 \2\2b"+
		"c\7\3\2\2c\25\3\2\2\2de\7\b\2\2ej\7\37\2\2fh\5\30\r\2gi\7+\2\2hg\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\7 \2\2op\7\3\2\2p\27\3\2\2\2qt\5 \21\2rt\7-\2\2sq\3\2\2\2sr\3\2\2"+
		"\2t\31\3\2\2\2uv\7\30\2\2v|\5\34\17\2wx\7\32\2\2xy\7\30\2\2y{\5\34\17"+
		"\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0081\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\32\2\2\u0080\u0082\5\36\20\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\3\2\2\u0084\33\3\2\2\2\u0085"+
		"\u0087\7\37\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u008a\5 \21\2\u0089\u008b\7 \2\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e\5"+
		"\36\20\2\u008e\35\3\2\2\2\u008f\u0092\5\f\7\2\u0090\u0092\5\20\t\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\37\3\2\2\2\u0093\u0094\b\21\1"+
		"\2\u0094\u0095\t\3\2\2\u0095\u0096\7\37\2\2\u0096\u0097\5 \21\2\u0097"+
		"\u0098\7 \2\2\u0098\u009f\3\2\2\2\u0099\u009a\7$\2\2\u009a\u009f\5 \21"+
		"\13\u009b\u009c\7\20\2\2\u009c\u009f\5 \21\n\u009d\u009f\5\"\22\2\u009e"+
		"\u0093\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\u00b4\3\2\2\2\u00a0\u00a1\f\t\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"\u00b3\5 \21\n\u00a3\u00a4\f\b\2\2\u00a4\u00a5\t\5\2\2\u00a5\u00b3\5 "+
		"\21\t\u00a6\u00a7\f\7\2\2\u00a7\u00a8\t\6\2\2\u00a8\u00b3\5 \21\b\u00a9"+
		"\u00aa\f\6\2\2\u00aa\u00ab\t\7\2\2\u00ab\u00b3\5 \21\7\u00ac\u00ad\f\5"+
		"\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00b3\5 \21\6\u00af\u00b0\f\4\2\2\u00b0"+
		"\u00b1\7\17\2\2\u00b1\u00b3\5 \21\5\u00b2\u00a0\3\2\2\2\u00b2\u00a3\3"+
		"\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5!\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00b9"+
		"\5 \21\2\u00b9\u00ba\7 \2\2\u00ba\u00bf\3\2\2\2\u00bb\u00bf\7,\2\2\u00bc"+
		"\u00bf\t\b\2\2\u00bd\u00bf\7.\2\2\u00be\u00b7\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf#\3\2\2\2\24\61\67D"+
		"KQWhls|\u0081\u0086\u008a\u0091\u009e\u00b2\u00b4\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}