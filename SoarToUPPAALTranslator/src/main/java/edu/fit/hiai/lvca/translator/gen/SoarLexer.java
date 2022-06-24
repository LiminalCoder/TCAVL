package edu.fit.hiai.lvca.translator.gen;// Generated from C:/Users/cm131/OneDrive/Documents/GitHub/lvca/code/SoarToUPPAALTranslator/src/main/antlr4/edu/fit/hiai/lvca/antlr4\Soar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, Documentation=40, Print_string=41, STATE=42, Sym_constant=43, 
		Int_constant=44, Float_constant=45, WS=46, COMMENT=47;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "Documentation", 
			"Print_string", "STATE", "Sym_constant", "Int_constant", "Float_constant", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sp'", "'gp'", "'{'", "'-->'", "'}'", "':'", "'o-support'", "'i-support'", 
			"'chunk'", "'default'", "'template'", "'('", "'impasse'", "')'", "'-'", 
			"'^'", "'.'", "'+'", "'['", "']'", "'<<'", "'>>'", "'<>'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'<=>'", "'='", "'write '", "'(crlf)'", "'*'", 
			"'/'", "','", "'!'", "'~'", "'@'", "'&'", null, null, "'state'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Documentation", "Print_string", "STATE", "Sym_constant", 
			"Int_constant", "Float_constant", "WS", "COMMENT"
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


	public SoarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Soar.g4"; }

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
		"\u0004\u0000/\u012e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u00f0\b\'\n\'\f\'\u00f3"+
		"\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u00fb\b(\n("+
		"\f(\u00fe\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0005*\u010a\b*\n*\f*\u010d\t*\u0001+\u0004+\u0110\b+\u000b+"+
		"\f+\u0111\u0001,\u0004,\u0115\b,\u000b,\f,\u0116\u0001,\u0001,\u0004,"+
		"\u011b\b,\u000b,\f,\u011c\u0001-\u0004-\u0120\b-\u000b-\f-\u0121\u0001"+
		"-\u0001-\u0001.\u0001.\u0005.\u0128\b.\n.\f.\u012b\t.\u0001.\u0001.\u0000"+
		"\u0000/\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/\u0001\u0000\u0007\u0001\u0000\"\"\u0001\u0000"+
		"||\u0002\u0000AZaz\u0006\u0000**--09AZ__az\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  \u0002\u0000\n\n\r\r\u0135\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0001_\u0001\u0000\u0000"+
		"\u0000\u0003b\u0001\u0000\u0000\u0000\u0005e\u0001\u0000\u0000\u0000\u0007"+
		"g\u0001\u0000\u0000\u0000\tk\u0001\u0000\u0000\u0000\u000bm\u0001\u0000"+
		"\u0000\u0000\ro\u0001\u0000\u0000\u0000\u000fy\u0001\u0000\u0000\u0000"+
		"\u0011\u0083\u0001\u0000\u0000\u0000\u0013\u0089\u0001\u0000\u0000\u0000"+
		"\u0015\u0091\u0001\u0000\u0000\u0000\u0017\u009a\u0001\u0000\u0000\u0000"+
		"\u0019\u009c\u0001\u0000\u0000\u0000\u001b\u00a4\u0001\u0000\u0000\u0000"+
		"\u001d\u00a6\u0001\u0000\u0000\u0000\u001f\u00a8\u0001\u0000\u0000\u0000"+
		"!\u00aa\u0001\u0000\u0000\u0000#\u00ac\u0001\u0000\u0000\u0000%\u00ae"+
		"\u0001\u0000\u0000\u0000\'\u00b0\u0001\u0000\u0000\u0000)\u00b2\u0001"+
		"\u0000\u0000\u0000+\u00b5\u0001\u0000\u0000\u0000-\u00b8\u0001\u0000\u0000"+
		"\u0000/\u00bb\u0001\u0000\u0000\u00001\u00bd\u0001\u0000\u0000\u00003"+
		"\u00bf\u0001\u0000\u0000\u00005\u00c2\u0001\u0000\u0000\u00007\u00c5\u0001"+
		"\u0000\u0000\u00009\u00c8\u0001\u0000\u0000\u0000;\u00cc\u0001\u0000\u0000"+
		"\u0000=\u00ce\u0001\u0000\u0000\u0000?\u00d5\u0001\u0000\u0000\u0000A"+
		"\u00dc\u0001\u0000\u0000\u0000C\u00de\u0001\u0000\u0000\u0000E\u00e0\u0001"+
		"\u0000\u0000\u0000G\u00e2\u0001\u0000\u0000\u0000I\u00e4\u0001\u0000\u0000"+
		"\u0000K\u00e6\u0001\u0000\u0000\u0000M\u00e8\u0001\u0000\u0000\u0000O"+
		"\u00ea\u0001\u0000\u0000\u0000Q\u00f8\u0001\u0000\u0000\u0000S\u0101\u0001"+
		"\u0000\u0000\u0000U\u0107\u0001\u0000\u0000\u0000W\u010f\u0001\u0000\u0000"+
		"\u0000Y\u0114\u0001\u0000\u0000\u0000[\u011f\u0001\u0000\u0000\u0000]"+
		"\u0125\u0001\u0000\u0000\u0000_`\u0005s\u0000\u0000`a\u0005p\u0000\u0000"+
		"a\u0002\u0001\u0000\u0000\u0000bc\u0005g\u0000\u0000cd\u0005p\u0000\u0000"+
		"d\u0004\u0001\u0000\u0000\u0000ef\u0005{\u0000\u0000f\u0006\u0001\u0000"+
		"\u0000\u0000gh\u0005-\u0000\u0000hi\u0005-\u0000\u0000ij\u0005>\u0000"+
		"\u0000j\b\u0001\u0000\u0000\u0000kl\u0005}\u0000\u0000l\n\u0001\u0000"+
		"\u0000\u0000mn\u0005:\u0000\u0000n\f\u0001\u0000\u0000\u0000op\u0005o"+
		"\u0000\u0000pq\u0005-\u0000\u0000qr\u0005s\u0000\u0000rs\u0005u\u0000"+
		"\u0000st\u0005p\u0000\u0000tu\u0005p\u0000\u0000uv\u0005o\u0000\u0000"+
		"vw\u0005r\u0000\u0000wx\u0005t\u0000\u0000x\u000e\u0001\u0000\u0000\u0000"+
		"yz\u0005i\u0000\u0000z{\u0005-\u0000\u0000{|\u0005s\u0000\u0000|}\u0005"+
		"u\u0000\u0000}~\u0005p\u0000\u0000~\u007f\u0005p\u0000\u0000\u007f\u0080"+
		"\u0005o\u0000\u0000\u0080\u0081\u0005r\u0000\u0000\u0081\u0082\u0005t"+
		"\u0000\u0000\u0082\u0010\u0001\u0000\u0000\u0000\u0083\u0084\u0005c\u0000"+
		"\u0000\u0084\u0085\u0005h\u0000\u0000\u0085\u0086\u0005u\u0000\u0000\u0086"+
		"\u0087\u0005n\u0000\u0000\u0087\u0088\u0005k\u0000\u0000\u0088\u0012\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005f\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d"+
		"\u008e\u0005u\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005"+
		"t\u0000\u0000\u0090\u0014\u0001\u0000\u0000\u0000\u0091\u0092\u0005t\u0000"+
		"\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u0094\u0005m\u0000\u0000\u0094"+
		"\u0095\u0005p\u0000\u0000\u0095\u0096\u0005l\u0000\u0000\u0096\u0097\u0005"+
		"a\u0000\u0000\u0097\u0098\u0005t\u0000\u0000\u0098\u0099\u0005e\u0000"+
		"\u0000\u0099\u0016\u0001\u0000\u0000\u0000\u009a\u009b\u0005(\u0000\u0000"+
		"\u009b\u0018\u0001\u0000\u0000\u0000\u009c\u009d\u0005i\u0000\u0000\u009d"+
		"\u009e\u0005m\u0000\u0000\u009e\u009f\u0005p\u0000\u0000\u009f\u00a0\u0005"+
		"a\u0000\u0000\u00a0\u00a1\u0005s\u0000\u0000\u00a1\u00a2\u0005s\u0000"+
		"\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u001a\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005)\u0000\u0000\u00a5\u001c\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005-\u0000\u0000\u00a7\u001e\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005^\u0000\u0000\u00a9 \u0001\u0000\u0000\u0000\u00aa\u00ab\u0005."+
		"\u0000\u0000\u00ab\"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005+\u0000"+
		"\u0000\u00ad$\u0001\u0000\u0000\u0000\u00ae\u00af\u0005[\u0000\u0000\u00af"+
		"&\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005]\u0000\u0000\u00b1(\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005<\u0000\u0000\u00b3\u00b4\u0005<\u0000"+
		"\u0000\u00b4*\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005>\u0000\u0000\u00b6"+
		"\u00b7\u0005>\u0000\u0000\u00b7,\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"<\u0000\u0000\u00b9\u00ba\u0005>\u0000\u0000\u00ba.\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005<\u0000\u0000\u00bc0\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005>\u0000\u0000\u00be2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"<\u0000\u0000\u00c0\u00c1\u0005=\u0000\u0000\u00c14\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005>\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000\u00c4"+
		"6\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c6\u00c7\u0005"+
		"=\u0000\u0000\u00c78\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005<\u0000"+
		"\u0000\u00c9\u00ca\u0005=\u0000\u0000\u00ca\u00cb\u0005>\u0000\u0000\u00cb"+
		":\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005=\u0000\u0000\u00cd<\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005w\u0000\u0000\u00cf\u00d0\u0005r\u0000"+
		"\u0000\u00d0\u00d1\u0005i\u0000\u0000\u00d1\u00d2\u0005t\u0000\u0000\u00d2"+
		"\u00d3\u0005e\u0000\u0000\u00d3\u00d4\u0005 \u0000\u0000\u00d4>\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005(\u0000\u0000\u00d6\u00d7\u0005c\u0000"+
		"\u0000\u00d7\u00d8\u0005r\u0000\u0000\u00d8\u00d9\u0005l\u0000\u0000\u00d9"+
		"\u00da\u0005f\u0000\u0000\u00da\u00db\u0005)\u0000\u0000\u00db@\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005*\u0000\u0000\u00ddB\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005/\u0000\u0000\u00dfD\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0005,\u0000\u0000\u00e1F\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"!\u0000\u0000\u00e3H\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005~\u0000"+
		"\u0000\u00e5J\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005@\u0000\u0000\u00e7"+
		"L\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005&\u0000\u0000\u00e9N\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005\"\u0000\u0000\u00eb\u00ec\u0005\""+
		"\u0000\u0000\u00ec\u00ed\u0005\"\u0000\u0000\u00ed\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f0\b\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\"\u0000\u0000\u00f5"+
		"\u00f6\u0005\"\u0000\u0000\u00f6\u00f7\u0005\"\u0000\u0000\u00f7P\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fc\u0005|\u0000\u0000\u00f9\u00fb\b\u0001"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005|\u0000\u0000\u0100R\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005s\u0000\u0000\u0102\u0103\u0005t\u0000\u0000\u0103\u0104"+
		"\u0005a\u0000\u0000\u0104\u0105\u0005t\u0000\u0000\u0105\u0106\u0005e"+
		"\u0000\u0000\u0106T\u0001\u0000\u0000\u0000\u0107\u010b\u0007\u0002\u0000"+
		"\u0000\u0108\u010a\u0007\u0003\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010cV\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0007\u0004\u0000\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112X\u0001\u0000\u0000\u0000\u0113\u0115\u0007\u0004\u0000\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0005.\u0000\u0000\u0119\u011b"+
		"\u0007\u0004\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011dZ\u0001\u0000\u0000\u0000\u011e\u0120\u0007"+
		"\u0005\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0006"+
		"-\u0000\u0000\u0124\\\u0001\u0000\u0000\u0000\u0125\u0129\u0005#\u0000"+
		"\u0000\u0126\u0128\b\u0006\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0006.\u0000\u0000\u012d"+
		"^\u0001\u0000\u0000\u0000\t\u0000\u00f1\u00fc\u010b\u0111\u0116\u011c"+
		"\u0121\u0129\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}