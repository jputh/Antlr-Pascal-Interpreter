// Generated from Grammar.g4 by ANTLR 4.8

     import java.util.HashMap; 
     import java.lang.Math;
     import java.util.Scanner;
     
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PROGRAM=7, VAR=8, FUNCTION=9, 
		TRUE=10, FALSE=11, BOOLEAN=12, AND=13, OR=14, NOT=15, MOD=16, SQRT=17, 
		LN=18, EXP=19, SIN=20, COS=21, REAL=22, FOR=23, WHILE=24, DO=25, TO=26, 
		BREAK=27, IF=28, THEN=29, ELSE=30, CASE=31, OF=32, BEGIN=33, END=34, LPAREN=35, 
		RPAREN=36, MULT=37, DIV=38, ADD=39, SUBT=40, EQ=41, GT=42, LT=43, GTE=44, 
		LTE=45, NEQ=46, DELIM=47, ID=48, STRING_LITERAL=49, NUM=50, WS=51, COMMENT_1=52, 
		COMMENT_2=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "PROGRAM", "VAR", "FUNCTION", "TRUE", 
			"FALSE", "BOOLEAN", "AND", "OR", "NOT", "MOD", "SQRT", "LN", "EXP", "SIN", 
			"COS", "REAL", "FOR", "WHILE", "DO", "TO", "BREAK", "IF", "THEN", "ELSE", 
			"CASE", "OF", "BEGIN", "END", "LPAREN", "RPAREN", "MULT", "DIV", "ADD", 
			"SUBT", "EQ", "GT", "LT", "GTE", "LTE", "NEQ", "DELIM", "ID", "STRING_LITERAL", 
			"NUM", "WS", "COMMENT_1", "COMMENT_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "':'", "':='", "'readln'", "'writeln'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'", 
			"'>='", "'<='", "'<>'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PROGRAM", "VAR", "FUNCTION", 
			"TRUE", "FALSE", "BOOLEAN", "AND", "OR", "NOT", "MOD", "SQRT", "LN", 
			"EXP", "SIN", "COS", "REAL", "FOR", "WHILE", "DO", "TO", "BREAK", "IF", 
			"THEN", "ELSE", "CASE", "OF", "BEGIN", "END", "LPAREN", "RPAREN", "MULT", 
			"DIV", "ADD", "SUBT", "EQ", "GT", "LT", "GTE", "LTE", "NEQ", "DELIM", 
			"ID", "STRING_LITERAL", "NUM", "WS", "COMMENT_1", "COMMENT_2"
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

	 
	    Scanner io = new Scanner(System.in);


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;"+
		"\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C"+
		"\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\7K\u0192\nK"+
		"\fK\16K\u0195\13K\3L\3L\3L\3L\7L\u019b\nL\fL\16L\u019e\13L\3L\3L\3M\6"+
		"M\u01a3\nM\rM\16M\u01a4\3M\6M\u01a8\nM\rM\16M\u01a9\3M\3M\6M\u01ae\nM"+
		"\rM\16M\u01af\5M\u01b2\nM\3N\6N\u01b5\nN\rN\16N\u01b6\3N\3N\3O\3O\3O\3"+
		"O\7O\u01bf\nO\fO\16O\u01c2\13O\3O\3O\3O\3O\3O\3P\3P\7P\u01cb\nP\fP\16"+
		"P\u01ce\13P\3P\3P\3P\3P\4\u01c0\u01cc\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\2C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23"+
		"Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'"+
		"\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093"+
		"\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66\u009f\67\3\2 \4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C"+
		"\\c|\6\2\62;C\\aac|\3\2))\5\2\13\f\17\17\"\"\2\u01c2\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2\2\7\u00a5\3\2\2"+
		"\2\t\u00a7\3\2\2\2\13\u00aa\3\2\2\2\r\u00b1\3\2\2\2\17\u00b9\3\2\2\2\21"+
		"\u00bb\3\2\2\2\23\u00bd\3\2\2\2\25\u00bf\3\2\2\2\27\u00c1\3\2\2\2\31\u00c3"+
		"\3\2\2\2\33\u00c5\3\2\2\2\35\u00c7\3\2\2\2\37\u00c9\3\2\2\2!\u00cb\3\2"+
		"\2\2#\u00cd\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00e7"+
		"\3\2\2\2?\u00e9\3\2\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E\u00f5\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u0102\3\2\2\2K\u0107\3\2\2\2M\u010d\3\2\2\2O\u0115\3\2"+
		"\2\2Q\u0119\3\2\2\2S\u011c\3\2\2\2U\u0120\3\2\2\2W\u0124\3\2\2\2Y\u0129"+
		"\3\2\2\2[\u012c\3\2\2\2]\u0130\3\2\2\2_\u0134\3\2\2\2a\u0138\3\2\2\2c"+
		"\u013d\3\2\2\2e\u0141\3\2\2\2g\u0147\3\2\2\2i\u014a\3\2\2\2k\u014d\3\2"+
		"\2\2m\u0153\3\2\2\2o\u0156\3\2\2\2q\u015b\3\2\2\2s\u0160\3\2\2\2u\u0165"+
		"\3\2\2\2w\u0168\3\2\2\2y\u016e\3\2\2\2{\u0172\3\2\2\2}\u0174\3\2\2\2\177"+
		"\u0176\3\2\2\2\u0081\u0178\3\2\2\2\u0083\u017a\3\2\2\2\u0085\u017c\3\2"+
		"\2\2\u0087\u017e\3\2\2\2\u0089\u0180\3\2\2\2\u008b\u0182\3\2\2\2\u008d"+
		"\u0184\3\2\2\2\u008f\u0187\3\2\2\2\u0091\u018a\3\2\2\2\u0093\u018d\3\2"+
		"\2\2\u0095\u018f\3\2\2\2\u0097\u0196\3\2\2\2\u0099\u01b1\3\2\2\2\u009b"+
		"\u01b4\3\2\2\2\u009d\u01ba\3\2\2\2\u009f\u01c8\3\2\2\2\u00a1\u00a2\7="+
		"\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4\6\3\2\2\2\u00a5\u00a6"+
		"\7<\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8\u00a9\7?\2\2\u00a9\n"+
		"\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7p\2\2\u00b0\f\3\2\2\2\u00b1"+
		"\u00b2\7y\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7v\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7p\2\2\u00b8\16\3\2"+
		"\2\2\u00b9\u00ba\t\2\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\22"+
		"\3\2\2\2\u00bd\u00be\t\4\2\2\u00be\24\3\2\2\2\u00bf\u00c0\t\5\2\2\u00c0"+
		"\26\3\2\2\2\u00c1\u00c2\t\6\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\t\7\2\2\u00c4"+
		"\32\3\2\2\2\u00c5\u00c6\t\b\2\2\u00c6\34\3\2\2\2\u00c7\u00c8\t\t\2\2\u00c8"+
		"\36\3\2\2\2\u00c9\u00ca\t\n\2\2\u00ca \3\2\2\2\u00cb\u00cc\t\13\2\2\u00cc"+
		"\"\3\2\2\2\u00cd\u00ce\t\f\2\2\u00ce$\3\2\2\2\u00cf\u00d0\t\r\2\2\u00d0"+
		"&\3\2\2\2\u00d1\u00d2\t\16\2\2\u00d2(\3\2\2\2\u00d3\u00d4\t\17\2\2\u00d4"+
		"*\3\2\2\2\u00d5\u00d6\t\20\2\2\u00d6,\3\2\2\2\u00d7\u00d8\t\21\2\2\u00d8"+
		".\3\2\2\2\u00d9\u00da\t\22\2\2\u00da\60\3\2\2\2\u00db\u00dc\t\23\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\t\24\2\2\u00de\64\3\2\2\2\u00df\u00e0\t\25\2\2"+
		"\u00e0\66\3\2\2\2\u00e1\u00e2\t\26\2\2\u00e28\3\2\2\2\u00e3\u00e4\t\27"+
		"\2\2\u00e4:\3\2\2\2\u00e5\u00e6\t\30\2\2\u00e6<\3\2\2\2\u00e7\u00e8\t"+
		"\31\2\2\u00e8>\3\2\2\2\u00e9\u00ea\t\32\2\2\u00ea@\3\2\2\2\u00eb\u00ec"+
		"\t\33\2\2\u00ecB\3\2\2\2\u00ed\u00ee\5-\27\2\u00ee\u00ef\5\61\31\2\u00ef"+
		"\u00f0\5+\26\2\u00f0\u00f1\5\33\16\2\u00f1\u00f2\5\61\31\2\u00f2\u00f3"+
		"\5\17\b\2\u00f3\u00f4\5\'\24\2\u00f4D\3\2\2\2\u00f5\u00f6\59\35\2\u00f6"+
		"\u00f7\5\17\b\2\u00f7\u00f8\5\61\31\2\u00f8F\3\2\2\2\u00f9\u00fa\5\31"+
		"\r\2\u00fa\u00fb\5\67\34\2\u00fb\u00fc\5)\25\2\u00fc\u00fd\5\23\n\2\u00fd"+
		"\u00fe\5\65\33\2\u00fe\u00ff\5\37\20\2\u00ff\u0100\5+\26\2\u0100\u0101"+
		"\5)\25\2\u0101H\3\2\2\2\u0102\u0103\5\65\33\2\u0103\u0104\5\61\31\2\u0104"+
		"\u0105\5\67\34\2\u0105\u0106\5\27\f\2\u0106J\3\2\2\2\u0107\u0108\5\31"+
		"\r\2\u0108\u0109\5\17\b\2\u0109\u010a\5%\23\2\u010a\u010b\5\63\32\2\u010b"+
		"\u010c\5\27\f\2\u010cL\3\2\2\2\u010d\u010e\5\21\t\2\u010e\u010f\5+\26"+
		"\2\u010f\u0110\5+\26\2\u0110\u0111\5%\23\2\u0111\u0112\5\27\f\2\u0112"+
		"\u0113\5\17\b\2\u0113\u0114\5)\25\2\u0114N\3\2\2\2\u0115\u0116\5\17\b"+
		"\2\u0116\u0117\5)\25\2\u0117\u0118\5\25\13\2\u0118P\3\2\2\2\u0119\u011a"+
		"\5+\26\2\u011a\u011b\5\61\31\2\u011bR\3\2\2\2\u011c\u011d\5)\25\2\u011d"+
		"\u011e\5+\26\2\u011e\u011f\5\65\33\2\u011fT\3\2\2\2\u0120\u0121\5\'\24"+
		"\2\u0121\u0122\5+\26\2\u0122\u0123\5\25\13\2\u0123V\3\2\2\2\u0124\u0125"+
		"\5\63\32\2\u0125\u0126\5/\30\2\u0126\u0127\5\61\31\2\u0127\u0128\5\65"+
		"\33\2\u0128X\3\2\2\2\u0129\u012a\5%\23\2\u012a\u012b\5)\25\2\u012bZ\3"+
		"\2\2\2\u012c\u012d\5\27\f\2\u012d\u012e\5=\37\2\u012e\u012f\5-\27\2\u012f"+
		"\\\3\2\2\2\u0130\u0131\5\63\32\2\u0131\u0132\5\37\20\2\u0132\u0133\5)"+
		"\25\2\u0133^\3\2\2\2\u0134\u0135\5\23\n\2\u0135\u0136\5+\26\2\u0136\u0137"+
		"\5\63\32\2\u0137`\3\2\2\2\u0138\u0139\5\61\31\2\u0139\u013a\5\27\f\2\u013a"+
		"\u013b\5\17\b\2\u013b\u013c\5%\23\2\u013cb\3\2\2\2\u013d\u013e\5\31\r"+
		"\2\u013e\u013f\5+\26\2\u013f\u0140\5\61\31\2\u0140d\3\2\2\2\u0141\u0142"+
		"\5;\36\2\u0142\u0143\5\35\17\2\u0143\u0144\5\37\20\2\u0144\u0145\5%\23"+
		"\2\u0145\u0146\5\27\f\2\u0146f\3\2\2\2\u0147\u0148\5\25\13\2\u0148\u0149"+
		"\5+\26\2\u0149h\3\2\2\2\u014a\u014b\5\65\33\2\u014b\u014c\5+\26\2\u014c"+
		"j\3\2\2\2\u014d\u014e\5\21\t\2\u014e\u014f\5\61\31\2\u014f\u0150\5\27"+
		"\f\2\u0150\u0151\5\17\b\2\u0151\u0152\5#\22\2\u0152l\3\2\2\2\u0153\u0154"+
		"\5\37\20\2\u0154\u0155\5\31\r\2\u0155n\3\2\2\2\u0156\u0157\5\65\33\2\u0157"+
		"\u0158\5\35\17\2\u0158\u0159\5\27\f\2\u0159\u015a\5)\25\2\u015ap\3\2\2"+
		"\2\u015b\u015c\5\27\f\2\u015c\u015d\5%\23\2\u015d\u015e\5\63\32\2\u015e"+
		"\u015f\5\27\f\2\u015fr\3\2\2\2\u0160\u0161\5\23\n\2\u0161\u0162\5\17\b"+
		"\2\u0162\u0163\5\63\32\2\u0163\u0164\5\27\f\2\u0164t\3\2\2\2\u0165\u0166"+
		"\5+\26\2\u0166\u0167\5\31\r\2\u0167v\3\2\2\2\u0168\u0169\5\21\t\2\u0169"+
		"\u016a\5\27\f\2\u016a\u016b\5\33\16\2\u016b\u016c\5\37\20\2\u016c\u016d"+
		"\5)\25\2\u016dx\3\2\2\2\u016e\u016f\5\27\f\2\u016f\u0170\5)\25\2\u0170"+
		"\u0171\5\25\13\2\u0171z\3\2\2\2\u0172\u0173\7*\2\2\u0173|\3\2\2\2\u0174"+
		"\u0175\7+\2\2\u0175~\3\2\2\2\u0176\u0177\7,\2\2\u0177\u0080\3\2\2\2\u0178"+
		"\u0179\7\61\2\2\u0179\u0082\3\2\2\2\u017a\u017b\7-\2\2\u017b\u0084\3\2"+
		"\2\2\u017c\u017d\7/\2\2\u017d\u0086\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0088"+
		"\3\2\2\2\u0180\u0181\7@\2\2\u0181\u008a\3\2\2\2\u0182\u0183\7>\2\2\u0183"+
		"\u008c\3\2\2\2\u0184\u0185\7@\2\2\u0185\u0186\7?\2\2\u0186\u008e\3\2\2"+
		"\2\u0187\u0188\7>\2\2\u0188\u0189\7?\2\2\u0189\u0090\3\2\2\2\u018a\u018b"+
		"\7>\2\2\u018b\u018c\7@\2\2\u018c\u0092\3\2\2\2\u018d\u018e\7.\2\2\u018e"+
		"\u0094\3\2\2\2\u018f\u0193\t\34\2\2\u0190\u0192\t\35\2\2\u0191\u0190\3"+
		"\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0096\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019c\7)\2\2\u0197\u0198\7)\2"+
		"\2\u0198\u019b\7)\2\2\u0199\u019b\n\36\2\2\u019a\u0197\3\2\2\2\u019a\u0199"+
		"\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7)\2\2\u01a0\u0098\3\2"+
		"\2\2\u01a1\u01a3\4\62;\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b2\3\2\2\2\u01a6\u01a8\4\62"+
		";\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01ae\4"+
		"\62;\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01a2\3\2\2\2\u01b1\u01a7\3\2"+
		"\2\2\u01b2\u009a\3\2\2\2\u01b3\u01b5\t\37\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\bN\2\2\u01b9\u009c\3\2\2\2\u01ba\u01bb\7}\2\2\u01bb\u01bc"+
		"\7,\2\2\u01bc\u01c0\3\2\2\2\u01bd\u01bf\13\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\u01c2\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7,\2\2\u01c4\u01c5\7\177\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\bO\2\2\u01c7\u009e\3\2\2\2\u01c8\u01cc\7}\2"+
		"\2\u01c9\u01cb\13\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d0\7\177\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\bP\2\2\u01d2"+
		"\u00a0\3\2\2\2\r\2\u0193\u019a\u019c\u01a4\u01a9\u01af\u01b1\u01b6\u01c0"+
		"\u01cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}