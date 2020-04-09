// Generated from D:/Projects/XML-language-parser/src/main/resources\XMLLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		OPEN_SCRIPT_TAG=9, CLOSE_SCRIPT_TAG=10, OPEN_SCRIPT_BODY_TAG=11, CLOSE_SCRIPT_BODY_TAG=12, 
		OPEN_CONSTANTS_TAG=13, CLOSE_CONSTATNS_TAG=14, OPEN_ALGORITHM_TAG=15, 
		CLOSE_ALGORITHM_TAG=16, TEXT=17, TAG_DECLARATION=18, TAG_NAME_ATTR=19, 
		TAG_VALUE_ATTR=20, CLOSE=21, SPECIAL_CLOSE=22, SLASH_CLOSE=23, SLASH=24, 
		EQUALS=25, STRING=26, Name=27, S=28, PI=29;
	public static final int
		INSIDE=1, PROC_INSTR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PROC_INSTR"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "SPECIAL_OPEN", "OPEN_SCRIPT_TAG", "CLOSE_SCRIPT_TAG", 
			"OPEN_SCRIPT_BODY_TAG", "CLOSE_SCRIPT_BODY_TAG", "OPEN_CONSTANTS_TAG", 
			"CLOSE_CONSTATNS_TAG", "OPEN_ALGORITHM_TAG", "CLOSE_ALGORITHM_TAG", "TEXT", 
			"TAG_DECLARATION", "TAG_NAME_ATTR", "TAG_VALUE_ATTR", "CLOSE", "SPECIAL_CLOSE", 
			"SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", "S", "HEXDIGIT", 
			"DIGIT", "NameChar", "NameStartChar", "PI", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, "'<XMLScript>'", 
			"'</XMLScript>'", "'<body>'", "'</body>'", "'<constants>'", "'</constants'", 
			"'<algorithm>'", "'</algorithm>'", null, "'tag'", "'name'", "'value'", 
			"'>'", null, "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "OPEN_SCRIPT_TAG", "CLOSE_SCRIPT_TAG", "OPEN_SCRIPT_BODY_TAG", 
			"CLOSE_SCRIPT_BODY_TAG", "OPEN_CONSTANTS_TAG", "CLOSE_CONSTATNS_TAG", 
			"OPEN_ALGORITHM_TAG", "CLOSE_ALGORITHM_TAG", "TEXT", "TAG_DECLARATION", 
			"TAG_NAME_ATTR", "TAG_VALUE_ATTR", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", 
			"SLASH", "EQUALS", "STRING", "Name", "S", "PI"
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0167\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\7\2R\n\2\f"+
		"\2\16\2U\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4s\n\4"+
		"\f\4\16\4v\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u0084"+
		"\n\6\r\6\16\6\u0085\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008f\n\6\r\6\16\6"+
		"\u0090\3\6\3\6\5\6\u0095\n\6\3\7\3\7\5\7\u0099\n\7\3\7\6\7\u009c\n\7\r"+
		"\7\16\7\u009d\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u0110\n\23\r\23\16"+
		"\23\u0111\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\7\34\u0137\n\34\f\34\16"+
		"\34\u013a\13\34\3\34\3\34\3\34\7\34\u013f\n\34\f\34\16\34\u0142\13\34"+
		"\3\34\5\34\u0145\n\34\3\35\3\35\7\35\u0149\n\35\f\35\16\35\u014c\13\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u015a\n!\3\"\5\"\u015d"+
		"\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\5Sgt\2%\5\3\7\4\t\5\13\6\r\7\17\b\21\t"+
		"\23\n\25\2\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27"+
		"\61\30\63\31\65\32\67\339\34;\35=\36?\2A\2C\2E\2G\37I\2\5\2\3\4\f\4\2"+
		"\13\13\"\"\4\2((>>\4\2$$>>\4\2))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2"+
		"\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\2\u0171\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3"+
		"\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\3=\3\2\2\2\4G\3"+
		"\2\2\2\4I\3\2\2\2\5K\3\2\2\2\7Z\3\2\2\2\tn\3\2\2\2\13{\3\2\2\2\r\u0094"+
		"\3\2\2\2\17\u009b\3\2\2\2\21\u009f\3\2\2\2\23\u00a3\3\2\2\2\25\u00ad\3"+
		"\2\2\2\27\u00b5\3\2\2\2\31\u00c1\3\2\2\2\33\u00ce\3\2\2\2\35\u00d5\3\2"+
		"\2\2\37\u00dd\3\2\2\2!\u00e9\3\2\2\2#\u00f5\3\2\2\2%\u0101\3\2\2\2\'\u010f"+
		"\3\2\2\2)\u0113\3\2\2\2+\u0117\3\2\2\2-\u011c\3\2\2\2/\u0122\3\2\2\2\61"+
		"\u0126\3\2\2\2\63\u012b\3\2\2\2\65\u0130\3\2\2\2\67\u0132\3\2\2\29\u0144"+
		"\3\2\2\2;\u0146\3\2\2\2=\u014d\3\2\2\2?\u0151\3\2\2\2A\u0153\3\2\2\2C"+
		"\u0159\3\2\2\2E\u015c\3\2\2\2G\u015e\3\2\2\2I\u0163\3\2\2\2KL\7>\2\2L"+
		"M\7#\2\2MN\7/\2\2NO\7/\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST"+
		"\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7/\2\2WX\7/\2\2XY\7@\2\2Y\6\3"+
		"\2\2\2Z[\7>\2\2[\\\7#\2\2\\]\7]\2\2]^\7E\2\2^_\7F\2\2_`\7C\2\2`a\7V\2"+
		"\2ab\7C\2\2bc\7]\2\2cg\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2"+
		"\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7_\2\2kl\7_\2\2lm\7@\2\2m\b\3\2\2\2"+
		"no\7>\2\2op\7#\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2"+
		"tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7@\2\2xy\3\2\2\2yz\b\4\2\2z\n\3\2\2\2"+
		"{|\7(\2\2|}\5;\35\2}~\7=\2\2~\f\3\2\2\2\177\u0080\7(\2\2\u0080\u0081\7"+
		"%\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5A \2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\7=\2\2\u0088\u0095\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b"+
		"\7%\2\2\u008b\u008c\7z\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5?\37\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7=\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\177\3\2\2\2\u0094\u0089\3\2\2\2\u0095\16\3\2\2\2\u0096\u009c\t\2\2\2"+
		"\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\7\f\2\2\u009b\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\20\3\2\2"+
		"\2\u009f\u00a0\7>\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\b\3\2\u00a2\22"+
		"\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7A\2\2\u00a5\u00a6\7z\2\2\u00a6"+
		"\u00a7\7o\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5=\36"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\t\3\2\u00ac\24\3\2\2\2\u00ad\u00ae"+
		"\7>\2\2\u00ae\u00af\7A\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5;\35\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\n\4\2\u00b3\u00b4\b\n\5\2\u00b4\26\3\2\2"+
		"\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7Z\2\2\u00b7\u00b8\7O\2\2\u00b8\u00b9"+
		"\7N\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7@\2\2"+
		"\u00c0\30\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4"+
		"\7Z\2\2\u00c4\u00c5\7O\2\2\u00c5\u00c6\7N\2\2\u00c6\u00c7\7U\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7r\2\2"+
		"\u00cb\u00cc\7v\2\2\u00cc\u00cd\7@\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7"+
		">\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3"+
		"\7{\2\2\u00d3\u00d4\7@\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7"+
		"\7\61\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\u00db\7{\2\2\u00db\u00dc\7@\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7>\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7u\2\2"+
		"\u00e2\u00e3\7v\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7@\2\2\u00e8 \3\2\2\2\u00e9\u00ea"+
		"\7>\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u00f2\7p\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7u\2\2\u00f4\"\3\2"+
		"\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7i\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7@\2\2"+
		"\u0100$\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7"+
		"c\2\2\u0104\u0105\7n\2\2\u0105\u0106\7i\2\2\u0106\u0107\7q\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7j\2\2\u010b"+
		"\u010c\7o\2\2\u010c\u010d\7@\2\2\u010d&\3\2\2\2\u010e\u0110\n\3\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112(\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7i\2\2\u0116*\3\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7c\2\2\u0119\u011a"+
		"\7o\2\2\u011a\u011b\7g\2\2\u011b,\3\2\2\2\u011c\u011d\7x\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7n\2\2\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2\u0121"+
		".\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\27\6\2"+
		"\u0125\60\3\2\2\2\u0126\u0127\7A\2\2\u0127\u0128\7@\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u012a\b\30\6\2\u012a\62\3\2\2\2\u012b\u012c\7\61\2\2\u012c"+
		"\u012d\7@\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\31\6\2\u012f\64\3\2\2"+
		"\2\u0130\u0131\7\61\2\2\u0131\66\3\2\2\2\u0132\u0133\7?\2\2\u01338\3\2"+
		"\2\2\u0134\u0138\7$\2\2\u0135\u0137\n\4\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u0145\7$\2\2\u013c\u0140\7)\2\2\u013d\u013f"+
		"\n\5\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7)"+
		"\2\2\u0144\u0134\3\2\2\2\u0144\u013c\3\2\2\2\u0145:\3\2\2\2\u0146\u014a"+
		"\5E\"\2\u0147\u0149\5C!\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b<\3\2\2\2\u014c\u014a\3\2\2\2"+
		"\u014d\u014e\t\6\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\36\2\2\u0150>\3"+
		"\2\2\2\u0151\u0152\t\7\2\2\u0152@\3\2\2\2\u0153\u0154\t\b\2\2\u0154B\3"+
		"\2\2\2\u0155\u015a\5E\"\2\u0156\u015a\t\t\2\2\u0157\u015a\5A \2\u0158"+
		"\u015a\t\n\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u0158\3\2\2\2\u015aD\3\2\2\2\u015b\u015d\t\13\2\2\u015c\u015b"+
		"\3\2\2\2\u015dF\3\2\2\2\u015e\u015f\7A\2\2\u015f\u0160\7@\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\b#\6\2\u0162H\3\2\2\2\u0163\u0164\13\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\b$\4\2\u0166J\3\2\2\2\25\2\3\4Sgt\u0085\u0090"+
		"\u0094\u0098\u009b\u009d\u0111\u0138\u0140\u0144\u014a\u0159\u015c\7\b"+
		"\2\2\7\3\2\5\2\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}