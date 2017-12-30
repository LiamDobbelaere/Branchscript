// Generated from D:/GitHub/Branchscript/src/main/resources\Branchscript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BranchscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_HEADER=1, CLOSE_HEADER=2, HEADER_SEPARATOR=3, OPEN_ANSWER=4, OPEN_LINK=5, 
		OPEN_COLLECTION=6, CLOSE_COLLECTION=7, COLLECTION_DELIMITER=8, BOOL_TRUE=9, 
		BOOL_FALSE=10, INCREMENT=11, DECREMENT=12, ASSIGN=13, EQUAL=14, GREATER=15, 
		LESS=16, TRIGGER_KEYWORD=17, OPTIONS_KEYWORD=18, SETFLAGS_KEYWORD=19, 
		IF_KEYWORD=20, IF_AND_KEYWORD=21, IF_OR_KEYWORD=22, ID=23, NUMBER=24, 
		STRING=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_HEADER", "CLOSE_HEADER", "HEADER_SEPARATOR", "OPEN_ANSWER", "OPEN_LINK", 
		"OPEN_COLLECTION", "CLOSE_COLLECTION", "COLLECTION_DELIMITER", "BOOL_TRUE", 
		"BOOL_FALSE", "INCREMENT", "DECREMENT", "ASSIGN", "EQUAL", "GREATER", 
		"LESS", "TRIGGER_KEYWORD", "OPTIONS_KEYWORD", "SETFLAGS_KEYWORD", "IF_KEYWORD", 
		"IF_AND_KEYWORD", "IF_OR_KEYWORD", "ID", "NUMBER", "DIGIT", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'/'", "'-'", "'->'", "'('", "')'", "','", "'true'", 
		"'false'", "'++'", "'--'", "'='", "'=='", "'>'", "'<'", "'TRIGGER'", "'OPTIONS'", 
		"'SET'", "'IF'", "'IF_AND'", "'IF_OR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_HEADER", "CLOSE_HEADER", "HEADER_SEPARATOR", "OPEN_ANSWER", 
		"OPEN_LINK", "OPEN_COLLECTION", "CLOSE_COLLECTION", "COLLECTION_DELIMITER", 
		"BOOL_TRUE", "BOOL_FALSE", "INCREMENT", "DECREMENT", "ASSIGN", "EQUAL", 
		"GREATER", "LESS", "TRIGGER_KEYWORD", "OPTIONS_KEYWORD", "SETFLAGS_KEYWORD", 
		"IF_KEYWORD", "IF_AND_KEYWORD", "IF_OR_KEYWORD", "ID", "NUMBER", "STRING", 
		"WS"
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


	public BranchscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Branchscript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u008a"+
		"\n\30\r\30\16\30\u008b\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\7\33\u0099\n\33\f\33\16\33\u009c\13\33\3\33\3\33"+
		"\3\34\6\34\u00a1\n\34\r\34\16\34\u00a2\3\34\3\34\2\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\33\67\34\3\2\7\5\2C\\aac|\3\2"+
		"\62;\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\2\u00a9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2"+
		"\2\13A\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25O\3\2"+
		"\2\2\27U\3\2\2\2\31X\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!b\3\2"+
		"\2\2#d\3\2\2\2%l\3\2\2\2\'t\3\2\2\2)x\3\2\2\2+{\3\2\2\2-\u0082\3\2\2\2"+
		"/\u0089\3\2\2\2\61\u008e\3\2\2\2\63\u0092\3\2\2\2\65\u0094\3\2\2\2\67"+
		"\u00a0\3\2\2\29:\7]\2\2:\4\3\2\2\2;<\7_\2\2<\6\3\2\2\2=>\7\61\2\2>\b\3"+
		"\2\2\2?@\7/\2\2@\n\3\2\2\2AB\7/\2\2BC\7@\2\2C\f\3\2\2\2DE\7*\2\2E\16\3"+
		"\2\2\2FG\7+\2\2G\20\3\2\2\2HI\7.\2\2I\22\3\2\2\2JK\7v\2\2KL\7t\2\2LM\7"+
		"w\2\2MN\7g\2\2N\24\3\2\2\2OP\7h\2\2PQ\7c\2\2QR\7n\2\2RS\7u\2\2ST\7g\2"+
		"\2T\26\3\2\2\2UV\7-\2\2VW\7-\2\2W\30\3\2\2\2XY\7/\2\2YZ\7/\2\2Z\32\3\2"+
		"\2\2[\\\7?\2\2\\\34\3\2\2\2]^\7?\2\2^_\7?\2\2_\36\3\2\2\2`a\7@\2\2a \3"+
		"\2\2\2bc\7>\2\2c\"\3\2\2\2de\7V\2\2ef\7T\2\2fg\7K\2\2gh\7I\2\2hi\7I\2"+
		"\2ij\7G\2\2jk\7T\2\2k$\3\2\2\2lm\7Q\2\2mn\7R\2\2no\7V\2\2op\7K\2\2pq\7"+
		"Q\2\2qr\7P\2\2rs\7U\2\2s&\3\2\2\2tu\7U\2\2uv\7G\2\2vw\7V\2\2w(\3\2\2\2"+
		"xy\7K\2\2yz\7H\2\2z*\3\2\2\2{|\7K\2\2|}\7H\2\2}~\7a\2\2~\177\7C\2\2\177"+
		"\u0080\7P\2\2\u0080\u0081\7F\2\2\u0081,\3\2\2\2\u0082\u0083\7K\2\2\u0083"+
		"\u0084\7H\2\2\u0084\u0085\7a\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7T\2\2"+
		"\u0087.\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\60\3\2\2\2\u008d"+
		"\u008f\5\63\32\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\62\3\2\2\2\u0092\u0093\t\3\2\2\u0093"+
		"\64\3\2\2\2\u0094\u009a\7$\2\2\u0095\u0096\7^\2\2\u0096\u0099\t\4\2\2"+
		"\u0097\u0099\n\5\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e\66\3\2\2\2\u009f\u00a1\t\6\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\34\2\2\u00a58\3\2\2\2\b\2\u008b"+
		"\u0090\u0098\u009a\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}