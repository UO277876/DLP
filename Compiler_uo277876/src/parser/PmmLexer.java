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
		T__0=1, T__1=2, TRASH=3, COMMENT_BLOCK=4, COMMENT=5, INT_CONSTANT=6, REAL_CONSTANT=7, 
		CHAR_CONSTANT=8, ID=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "LETTER", "DECIMAL", "EXPONENT", "TRASH", "COMMENT_BLOCK", 
			"COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TRASH", "COMMENT_BLOCK", "COMMENT", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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
		"\u0004\u0000\t\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u0004%\b\u0004\n\u0004\f\u0004(\t\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004,\b\u0004\u000b\u0004\f\u0004-\u0001\u0004\u0004\u00041\b\u0004"+
		"\u000b\u0004\f\u00042\u0001\u0004\u0001\u0004\u0005\u00047\b\u0004\n\u0004"+
		"\f\u0004:\t\u0004\u0003\u0004<\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"@\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006E\b\u0006\u000b"+
		"\u0006\f\u0006F\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007O\b\u0007\n\u0007\f\u0007R\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0005\b\\\b\b\n\b\f\b_\t\b\u0001\b\u0003\bb\b\b\u0001\b\u0003"+
		"\be\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tk\b\t\n\t\f\tn\t\t\u0001"+
		"\t\u0003\tq\b\t\u0001\n\u0001\n\u0001\n\u0003\nv\b\n\u0001\n\u0001\n\u0003"+
		"\nz\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0083\b\u000b\u0001\u000b\u0003\u000b\u0086"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u008a\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u008f\b\f\n\f\f\f\u0092\t\f\u0003\f\u0094\b\f\u0002P]\u0000\r\u0001"+
		"\u0001\u0003\u0002\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0003"+
		"\u000f\u0004\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b\u0019\t\u0001"+
		"\u0000\b\u0001\u000009\u0002\u0000AZaz\u0002\u0000EEee\u0002\u0000++-"+
		"-\u0003\u0000\t\n\r\r  \u0001\u0001\n\n\u0001\u000019\u0003\u0000nnrr"+
		"tt\u00a5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000"+
		"\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000"+
		"\u0007!\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001"+
		"\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000"+
		"\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013p\u0001\u0000\u0000\u0000\u0015"+
		"y\u0001\u0000\u0000\u0000\u0017\u0085\u0001\u0000\u0000\u0000\u0019\u0093"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005*\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005+\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0007\u0000\u0000\u0000 \u0006\u0001\u0000\u0000\u0000"+
		"!\"\u0007\u0001\u0000\u0000\"\b\u0001\u0000\u0000\u0000#%\u0003\u0013"+
		"\t\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000)+\u0005.\u0000\u0000*,\u0003\u0005\u0002\u0000+*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.<\u0001\u0000\u0000\u0000/1\u0003\u0013\t\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000048\u0005.\u0000"+
		"\u000057\u0003\u0005\u0002\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;&\u0001\u0000\u0000\u0000"+
		";0\u0001\u0000\u0000\u0000<\n\u0001\u0000\u0000\u0000=?\u0007\u0002\u0000"+
		"\u0000>@\u0007\u0003\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0003\u0005\u0002\u0000B\f\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0004\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HI\u0006\u0006\u0000\u0000I\u000e\u0001"+
		"\u0000\u0000\u0000JK\u0005\"\u0000\u0000KL\u0005\"\u0000\u0000LP\u0005"+
		"\"\u0000\u0000MO\t\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000"+
		"TU\u0005\"\u0000\u0000UV\u0005\"\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0006\u0007\u0000\u0000X\u0010\u0001\u0000\u0000\u0000Y]\u0005#\u0000"+
		"\u0000Z\\\t\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0005\r\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ce\u0007\u0005\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0006\b\u0000\u0000g\u0012\u0001\u0000\u0000\u0000hl\u0007\u0006"+
		"\u0000\u0000ik\u0003\u0005\u0002\u0000ji\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mq\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u00050\u0000\u0000"+
		"ph\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0014\u0001\u0000"+
		"\u0000\u0000rz\u0003\t\u0004\u0000sv\u0003\t\u0004\u0000tv\u0003\u0013"+
		"\t\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0003\u000b\u0005\u0000xz\u0001\u0000\u0000\u0000yr\u0001"+
		"\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000z\u0016\u0001\u0000\u0000"+
		"\u0000{|\u0005\'\u0000\u0000|}\t\u0000\u0000\u0000}\u0086\u0005\'\u0000"+
		"\u0000~\u007f\u0005\'\u0000\u0000\u007f\u0082\u0005\\\u0000\u0000\u0080"+
		"\u0083\u0003\u0013\t\u0000\u0081\u0083\u0007\u0007\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0005\'\u0000\u0000\u0085{\u0001"+
		"\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0086\u0018\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0003\u0007\u0003\u0000\u0088\u008a\u0005_\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u0094\u0001\u0000\u0000\u0000\u008b\u008f\u0003\u0007\u0003"+
		"\u0000\u008c\u008f\u0003\u0005\u0002\u0000\u008d\u008f\u0005_\u0000\u0000"+
		"\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0089\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u001a\u0001\u0000\u0000\u0000\u0016\u0000&-28;?FP]adlpuy\u0082"+
		"\u0085\u0089\u008e\u0090\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}