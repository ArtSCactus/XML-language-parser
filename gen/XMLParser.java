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
		COMMON_OPEN_BLOCK=26, COMMON_CLOSE_BLOCK=27, CONDITION_END=28, DOCUMENT=29, 
		DOCUMENT_WORD=30, TABULATION_AND_SPACES=31, VARIABLE_EQUALS=32, DOC_END_OF_DECLARATION=33, 
		EMPTY_TAG=34, TAG_WORD=35, TAG_TABULATION_AND_SPACES=36, TAG_VARIABLE_EQUALS=37, 
		TAG_END_OF_DECLARATION=38, ATTRIBUTE=39, ATTRIBUTE_WORD=40, ATTRIBUTE_DELIMITER=41, 
		ATTRIBUTE_TABULATION_AND_SPACES=42, ATTRIBUTE_EQUALS=43, ATTRIBUTE_END_OF_DECLARATION=44, 
		FUNC_NAME=45, FUNC_OPEN_CODE_BLOCK=46, FUNC_IGNORING_SYMBOLS_SPACES=47, 
		FUNC_CLOSE_CODE_BLOCK=48, APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES=49, 
		APPEND_OPERATOR_WORD=50, TO_SYMBOL=51, END_OF_OPERATOR=52, CONDITION_WORD=53, 
		CONDITION_BRACKETS_OPEN=54, CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=55, 
		CONDITION_BRACKETS_CLOSE=56, HAS_CONDITION=57, EQUALS_CONDITION=58, OPEN_BLOCK=59, 
		CLOSE_BLOCK=60, ELSE_CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=61, ELSE_OPEN_BLOCK=62, 
		ELSE_CLOSE_BLOCK=63, BRACKET_CLOSE=64, EXPRESSION_ARGUMENTS=65, TAG_DECLARATION=66, 
		TAG_NAME_ATTR=67, TAG_VALUE_ATTR=68, CLOSE=69, SPECIAL_CLOSE=70, SLASH_CLOSE=71, 
		SLASH=72, EQUALS=73, STRING=74, Name=75, S=76, PI=77;
	public static final int
		RULE_tag = 0, RULE_tag_name_attr = 1, RULE_tag_value_attr = 2, RULE_simple_tag = 3, 
		RULE_complex_tag = 4, RULE_complex_tag_close = 5, RULE_tagVariable = 6, 
		RULE_documentVariable = 7, RULE_attrVariable = 8, RULE_tagVariableName = 9, 
		RULE_tagVariableValue = 10, RULE_docVariableName = 11, RULE_docVariableValue = 12, 
		RULE_attrVariableValue = 13, RULE_attrName = 14, RULE_attrValue = 15, 
		RULE_variable = 16, RULE_operator = 17, RULE_appendOperator = 18, RULE_appendOperatorChildName = 19, 
		RULE_appendOperatorParentName = 20, RULE_appendOperatorToWord = 21, RULE_function = 22, 
		RULE_conditionOperator = 23, RULE_conditionType = 24, RULE_ifCondition = 25, 
		RULE_conditionExitFlag = 26, RULE_elseCondition = 27, RULE_code = 28, 
		RULE_insideBlockCode = 29, RULE_script = 30, RULE_scriptOpen = 31, RULE_scriptClose = 32, 
		RULE_scriptBodyOpen = 33, RULE_scriptBodyClose = 34, RULE_constants = 35, 
		RULE_prolog = 36, RULE_reference = 37, RULE_attribute = 38, RULE_chardata = 39, 
		RULE_misc = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"tag", "tag_name_attr", "tag_value_attr", "simple_tag", "complex_tag", 
			"complex_tag_close", "tagVariable", "documentVariable", "attrVariable", 
			"tagVariableName", "tagVariableValue", "docVariableName", "docVariableValue", 
			"attrVariableValue", "attrName", "attrValue", "variable", "operator", 
			"appendOperator", "appendOperatorChildName", "appendOperatorParentName", 
			"appendOperatorToWord", "function", "conditionOperator", "conditionType", 
			"ifCondition", "conditionExitFlag", "elseCondition", "code", "insideBlockCode", 
			"script", "scriptOpen", "scriptClose", "scriptBodyOpen", "scriptBodyClose", 
			"constants", "prolog", "reference", "attribute", "chardata", "misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'<'", null, "'<XMLScript>'", 
			"'</XMLScript>'", "'<body>'", "'</body>'", "'<constants>'", "'</constants>'", 
			"'<algorithm>'", "'</algorithm>'", null, "'if'", "'else'", null, "'doc'", 
			"'attr'", "'function'", "'func'", "'append'", null, null, null, "'DOC'", 
			null, null, null, null, "'TAG'", null, null, null, null, "'ATTR'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'has'", "'=='", null, null, null, null, null, 
			null, null, null, "'name'", "'value'", "'>'", null, "'/>'", "'/'"
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
			"CONDITION_END", "DOCUMENT", "DOCUMENT_WORD", "TABULATION_AND_SPACES", 
			"VARIABLE_EQUALS", "DOC_END_OF_DECLARATION", "EMPTY_TAG", "TAG_WORD", 
			"TAG_TABULATION_AND_SPACES", "TAG_VARIABLE_EQUALS", "TAG_END_OF_DECLARATION", 
			"ATTRIBUTE", "ATTRIBUTE_WORD", "ATTRIBUTE_DELIMITER", "ATTRIBUTE_TABULATION_AND_SPACES", 
			"ATTRIBUTE_EQUALS", "ATTRIBUTE_END_OF_DECLARATION", "FUNC_NAME", "FUNC_OPEN_CODE_BLOCK", 
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				simple_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
			setState(86);
			match(TAG_NAME_ATTR);
			setState(87);
			match(EQUALS);
			setState(88);
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
			setState(90);
			match(TAG_VALUE_ATTR);
			setState(91);
			match(EQUALS);
			setState(92);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(94);
				misc();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(OPEN);
			setState(101);
			match(TAG_DECLARATION);
			setState(102);
			tag_name_attr();
			setState(103);
			tag_value_attr();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(104);
				attribute();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(SLASH_CLOSE);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					misc();
					}
					} 
				}
				setState(116);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(117);
				misc();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(OPEN);
			setState(124);
			match(TAG_DECLARATION);
			setState(125);
			tag_name_attr();
			setState(126);
			tag_value_attr();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(127);
				attribute();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(CLOSE);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					tag();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(140);
			complex_tag_close();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					misc();
					}
					} 
				}
				setState(146);
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
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(147);
				misc();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(OPEN);
			setState(154);
			match(SLASH);
			setState(155);
			match(TAG_DECLARATION);
			setState(156);
			match(CLOSE);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					misc();
					}
					} 
				}
				setState(162);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(163);
				misc();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(TAG_VAR);
			setState(170);
			tagVariableName();
			setState(171);
			match(TAG_VARIABLE_EQUALS);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_WORD:
				{
				setState(172);
				tagVariableValue();
				}
				break;
			case EMPTY_TAG:
				{
				setState(173);
				match(EMPTY_TAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(TAG_END_OF_DECLARATION);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					misc();
					}
					} 
				}
				setState(182);
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
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(183);
				misc();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(DOCUMENT_VAR);
			setState(190);
			docVariableName();
			setState(191);
			match(VARIABLE_EQUALS);
			setState(192);
			docVariableValue();
			setState(193);
			match(DOC_END_OF_DECLARATION);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					misc();
					}
					} 
				}
				setState(199);
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
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(200);
				misc();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(ATTRIBUTE_VAR);
			setState(207);
			match(ATTRIBUTE_WORD);
			setState(208);
			match(ATTRIBUTE_EQUALS);
			setState(209);
			attrVariableValue();
			setState(210);
			match(ATTRIBUTE_END_OF_DECLARATION);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					misc();
					}
					} 
				}
				setState(216);
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
			setState(217);
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
			setState(219);
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
			setState(221);
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
			setState(223);
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
			setState(225);
			attrName();
			setState(226);
			match(ATTRIBUTE_DELIMITER);
			setState(227);
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
			setState(229);
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
			setState(231);
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

	public static class VariableContext extends ParserRuleContext {
		public TagVariableContext tagVariable() {
			return getRuleContext(TagVariableContext.class,0);
		}
		public DocumentVariableContext documentVariable() {
			return getRuleContext(DocumentVariableContext.class,0);
		}
		public AttrVariableContext attrVariable() {
			return getRuleContext(AttrVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				tagVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				documentVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				attrVariable();
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

	public static class OperatorContext extends ParserRuleContext {
		public ConditionOperatorContext conditionOperator() {
			return getRuleContext(ConditionOperatorContext.class,0);
		}
		public AppendOperatorContext appendOperator() {
			return getRuleContext(AppendOperatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				conditionOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				appendOperator();
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
		enterRule(_localctx, 36, RULE_appendOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(242);
				misc();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(APPEND_OPERATOR_DECLARATION);
			setState(249);
			appendOperatorChildName();
			setState(250);
			appendOperatorToWord();
			setState(251);
			appendOperatorParentName();
			setState(252);
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
		enterRule(_localctx, 38, RULE_appendOperatorChildName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 40, RULE_appendOperatorParentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 42, RULE_appendOperatorToWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		public InsideBlockCodeContext insideBlockCode() {
			return getRuleContext(InsideBlockCodeContext.class,0);
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
		enterRule(_localctx, 44, RULE_function);
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
			_la = _input.LA(1);
			if ( !(_la==FUNCTION_WORD || _la==FUNCTION_WORD_SHORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			match(FUNC_NAME);
			setState(268);
			match(FUNC_OPEN_CODE_BLOCK);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(269);
				insideBlockCode();
				}
				break;
			}
			setState(272);
			match(FUNC_CLOSE_CODE_BLOCK);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					misc();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ConditionExitFlagContext conditionExitFlag() {
			return getRuleContext(ConditionExitFlagContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
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
		enterRule(_localctx, 46, RULE_conditionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(279);
				misc();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(IF);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(286);
				misc();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(CONDITION_BRACKETS_OPEN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(293);
				misc();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(CONDITION_WORD);
			setState(300);
			conditionType();
			setState(301);
			match(CONDITION_WORD);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(302);
				misc();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(CONDITION_BRACKETS_CLOSE);
			setState(309);
			ifCondition();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(310);
				elseCondition();
				}
			}

			setState(313);
			conditionExitFlag();
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
		enterRule(_localctx, 48, RULE_conditionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode COMMON_OPEN_BLOCK() { return getToken(XMLParser.COMMON_OPEN_BLOCK, 0); }
		public TerminalNode COMMON_CLOSE_BLOCK() { return getToken(XMLParser.COMMON_CLOSE_BLOCK, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public InsideBlockCodeContext insideBlockCode() {
			return getRuleContext(InsideBlockCodeContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(317);
				misc();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(COMMON_OPEN_BLOCK);
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(324);
				insideBlockCode();
				}
				break;
			}
			setState(327);
			match(COMMON_CLOSE_BLOCK);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(328);
				misc();
				}
				}
				setState(333);
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

	public static class ConditionExitFlagContext extends ParserRuleContext {
		public TerminalNode CONDITION_END() { return getToken(XMLParser.CONDITION_END, 0); }
		public ConditionExitFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExitFlag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterConditionExitFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitConditionExitFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitConditionExitFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExitFlagContext conditionExitFlag() throws RecognitionException {
		ConditionExitFlagContext _localctx = new ConditionExitFlagContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionExitFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(CONDITION_END);
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
		public TerminalNode COMMON_OPEN_BLOCK() { return getToken(XMLParser.COMMON_OPEN_BLOCK, 0); }
		public TerminalNode COMMON_CLOSE_BLOCK() { return getToken(XMLParser.COMMON_CLOSE_BLOCK, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public InsideBlockCodeContext insideBlockCode() {
			return getRuleContext(InsideBlockCodeContext.class,0);
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
		enterRule(_localctx, 54, RULE_elseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ELSE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(337);
				misc();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(COMMON_OPEN_BLOCK);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(344);
				insideBlockCode();
				}
				break;
			}
			setState(347);
			match(COMMON_CLOSE_BLOCK);
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
		public List<TagVariableContext> tagVariable() {
			return getRuleContexts(TagVariableContext.class);
		}
		public TagVariableContext tagVariable(int i) {
			return getRuleContext(TagVariableContext.class,i);
		}
		public List<DocumentVariableContext> documentVariable() {
			return getRuleContexts(DocumentVariableContext.class);
		}
		public DocumentVariableContext documentVariable(int i) {
			return getRuleContext(DocumentVariableContext.class,i);
		}
		public List<AttrVariableContext> attrVariable() {
			return getRuleContexts(AttrVariableContext.class);
		}
		public AttrVariableContext attrVariable(int i) {
			return getRuleContext(AttrVariableContext.class,i);
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
		enterRule(_localctx, 56, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					misc();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(355);
						tagVariable();
						}
						break;
					case 2:
						{
						setState(356);
						documentVariable();
						}
						break;
					case 3:
						{
						setState(357);
						attrVariable();
						}
						break;
					case 4:
						{
						setState(358);
						conditionOperator();
						}
						break;
					case 5:
						{
						setState(359);
						function();
						}
						break;
					case 6:
						{
						setState(360);
						appendOperator();
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					misc();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class InsideBlockCodeContext extends ParserRuleContext {
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public InsideBlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideBlockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterInsideBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitInsideBlockCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitInsideBlockCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideBlockCodeContext insideBlockCode() throws RecognitionException {
		InsideBlockCodeContext _localctx = new InsideBlockCodeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insideBlockCode);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					misc();
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(378);
						variable();
						}
						break;
					case 2:
						{
						setState(379);
						operator();
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(385);
				misc();
				}
				}
				setState(390);
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
		enterRule(_localctx, 60, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(391);
				prolog();
				}
			}

			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					misc();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(400);
			scriptOpen();
			setState(401);
			constants();
			setState(402);
			scriptBodyOpen();
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(403);
				code();
				}
				break;
			}
			setState(406);
			scriptBodyClose();
			setState(407);
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
		enterRule(_localctx, 62, RULE_scriptOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(409);
				misc();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			match(OPEN_SCRIPT_TAG);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(416);
				misc();
				}
				}
				setState(421);
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
		enterRule(_localctx, 64, RULE_scriptClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(422);
				misc();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(CLOSE_SCRIPT_TAG);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(429);
				misc();
				}
				}
				setState(434);
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
		enterRule(_localctx, 66, RULE_scriptBodyOpen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(435);
				misc();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(OPEN_SCRIPT_BODY_TAG);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					misc();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 68, RULE_scriptBodyClose);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(448);
				misc();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(CLOSE_SCRIPT_BODY_TAG);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					misc();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 70, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(OPEN_CONSTANTS_TAG);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << TAG_VAR) | (1L << DOCUMENT_VAR) | (1L << ATTRIBUTE_VAR))) != 0)) {
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(462);
					documentVariable();
					}
					break;
				case 2:
					{
					setState(463);
					tagVariable();
					}
					break;
				case 3:
					{
					setState(464);
					attrVariable();
					}
					break;
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		enterRule(_localctx, 72, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(XMLDeclOpen);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(473);
				attribute();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		enterRule(_localctx, 74, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
		enterRule(_localctx, 76, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(Name);
			setState(484);
			match(EQUALS);
			setState(485);
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
		enterRule(_localctx, 78, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		enterRule(_localctx, 80, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\5\2W\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\7\5b\n\5\f\5\16\5e\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\7\5s\n\5\f\5\16\5"+
		"v\13\5\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f"+
		"\6\16\6\u0086\13\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\7"+
		"\6\u0091\n\6\f\6\16\6\u0094\13\6\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4\13\7\3\b\7\b\u00a7\n"+
		"\b\f\b\16\b\u00aa\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\7\b\u00b5"+
		"\n\b\f\b\16\b\u00b8\13\b\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00c6\n\t\f\t\16\t\u00c9\13\t\3\n\7\n\u00cc\n\n\f"+
		"\n\16\n\u00cf\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d7\n\n\f\n\16\n\u00da"+
		"\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00ef\n\22\3\23\3\23\5\23\u00f3\n\23\3"+
		"\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\7\30\u0108\n\30\f\30\16\30\u010b"+
		"\13\30\3\30\3\30\3\30\3\30\5\30\u0111\n\30\3\30\3\30\7\30\u0115\n\30\f"+
		"\30\16\30\u0118\13\30\3\31\7\31\u011b\n\31\f\31\16\31\u011e\13\31\3\31"+
		"\3\31\7\31\u0122\n\31\f\31\16\31\u0125\13\31\3\31\3\31\7\31\u0129\n\31"+
		"\f\31\16\31\u012c\13\31\3\31\3\31\3\31\3\31\7\31\u0132\n\31\f\31\16\31"+
		"\u0135\13\31\3\31\3\31\3\31\5\31\u013a\n\31\3\31\3\31\3\32\3\32\3\33\7"+
		"\33\u0141\n\33\f\33\16\33\u0144\13\33\3\33\3\33\5\33\u0148\n\33\3\33\3"+
		"\33\7\33\u014c\n\33\f\33\16\33\u014f\13\33\3\34\3\34\3\35\3\35\7\35\u0155"+
		"\n\35\f\35\16\35\u0158\13\35\3\35\3\35\5\35\u015c\n\35\3\35\3\35\3\36"+
		"\7\36\u0161\n\36\f\36\16\36\u0164\13\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u016c\n\36\f\36\16\36\u016f\13\36\3\36\7\36\u0172\n\36\f\36\16\36"+
		"\u0175\13\36\3\37\7\37\u0178\n\37\f\37\16\37\u017b\13\37\3\37\3\37\7\37"+
		"\u017f\n\37\f\37\16\37\u0182\13\37\3\37\7\37\u0185\n\37\f\37\16\37\u0188"+
		"\13\37\3 \5 \u018b\n \3 \7 \u018e\n \f \16 \u0191\13 \3 \3 \3 \3 \5 \u0197"+
		"\n \3 \3 \3 \3!\7!\u019d\n!\f!\16!\u01a0\13!\3!\3!\7!\u01a4\n!\f!\16!"+
		"\u01a7\13!\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad\13\"\3\"\3\"\7\"\u01b1\n\""+
		"\f\"\16\"\u01b4\13\"\3#\7#\u01b7\n#\f#\16#\u01ba\13#\3#\3#\7#\u01be\n"+
		"#\f#\16#\u01c1\13#\3$\7$\u01c4\n$\f$\16$\u01c7\13$\3$\3$\7$\u01cb\n$\f"+
		"$\16$\u01ce\13$\3%\3%\3%\3%\7%\u01d4\n%\f%\16%\u01d7\13%\3%\3%\3&\3&\7"+
		"&\u01dd\n&\f&\16&\u01e0\13&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\2"+
		"\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPR\2\6\3\2\31\32\3\2\6\7\4\2\b\bCC\4\2\3\3\b\b\2\u0201\2V\3\2\2"+
		"\2\4X\3\2\2\2\6\\\3\2\2\2\bc\3\2\2\2\nz\3\2\2\2\f\u0098\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00bc\3\2\2\2\22\u00cd\3\2\2\2\24\u00db\3\2\2\2\26\u00dd\3"+
		"\2\2\2\30\u00df\3\2\2\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u00e7\3\2"+
		"\2\2 \u00e9\3\2\2\2\"\u00ee\3\2\2\2$\u00f2\3\2\2\2&\u00f7\3\2\2\2(\u0100"+
		"\3\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0109\3\2\2\2\60\u011c\3\2\2\2"+
		"\62\u013d\3\2\2\2\64\u0142\3\2\2\2\66\u0150\3\2\2\28\u0152\3\2\2\2:\u0162"+
		"\3\2\2\2<\u0179\3\2\2\2>\u018a\3\2\2\2@\u019e\3\2\2\2B\u01ab\3\2\2\2D"+
		"\u01b8\3\2\2\2F\u01c5\3\2\2\2H\u01cf\3\2\2\2J\u01da\3\2\2\2L\u01e3\3\2"+
		"\2\2N\u01e5\3\2\2\2P\u01e9\3\2\2\2R\u01eb\3\2\2\2TW\5\b\5\2UW\5\n\6\2"+
		"VT\3\2\2\2VU\3\2\2\2W\3\3\2\2\2XY\7E\2\2YZ\7K\2\2Z[\7L\2\2[\5\3\2\2\2"+
		"\\]\7F\2\2]^\7K\2\2^_\7L\2\2_\7\3\2\2\2`b\5R*\2a`\3\2\2\2be\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\t\2\2gh\7D\2\2hi\5\4\3\2im"+
		"\5\6\4\2jl\5N(\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3"+
		"\2\2\2pt\7I\2\2qs\5R*\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2"+
		"\2\2vt\3\2\2\2wy\5R*\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|z\3\2\2\2}~\7\t\2\2~\177\7D\2\2\177\u0080\5\4\3\2\u0080\u0084\5\6\4"+
		"\2\u0081\u0083\5N(\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008b\7G\2\2\u0088\u008a\5\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0092\5\f\7\2\u008f\u0091\5R*\2\u0090\u008f\3\2\2"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\13"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5R*\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\t\2\2\u009c\u009d\7J\2\2\u009d"+
		"\u009e\7D\2\2\u009e\u00a2\7G\2\2\u009f\u00a1\5R*\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\r\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5R*\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00b0\7\'\2\2\u00ae\u00b1\5\26\f\2\u00af\u00b1\7$\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7(\2\2\u00b3"+
		"\u00b5\5R*\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\17\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb"+
		"\5R*\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\27"+
		"\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3\5\32\16\2\u00c3"+
		"\u00c7\7#\2\2\u00c4\u00c6\5R*\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cc\5R*\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\7-\2\2\u00d3"+
		"\u00d4\5\34\17\2\u00d4\u00d8\7.\2\2\u00d5\u00d7\5R*\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\23\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7%\2\2\u00dc\25\3\2\2\2\u00dd"+
		"\u00de\7%\2\2\u00de\27\3\2\2\2\u00df\u00e0\7 \2\2\u00e0\31\3\2\2\2\u00e1"+
		"\u00e2\7 \2\2\u00e2\33\3\2\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\7+\2"+
		"\2\u00e5\u00e6\5 \21\2\u00e6\35\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8\37\3"+
		"\2\2\2\u00e9\u00ea\7*\2\2\u00ea!\3\2\2\2\u00eb\u00ef\5\16\b\2\u00ec\u00ef"+
		"\5\20\t\2\u00ed\u00ef\5\22\n\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f3\5\60\31\2\u00f1\u00f3"+
		"\5&\24\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3%\3\2\2\2\u00f4"+
		"\u00f6\5R*\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\7\33\2\2\u00fb\u00fc\5(\25\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\5*\26\2"+
		"\u00fe\u00ff\7\66\2\2\u00ff\'\3\2\2\2\u0100\u0101\7\64\2\2\u0101)\3\2"+
		"\2\2\u0102\u0103\7\64\2\2\u0103+\3\2\2\2\u0104\u0105\7\65\2\2\u0105-\3"+
		"\2\2\2\u0106\u0108\5R*\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\t\2\2\2\u010d\u010e\7/\2\2\u010e\u0110\7\60\2\2\u010f"+
		"\u0111\5<\37\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0116\7\62\2\2\u0113\u0115\5R*\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011b\5R*\2\u011a\u0119\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0123\7\24\2\2\u0120\u0122\5R*\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012a\78\2\2\u0127\u0129\5R*"+
		"\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\67\2\2"+
		"\u012e\u012f\5\62\32\2\u012f\u0133\7\67\2\2\u0130\u0132\5R*\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7:\2\2\u0137\u0139\5\64"+
		"\33\2\u0138\u013a\58\35\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\5\66\34\2\u013c\61\3\2\2\2\u013d\u013e\7<\2"+
		"\2\u013e\63\3\2\2\2\u013f\u0141\5R*\2\u0140\u013f\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0147\7\34\2\2\u0146\u0148\5<\37\2\u0147\u0146\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014d\7\35\2\2\u014a"+
		"\u014c\5R*\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\65\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151"+
		"\7\36\2\2\u0151\67\3\2\2\2\u0152\u0156\7\25\2\2\u0153\u0155\5R*\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\7\34\2\2\u015a"+
		"\u015c\5<\37\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\7\35\2\2\u015e9\3\2\2\2\u015f\u0161\5R*\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u016d\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016c\5\16\b\2\u0166\u016c\5"+
		"\20\t\2\u0167\u016c\5\22\n\2\u0168\u016c\5\60\31\2\u0169\u016c\5.\30\2"+
		"\u016a\u016c\5&\24\2\u016b\u0165\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167"+
		"\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0173\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u0170\u0172\5R*\2\u0171\u0170\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174;\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\5R*\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2"+
		"\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0180\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u017f\5\"\22\2\u017d\u017f\5$\23\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0186\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\5R*\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187=\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\5J&\2\u018a\u0189"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018e\5R*\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\5@!\2\u0193\u0194"+
		"\5H%\2\u0194\u0196\5D#\2\u0195\u0197\5:\36\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5F$\2\u0199\u019a\5B\""+
		"\2\u019a?\3\2\2\2\u019b\u019d\5R*\2\u019c\u019b\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a5\7\13\2\2\u01a2\u01a4\5R*\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"A\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\5R*\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b2\7\f\2\2\u01af\u01b1\5R*\2\u01b0\u01af"+
		"\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"C\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7\5R*\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\7\r\2\2\u01bc\u01be\5R*\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"E\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\5R*\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\7\16\2\2\u01c9\u01cb\5R*\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cdG\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d5\7\17\2\2\u01d0\u01d4"+
		"\5\20\t\2\u01d1\u01d4\5\16\b\2\u01d2\u01d4\5\22\n\2\u01d3\u01d0\3\2\2"+
		"\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\7\20\2\2\u01d9I\3\2\2\2\u01da\u01de\7\n\2\2\u01db\u01dd\5N(\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7H\2\2\u01e2"+
		"K\3\2\2\2\u01e3\u01e4\t\3\2\2\u01e4M\3\2\2\2\u01e5\u01e6\7M\2\2\u01e6"+
		"\u01e7\7K\2\2\u01e7\u01e8\7L\2\2\u01e8O\3\2\2\2\u01e9\u01ea\t\4\2\2\u01ea"+
		"Q\3\2\2\2\u01eb\u01ec\t\5\2\2\u01ecS\3\2\2\29Vcmtz\u0084\u008b\u0092\u0098"+
		"\u00a2\u00a8\u00b0\u00b6\u00bc\u00c7\u00cd\u00d8\u00ee\u00f2\u00f7\u0109"+
		"\u0110\u0116\u011c\u0123\u012a\u0133\u0139\u0142\u0147\u014d\u0156\u015b"+
		"\u0162\u016b\u016d\u0173\u0179\u017e\u0180\u0186\u018a\u018f\u0196\u019e"+
		"\u01a5\u01ab\u01b2\u01b8\u01bf\u01c5\u01cc\u01d3\u01d5\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}