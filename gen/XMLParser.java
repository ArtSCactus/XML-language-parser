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
		CLOSE_ALGORITHM_TAG=16, BRACKET_OPEN=17, IF=18, ELSE=19, TAG_VAR=20, DOCUMENT_VAR=21, 
		ATTRIBUTE_VAR=22, FUNCTION_WORD=23, FUNCTION_WORD_SHORT=24, APPEND_OPERATOR_DECLARATION=25, 
		COMMON_OPEN_BLOCK=26, COMMON_CLOSE_BLOCK=27, DOCUMENT=28, DOCUMENT_WORD=29, 
		TABULATION_AND_SPACES=30, VARIABLE_EQUALS=31, DOC_END_OF_DECLARATION=32, 
		EMPTY_TAG=33, TAG_WORD=34, TAG_TABULATION_AND_SPACES=35, TAG_VARIABLE_EQUALS=36, 
		TAG_END_OF_DECLARATION=37, ATTRIBUTE=38, ATTRIBUTE_WORD=39, ATTRIBUTE_DELIMITER=40, 
		ATTRIBUTE_TABULATION_AND_SPACES=41, ATTRIBUTE_EQUALS=42, ATTRIBUTE_END_OF_DECLARATION=43, 
		FUNC_NAME=44, FUNC_OPEN_CODE_BLOCK=45, FUNC_IGNORING_SYMBOLS_SPACES=46, 
		FUNC_CLOSE_CODE_BLOCK=47, APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES=48, 
		APPEND_OPERATOR_WORD=49, TO_SYMBOL=50, END_OF_OPERATOR=51, CONDITION_WORD=52, 
		CONDITION_BRACKETS_OPEN=53, CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=54, 
		CONDITION_BRACKETS_CLOSE=55, HAS_CONDITION=56, EQUALS_CONDITION=57, OPEN_BLOCK=58, 
		CLOSE_BLOCK=59, ELSE_CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=60, ELSE_OPEN_BLOCK=61, 
		ELSE_CLOSE_BLOCK=62, BRACKET_CLOSE=63, EXPRESSION_ARGUMENTS=64, TAG_DECLARATION=65, 
		TAG_NAME_ATTR=66, TAG_VALUE_ATTR=67, CLOSE=68, SPECIAL_CLOSE=69, SLASH_CLOSE=70, 
		SLASH=71, EQUALS=72, STRING=73, Name=74, S=75, PI=76;
	public static final int
		RULE_tag = 0, RULE_tag_name_attr = 1, RULE_tag_value_attr = 2, RULE_simple_tag = 3, 
		RULE_complex_tag = 4, RULE_complex_tag_close = 5, RULE_tagVariable = 6, 
		RULE_documentVariable = 7, RULE_attrVariable = 8, RULE_tagVariableName = 9, 
		RULE_tagVariableValue = 10, RULE_docVariableName = 11, RULE_docVariableValue = 12, 
		RULE_attrVariableValue = 13, RULE_attrName = 14, RULE_attrValue = 15, 
		RULE_appendOperator = 16, RULE_appendOperatorChildName = 17, RULE_appendOperatorParentName = 18, 
		RULE_appendOperatorToWord = 19, RULE_function = 20, RULE_conditionOperator = 21, 
		RULE_conditionType = 22, RULE_elseCondition = 23, RULE_code = 24, RULE_script = 25, 
		RULE_scriptOpen = 26, RULE_scriptClose = 27, RULE_scriptBodyOpen = 28, 
		RULE_scriptBodyClose = 29, RULE_constants = 30, RULE_prolog = 31, RULE_reference = 32, 
		RULE_attribute = 33, RULE_chardata = 34, RULE_misc = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"tag", "tag_name_attr", "tag_value_attr", "simple_tag", "complex_tag", 
			"complex_tag_close", "tagVariable", "documentVariable", "attrVariable", 
			"tagVariableName", "tagVariableValue", "docVariableName", "docVariableValue", 
			"attrVariableValue", "attrName", "attrValue", "appendOperator", "appendOperatorChildName", 
			"appendOperatorParentName", "appendOperatorToWord", "function", "conditionOperator", 
			"conditionType", "elseCondition", "code", "script", "scriptOpen", "scriptClose", 
			"scriptBodyOpen", "scriptBodyClose", "constants", "prolog", "reference", 
			"attribute", "chardata", "misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, "'<XMLScript>'", 
			"'</XMLScript>'", "'<body>'", "'</body>'", "'<constants>'", "'</constants>'", 
			"'<algorithm>'", "'</algorithm>'", null, "'if'", "'else'", null, "'doc'", 
			"'attr'", "'function'", "'func'", "'append'", null, null, "'DOC'", null, 
			null, null, null, "'TAG'", null, null, null, null, "'ATTR'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'has'", "'=='", null, null, null, null, null, null, 
			null, null, "'name'", "'value'", "'>'", null, "'/>'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
			"XMLDeclOpen", "OPEN_SCRIPT_TAG", "CLOSE_SCRIPT_TAG", "OPEN_SCRIPT_BODY_TAG", 
			"CLOSE_SCRIPT_BODY_TAG", "OPEN_CONSTANTS_TAG", "CLOSE_CONSTANTS_TAG", 
			"OPEN_ALGORITHM_TAG", "CLOSE_ALGORITHM_TAG", "BRACKET_OPEN", "IF", "ELSE", 
			"TAG_VAR", "DOCUMENT_VAR", "ATTRIBUTE_VAR", "FUNCTION_WORD", "FUNCTION_WORD_SHORT", 
			"APPEND_OPERATOR_DECLARATION", "COMMON_OPEN_BLOCK", "COMMON_CLOSE_BLOCK", 
			"DOCUMENT", "DOCUMENT_WORD", "TABULATION_AND_SPACES", "VARIABLE_EQUALS", 
			"DOC_END_OF_DECLARATION", "EMPTY_TAG", "TAG_WORD", "TAG_TABULATION_AND_SPACES", 
			"TAG_VARIABLE_EQUALS", "TAG_END_OF_DECLARATION", "ATTRIBUTE", "ATTRIBUTE_WORD", 
			"ATTRIBUTE_DELIMITER", "ATTRIBUTE_TABULATION_AND_SPACES", "ATTRIBUTE_EQUALS", 
			"ATTRIBUTE_END_OF_DECLARATION", "FUNC_NAME", "FUNC_OPEN_CODE_BLOCK", 
			"FUNC_IGNORING_SYMBOLS_SPACES", "FUNC_CLOSE_CODE_BLOCK", "APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES", 
			"APPEND_OPERATOR_WORD", "TO_SYMBOL", "END_OF_OPERATOR", "CONDITION_WORD", 
			"CONDITION_BRACKETS_OPEN", "CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES", 
			"CONDITION_BRACKETS_CLOSE", "HAS_CONDITION", "EQUALS_CONDITION", "OPEN_BLOCK", 
			"CLOSE_BLOCK", "ELSE_CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES", "ELSE_OPEN_BLOCK", 
			"ELSE_CLOSE_BLOCK", "BRACKET_CLOSE", "EXPRESSION_ARGUMENTS", "TAG_DECLARATION", 
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				simple_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
			setState(76);
			match(TAG_NAME_ATTR);
			setState(77);
			match(EQUALS);
			setState(78);
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
			setState(80);
			match(TAG_VALUE_ATTR);
			setState(81);
			match(EQUALS);
			setState(82);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(84);
				misc();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(OPEN);
			setState(91);
			match(TAG_DECLARATION);
			setState(92);
			tag_name_attr();
			setState(93);
			tag_value_attr();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(94);
				attribute();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(SLASH_CLOSE);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			match(TAG_DECLARATION);
			setState(115);
			tag_name_attr();
			setState(116);
			tag_value_attr();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(117);
				attribute();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(CLOSE);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					tag();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(130);
			complex_tag_close();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					misc();
					}
					} 
				}
				setState(136);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(137);
				misc();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(OPEN);
			setState(144);
			match(SLASH);
			setState(145);
			match(TAG_DECLARATION);
			setState(146);
			match(CLOSE);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					misc();
					}
					} 
				}
				setState(152);
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

	public static class TagVariableContext extends ParserRuleContext {
		public TerminalNode TAG_VAR() { return getToken(XMLParser.TAG_VAR, 0); }
		public TagVariableNameContext tagVariableName() {
			return getRuleContext(TagVariableNameContext.class,0);
		}
		public TerminalNode TAG_VARIABLE_EQUALS() { return getToken(XMLParser.TAG_VARIABLE_EQUALS, 0); }
		public TerminalNode TAG_END_OF_DECLARATION() { return getToken(XMLParser.TAG_END_OF_DECLARATION, 0); }
		public TagVariableValueContext tagVariableValue() {
			return getRuleContext(TagVariableValueContext.class,0);
		}
		public TerminalNode EMPTY_TAG() { return getToken(XMLParser.EMPTY_TAG, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public TagVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTagVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTagVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTagVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagVariableContext tagVariable() throws RecognitionException {
		TagVariableContext _localctx = new TagVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tagVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(153);
				misc();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(TAG_VAR);
			setState(160);
			tagVariableName();
			setState(161);
			match(TAG_VARIABLE_EQUALS);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_WORD:
				{
				setState(162);
				tagVariableValue();
				}
				break;
			case EMPTY_TAG:
				{
				setState(163);
				match(EMPTY_TAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			match(TAG_END_OF_DECLARATION);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					misc();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class DocumentVariableContext extends ParserRuleContext {
		public TerminalNode DOCUMENT_VAR() { return getToken(XMLParser.DOCUMENT_VAR, 0); }
		public DocVariableNameContext docVariableName() {
			return getRuleContext(DocVariableNameContext.class,0);
		}
		public TerminalNode VARIABLE_EQUALS() { return getToken(XMLParser.VARIABLE_EQUALS, 0); }
		public DocVariableValueContext docVariableValue() {
			return getRuleContext(DocVariableValueContext.class,0);
		}
		public TerminalNode DOC_END_OF_DECLARATION() { return getToken(XMLParser.DOC_END_OF_DECLARATION, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public DocumentVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterDocumentVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitDocumentVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitDocumentVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentVariableContext documentVariable() throws RecognitionException {
		DocumentVariableContext _localctx = new DocumentVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_documentVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(173);
				misc();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(DOCUMENT_VAR);
			setState(180);
			docVariableName();
			setState(181);
			match(VARIABLE_EQUALS);
			setState(182);
			docVariableValue();
			setState(183);
			match(DOC_END_OF_DECLARATION);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					misc();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AttrVariableContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_VAR() { return getToken(XMLParser.ATTRIBUTE_VAR, 0); }
		public TerminalNode ATTRIBUTE_WORD() { return getToken(XMLParser.ATTRIBUTE_WORD, 0); }
		public TerminalNode ATTRIBUTE_EQUALS() { return getToken(XMLParser.ATTRIBUTE_EQUALS, 0); }
		public AttrVariableValueContext attrVariableValue() {
			return getRuleContext(AttrVariableValueContext.class,0);
		}
		public TerminalNode ATTRIBUTE_END_OF_DECLARATION() { return getToken(XMLParser.ATTRIBUTE_END_OF_DECLARATION, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public AttrVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttrVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttrVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttrVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrVariableContext attrVariable() throws RecognitionException {
		AttrVariableContext _localctx = new AttrVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attrVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(190);
				misc();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(ATTRIBUTE_VAR);
			setState(197);
			match(ATTRIBUTE_WORD);
			setState(198);
			match(ATTRIBUTE_EQUALS);
			setState(199);
			attrVariableValue();
			setState(200);
			match(ATTRIBUTE_END_OF_DECLARATION);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					misc();
					}
					} 
				}
				setState(206);
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

	public static class TagVariableNameContext extends ParserRuleContext {
		public TerminalNode TAG_WORD() { return getToken(XMLParser.TAG_WORD, 0); }
		public TagVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTagVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTagVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTagVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagVariableNameContext tagVariableName() throws RecognitionException {
		TagVariableNameContext _localctx = new TagVariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tagVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TAG_WORD);
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

	public static class TagVariableValueContext extends ParserRuleContext {
		public TerminalNode TAG_WORD() { return getToken(XMLParser.TAG_WORD, 0); }
		public TagVariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagVariableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterTagVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitTagVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitTagVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagVariableValueContext tagVariableValue() throws RecognitionException {
		TagVariableValueContext _localctx = new TagVariableValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tagVariableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TAG_WORD);
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

	public static class DocVariableNameContext extends ParserRuleContext {
		public TerminalNode DOCUMENT_WORD() { return getToken(XMLParser.DOCUMENT_WORD, 0); }
		public DocVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterDocVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitDocVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitDocVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocVariableNameContext docVariableName() throws RecognitionException {
		DocVariableNameContext _localctx = new DocVariableNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_docVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(DOCUMENT_WORD);
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

	public static class DocVariableValueContext extends ParserRuleContext {
		public TerminalNode DOCUMENT_WORD() { return getToken(XMLParser.DOCUMENT_WORD, 0); }
		public DocVariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docVariableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterDocVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitDocVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitDocVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocVariableValueContext docVariableValue() throws RecognitionException {
		DocVariableValueContext _localctx = new DocVariableValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_docVariableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(DOCUMENT_WORD);
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

	public static class AttrVariableValueContext extends ParserRuleContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public TerminalNode ATTRIBUTE_DELIMITER() { return getToken(XMLParser.ATTRIBUTE_DELIMITER, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttrVariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrVariableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttrVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttrVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttrVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrVariableValueContext attrVariableValue() throws RecognitionException {
		AttrVariableValueContext _localctx = new AttrVariableValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attrVariableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			attrName();
			setState(216);
			match(ATTRIBUTE_DELIMITER);
			setState(217);
			attrValue();
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

	public static class AttrNameContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_WORD() { return getToken(XMLParser.ATTRIBUTE_WORD, 0); }
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ATTRIBUTE_WORD);
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

	public static class AttrValueContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_WORD() { return getToken(XMLParser.ATTRIBUTE_WORD, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attrValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ATTRIBUTE_WORD);
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

	public static class AppendOperatorContext extends ParserRuleContext {
		public TerminalNode APPEND_OPERATOR_DECLARATION() { return getToken(XMLParser.APPEND_OPERATOR_DECLARATION, 0); }
		public AppendOperatorChildNameContext appendOperatorChildName() {
			return getRuleContext(AppendOperatorChildNameContext.class,0);
		}
		public AppendOperatorToWordContext appendOperatorToWord() {
			return getRuleContext(AppendOperatorToWordContext.class,0);
		}
		public AppendOperatorParentNameContext appendOperatorParentName() {
			return getRuleContext(AppendOperatorParentNameContext.class,0);
		}
		public TerminalNode END_OF_OPERATOR() { return getToken(XMLParser.END_OF_OPERATOR, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public AppendOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAppendOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAppendOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAppendOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendOperatorContext appendOperator() throws RecognitionException {
		AppendOperatorContext _localctx = new AppendOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_appendOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(223);
				misc();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(APPEND_OPERATOR_DECLARATION);
			setState(230);
			appendOperatorChildName();
			setState(231);
			appendOperatorToWord();
			setState(232);
			appendOperatorParentName();
			setState(233);
			match(END_OF_OPERATOR);
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

	public static class AppendOperatorChildNameContext extends ParserRuleContext {
		public TerminalNode APPEND_OPERATOR_WORD() { return getToken(XMLParser.APPEND_OPERATOR_WORD, 0); }
		public AppendOperatorChildNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendOperatorChildName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAppendOperatorChildName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAppendOperatorChildName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAppendOperatorChildName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendOperatorChildNameContext appendOperatorChildName() throws RecognitionException {
		AppendOperatorChildNameContext _localctx = new AppendOperatorChildNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_appendOperatorChildName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(APPEND_OPERATOR_WORD);
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

	public static class AppendOperatorParentNameContext extends ParserRuleContext {
		public TerminalNode APPEND_OPERATOR_WORD() { return getToken(XMLParser.APPEND_OPERATOR_WORD, 0); }
		public AppendOperatorParentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendOperatorParentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAppendOperatorParentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAppendOperatorParentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAppendOperatorParentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendOperatorParentNameContext appendOperatorParentName() throws RecognitionException {
		AppendOperatorParentNameContext _localctx = new AppendOperatorParentNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_appendOperatorParentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(APPEND_OPERATOR_WORD);
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

	public static class AppendOperatorToWordContext extends ParserRuleContext {
		public TerminalNode TO_SYMBOL() { return getToken(XMLParser.TO_SYMBOL, 0); }
		public AppendOperatorToWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendOperatorToWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAppendOperatorToWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAppendOperatorToWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitAppendOperatorToWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendOperatorToWordContext appendOperatorToWord() throws RecognitionException {
		AppendOperatorToWordContext _localctx = new AppendOperatorToWordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_appendOperatorToWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TO_SYMBOL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC_NAME() { return getToken(XMLParser.FUNC_NAME, 0); }
		public TerminalNode FUNC_OPEN_CODE_BLOCK() { return getToken(XMLParser.FUNC_OPEN_CODE_BLOCK, 0); }
		public TerminalNode FUNC_CLOSE_CODE_BLOCK() { return getToken(XMLParser.FUNC_CLOSE_CODE_BLOCK, 0); }
		public TerminalNode FUNCTION_WORD() { return getToken(XMLParser.FUNCTION_WORD, 0); }
		public TerminalNode FUNCTION_WORD_SHORT() { return getToken(XMLParser.FUNCTION_WORD_SHORT, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(241);
				misc();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION_WORD || _la==FUNCTION_WORD_SHORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
			match(FUNC_NAME);
			setState(249);
			match(FUNC_OPEN_CODE_BLOCK);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(250);
				code();
				}
				break;
			}
			setState(253);
			match(FUNC_CLOSE_CODE_BLOCK);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					misc();
					}
					} 
				}
				setState(259);
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

	public static class ConditionOperatorContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(XMLParser.IF, 0); }
		public TerminalNode CONDITION_BRACKETS_OPEN() { return getToken(XMLParser.CONDITION_BRACKETS_OPEN, 0); }
		public List<TerminalNode> CONDITION_WORD() { return getTokens(XMLParser.CONDITION_WORD); }
		public TerminalNode CONDITION_WORD(int i) {
			return getToken(XMLParser.CONDITION_WORD, i);
		}
		public ConditionTypeContext conditionType() {
			return getRuleContext(ConditionTypeContext.class,0);
		}
		public TerminalNode CONDITION_BRACKETS_CLOSE() { return getToken(XMLParser.CONDITION_BRACKETS_CLOSE, 0); }
		public TerminalNode COMMON_OPEN_BLOCK() { return getToken(XMLParser.COMMON_OPEN_BLOCK, 0); }
		public TerminalNode COMMON_CLOSE_BLOCK() { return getToken(XMLParser.COMMON_CLOSE_BLOCK, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
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
		enterRule(_localctx, 42, RULE_conditionOperator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(260);
				misc();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(IF);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(267);
				misc();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(CONDITION_BRACKETS_OPEN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(274);
				misc();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(CONDITION_WORD);
			setState(281);
			conditionType();
			setState(282);
			match(CONDITION_WORD);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(283);
				misc();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(CONDITION_BRACKETS_CLOSE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(290);
				misc();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(COMMON_OPEN_BLOCK);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(297);
				code();
				}
				break;
			}
			setState(300);
			match(COMMON_CLOSE_BLOCK);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					misc();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(307);
				elseCondition();
				}
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

	public static class ConditionTypeContext extends ParserRuleContext {
		public TerminalNode EQUALS_CONDITION() { return getToken(XMLParser.EQUALS_CONDITION, 0); }
		public ConditionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterConditionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitConditionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitConditionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionTypeContext conditionType() throws RecognitionException {
		ConditionTypeContext _localctx = new ConditionTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(EQUALS_CONDITION);
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

	public static class ElseConditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(XMLParser.ELSE, 0); }
		public TerminalNode ELSE_OPEN_BLOCK() { return getToken(XMLParser.ELSE_OPEN_BLOCK, 0); }
		public TerminalNode ELSE_CLOSE_BLOCK() { return getToken(XMLParser.ELSE_CLOSE_BLOCK, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ELSE);
			setState(313);
			match(ELSE_OPEN_BLOCK);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(314);
				code();
				}
				break;
			}
			setState(317);
			match(ELSE_CLOSE_BLOCK);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<AppendOperatorContext> appendOperator() {
			return getRuleContexts(AppendOperatorContext.class);
		}
		public AppendOperatorContext appendOperator(int i) {
			return getRuleContext(AppendOperatorContext.class,i);
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
		enterRule(_localctx, 48, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					misc();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(325);
						conditionOperator();
						}
						break;
					case 2:
						{
						setState(326);
						function();
						}
						break;
					case 3:
						{
						setState(327);
						appendOperator();
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					misc();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
		enterRule(_localctx, 50, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(339);
				prolog();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					misc();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(348);
			scriptOpen();
			setState(349);
			constants();
			setState(350);
			scriptBodyOpen();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(351);
				code();
				}
				break;
			}
			setState(354);
			scriptBodyClose();
			setState(355);
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
		enterRule(_localctx, 52, RULE_scriptOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(357);
				misc();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(OPEN_SCRIPT_TAG);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(364);
				misc();
				}
				}
				setState(369);
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
		enterRule(_localctx, 54, RULE_scriptClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(370);
				misc();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(CLOSE_SCRIPT_TAG);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(377);
				misc();
				}
				}
				setState(382);
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
		enterRule(_localctx, 56, RULE_scriptBodyOpen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(383);
				misc();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(OPEN_SCRIPT_BODY_TAG);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					misc();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 58, RULE_scriptBodyClose);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(396);
				misc();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CLOSE_SCRIPT_BODY_TAG);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					misc();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public List<DocumentVariableContext> documentVariable() {
			return getRuleContexts(DocumentVariableContext.class);
		}
		public DocumentVariableContext documentVariable(int i) {
			return getRuleContext(DocumentVariableContext.class,i);
		}
		public List<TagVariableContext> tagVariable() {
			return getRuleContexts(TagVariableContext.class);
		}
		public TagVariableContext tagVariable(int i) {
			return getRuleContext(TagVariableContext.class,i);
		}
		public List<AttrVariableContext> attrVariable() {
			return getRuleContexts(AttrVariableContext.class);
		}
		public AttrVariableContext attrVariable(int i) {
			return getRuleContext(AttrVariableContext.class,i);
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
		enterRule(_localctx, 60, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(OPEN_CONSTANTS_TAG);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << TAG_VAR) | (1L << DOCUMENT_VAR) | (1L << ATTRIBUTE_VAR))) != 0)) {
				{
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(410);
					documentVariable();
					}
					break;
				case 2:
					{
					setState(411);
					tagVariable();
					}
					break;
				case 3:
					{
					setState(412);
					attrVariable();
					}
					break;
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
		enterRule(_localctx, 62, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(XMLDeclOpen);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(421);
				attribute();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
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
		enterRule(_localctx, 64, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 66, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(Name);
			setState(432);
			match(EQUALS);
			setState(433);
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
		public TerminalNode EXPRESSION_ARGUMENTS() { return getToken(XMLParser.EXPRESSION_ARGUMENTS, 0); }
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
		enterRule(_localctx, 68, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==EXPRESSION_ARGUMENTS) ) {
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
		enterRule(_localctx, 70, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5\f\5"+
		"\16\5e\13\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\7\6o\n\6\f\6\16\6r\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\7\6\u0080\n\6\f"+
		"\6\16\6\u0083\13\6\3\6\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\7\7\7\u008d"+
		"\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a"+
		"\13\7\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7"+
		"\n\b\3\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\t\7\t\u00b1\n\t\f\t\16"+
		"\t\u00b4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bc\n\t\f\t\16\t\u00bf\13"+
		"\t\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cd"+
		"\n\n\f\n\16\n\u00d0\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6\13"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\7"+
		"\26\u00f5\n\26\f\26\16\26\u00f8\13\26\3\26\3\26\3\26\3\26\5\26\u00fe\n"+
		"\26\3\26\3\26\7\26\u0102\n\26\f\26\16\26\u0105\13\26\3\27\7\27\u0108\n"+
		"\27\f\27\16\27\u010b\13\27\3\27\3\27\7\27\u010f\n\27\f\27\16\27\u0112"+
		"\13\27\3\27\3\27\7\27\u0116\n\27\f\27\16\27\u0119\13\27\3\27\3\27\3\27"+
		"\3\27\7\27\u011f\n\27\f\27\16\27\u0122\13\27\3\27\3\27\7\27\u0126\n\27"+
		"\f\27\16\27\u0129\13\27\3\27\3\27\5\27\u012d\n\27\3\27\3\27\7\27\u0131"+
		"\n\27\f\27\16\27\u0134\13\27\3\27\5\27\u0137\n\27\3\30\3\30\3\31\3\31"+
		"\3\31\5\31\u013e\n\31\3\31\3\31\3\32\7\32\u0143\n\32\f\32\16\32\u0146"+
		"\13\32\3\32\3\32\3\32\7\32\u014b\n\32\f\32\16\32\u014e\13\32\3\32\7\32"+
		"\u0151\n\32\f\32\16\32\u0154\13\32\3\33\5\33\u0157\n\33\3\33\7\33\u015a"+
		"\n\33\f\33\16\33\u015d\13\33\3\33\3\33\3\33\3\33\5\33\u0163\n\33\3\33"+
		"\3\33\3\33\3\34\7\34\u0169\n\34\f\34\16\34\u016c\13\34\3\34\3\34\7\34"+
		"\u0170\n\34\f\34\16\34\u0173\13\34\3\35\7\35\u0176\n\35\f\35\16\35\u0179"+
		"\13\35\3\35\3\35\7\35\u017d\n\35\f\35\16\35\u0180\13\35\3\36\7\36\u0183"+
		"\n\36\f\36\16\36\u0186\13\36\3\36\3\36\7\36\u018a\n\36\f\36\16\36\u018d"+
		"\13\36\3\37\7\37\u0190\n\37\f\37\16\37\u0193\13\37\3\37\3\37\7\37\u0197"+
		"\n\37\f\37\16\37\u019a\13\37\3 \3 \3 \3 \7 \u01a0\n \f \16 \u01a3\13 "+
		"\3 \3 \3!\3!\7!\u01a9\n!\f!\16!\u01ac\13!\3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\6\3\2\31\32\3\2\6\7\4\2\b\bBB\4\2\3\3\b\b\2\u01c7"+
		"\2L\3\2\2\2\4N\3\2\2\2\6R\3\2\2\2\bY\3\2\2\2\np\3\2\2\2\f\u008e\3\2\2"+
		"\2\16\u009e\3\2\2\2\20\u00b2\3\2\2\2\22\u00c3\3\2\2\2\24\u00d1\3\2\2\2"+
		"\26\u00d3\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36"+
		"\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00e4\3\2\2\2$\u00ed\3\2\2\2&\u00ef\3"+
		"\2\2\2(\u00f1\3\2\2\2*\u00f6\3\2\2\2,\u0109\3\2\2\2.\u0138\3\2\2\2\60"+
		"\u013a\3\2\2\2\62\u0144\3\2\2\2\64\u0156\3\2\2\2\66\u016a\3\2\2\28\u0177"+
		"\3\2\2\2:\u0184\3\2\2\2<\u0191\3\2\2\2>\u019b\3\2\2\2@\u01a6\3\2\2\2B"+
		"\u01af\3\2\2\2D\u01b1\3\2\2\2F\u01b5\3\2\2\2H\u01b7\3\2\2\2JM\5\b\5\2"+
		"KM\5\n\6\2LJ\3\2\2\2LK\3\2\2\2M\3\3\2\2\2NO\7D\2\2OP\7J\2\2PQ\7K\2\2Q"+
		"\5\3\2\2\2RS\7E\2\2ST\7J\2\2TU\7K\2\2U\7\3\2\2\2VX\5H%\2WV\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\t\2\2]^\7C\2\2^_"+
		"\5\4\3\2_c\5\6\4\2`b\5D#\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3"+
		"\2\2\2ec\3\2\2\2fj\7H\2\2gi\5H%\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2k\t\3\2\2\2lj\3\2\2\2mo\5H%\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2qs\3\2\2\2rp\3\2\2\2st\7\t\2\2tu\7C\2\2uv\5\4\3\2vz\5\6\4\2wy\5D#"+
		"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0081"+
		"\7F\2\2~\u0080\5\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0088\5\f\7\2\u0085\u0087\5H%\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008d\5H%\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7I\2\2\u0093\u0094\7C\2\2\u0094\u0098"+
		"\7F\2\2\u0095\u0097\5H%\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009b\u009d\5H%\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\26\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a6\7&\2\2\u00a4\u00a7\5"+
		"\26\f\2\u00a5\u00a7\7#\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ac\7\'\2\2\u00a9\u00ab\5H%\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\17"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\5H%\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\30\r\2\u00b7"+
		"\u00b8\7!\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00bd\7\"\2\2\u00ba\u00bc\5"+
		"H%\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5H%\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\30\2\2"+
		"\u00c7\u00c8\7)\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00ce"+
		"\7-\2\2\u00cb\u00cd\5H%\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\7$\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\7$\2\2\u00d4\27\3\2"+
		"\2\2\u00d5\u00d6\7\37\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\7\37\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\7*\2\2\u00db\u00dc\5 \21"+
		"\2\u00dc\35\3\2\2\2\u00dd\u00de\7)\2\2\u00de\37\3\2\2\2\u00df\u00e0\7"+
		")\2\2\u00e0!\3\2\2\2\u00e1\u00e3\5H%\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\33\2\2\u00e8\u00e9\5$\23\2\u00e9\u00ea\5"+
		"(\25\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\7\65\2\2\u00ec#\3\2\2\2\u00ed\u00ee"+
		"\7\63\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7\63\2\2\u00f0\'\3\2\2\2\u00f1\u00f2"+
		"\7\64\2\2\u00f2)\3\2\2\2\u00f3\u00f5\5H%\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\u00fb\7.\2\2\u00fb\u00fd\7/\2"+
		"\2\u00fc\u00fe\5\62\32\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0103\7\61\2\2\u0100\u0102\5H%\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"+\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5H%\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7\24\2\2\u010d\u010f\5H%\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0117\7\67\2\2\u0114"+
		"\u0116\5H%\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b"+
		"\7\66\2\2\u011b\u011c\5.\30\2\u011c\u0120\7\66\2\2\u011d\u011f\5H%\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\79\2\2\u0124"+
		"\u0126\5H%\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c"+
		"\7\34\2\2\u012b\u012d\5\62\32\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u0132\7\35\2\2\u012f\u0131\5H%\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\5\60\31\2\u0136\u0135\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137-\3\2\2\2\u0138\u0139\7;\2\2\u0139/\3"+
		"\2\2\2\u013a\u013b\7\25\2\2\u013b\u013d\7?\2\2\u013c\u013e\5\62\32\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7@"+
		"\2\2\u0140\61\3\2\2\2\u0141\u0143\5H%\2\u0142\u0141\3\2\2\2\u0143\u0146"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014c\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u014b\5,\27\2\u0148\u014b\5*\26\2\u0149\u014b\5\""+
		"\22\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0151\5H%\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\63\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0157\5@!\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157\u015b\3\2\2\2\u0158\u015a\5H%\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\5\66\34\2\u015f\u0160\5> \2\u0160\u0162\5:"+
		"\36\2\u0161\u0163\5\62\32\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\5<\37\2\u0165\u0166\58\35\2\u0166\65\3\2\2"+
		"\2\u0167\u0169\5H%\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0171\7\13\2\2\u016e\u0170\5H%\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\67\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0176\5H%\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u017a\u017e\7\f\2\2\u017b\u017d\5H%\2\u017c\u017b\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f9\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0183\5H%\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018b\7\r\2\2\u0188\u018a\5H%\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c;\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\u018e\u0190\5H%\2\u018f\u018e\3\2\2\2\u0190\u0193"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0198\7\16\2\2\u0195\u0197\5H%\2\u0196\u0195\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"=\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u01a1\7\17\2\2\u019c\u01a0\5\20\t"+
		"\2\u019d\u01a0\5\16\b\2\u019e\u01a0\5\22\n\2\u019f\u019c\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a5\7\20\2\2\u01a5?\3\2\2\2\u01a6\u01aa\7\n\2\2\u01a7\u01a9\5D#\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7G\2\2\u01ae"+
		"A\3\2\2\2\u01af\u01b0\t\3\2\2\u01b0C\3\2\2\2\u01b1\u01b2\7L\2\2\u01b2"+
		"\u01b3\7J\2\2\u01b3\u01b4\7K\2\2\u01b4E\3\2\2\2\u01b5\u01b6\t\4\2\2\u01b6"+
		"G\3\2\2\2\u01b7\u01b8\t\5\2\2\u01b8I\3\2\2\2\62LYcjpz\u0081\u0088\u008e"+
		"\u0098\u009e\u00a6\u00ac\u00b2\u00bd\u00c3\u00ce\u00e4\u00f6\u00fd\u0103"+
		"\u0109\u0110\u0117\u0120\u0127\u012c\u0132\u0136\u013d\u0144\u014a\u014c"+
		"\u0152\u0156\u015b\u0162\u016a\u0171\u0177\u017e\u0184\u018b\u0191\u0198"+
		"\u019f\u01a1\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}