// Generated from C:/Users/micha/IdeaProjects/Kompilatory-Logo/src/main/java\SimpleLogo.g4 by ANTLR 4.8
package antlr.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, STRINGLITERAL=40, STRING=41, NUMBER=42, COMMENT=43, EOL=44, 
		WS=45, L_BUCKET=46, R_BUCKET=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "STRINGLITERAL", 
			"STRING", "NUMBER", "COMMENT", "EOL", "WS", "L_BUCKET", "R_BUCKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'to'", "'end'", "':'", "','", "'repeat'", "'if'", "'<'", "'>'", 
			"'='", "'make'", "'print'", "'+'", "'-'", "'*'", "'/'", "'fd'", "'forward'", 
			"'bk'", "'backward'", "'rt'", "'right'", "'lt'", "'left'", "'cs'", "'clearscreen'", 
			"'pu'", "'penup'", "'pd'", "'pendown'", "'ht'", "'hideturtle'", "'st'", 
			"'showturtle'", "'home'", "'stop'", "'label'", "'setxy'", "'random'", 
			"'for'", null, null, null, null, null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRINGLITERAL", "STRING", "NUMBER", "COMMENT", 
			"EOL", "WS", "L_BUCKET", "R_BUCKET"
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


	public SimpleLogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLogo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\7*\u011d\n"+
		"*\f*\16*\u0120\13*\3+\6+\u0123\n+\r+\16+\u0124\3,\3,\7,\u0129\n,\f,\16"+
		",\u012c\13,\3-\5-\u012f\n-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\2\2\61\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\4\2C\\c|\6\2\62;C\\aa"+
		"c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u013d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5d\3\2\2\2\7"+
		"h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rs\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23"+
		"z\3\2\2\2\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2"+
		"\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0092\3\2\2\2%\u009a"+
		"\3\2\2\2\'\u009d\3\2\2\2)\u00a6\3\2\2\2+\u00a9\3\2\2\2-\u00af\3\2\2\2"+
		"/\u00b2\3\2\2\2\61\u00b7\3\2\2\2\63\u00ba\3\2\2\2\65\u00c6\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00cf\3\2\2\2;\u00d2\3\2\2\2=\u00da\3\2\2\2?\u00dd\3\2"+
		"\2\2A\u00e8\3\2\2\2C\u00eb\3\2\2\2E\u00f6\3\2\2\2G\u00fb\3\2\2\2I\u0100"+
		"\3\2\2\2K\u0106\3\2\2\2M\u010c\3\2\2\2O\u0113\3\2\2\2Q\u0117\3\2\2\2S"+
		"\u011a\3\2\2\2U\u0122\3\2\2\2W\u0126\3\2\2\2Y\u012e\3\2\2\2[\u0132\3\2"+
		"\2\2]\u0136\3\2\2\2_\u0138\3\2\2\2ab\7v\2\2bc\7q\2\2c\4\3\2\2\2de\7g\2"+
		"\2ef\7p\2\2fg\7f\2\2g\6\3\2\2\2hi\7<\2\2i\b\3\2\2\2jk\7.\2\2k\n\3\2\2"+
		"\2lm\7t\2\2mn\7g\2\2no\7r\2\2op\7g\2\2pq\7c\2\2qr\7v\2\2r\f\3\2\2\2st"+
		"\7k\2\2tu\7h\2\2u\16\3\2\2\2vw\7>\2\2w\20\3\2\2\2xy\7@\2\2y\22\3\2\2\2"+
		"z{\7?\2\2{\24\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7m\2\2\177\u0080\7g\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\30\3\2\2\2\u0087\u0088\7-\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7/\2\2\u008a\34\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\36\3\2\2\2\u008d\u008e\7\61\2\2\u008e \3\2\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7f\2\2\u0091\"\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7y\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7f\2\2\u0099$\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7m\2"+
		"\2\u009c&\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7"+
		"e\2\2\u00a0\u00a1\7m\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7f\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7v\2\2\u00ae,\3\2\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7v\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7v\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7u\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7"+
		"r\2\2\u00c7\u00c8\7w\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7r\2\2\u00ce"+
		"8\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7f\2\2\u00d1:\3\2\2\2\u00d2\u00d3"+
		"\7r\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6"+
		"\u00d7\7q\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9\7p\2\2\u00d9<\3\2\2\2\u00da"+
		"\u00db\7j\2\2\u00db\u00dc\7v\2\2\u00dc>\3\2\2\2\u00dd\u00de\7j\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7g\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea"+
		"\7v\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7w\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5D\3\2\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7o\2"+
		"\2\u00f9\u00fa\7g\2\2\u00faF\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7"+
		"v\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7r\2\2\u00ffH\3\2\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7c\2\2\u0102\u0103\7d\2\2\u0103\u0104\7g\2\2\u0104"+
		"\u0105\7n\2\2\u0105J\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7v\2\2\u0109\u010a\7z\2\2\u010a\u010b\7{\2\2\u010bL\3\2\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7c\2\2\u010e\u010f\7p\2\2\u010f\u0110\7f\2\2"+
		"\u0110\u0111\7q\2\2\u0111\u0112\7o\2\2\u0112N\3\2\2\2\u0113\u0114\7h\2"+
		"\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116P\3\2\2\2\u0117\u0118\7"+
		"$\2\2\u0118\u0119\5S*\2\u0119R\3\2\2\2\u011a\u011e\t\2\2\2\u011b\u011d"+
		"\t\3\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011fT\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\t\4\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125V\3\2\2\2\u0126\u012a\7=\2\2\u0127\u0129\n\5\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"X\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7\17\2\2\u012e\u012d\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\f\2\2\u0131Z\3"+
		"\2\2\2\u0132\u0133\t\6\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b.\2\2\u0135"+
		"\\\3\2\2\2\u0136\u0137\7]\2\2\u0137^\3\2\2\2\u0138\u0139\7_\2\2\u0139"+
		"`\3\2\2\2\7\2\u011e\u0124\u012a\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}