// Generated from /Users/asgupta/code/mbrdi-reveng/reconstructor/poc/src/main/antlr4/org/poc/CopyIdmsLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CopyIdmsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COPY=1, IDMS=2, RECORD=3, COPY_BOOK_IDENTIFIER=4, DOT_FS=5, WS=6, Unknown=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COPY", "IDMS", "RECORD", "COPY_BOOK_IDENTIFIER", "DOT_FS", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "WS", "Unknown"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COPY", "IDMS", "RECORD", "COPY_BOOK_IDENTIFIER", "DOT_FS", "WS", 
			"Unknown"
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


	public CopyIdmsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CopyIdmsLexer.g4"; }

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
		"\u0004\u0000\u0007\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0004\u0003W\b\u0003\u000b\u0003\f\u0003X\u0001\u0004\u0001\u0004\u0003"+
		"\u0004]\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u0094\b\u001f\u000b\u001f"+
		"\f\u001f\u0095\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0000"+
		"\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000"+
		"\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u0000%\u0000"+
		"\'\u0000)\u0000+\u0000-\u0000/\u00001\u00003\u00005\u00007\u00009\u0000"+
		";\u0000=\u0000?\u0006A\u0007\u0001\u0000\u001c\u0003\u000009AZaz\u0002"+
		"\u0000AAaa\u0002\u0000BBbb\u0002\u0000CCcc\u0002\u0000DDdd\u0002\u0000"+
		"EEee\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000HHhh\u0002\u0000IIii\u0002"+
		"\u0000JJjj\u0002\u0000KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002\u0000"+
		"NNnn\u0002\u0000OOoo\u0002\u0000PPpp\u0002\u0000QQqq\u0002\u0000RRrr\u0002"+
		"\u0000SSss\u0002\u0000TTtt\u0002\u0000UUuu\u0002\u0000VVvv\u0002\u0000"+
		"WWww\u0002\u0000XXxx\u0002\u0000YYyy\u0002\u0000ZZzz\u0003\u0000\t\n\r"+
		"\r  \u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003"+
		"H\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007T\u0001"+
		"\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b^\u0001\u0000\u0000"+
		"\u0000\r`\u0001\u0000\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011"+
		"d\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015h\u0001"+
		"\u0000\u0000\u0000\u0017j\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000"+
		"\u0000\u001bn\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001f"+
		"r\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000#v\u0001\u0000\u0000"+
		"\u0000%x\u0001\u0000\u0000\u0000\'z\u0001\u0000\u0000\u0000)|\u0001\u0000"+
		"\u0000\u0000+~\u0001\u0000\u0000\u0000-\u0080\u0001\u0000\u0000\u0000"+
		"/\u0082\u0001\u0000\u0000\u00001\u0084\u0001\u0000\u0000\u00003\u0086"+
		"\u0001\u0000\u0000\u00005\u0088\u0001\u0000\u0000\u00007\u008a\u0001\u0000"+
		"\u0000\u00009\u008c\u0001\u0000\u0000\u0000;\u008e\u0001\u0000\u0000\u0000"+
		"=\u0090\u0001\u0000\u0000\u0000?\u0093\u0001\u0000\u0000\u0000A\u0099"+
		"\u0001\u0000\u0000\u0000CD\u0003\u000f\u0007\u0000DE\u0003\'\u0013\u0000"+
		"EF\u0003)\u0014\u0000FG\u0003;\u001d\u0000G\u0002\u0001\u0000\u0000\u0000"+
		"HI\u0003\u001b\r\u0000IJ\u0003\u0011\b\u0000JK\u0003#\u0011\u0000KL\u0003"+
		"/\u0017\u0000L\u0004\u0001\u0000\u0000\u0000MN\u0003-\u0016\u0000NO\u0003"+
		"\u0013\t\u0000OP\u0003\u000f\u0007\u0000PQ\u0003\'\u0013\u0000QR\u0003"+
		"-\u0016\u0000RS\u0003\u0011\b\u0000S\u0006\u0001\u0000\u0000\u0000TV\u0003"+
		"5\u001a\u0000UW\u0007\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\b\u0001\u0000\u0000\u0000Z\\\u0005.\u0000\u0000[]\u0005\u0000\u0000"+
		"\u0001\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\n\u0001"+
		"\u0000\u0000\u0000^_\u0007\u0001\u0000\u0000_\f\u0001\u0000\u0000\u0000"+
		"`a\u0007\u0002\u0000\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0007\u0003"+
		"\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0007\u0004\u0000\u0000"+
		"e\u0012\u0001\u0000\u0000\u0000fg\u0007\u0005\u0000\u0000g\u0014\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0006\u0000\u0000i\u0016\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0007\u0000\u0000k\u0018\u0001\u0000\u0000\u0000lm\u0007"+
		"\b\u0000\u0000m\u001a\u0001\u0000\u0000\u0000no\u0007\t\u0000\u0000o\u001c"+
		"\u0001\u0000\u0000\u0000pq\u0007\n\u0000\u0000q\u001e\u0001\u0000\u0000"+
		"\u0000rs\u0007\u000b\u0000\u0000s \u0001\u0000\u0000\u0000tu\u0007\f\u0000"+
		"\u0000u\"\u0001\u0000\u0000\u0000vw\u0007\r\u0000\u0000w$\u0001\u0000"+
		"\u0000\u0000xy\u0007\u000e\u0000\u0000y&\u0001\u0000\u0000\u0000z{\u0007"+
		"\u000f\u0000\u0000{(\u0001\u0000\u0000\u0000|}\u0007\u0010\u0000\u0000"+
		"}*\u0001\u0000\u0000\u0000~\u007f\u0007\u0011\u0000\u0000\u007f,\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0007\u0012\u0000\u0000\u0081.\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0007\u0013\u0000\u0000\u00830\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0007\u0014\u0000\u0000\u00852\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0007\u0015\u0000\u0000\u00874\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0007\u0016\u0000\u0000\u00896\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0007\u0017\u0000\u0000\u008b8\u0001\u0000\u0000\u0000\u008c\u008d\u0007"+
		"\u0018\u0000\u0000\u008d:\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0019"+
		"\u0000\u0000\u008f<\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u001a\u0000"+
		"\u0000\u0091>\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u001b\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u001f\u0000\u0000"+
		"\u0098@\u0001\u0000\u0000\u0000\u0099\u009a\t\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006 \u0000\u0000\u009cB\u0001"+
		"\u0000\u0000\u0000\u0004\u0000X\\\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}