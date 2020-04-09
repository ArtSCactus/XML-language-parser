// Generated from D:/Projects/XML-language-parser/src/main/resources\XMLParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLParser extends Parser {
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
		EQUALS=25, STRING=26, Name=27, S=28, PI=29, CLOSE_CONSTANTS_TAG=30;
	public static final int
		RULE_tag_name_attr = 0, RULE_tag_value_attr = 1, RULE_simple_tag = 2, 
		RULE_complex_tag = 3, RULE_complex_tag_close = 4, RULE_script = 5, RULE_scriptOpen = 6, 
		RULE_scriptClose = 7, RULE_scriptBodyOpen = 8, RULE_scriptBodyClose = 9, 
		RULE_constants = 10, RULE_prolog = 11, RULE_content = 12, RULE_element = 13, 
		RULE_reference = 14, RULE_attribute = 15, RULE_chardata = 16, RULE_misc = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"tag_name_attr", "tag_value_attr", "simple_tag", "complex_tag", "complex_tag_close", 
			"script", "scriptOpen", "scriptClose", "scriptBodyOpen", "scriptBodyClose", 
			"constants", "prolog", "content", "element", "reference", "attribute", 
			"chardata", "misc"
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
			"SLASH", "EQUALS", "STRING", "Name", "S", "PI", "CLOSE_CONSTANTS_TAG"
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

	@Override
	public String getGrammarFileName() { return "XMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Tag_name_attrContext extends ParserRuleContext {
		public TerminalNode TAG_NAME_ATTR() { return getToken(XMLParser.TAG_NAME_ATTR, 0); }
		public TerminalNode EQUALS() { return getToken(XMLParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public Tag_name_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_name_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTag_name_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTag_name_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTag_name_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_name_attrContext tag_name_attr() throws RecognitionException {
		Tag_name_attrContext _localctx = new Tag_name_attrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tag_name_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TAG_NAME_ATTR);
			setState(37);
			match(EQUALS);
			setState(38);
			match(STRING);
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

	public static class Tag_value_attrContext extends ParserRuleContext {
		public TerminalNode TAG_VALUE_ATTR() { return getToken(XMLParser.TAG_VALUE_ATTR, 0); }
		public TerminalNode EQUALS() { return getToken(XMLParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public Tag_value_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_value_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTag_value_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTag_value_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTag_value_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_value_attrContext tag_value_attr() throws RecognitionException {
		Tag_value_attrContext _localctx = new Tag_value_attrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tag_value_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TAG_VALUE_ATTR);
			setState(41);
			match(EQUALS);
			setState(42);
			match(STRING);
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

	public static class Simple_tagContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(XMLParser.OPEN, 0); }
		public TerminalNode TAG_DECLARATION() { return getToken(XMLParser.TAG_DECLARATION, 0); }
		public Tag_name_attrContext tag_name_attr() {
			return getRuleContext(Tag_name_attrContext.class,0);
		}
		public Tag_value_attrContext tag_value_attr() {
			return getRuleContext(Tag_value_attrContext.class,0);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(XMLParser.SLASH_CLOSE, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Simple_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterSimple_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitSimple_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitSimple_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_tagContext simple_tag() throws RecognitionException {
		Simple_tagContext _localctx = new Simple_tagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(44);
				misc();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(OPEN);
			setState(51);
			match(TAG_DECLARATION);
			setState(52);
			tag_name_attr();
			setState(53);
			tag_value_attr();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(54);
				attribute();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(SLASH_CLOSE);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					misc();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Complex_tagContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(XMLParser.OPEN, 0); }
		public TerminalNode TAG_DECLARATION() { return getToken(XMLParser.TAG_DECLARATION, 0); }
		public Tag_name_attrContext tag_name_attr() {
			return getRuleContext(Tag_name_attrContext.class,0);
		}
		public Tag_value_attrContext tag_value_attr() {
			return getRuleContext(Tag_value_attrContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(XMLParser.CLOSE, 0); }
		public Complex_tag_closeContext complex_tag_close() {
			return getRuleContext(Complex_tag_closeContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<Simple_tagContext> simple_tag() {
			return getRuleContexts(Simple_tagContext.class);
		}
		public Simple_tagContext simple_tag(int i) {
			return getRuleContext(Simple_tagContext.class,i);
		}
		public Complex_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterComplex_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitComplex_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitComplex_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_tagContext complex_tag() throws RecognitionException {
		Complex_tagContext _localctx = new Complex_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_complex_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(67);
				misc();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(OPEN);
			setState(74);
			match(TAG_DECLARATION);
			setState(75);
			tag_name_attr();
			setState(76);
			tag_value_attr();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(77);
				attribute();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(CLOSE);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					simple_tag();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(90);
			complex_tag_close();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					misc();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Complex_tag_closeContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(XMLParser.OPEN, 0); }
		public TerminalNode SLASH() { return getToken(XMLParser.SLASH, 0); }
		public TerminalNode TAG_DECLARATION() { return getToken(XMLParser.TAG_DECLARATION, 0); }
		public TerminalNode CLOSE() { return getToken(XMLParser.CLOSE, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public Complex_tag_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_tag_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterComplex_tag_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitComplex_tag_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitComplex_tag_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_tag_closeContext complex_tag_close() throws RecognitionException {
		Complex_tag_closeContext _localctx = new Complex_tag_closeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complex_tag_close);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(97);
				misc();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(OPEN);
			setState(104);
			match(SLASH);
			setState(105);
			match(TAG_DECLARATION);
			setState(106);
			match(CLOSE);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					misc();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ScriptContext extends ParserRuleContext {
		public ScriptOpenContext scriptOpen() {
			return getRuleContext(ScriptOpenContext.class,0);
		}
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public ScriptBodyOpenContext scriptBodyOpen() {
			return getRuleContext(ScriptBodyOpenContext.class,0);
		}
		public ScriptBodyCloseContext scriptBodyClose() {
			return getRuleContext(ScriptBodyCloseContext.class,0);
		}
		public ScriptCloseContext scriptClose() {
			return getRuleContext(ScriptCloseContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(113);
				prolog();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					misc();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(122);
			scriptOpen();
			setState(123);
			constants();
			setState(124);
			scriptBodyOpen();
			setState(125);
			scriptBodyClose();
			setState(126);
			scriptClose();
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

	public static class ScriptOpenContext extends ParserRuleContext {
		public TerminalNode OPEN_SCRIPT_TAG() { return getToken(XMLParser.OPEN_SCRIPT_TAG, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ScriptOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterScriptOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitScriptOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitScriptOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptOpenContext scriptOpen() throws RecognitionException {
		ScriptOpenContext _localctx = new ScriptOpenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scriptOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(128);
				misc();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(OPEN_SCRIPT_TAG);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(135);
				misc();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ScriptCloseContext extends ParserRuleContext {
		public TerminalNode CLOSE_SCRIPT_TAG() { return getToken(XMLParser.CLOSE_SCRIPT_TAG, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ScriptCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterScriptClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitScriptClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitScriptClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptCloseContext scriptClose() throws RecognitionException {
		ScriptCloseContext _localctx = new ScriptCloseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scriptClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(141);
				misc();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(CLOSE_SCRIPT_TAG);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(148);
				misc();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ScriptBodyOpenContext extends ParserRuleContext {
		public TerminalNode OPEN_SCRIPT_BODY_TAG() { return getToken(XMLParser.OPEN_SCRIPT_BODY_TAG, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ScriptBodyOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBodyOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterScriptBodyOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitScriptBodyOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitScriptBodyOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBodyOpenContext scriptBodyOpen() throws RecognitionException {
		ScriptBodyOpenContext _localctx = new ScriptBodyOpenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scriptBodyOpen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(154);
				misc();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(OPEN_SCRIPT_BODY_TAG);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					misc();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ScriptBodyCloseContext extends ParserRuleContext {
		public TerminalNode CLOSE_SCRIPT_BODY_TAG() { return getToken(XMLParser.CLOSE_SCRIPT_BODY_TAG, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ScriptBodyCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBodyClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterScriptBodyClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitScriptBodyClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitScriptBodyClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBodyCloseContext scriptBodyClose() throws RecognitionException {
		ScriptBodyCloseContext _localctx = new ScriptBodyCloseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scriptBodyClose);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(167);
				misc();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(CLOSE_SCRIPT_BODY_TAG);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					misc();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode OPEN_CONSTANTS_TAG() { return getToken(XMLParser.OPEN_CONSTANTS_TAG, 0); }
		public TerminalNode CLOSE_CONSTANTS_TAG() { return getToken(XMLParser.CLOSE_CONSTANTS_TAG, 0); }
		public List<Complex_tagContext> complex_tag() {
			return getRuleContexts(Complex_tagContext.class);
		}
		public Complex_tagContext complex_tag(int i) {
			return getRuleContext(Complex_tagContext.class,i);
		}
		public List<Simple_tagContext> simple_tag() {
			return getRuleContexts(Simple_tagContext.class);
		}
		public Simple_tagContext simple_tag(int i) {
			return getRuleContext(Simple_tagContext.class,i);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(OPEN_CONSTANTS_TAG);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(181);
					complex_tag();
					}
					break;
				case 2:
					{
					setState(182);
					simple_tag();
					}
					break;
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(CLOSE_CONSTANTS_TAG);
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(XMLParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(XMLParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitProlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(XMLDeclOpen);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(191);
				attribute();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(SPECIAL_CLOSE);
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

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(XMLParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(XMLParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(XMLParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(XMLParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(XMLParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(XMLParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(199);
				chardata();
				}
			}

			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(202);
						element();
						}
						break;
					case EntityRef:
					case CharRef:
						{
						setState(203);
						reference();
						}
						break;
					case CDATA:
						{
						setState(204);
						match(CDATA);
						}
						break;
					case PI:
						{
						setState(205);
						match(PI);
						}
						break;
					case COMMENT:
						{
						setState(206);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==TEXT) {
						{
						setState(209);
						chardata();
						}
					}

					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(XMLParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(XMLParser.OPEN, i);
		}
		public List<TerminalNode> Name() { return getTokens(XMLParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(XMLParser.Name, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(XMLParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(XMLParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XMLParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(XMLParser.SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(OPEN);
				setState(218);
				match(Name);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(219);
					attribute();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(CLOSE);
				setState(226);
				content();
				setState(227);
				match(OPEN);
				setState(228);
				match(SLASH);
				setState(229);
				match(Name);
				setState(230);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(OPEN);
				setState(233);
				match(Name);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(234);
					attribute();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(SLASH_CLOSE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(XMLParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(XMLParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(XMLParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(XMLParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Name);
			setState(246);
			match(EQUALS);
			setState(247);
			match(STRING);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(XMLParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(XMLParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(XMLParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\7\4A\n\4\f\4"+
		"\16\4D\13\4\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f"+
		"\5\16\5T\13\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6"+
		"\16\6r\13\6\3\7\5\7u\n\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\7\b\u008b\n\b\f\b"+
		"\16\b\u008e\13\b\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\t\3\t\7\t\u0098"+
		"\n\t\f\t\16\t\u009b\13\t\3\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\n\3\n"+
		"\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae"+
		"\13\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\f\3\f\3\f\7"+
		"\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\f\3\f\3\r\3\r\7\r\u00c3\n\r\f\r\16"+
		"\r\u00c6\13\r\3\r\3\r\3\16\5\16\u00cb\n\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00d2\n\16\3\16\5\16\u00d5\n\16\7\16\u00d7\n\16\f\16\16\16\u00da\13"+
		"\16\3\17\3\17\3\17\7\17\u00df\n\17\f\17\16\17\u00e2\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1"+
		"\13\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3"+
		"\2\6\7\4\2\b\b\23\23\5\2\3\3\b\b\37\37\2\u010d\2&\3\2\2\2\4*\3\2\2\2\6"+
		"\61\3\2\2\2\bH\3\2\2\2\nf\3\2\2\2\ft\3\2\2\2\16\u0085\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00ac\3\2\2\2\26\u00b6\3\2\2\2\30\u00c0\3"+
		"\2\2\2\32\u00ca\3\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2 \u00f7\3\2\2"+
		"\2\"\u00fb\3\2\2\2$\u00fd\3\2\2\2&\'\7\25\2\2\'(\7\33\2\2()\7\34\2\2)"+
		"\3\3\2\2\2*+\7\26\2\2+,\7\33\2\2,-\7\34\2\2-\5\3\2\2\2.\60\5$\23\2/.\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2"+
		"\2\2\64\65\7\t\2\2\65\66\7\24\2\2\66\67\5\2\2\2\67;\5\4\3\28:\5 \21\2"+
		"98\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>B\7\31\2"+
		"\2?A\5$\23\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2"+
		"\2\2EG\5$\23\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2"+
		"\2\2KL\7\t\2\2LM\7\24\2\2MN\5\2\2\2NR\5\4\3\2OQ\5 \21\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UY\7\27\2\2VX\5\6\4\2WV"+
		"\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\n\6\2"+
		"]_\5$\23\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2b`\3\2\2"+
		"\2ce\5$\23\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2"+
		"\2ij\7\t\2\2jk\7\32\2\2kl\7\24\2\2lp\7\27\2\2mo\5$\23\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2su\5\30\r\2ts\3\2\2\2"+
		"tu\3\2\2\2uy\3\2\2\2vx\5$\23\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z|\3\2\2\2{y\3\2\2\2|}\5\16\b\2}~\5\26\f\2~\177\5\22\n\2\177\u0080\5\24"+
		"\13\2\u0080\u0081\5\20\t\2\u0081\r\3\2\2\2\u0082\u0084\5$\23\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\7\13\2\2\u0089\u008b\5"+
		"$\23\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5$\23"+
		"\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7\f\2\2\u0096"+
		"\u0098\5$\23\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e"+
		"\5$\23\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a6\7\r"+
		"\2\2\u00a3\u00a5\5$\23\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b3\7\16\2\2\u00b0\u00b2\5$\23\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00bb\7\17\2\2\u00b7\u00ba\5\b\5\2\u00b8\u00ba\5"+
		"\6\4\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7 \2\2\u00bf\27\3\2\2\2\u00c0\u00c4\7\n\2\2\u00c1\u00c3"+
		"\5 \21\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\30"+
		"\2\2\u00c8\31\3\2\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00d8\3\2\2\2\u00cc\u00d2\5\34\17\2\u00cd\u00d2\5\36\20"+
		"\2\u00ce\u00d2\7\4\2\2\u00cf\u00d2\7\37\2\2\u00d0\u00d2\7\3\2\2\u00d1"+
		"\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\"\22\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\33\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\t\2\2\u00dc\u00e0\7\35\2"+
		"\2\u00dd\u00df\5 \21\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\27\2\2\u00e4\u00e5\5\32\16\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7"+
		"\7\32\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00f4\3\2\2"+
		"\2\u00ea\u00eb\7\t\2\2\u00eb\u00ef\7\35\2\2\u00ec\u00ee\5 \21\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\7\31\2\2\u00f3"+
		"\u00db\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\t\2\2"+
		"\2\u00f6\37\3\2\2\2\u00f7\u00f8\7\35\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa"+
		"\7\34\2\2\u00fa!\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc#\3\2\2\2\u00fd\u00fe"+
		"\t\4\2\2\u00fe%\3\2\2\2\37\61;BHRY`fpty\u0085\u008c\u0092\u0099\u009f"+
		"\u00a6\u00ac\u00b3\u00b9\u00bb\u00c4\u00ca\u00d1\u00d4\u00d8\u00e0\u00ef"+
		"\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}