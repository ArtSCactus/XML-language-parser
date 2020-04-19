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
		OPEN_CONSTANTS_TAG=13, CLOSE_CONSTANTS_TAG=14, OPEN_ALGORITHM_TAG=15, 
		CLOSE_ALGORITHM_TAG=16, BRACKET_OPEN=17, BRACKET_CLOSE=18, OPEN_BLOCK=19, 
		CLOSE_BLOCK=20, IF=21, WORD=22, IS=23, CONTAINS=24, EQUALS_WORD=25, TAG_DECLARATION=26, 
		TAG_NAME_ATTR=27, TAG_VALUE_ATTR=28, ELSE=29, CLOSE=30, SPECIAL_CLOSE=31, 
		SLASH_CLOSE=32, SLASH=33, EQUALS=34, STRING=35, Name=36, S=37, PI=38, 
		FOR=39, TEXT=40;
	public static final int
		RULE_tag = 0, RULE_tag_name_attr = 1, RULE_tag_value_attr = 2, RULE_simple_tag = 3, 
		RULE_complex_tag = 4, RULE_complex_tag_close = 5, RULE_conditionOperator = 6, 
		RULE_cycleOperator = 7, RULE_code = 8, RULE_script = 9, RULE_scriptOpen = 10, 
		RULE_scriptClose = 11, RULE_scriptBodyOpen = 12, RULE_scriptBodyClose = 13, 
		RULE_constants = 14, RULE_prolog = 15, RULE_operatorExpression = 16, RULE_reference = 17, 
		RULE_attribute = 18, RULE_chardata = 19, RULE_misc = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"tag", "tag_name_attr", "tag_value_attr", "simple_tag", "complex_tag", 
			"complex_tag_close", "conditionOperator", "cycleOperator", "code", "script", 
			"scriptOpen", "scriptClose", "scriptBodyOpen", "scriptBodyClose", "constants", 
			"prolog", "operatorExpression", "reference", "attribute", "chardata", 
			"misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, "'<XMLScript>'", 
			"'</XMLScript>'", "'<body>'", "'</body>'", "'<constants>'", "'</constants>'", 
			"'<algorithm>'", "'</algorithm>'", "'('", "')'", "'{'", "'}'", "'if'", 
			null, "'is'", "'cont'", "'eq'", "'tag'", "'name'", "'value'", "'else'", 
			"'>'", null, "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "OPEN_SCRIPT_TAG", "CLOSE_SCRIPT_TAG", "OPEN_SCRIPT_BODY_TAG", 
			"CLOSE_SCRIPT_BODY_TAG", "OPEN_CONSTANTS_TAG", "CLOSE_CONSTANTS_TAG", 
			"OPEN_ALGORITHM_TAG", "CLOSE_ALGORITHM_TAG", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"OPEN_BLOCK", "CLOSE_BLOCK", "IF", "WORD", "IS", "CONTAINS", "EQUALS_WORD", 
			"TAG_DECLARATION", "TAG_NAME_ATTR", "TAG_VALUE_ATTR", "ELSE", "CLOSE", 
			"SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "Name", 
			"S", "PI", "FOR", "TEXT"
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

	public static class TagContext extends ParserRuleContext {
		public Simple_tagContext simple_tag() {
			return getRuleContext(Simple_tagContext.class,0);
		}
		public Complex_tagContext complex_tag() {
			return getRuleContext(Complex_tagContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tag);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				simple_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				complex_tag();
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
		enterRule(_localctx, 2, RULE_tag_name_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(TAG_NAME_ATTR);
			setState(47);
			match(EQUALS);
			setState(48);
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
		enterRule(_localctx, 4, RULE_tag_value_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TAG_VALUE_ATTR);
			setState(51);
			match(EQUALS);
			setState(52);
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
		enterRule(_localctx, 6, RULE_simple_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(54);
				misc();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(OPEN);
			setState(61);
			match(TAG_DECLARATION);
			setState(62);
			tag_name_attr();
			setState(63);
			tag_value_attr();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(64);
				attribute();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(SLASH_CLOSE);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					misc();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
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
		enterRule(_localctx, 8, RULE_complex_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(77);
				misc();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(OPEN);
			setState(84);
			match(TAG_DECLARATION);
			setState(85);
			tag_name_attr();
			setState(86);
			tag_value_attr();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(87);
				attribute();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CLOSE);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					tag();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			complex_tag_close();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					misc();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 10, RULE_complex_tag_close);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(107);
				misc();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(OPEN);
			setState(114);
			match(SLASH);
			setState(115);
			match(TAG_DECLARATION);
			setState(116);
			match(CLOSE);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					misc();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ConditionOperatorContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(XMLParser.IF, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(XMLParser.BRACKET_OPEN, 0); }
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(XMLParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> OPEN_BLOCK() { return getTokens(XMLParser.OPEN_BLOCK); }
		public TerminalNode OPEN_BLOCK(int i) {
			return getToken(XMLParser.OPEN_BLOCK, i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(XMLParser.CLOSE_BLOCK); }
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(XMLParser.CLOSE_BLOCK, i);
		}
		public TerminalNode ELSE() { return getToken(XMLParser.ELSE, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ConditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterConditionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitConditionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitConditionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperatorContext conditionOperator() throws RecognitionException {
		ConditionOperatorContext _localctx = new ConditionOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionOperator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(124);
				misc();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(BRACKET_OPEN);
			setState(131);
			operatorExpression();
			setState(132);
			match(BRACKET_CLOSE);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(133);
				misc();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(OPEN_BLOCK);
			setState(140);
			match(CLOSE_BLOCK);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
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
			match(ELSE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
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
			setState(154);
			match(OPEN_BLOCK);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					misc();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_BLOCK) {
				{
				{
				setState(161);
				match(CLOSE_BLOCK);
				}
				}
				setState(166);
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

	public static class CycleOperatorContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(XMLParser.FOR, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(XMLParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(XMLParser.BRACKET_CLOSE, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(XMLParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(XMLParser.CLOSE_BLOCK, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public CycleOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterCycleOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitCycleOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitCycleOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleOperatorContext cycleOperator() throws RecognitionException {
		CycleOperatorContext _localctx = new CycleOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cycleOperator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
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
			match(FOR);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(174);
				misc();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(BRACKET_OPEN);
			setState(181);
			match(BRACKET_CLOSE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(182);
				misc();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(OPEN_BLOCK);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(189);
				misc();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(CLOSE_BLOCK);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					misc();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class CodeContext extends ParserRuleContext {
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<ConditionOperatorContext> conditionOperator() {
			return getRuleContexts(ConditionOperatorContext.class);
		}
		public ConditionOperatorContext conditionOperator(int i) {
			return getRuleContext(ConditionOperatorContext.class,i);
		}
		public List<CycleOperatorContext> cycleOperator() {
			return getRuleContexts(CycleOperatorContext.class);
		}
		public CycleOperatorContext cycleOperator(int i) {
			return getRuleContext(CycleOperatorContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					misc();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(210);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(208);
						conditionOperator();
						}
						break;
					case COMMENT:
					case SEA_WS:
					case FOR:
						{
						setState(209);
						cycleOperator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					misc();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
		enterRule(_localctx, 18, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(221);
				prolog();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					misc();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(230);
			scriptOpen();
			setState(231);
			constants();
			setState(232);
			scriptBodyOpen();
			setState(233);
			scriptBodyClose();
			setState(234);
			code();
			setState(235);
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
		enterRule(_localctx, 20, RULE_scriptOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(237);
				misc();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(OPEN_SCRIPT_TAG);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(244);
				misc();
				}
				}
				setState(249);
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
		enterRule(_localctx, 22, RULE_scriptClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(250);
				misc();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(CLOSE_SCRIPT_TAG);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(257);
				misc();
				}
				}
				setState(262);
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
		enterRule(_localctx, 24, RULE_scriptBodyOpen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(263);
				misc();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(OPEN_SCRIPT_BODY_TAG);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					misc();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 26, RULE_scriptBodyClose);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(276);
				misc();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(CLOSE_SCRIPT_BODY_TAG);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					misc();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 28, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(OPEN_CONSTANTS_TAG);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << OPEN))) != 0)) {
				{
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(290);
					complex_tag();
					}
					break;
				case 2:
					{
					setState(291);
					simple_tag();
					}
					break;
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		enterRule(_localctx, 30, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(XMLDeclOpen);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(300);
				attribute();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
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

	public static class OperatorExpressionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(XMLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(XMLParser.WORD, i);
		}
		public TerminalNode EQUALS_WORD() { return getToken(XMLParser.EQUALS_WORD, 0); }
		public TerminalNode IS() { return getToken(XMLParser.IS, 0); }
		public TerminalNode CONTAINS() { return getToken(XMLParser.CONTAINS, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operatorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(308);
				misc();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(WORD);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(315);
				misc();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << CONTAINS) | (1L << EQUALS_WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(322);
				misc();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(WORD);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(329);
				misc();
				}
				}
				setState(334);
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
		enterRule(_localctx, 34, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 36, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Name);
			setState(338);
			match(EQUALS);
			setState(339);
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
		enterRule(_localctx, 38, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 40, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==SEA_WS) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5D\n\5\f\5\16\5G\13\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\7\6Q\n\6\f"+
		"\6\16\6T\13\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\7\6"+
		"b\n\6\f\6\16\6e\13\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\7\7o\n\7\f\7"+
		"\16\7r\13\7\3\7\3\7\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\7\b\u0080"+
		"\n\b\f\b\16\b\u0083\13\b\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c"+
		"\13\b\3\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\3\b\7\b\u0098"+
		"\n\b\f\b\16\b\u009b\13\b\3\b\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b"+
		"\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13"+
		"\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\3\t\3\t\7\t\u00ba\n\t"+
		"\f\t\16\t\u00bd\13\t\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\3\t"+
		"\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13"+
		"\n\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\n\7\n\u00db\n\n\f\n\16"+
		"\n\u00de\13\n\3\13\5\13\u00e1\n\13\3\13\7\13\u00e4\n\13\f\13\16\13\u00e7"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\7\f\u00f1\n\f\f\f\16\f\u00f4"+
		"\13\f\3\f\3\f\7\f\u00f8\n\f\f\f\16\f\u00fb\13\f\3\r\7\r\u00fe\n\r\f\r"+
		"\16\r\u0101\13\r\3\r\3\r\7\r\u0105\n\r\f\r\16\r\u0108\13\r\3\16\7\16\u010b"+
		"\n\16\f\16\16\16\u010e\13\16\3\16\3\16\7\16\u0112\n\16\f\16\16\16\u0115"+
		"\13\16\3\17\7\17\u0118\n\17\f\17\16\17\u011b\13\17\3\17\3\17\7\17\u011f"+
		"\n\17\f\17\16\17\u0122\13\17\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20"+
		"\u012a\13\20\3\20\3\20\3\21\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21"+
		"\3\21\3\21\3\22\7\22\u0138\n\22\f\22\16\22\u013b\13\22\3\22\3\22\7\22"+
		"\u013f\n\22\f\22\16\22\u0142\13\22\3\22\3\22\7\22\u0146\n\22\f\22\16\22"+
		"\u0149\13\22\3\22\3\22\7\22\u014d\n\22\f\22\16\22\u0150\13\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\31\33\3\2\6\7\4\2\b\b**\4\2\3\3\b"+
		"\b\2\u0170\2.\3\2\2\2\4\60\3\2\2\2\6\64\3\2\2\2\b;\3\2\2\2\nR\3\2\2\2"+
		"\fp\3\2\2\2\16}\3\2\2\2\20\u00ac\3\2\2\2\22\u00cf\3\2\2\2\24\u00e0\3\2"+
		"\2\2\26\u00f2\3\2\2\2\30\u00ff\3\2\2\2\32\u010c\3\2\2\2\34\u0119\3\2\2"+
		"\2\36\u0123\3\2\2\2 \u012d\3\2\2\2\"\u0139\3\2\2\2$\u0151\3\2\2\2&\u0153"+
		"\3\2\2\2(\u0157\3\2\2\2*\u0159\3\2\2\2,/\5\b\5\2-/\5\n\6\2.,\3\2\2\2."+
		"-\3\2\2\2/\3\3\2\2\2\60\61\7\35\2\2\61\62\7$\2\2\62\63\7%\2\2\63\5\3\2"+
		"\2\2\64\65\7\36\2\2\65\66\7$\2\2\66\67\7%\2\2\67\7\3\2\2\28:\5*\26\29"+
		"8\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\t\2\2"+
		"?@\7\34\2\2@A\5\4\3\2AE\5\6\4\2BD\5&\24\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7\"\2\2IK\5*\26\2JI\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OQ\5*\26\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\t\2\2VW\7\34\2\2WX\5"+
		"\4\3\2X\\\5\6\4\2Y[\5&\24\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]_\3\2\2\2^\\\3\2\2\2_c\7 \2\2`b\5\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fj\5\f\7\2gi\5*\26\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2mo\5*\26\2nm\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\t\2\2tu\7#\2\2uv\7\34\2"+
		"\2vz\7 \2\2wy\5*\26\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\r\3\2\2"+
		"\2|z\3\2\2\2}\u0081\7\27\2\2~\u0080\5*\26\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\23\2\2\u0085\u0086\5\"\22\2\u0086\u008a\7"+
		"\24\2\2\u0087\u0089\5*\26\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\25\2\2\u008e\u0092\7\26\2\2\u008f\u0091\5*\26\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7\37\2\2\u0096"+
		"\u0098\5*\26\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u00a0\7\25\2\2\u009d\u009f\5*\26\2\u009e\u009d\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\7\26\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\17\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\5*\26\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b3\7)\2\2\u00b0\u00b2\5*\26\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00bb\7"+
		"\24\2\2\u00b8\u00ba\5*\26\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c2\7\25\2\2\u00bf\u00c1\5*\26\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7\26\2\2\u00c6\u00c8\5*\26\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5*\26\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d6\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\5\16\b\2\u00d3\u00d5\5"+
		"\20\t\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00db\5*\26\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00dc\3\2\2"+
		"\2\u00df\u00e1\5 \21\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5"+
		"\3\2\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\5\32\16\2"+
		"\u00eb\u00ec\5\34\17\2\u00ec\u00ed\5\22\n\2\u00ed\u00ee\5\30\r\2\u00ee"+
		"\25\3\2\2\2\u00ef\u00f1\5*\26\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f9\7\13\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\27"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5*\26\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0106\7\f\2\2\u0103\u0105\5*\26\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\31\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5*\26\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0113\7\r\2\2\u0110\u0112\5*"+
		"\26\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\33\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5*\26"+
		"\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\7\16\2\2"+
		"\u011d\u011f\5*\26\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\35\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0128\7\17\2\2\u0124\u0127\5\n\6\2\u0125\u0127\5\b\5\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\20"+
		"\2\2\u012c\37\3\2\2\2\u012d\u0131\7\n\2\2\u012e\u0130\5&\24\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7!\2\2\u0135!\3\2\2\2\u0136"+
		"\u0138\5*\26\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u0140\7\30\2\2\u013d\u013f\5*\26\2\u013e\u013d\3\2\2\2\u013f\u0142\3"+
		"\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0147\t\2\2\2\u0144\u0146\5*\26\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e\7\30\2\2\u014b\u014d\5"+
		"*\26\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f#\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\t\3\2\2"+
		"\u0152%\3\2\2\2\u0153\u0154\7&\2\2\u0154\u0155\7$\2\2\u0155\u0156\7%\2"+
		"\2\u0156\'\3\2\2\2\u0157\u0158\t\4\2\2\u0158)\3\2\2\2\u0159\u015a\t\5"+
		"\2\2\u015a+\3\2\2\2,.;ELR\\cjpz\u0081\u008a\u0092\u0099\u00a0\u00a6\u00ac"+
		"\u00b3\u00bb\u00c2\u00c9\u00cf\u00d4\u00d6\u00dc\u00e0\u00e5\u00f2\u00f9"+
		"\u00ff\u0106\u010c\u0113\u0119\u0120\u0126\u0128\u0131\u0139\u0140\u0147"+
		"\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}