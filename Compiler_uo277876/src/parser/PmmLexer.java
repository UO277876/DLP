// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRASH=1, COMMENT_BLOCK=2, COMMENT=3, INT_CONSTANT=4, REAL_CONSTANT=5, 
		CHAR_CONSTANT=6, ID=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "LETTER", "DECIMAL", "EXPONENT", "TRASH", "COMMENT_BLOCK", 
			"COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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
			null, "TRASH", "COMMENT_BLOCK", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\u0004\u0000\u0007\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u001d"+
		"\b\u0002\n\u0002\f\u0002 \t\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"$\b\u0002\u000b\u0002\f\u0002%\u0001\u0002\u0004\u0002)\b\u0002\u000b"+
		"\u0002\f\u0002*\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f"+
		"\u00022\t\u0002\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"8\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004=\b\u0004\u000b"+
		"\u0004\f\u0004>\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006T\b\u0006\n\u0006\f\u0006W\t\u0006\u0001"+
		"\u0006\u0003\u0006Z\b\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007c\b\u0007\n\u0007\f\u0007"+
		"f\t\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bn\b\b\u0001\b\u0001\b\u0003\br\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\t\u0003\t\u007f\b\t\u0001"+
		"\n\u0001\n\u0003\n\u0083\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u0088\b\n"+
		"\n\n\f\n\u008b\t\n\u0003\n\u008d\b\n\u0002HU\u0000\u000b\u0001\u0000\u0003"+
		"\u0000\u0005\u0000\u0007\u0000\t\u0001\u000b\u0002\r\u0003\u000f\u0004"+
		"\u0011\u0005\u0013\u0006\u0015\u0007\u0001\u0000\b\u0001\u000009\u0002"+
		"\u0000AZaz\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u0001"+
		"\u0001\n\n\u0001\u000019\u0003\u0000nnrrtt\u009e\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000"+
		"\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t<\u0001"+
		"\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000"+
		"\u0000\u000fh\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000\u0000\u0013"+
		"~\u0001\u0000\u0000\u0000\u0015\u008c\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0007\u0000\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0007\u0001\u0000\u0000\u001a\u0004\u0001\u0000\u0000\u0000\u001b\u001d"+
		"\u0003\u000f\u0007\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!#\u0005.\u0000\u0000\"$\u0003\u0001\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&4\u0001\u0000\u0000\u0000\')\u0003\u000f\u0007\u0000"+
		"(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,0\u0005.\u0000"+
		"\u0000-/\u0003\u0001\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u00003\u001e\u0001\u0000\u0000"+
		"\u00003(\u0001\u0000\u0000\u00004\u0006\u0001\u0000\u0000\u000057\u0007"+
		"\u0002\u0000\u000068\u0007\u0003\u0000\u000076\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0003\u0001\u0000"+
		"\u0000:\b\u0001\u0000\u0000\u0000;=\u0007\u0004\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0004\u0000\u0000"+
		"A\n\u0001\u0000\u0000\u0000BC\u0005\"\u0000\u0000CD\u0005\"\u0000\u0000"+
		"DH\u0005\"\u0000\u0000EG\t\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\"\u0000"+
		"\u0000LM\u0005\"\u0000\u0000MN\u0005\"\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0006\u0005\u0000\u0000P\f\u0001\u0000\u0000\u0000QU\u0005#\u0000"+
		"\u0000RT\t\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0005\r\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[]\u0007"+
		"\u0005\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0006\u0006\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`d\u0007\u0006"+
		"\u0000\u0000ac\u0003\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ei\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u00050\u0000\u0000"+
		"h`\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0010\u0001\u0000"+
		"\u0000\u0000jr\u0003\u0005\u0002\u0000kn\u0003\u0005\u0002\u0000ln\u0003"+
		"\u000f\u0007\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0003\u0007\u0003\u0000pr\u0001\u0000\u0000"+
		"\u0000qj\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000r\u0012\u0001"+
		"\u0000\u0000\u0000st\u0005\'\u0000\u0000tu\t\u0000\u0000\u0000u\u007f"+
		"\u0005\'\u0000\u0000vw\u0005\'\u0000\u0000wx\u0005\\\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000y|\u0003\u000f\u0007\u0000z|\u0007\u0007\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u007f\u0005\'\u0000\u0000~s\u0001\u0000\u0000\u0000~v\u0001\u0000"+
		"\u0000\u0000\u007f\u0014\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0003"+
		"\u0001\u0000\u0081\u0083\u0005_\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u008d\u0001\u0000\u0000"+
		"\u0000\u0084\u0088\u0003\u0003\u0001\u0000\u0085\u0088\u0003\u0001\u0000"+
		"\u0000\u0086\u0088\u0005_\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0082\u0001\u0000\u0000\u0000"+
		"\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0000\u001e%*037>HUY\\dhmq{~\u0082\u0087\u0089\u008c\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}