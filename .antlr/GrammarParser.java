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
		SIN=19, COS=20, REAL=21, FOR=22, WHILE=23, DO=24, TO=25, BREAK=26, IF=27, 
		THEN=28, ELSE=29, CASE=30, OF=31, BEGIN=32, END=33, LPAREN=34, RPAREN=35, 
		MULT=36, DIV=37, ADD=38, SUBT=39, EQ=40, GT=41, LT=42, GTE=43, LTE=44, 
		NEQ=45, DELIM=46, ID=47, STRING_LITERAL=48, NUM=49, WS=50, COMMENT_1=51, 
		COMMENT_2=52;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_varBlock = 2, RULE_varDecs = 3, 
		RULE_varDec = 4, RULE_block = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_varAssign = 8, RULE_varForAssign = 9, RULE_readLn = 10, RULE_writeLn = 11, 
		RULE_line = 12, RULE_whileLoop = 13, RULE_forLoop = 14, RULE_loopBlock = 15, 
		RULE_loopStatements = 16, RULE_loopStatement = 17, RULE_eval_break = 18, 
		RULE_ifStatement = 19, RULE_condBlock = 20, RULE_stateBlock = 21, RULE_expr = 22, 
		RULE_element = 23;
	public static final String[] ruleNames = {
		"start", "program", "varBlock", "varDecs", "varDec", "block", "statements", 
		"statement", "varAssign", "varForAssign", "readLn", "writeLn", "line", 
		"whileLoop", "forLoop", "loopBlock", "loopStatements", "loopStatement", 
		"eval_break", "ifStatement", "condBlock", "stateBlock", "expr", "element"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "':'", "':='", "'readln'", "'writeln'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'", "'>='", 
		"'<='", "'<>'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PROGRAM", "VAR", "TRUE", "FALSE", 
		"BOOLEAN", "AND", "OR", "NOT", "MOD", "SQRT", "LN", "EXP", "SIN", "COS", 
		"REAL", "FOR", "WHILE", "DO", "TO", "BREAK", "IF", "THEN", "ELSE", "CASE", 
		"OF", "BEGIN", "END", "LPAREN", "RPAREN", "MULT", "DIV", "ADD", "SUBT", 
		"EQ", "GT", "LT", "GTE", "LTE", "NEQ", "DELIM", "ID", "STRING_LITERAL", 
		"NUM", "WS", "COMMENT_1", "COMMENT_2"
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
			setState(48);
			program();
			setState(49);
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
			setState(51);
			match(PROGRAM);
			setState(52);
			match(ID);
			setState(53);
			match(T__0);
			setState(54);
			varBlock();
			setState(55);
			block();
			setState(56);
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
			setState(61);
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
				setState(59);
				match(VAR);
				setState(60);
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
			setState(67);
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
				setState(64);
				varDec();
				setState(65);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				setState(70);
				match(T__2);
				setState(71);
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
				setState(72);
				match(EQ);
				setState(73);
				expr(0);
				setState(74);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new NormDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__2);
				setState(78);
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
				setState(79);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(BEGIN);
				setState(84);
				statements();
				setState(85);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
			case T__5:
			case FOR:
			case WHILE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				statement();
				setState(91);
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
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				varAssign();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				forLoop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				ifStatement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				readLn();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
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
			setState(103);
			match(ID);
			setState(104);
			match(T__3);
			setState(105);
			expr(0);
			setState(106);
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

	public static class VarForAssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarForAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varForAssign; }
	}

	public final VarForAssignContext varForAssign() throws RecognitionException {
		VarForAssignContext _localctx = new VarForAssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varForAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__3);
			setState(110);
			expr(0);
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
		enterRule(_localctx, 20, RULE_readLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__4);
			setState(113);
			match(LPAREN);
			setState(114);
			match(ID);
			setState(115);
			match(RPAREN);
			setState(116);
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
		enterRule(_localctx, 22, RULE_writeLn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__5);
			setState(119);
			match(LPAREN);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				line();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELIM) {
					{
					setState(121);
					match(DELIM);
					}
				}

				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << SQRT) | (1L << LN) | (1L << EXP) | (1L << SIN) | (1L << COS) | (1L << LPAREN) | (1L << SUBT) | (1L << ID) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) );
			setState(128);
			match(RPAREN);
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
		enterRule(_localctx, 24, RULE_line);
		try {
			setState(133);
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
				setState(131);
				expr(0);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(136);
				match(LPAREN);
				}
				break;
			}
			setState(139);
			expr(0);
			setState(140);
			match(RPAREN);
			setState(141);
			match(DO);
			setState(142);
			loopBlock();
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public VarForAssignContext varForAssign() {
			return getRuleContext(VarForAssignContext.class,0);
		}
		public TerminalNode TO() { return getToken(GrammarParser.TO, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FOR);
			setState(145);
			varForAssign();
			setState(146);
			match(TO);
			setState(147);
			element();
			setState(148);
			match(DO);
			setState(149);
			loopBlock();
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

	public static class LoopBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(BEGIN);
			setState(152);
			loopStatements();
			setState(153);
			match(END);
			setState(154);
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

	public static class LoopStatementsContext extends ParserRuleContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public LoopStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatements; }
	}

	public final LoopStatementsContext loopStatements() throws RecognitionException {
		LoopStatementsContext _localctx = new LoopStatementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loopStatements);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
			case T__5:
			case FOR:
			case WHILE:
			case BREAK:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				loopStatement();
				setState(158);
				loopStatements();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Eval_breakContext eval_break() {
			return getRuleContext(Eval_breakContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopStatement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				eval_break();
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

	public static class Eval_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public Eval_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_break; }
	}

	public final Eval_breakContext eval_break() throws RecognitionException {
		Eval_breakContext _localctx = new Eval_breakContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eval_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(BREAK);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			condBlock();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					match(ELSE);
					setState(172);
					match(IF);
					setState(173);
					condBlock();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(179);
				match(ELSE);
				setState(180);
				stateBlock();
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
		enterRule(_localctx, 40, RULE_condBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				match(LPAREN);
				}
				break;
			}
			setState(186);
			expr(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(187);
				match(RPAREN);
				}
			}

			setState(190);
			match(THEN);
			setState(191);
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
		enterRule(_localctx, 42, RULE_stateBlock);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				block();
				setState(194);
				match(T__0);
				}
				break;
			case T__4:
			case T__5:
			case FOR:
			case WHILE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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

				setState(200);
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
				setState(201);
				match(LPAREN);
				setState(202);
				expr(0);
				setState(203);
				match(RPAREN);
				}
				break;
			case SUBT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(SUBT);
				setState(206);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(NOT);
				setState(208);
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
				setState(209);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						((MultExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213);
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
						setState(214);
						((MultExprContext)_localctx).rEx = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
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
						setState(217);
						((AddExprContext)_localctx).rEx = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						((CompareExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
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
						setState(220);
						((CompareExprContext)_localctx).rEx = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(222);
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
						setState(223);
						((EqualityExprContext)_localctx).rEx = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						match(AND);
						setState(226);
						((AndExprContext)_localctx).rEx = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).lEx = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(228);
						match(OR);
						setState(229);
						((OrExprContext)_localctx).rEx = expr(3);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 46, RULE_element);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(LPAREN);
				setState(236);
				expr(0);
				setState(237);
				match(RPAREN);
				}
				break;
			case ID:
				_localctx = new IdElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(ID);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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
				setState(241);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4@\n\4\3\5\3\5"+
		"\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r}\n\r\6\r\177\n\r\r\r\16\r\u0080\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u0088\n\16\3\17\3\17\5\17\u008c\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\5\22\u00a3\n\22\3\23\3\23\3\23\5\23\u00a8\n\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13"+
		"\25\3\25\3\25\5\25\u00b8\n\25\3\26\5\26\u00bb\n\26\3\26\3\26\5\26\u00bf"+
		"\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00c8\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d5\n\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00f5\n\31\3\31\2\3.\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\t\4\2\r\r\27\27\3\2\22\26\4\2\21\21&\'\3\2()\3"+
		"\2+.\4\2**//\3\2\13\f\2\u0100\2\62\3\2\2\2\4\65\3\2\2\2\6?\3\2\2\2\bE"+
		"\3\2\2\2\nR\3\2\2\2\fY\3\2\2\2\16_\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24"+
		"n\3\2\2\2\26r\3\2\2\2\30x\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2\36"+
		"\u0092\3\2\2\2 \u0099\3\2\2\2\"\u00a2\3\2\2\2$\u00a7\3\2\2\2&\u00a9\3"+
		"\2\2\2(\u00ab\3\2\2\2*\u00ba\3\2\2\2,\u00c7\3\2\2\2.\u00d4\3\2\2\2\60"+
		"\u00f4\3\2\2\2\62\63\5\4\3\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66\7\t\2\2"+
		"\66\67\7\61\2\2\678\7\3\2\289\5\6\4\29:\5\f\7\2:;\7\4\2\2;\5\3\2\2\2<"+
		"@\3\2\2\2=>\7\n\2\2>@\5\b\5\2?<\3\2\2\2?=\3\2\2\2@\7\3\2\2\2AF\3\2\2\2"+
		"BC\5\n\6\2CD\5\b\5\2DF\3\2\2\2EA\3\2\2\2EB\3\2\2\2F\t\3\2\2\2GH\7\61\2"+
		"\2HI\7\5\2\2IJ\t\2\2\2JK\7*\2\2KL\5.\30\2LM\7\3\2\2MS\3\2\2\2NO\7\61\2"+
		"\2OP\7\5\2\2PQ\t\2\2\2QS\7\3\2\2RG\3\2\2\2RN\3\2\2\2S\13\3\2\2\2TZ\3\2"+
		"\2\2UV\7\"\2\2VW\5\16\b\2WX\7#\2\2XZ\3\2\2\2YT\3\2\2\2YU\3\2\2\2Z\r\3"+
		"\2\2\2[`\3\2\2\2\\]\5\20\t\2]^\5\16\b\2^`\3\2\2\2_[\3\2\2\2_\\\3\2\2\2"+
		"`\17\3\2\2\2ah\5\22\n\2bh\5\34\17\2ch\5\36\20\2dh\5(\25\2eh\5\26\f\2f"+
		"h\5\30\r\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2"+
		"h\21\3\2\2\2ij\7\61\2\2jk\7\6\2\2kl\5.\30\2lm\7\3\2\2m\23\3\2\2\2no\7"+
		"\61\2\2op\7\6\2\2pq\5.\30\2q\25\3\2\2\2rs\7\7\2\2st\7$\2\2tu\7\61\2\2"+
		"uv\7%\2\2vw\7\3\2\2w\27\3\2\2\2xy\7\b\2\2y~\7$\2\2z|\5\32\16\2{}\7\60"+
		"\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~z\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7%\2\2\u0083"+
		"\u0084\7\3\2\2\u0084\31\3\2\2\2\u0085\u0088\5.\30\2\u0086\u0088\7\62\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\33\3\2\2\2\u0089\u008b"+
		"\7\31\2\2\u008a\u008c\7$\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\5.\30\2\u008e\u008f\7%\2\2\u008f\u0090\7\32"+
		"\2\2\u0090\u0091\5 \21\2\u0091\35\3\2\2\2\u0092\u0093\7\30\2\2\u0093\u0094"+
		"\5\24\13\2\u0094\u0095\7\33\2\2\u0095\u0096\5\60\31\2\u0096\u0097\7\32"+
		"\2\2\u0097\u0098\5 \21\2\u0098\37\3\2\2\2\u0099\u009a\7\"\2\2\u009a\u009b"+
		"\5\"\22\2\u009b\u009c\7#\2\2\u009c\u009d\7\3\2\2\u009d!\3\2\2\2\u009e"+
		"\u00a3\3\2\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\5\"\22\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3#\3\2\2\2\u00a4\u00a8"+
		"\5\n\6\2\u00a5\u00a8\5\20\t\2\u00a6\u00a8\5&\24\2\u00a7\u00a4\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8%\3\2\2\2\u00a9\u00aa\7"+
		"\34\2\2\u00aa\'\3\2\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00b2\5*\26\2\u00ad"+
		"\u00ae\7\37\2\2\u00ae\u00af\7\35\2\2\u00af\u00b1\5*\26\2\u00b0\u00ad\3"+
		"\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b7\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b8\5"+
		",\27\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00bb"+
		"\7$\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\5.\30\2\u00bd\u00bf\7%\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5,\27\2\u00c2"+
		"+\3\2\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7\3\2\2\u00c5\u00c8\3\2\2\2"+
		"\u00c6\u00c8\5\20\t\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8-\3"+
		"\2\2\2\u00c9\u00ca\b\30\1\2\u00ca\u00cb\t\3\2\2\u00cb\u00cc\7$\2\2\u00cc"+
		"\u00cd\5.\30\2\u00cd\u00ce\7%\2\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\7)\2"+
		"\2\u00d0\u00d5\5.\30\13\u00d1\u00d2\7\20\2\2\u00d2\u00d5\5.\30\n\u00d3"+
		"\u00d5\5\60\31\2\u00d4\u00c9\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d1\3"+
		"\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00ea\3\2\2\2\u00d6\u00d7\f\t\2\2\u00d7"+
		"\u00d8\t\4\2\2\u00d8\u00e9\5.\30\n\u00d9\u00da\f\b\2\2\u00da\u00db\t\5"+
		"\2\2\u00db\u00e9\5.\30\t\u00dc\u00dd\f\7\2\2\u00dd\u00de\t\6\2\2\u00de"+
		"\u00e9\5.\30\b\u00df\u00e0\f\6\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e9\5."+
		"\30\7\u00e2\u00e3\f\5\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e9\5.\30\6\u00e5"+
		"\u00e6\f\4\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e9\5.\30\5\u00e8\u00d6\3"+
		"\2\2\2\u00e8\u00d9\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8"+
		"\u00e2\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee"+
		"\7$\2\2\u00ee\u00ef\5.\30\2\u00ef\u00f0\7%\2\2\u00f0\u00f5\3\2\2\2\u00f1"+
		"\u00f5\7\61\2\2\u00f2\u00f5\t\b\2\2\u00f3\u00f5\7\63\2\2\u00f4\u00ed\3"+
		"\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\61\3\2\2\2\27?ERY_g|\u0080\u0087\u008b\u00a2\u00a7\u00b2\u00b7\u00ba"+
		"\u00be\u00c7\u00d4\u00e8\u00ea\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}