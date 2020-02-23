// Generated from /Users/joeymac/Desktop/P2/Grammar.g4 by ANTLR 4.7.1

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "PROGRAM", "VAR", "TRUE", "FALSE", 
		"BOOLEAN", "AND", "OR", "NOT", "MOD", "SQRT", "LN", "EXP", "SIN", "COS", 
		"REAL", "IF", "THEN", "ELSE", "CASE", "OF", "BEGIN", "END", "LPAREN", 
		"RPAREN", "MULT", "DIV", "ADD", "SUBT", "EQ", "GT", "LT", "GTE", "LTE", 
		"NEQ", "DELIM", "ID", "STRING_LITERAL", "NUM", "WS", "COMMENT_1", "COMMENT_2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\7E\u0167"+
		"\nE\fE\16E\u016a\13E\3F\3F\3F\3F\7F\u0170\nF\fF\16F\u0173\13F\3F\3F\3"+
		"G\6G\u0178\nG\rG\16G\u0179\3G\6G\u017d\nG\rG\16G\u017e\3G\3G\6G\u0183"+
		"\nG\rG\16G\u0184\5G\u0187\nG\3H\6H\u018a\nH\rH\16H\u018b\3H\3H\3I\3I\3"+
		"I\3I\7I\u0194\nI\fI\16I\u0197\13I\3I\3I\3I\3I\3I\3J\3J\7J\u01a0\nJ\fJ"+
		"\16J\u01a3\13J\3J\3J\3J\3J\4\u0195\u01a1\2K\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W"+
		"\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177"+
		"\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093"+
		"\61\3\2 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\3\2))\5\2\13\f\17\17\"\"\2\u0197\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009b"+
		"\3\2\2\2\13\u009e\3\2\2\2\r\u00a5\3\2\2\2\17\u00ad\3\2\2\2\21\u00af\3"+
		"\2\2\2\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00b5\3\2\2\2\31\u00b7\3\2"+
		"\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2\2\2"+
		"#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3"+
		"\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2"+
		"\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db"+
		"\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00e1\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00ed\3\2\2\2I\u00f2\3\2\2\2K\u00f8\3\2\2\2M\u0100\3\2\2\2O\u0104\3\2"+
		"\2\2Q\u0107\3\2\2\2S\u010b\3\2\2\2U\u010f\3\2\2\2W\u0114\3\2\2\2Y\u0117"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011f\3\2\2\2_\u0123\3\2\2\2a\u0128\3\2\2\2c"+
		"\u012b\3\2\2\2e\u0130\3\2\2\2g\u0135\3\2\2\2i\u013a\3\2\2\2k\u013d\3\2"+
		"\2\2m\u0143\3\2\2\2o\u0147\3\2\2\2q\u0149\3\2\2\2s\u014b\3\2\2\2u\u014d"+
		"\3\2\2\2w\u014f\3\2\2\2y\u0151\3\2\2\2{\u0153\3\2\2\2}\u0155\3\2\2\2\177"+
		"\u0157\3\2\2\2\u0081\u0159\3\2\2\2\u0083\u015c\3\2\2\2\u0085\u015f\3\2"+
		"\2\2\u0087\u0162\3\2\2\2\u0089\u0164\3\2\2\2\u008b\u016b\3\2\2\2\u008d"+
		"\u0186\3\2\2\2\u008f\u0189\3\2\2\2\u0091\u018f\3\2\2\2\u0093\u019d\3\2"+
		"\2\2\u0095\u0096\7=\2\2\u0096\4\3\2\2\2\u0097\u0098\7\60\2\2\u0098\6\3"+
		"\2\2\2\u0099\u009a\7<\2\2\u009a\b\3\2\2\2\u009b\u009c\7<\2\2\u009c\u009d"+
		"\7?\2\2\u009d\n\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\f\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7p\2\2"+
		"\u00ac\16\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\20\3\2\2\2\u00af\u00b0\t\3"+
		"\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\24\3\2\2\2\u00b3\u00b4"+
		"\t\5\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\30\3\2\2\2\u00b7\u00b8"+
		"\t\7\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba\34\3\2\2\2\u00bb\u00bc"+
		"\t\t\2\2\u00bc\36\3\2\2\2\u00bd\u00be\t\n\2\2\u00be \3\2\2\2\u00bf\u00c0"+
		"\t\13\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\t\f\2\2\u00c2$\3\2\2\2\u00c3\u00c4"+
		"\t\r\2\2\u00c4&\3\2\2\2\u00c5\u00c6\t\16\2\2\u00c6(\3\2\2\2\u00c7\u00c8"+
		"\t\17\2\2\u00c8*\3\2\2\2\u00c9\u00ca\t\20\2\2\u00ca,\3\2\2\2\u00cb\u00cc"+
		"\t\21\2\2\u00cc.\3\2\2\2\u00cd\u00ce\t\22\2\2\u00ce\60\3\2\2\2\u00cf\u00d0"+
		"\t\23\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\t\24\2\2\u00d2\64\3\2\2\2\u00d3"+
		"\u00d4\t\25\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\t\26\2\2\u00d68\3\2\2\2\u00d7"+
		"\u00d8\t\27\2\2\u00d8:\3\2\2\2\u00d9\u00da\t\30\2\2\u00da<\3\2\2\2\u00db"+
		"\u00dc\t\31\2\2\u00dc>\3\2\2\2\u00dd\u00de\t\32\2\2\u00de@\3\2\2\2\u00df"+
		"\u00e0\t\33\2\2\u00e0B\3\2\2\2\u00e1\u00e2\5-\27\2\u00e2\u00e3\5\61\31"+
		"\2\u00e3\u00e4\5+\26\2\u00e4\u00e5\5\33\16\2\u00e5\u00e6\5\61\31\2\u00e6"+
		"\u00e7\5\17\b\2\u00e7\u00e8\5\'\24\2\u00e8D\3\2\2\2\u00e9\u00ea\59\35"+
		"\2\u00ea\u00eb\5\17\b\2\u00eb\u00ec\5\61\31\2\u00ecF\3\2\2\2\u00ed\u00ee"+
		"\5\65\33\2\u00ee\u00ef\5\61\31\2\u00ef\u00f0\5\67\34\2\u00f0\u00f1\5\27"+
		"\f\2\u00f1H\3\2\2\2\u00f2\u00f3\5\31\r\2\u00f3\u00f4\5\17\b\2\u00f4\u00f5"+
		"\5%\23\2\u00f5\u00f6\5\63\32\2\u00f6\u00f7\5\27\f\2\u00f7J\3\2\2\2\u00f8"+
		"\u00f9\5\21\t\2\u00f9\u00fa\5+\26\2\u00fa\u00fb\5+\26\2\u00fb\u00fc\5"+
		"%\23\2\u00fc\u00fd\5\27\f\2\u00fd\u00fe\5\17\b\2\u00fe\u00ff\5)\25\2\u00ff"+
		"L\3\2\2\2\u0100\u0101\5\17\b\2\u0101\u0102\5)\25\2\u0102\u0103\5\25\13"+
		"\2\u0103N\3\2\2\2\u0104\u0105\5+\26\2\u0105\u0106\5\61\31\2\u0106P\3\2"+
		"\2\2\u0107\u0108\5)\25\2\u0108\u0109\5+\26\2\u0109\u010a\5\65\33\2\u010a"+
		"R\3\2\2\2\u010b\u010c\5\'\24\2\u010c\u010d\5+\26\2\u010d\u010e\5\25\13"+
		"\2\u010eT\3\2\2\2\u010f\u0110\5\63\32\2\u0110\u0111\5/\30\2\u0111\u0112"+
		"\5\61\31\2\u0112\u0113\5\65\33\2\u0113V\3\2\2\2\u0114\u0115\5%\23\2\u0115"+
		"\u0116\5)\25\2\u0116X\3\2\2\2\u0117\u0118\5\27\f\2\u0118\u0119\5=\37\2"+
		"\u0119\u011a\5-\27\2\u011aZ\3\2\2\2\u011b\u011c\5\63\32\2\u011c\u011d"+
		"\5\37\20\2\u011d\u011e\5)\25\2\u011e\\\3\2\2\2\u011f\u0120\5\23\n\2\u0120"+
		"\u0121\5+\26\2\u0121\u0122\5\63\32\2\u0122^\3\2\2\2\u0123\u0124\5\61\31"+
		"\2\u0124\u0125\5\27\f\2\u0125\u0126\5\17\b\2\u0126\u0127\5%\23\2\u0127"+
		"`\3\2\2\2\u0128\u0129\5\37\20\2\u0129\u012a\5\31\r\2\u012ab\3\2\2\2\u012b"+
		"\u012c\5\65\33\2\u012c\u012d\5\35\17\2\u012d\u012e\5\27\f\2\u012e\u012f"+
		"\5)\25\2\u012fd\3\2\2\2\u0130\u0131\5\27\f\2\u0131\u0132\5%\23\2\u0132"+
		"\u0133\5\63\32\2\u0133\u0134\5\27\f\2\u0134f\3\2\2\2\u0135\u0136\5\23"+
		"\n\2\u0136\u0137\5\17\b\2\u0137\u0138\5\63\32\2\u0138\u0139\5\27\f\2\u0139"+
		"h\3\2\2\2\u013a\u013b\5+\26\2\u013b\u013c\5\31\r\2\u013cj\3\2\2\2\u013d"+
		"\u013e\5\21\t\2\u013e\u013f\5\27\f\2\u013f\u0140\5\33\16\2\u0140\u0141"+
		"\5\37\20\2\u0141\u0142\5)\25\2\u0142l\3\2\2\2\u0143\u0144\5\27\f\2\u0144"+
		"\u0145\5)\25\2\u0145\u0146\5\25\13\2\u0146n\3\2\2\2\u0147\u0148\7*\2\2"+
		"\u0148p\3\2\2\2\u0149\u014a\7+\2\2\u014ar\3\2\2\2\u014b\u014c\7,\2\2\u014c"+
		"t\3\2\2\2\u014d\u014e\7\61\2\2\u014ev\3\2\2\2\u014f\u0150\7-\2\2\u0150"+
		"x\3\2\2\2\u0151\u0152\7/\2\2\u0152z\3\2\2\2\u0153\u0154\7?\2\2\u0154|"+
		"\3\2\2\2\u0155\u0156\7@\2\2\u0156~\3\2\2\2\u0157\u0158\7>\2\2\u0158\u0080"+
		"\3\2\2\2\u0159\u015a\7@\2\2\u015a\u015b\7?\2\2\u015b\u0082\3\2\2\2\u015c"+
		"\u015d\7>\2\2\u015d\u015e\7?\2\2\u015e\u0084\3\2\2\2\u015f\u0160\7>\2"+
		"\2\u0160\u0161\7@\2\2\u0161\u0086\3\2\2\2\u0162\u0163\7.\2\2\u0163\u0088"+
		"\3\2\2\2\u0164\u0168\t\34\2\2\u0165\u0167\t\35\2\2\u0166\u0165\3\2\2\2"+
		"\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u008a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0171\7)\2\2\u016c\u016d\7)\2\2\u016d"+
		"\u0170\7)\2\2\u016e\u0170\n\36\2\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7)\2\2\u0175\u008c\3\2"+
		"\2\2\u0176\u0178\4\62;\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0187\3\2\2\2\u017b\u017d\4\62"+
		";\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\7\60\2\2\u0181\u0183\4"+
		"\62;\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0177\3\2\2\2\u0186\u017c\3\2"+
		"\2\2\u0187\u008e\3\2\2\2\u0188\u018a\t\37\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\bH\2\2\u018e\u0090\3\2\2\2\u018f\u0190\7}\2\2\u0190\u0191"+
		"\7,\2\2\u0191\u0195\3\2\2\2\u0192\u0194\13\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7,\2\2\u0199\u019a\7\177\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\bI\2\2\u019c\u0092\3\2\2\2\u019d\u01a1\7}\2"+
		"\2\u019e\u01a0\13\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a5\7\177\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\bJ\2\2\u01a7"+
		"\u0094\3\2\2\2\r\2\u0168\u016f\u0171\u0179\u017e\u0184\u0186\u018b\u0195"+
		"\u01a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}