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
		COMMON_OPEN_BLOCK=26, COMMON_CLOSE_BLOCK=27, CONDITION_END=28, COMMA=29, 
		RUN_FUNCTION_WORD=30, FUNC_RUN_WORD=31, FUNC_RUN_TABULATION_AND_SPACES=32, 
		FUNC_RUN_END=33, DOCUMENT=34, DOCUMENT_WORD=35, TABULATION_AND_SPACES=36, 
		VARIABLE_EQUALS=37, DOC_END_OF_DECLARATION=38, EMPTY_TAG=39, TAG_WORD=40, 
		TAG_TABULATION_AND_SPACES=41, TAG_VARIABLE_EQUALS=42, TAG_END_OF_DECLARATION=43, 
		ATTRIBUTE=44, ATTRIBUTE_WORD=45, ATTRIBUTE_DELIMITER=46, ATTRIBUTE_TABULATION_AND_SPACES=47, 
		ATTRIBUTE_EQUALS=48, ATTRIBUTE_END_OF_DECLARATION=49, FUNC_NAME=50, FUNC_IGNORING_SYMBOLS_SPACES=51, 
		APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES=52, APPEND_OPERATOR_WORD=53, TO_SYMBOL=54, 
		END_OF_OPERATOR=55, CONDITION_WORD=56, CONDITION_BRACKETS_OPEN=57, CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=58, 
		CONDITION_BRACKETS_CLOSE=59, HAS_CONDITION=60, EQUALS_CONDITION=61, OPEN_BLOCK=62, 
		CLOSE_BLOCK=63, ELSE_CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES=64, ELSE_OPEN_BLOCK=65, 
		ELSE_CLOSE_BLOCK=66, BRACKET_CLOSE=67, EXPRESSION_ARGUMENTS=68, TAG_DECLARATION=69, 
		TAG_NAME_ATTR=70, TAG_VALUE_ATTR=71, CLOSE=72, SPECIAL_CLOSE=73, SLASH_CLOSE=74, 
		SLASH=75, EQUALS=76, STRING=77, Name=78, S=79, PI=80;
	public static final int
		RULE_tag = 0, RULE_tag_name_attr = 1, RULE_tag_value_attr = 2, RULE_simple_tag = 3, 
		RULE_complex_tag = 4, RULE_complex_tag_close = 5, RULE_tagVariable = 6, 
		RULE_documentVariable = 7, RULE_attrVariable = 8, RULE_tagVariableName = 9, 
		RULE_tagVariableValue = 10, RULE_docVariableName = 11, RULE_docVariableValue = 12, 
		RULE_attrVariableValue = 13, RULE_attrName = 14, RULE_attrValue = 15, 
		RULE_variable = 16, RULE_operator = 17, RULE_appendOperator = 18, RULE_appendOperatorChildName = 19, 
		RULE_appendOperatorParentName = 20, RULE_appendOperatorToWord = 21, RULE_function = 22, 
		RULE_functionDeclarationEnd = 23, RULE_functionRun = 24, RULE_args = 25, 
		RULE_conditionOperator = 26, RULE_conditionType = 27, RULE_ifCondition = 28, 
		RULE_conditionExitFlag = 29, RULE_elseCondition = 30, RULE_code = 31, 
		RULE_insideBlockCode = 32, RULE_script = 33, RULE_scriptOpen = 34, RULE_scriptClose = 35, 
		RULE_scriptBodyOpen = 36, RULE_scriptBodyClose = 37, RULE_constants = 38, 
		RULE_prolog = 39, RULE_reference = 40, RULE_attribute = 41, RULE_chardata = 42, 
		RULE_misc = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"tag", "tag_name_attr", "tag_value_attr", "simple_tag", "complex_tag", 
			"complex_tag_close", "tagVariable", "documentVariable", "attrVariable", 
			"tagVariableName", "tagVariableValue", "docVariableName", "docVariableValue", 
			"attrVariableValue", "attrName", "attrValue", "variable", "operator", 
			"appendOperator", "appendOperatorChildName", "appendOperatorParentName", 
			"appendOperatorToWord", "function", "functionDeclarationEnd", "functionRun", 
			"args", "conditionOperator", "conditionType", "ifCondition", "conditionExitFlag", 
			"elseCondition", "code", "insideBlockCode", "script", "scriptOpen", "scriptClose", 
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
			"'attr'", "'function'", "'func'", "'append'", null, null, null, "','", 
			"'run'", null, null, null, "'DOC'", null, null, null, null, "'TAG'", 
			null, null, null, null, "'ATTR'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'has'", "'=='", 
			null, null, null, null, null, null, null, null, "'name'", "'value'", 
			"'>'", null, "'/>'", "'/'"
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
			"CONDITION_END", "COMMA", "RUN_FUNCTION_WORD", "FUNC_RUN_WORD", "FUNC_RUN_TABULATION_AND_SPACES", 
			"FUNC_RUN_END", "DOCUMENT", "DOCUMENT_WORD", "TABULATION_AND_SPACES", 
			"VARIABLE_EQUALS", "DOC_END_OF_DECLARATION", "EMPTY_TAG", "TAG_WORD", 
			"TAG_TABULATION_AND_SPACES", "TAG_VARIABLE_EQUALS", "TAG_END_OF_DECLARATION", 
			"ATTRIBUTE", "ATTRIBUTE_WORD", "ATTRIBUTE_DELIMITER", "ATTRIBUTE_TABULATION_AND_SPACES", 
			"ATTRIBUTE_EQUALS", "ATTRIBUTE_END_OF_DECLARATION", "FUNC_NAME", "FUNC_IGNORING_SYMBOLS_SPACES", 
			"APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES", "APPEND_OPERATOR_WORD", "TO_SYMBOL", 
			"END_OF_OPERATOR", "CONDITION_WORD", "CONDITION_BRACKETS_OPEN", "CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES", 
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				simple_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(92);
			match(TAG_NAME_ATTR);
			setState(93);
			match(EQUALS);
			setState(94);
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
			setState(96);
			match(TAG_VALUE_ATTR);
			setState(97);
			match(EQUALS);
			setState(98);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(100);
				misc();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(OPEN);
			setState(107);
			match(TAG_DECLARATION);
			setState(108);
			tag_name_attr();
			setState(109);
			tag_value_attr();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(110);
				attribute();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(SLASH_CLOSE);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(123);
				misc();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(OPEN);
			setState(130);
			match(TAG_DECLARATION);
			setState(131);
			tag_name_attr();
			setState(132);
			tag_value_attr();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(133);
				attribute();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(CLOSE);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					tag();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(146);
			complex_tag_close();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			match(OPEN);
			setState(160);
			match(SLASH);
			setState(161);
			match(TAG_DECLARATION);
			setState(162);
			match(CLOSE);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					misc();
					}
					} 
				}
				setState(168);
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
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(169);
				misc();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(TAG_VAR);
			setState(176);
			tagVariableName();
			setState(177);
			match(TAG_VARIABLE_EQUALS);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_WORD:
				{
				setState(178);
				tagVariableValue();
				}
				break;
			case EMPTY_TAG:
				{
				setState(179);
				match(EMPTY_TAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(TAG_END_OF_DECLARATION);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					misc();
					}
					} 
				}
				setState(188);
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
			match(DOCUMENT_VAR);
			setState(196);
			docVariableName();
			setState(197);
			match(VARIABLE_EQUALS);
			setState(198);
			docVariableValue();
			setState(199);
			match(DOC_END_OF_DECLARATION);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					misc();
					}
					} 
				}
				setState(205);
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
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(206);
				misc();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(ATTRIBUTE_VAR);
			setState(213);
			match(ATTRIBUTE_WORD);
			setState(214);
			match(ATTRIBUTE_EQUALS);
			setState(215);
			attrVariableValue();
			setState(216);
			match(ATTRIBUTE_END_OF_DECLARATION);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					misc();
					}
					} 
				}
				setState(222);
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
			setState(223);
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
			setState(225);
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
			setState(227);
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
			setState(229);
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
			setState(231);
			attrName();
			setState(232);
			match(ATTRIBUTE_DELIMITER);
			setState(233);
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
			setState(235);
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
			setState(237);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				tagVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				documentVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
		public FunctionRunContext functionRun() {
			return getRuleContext(FunctionRunContext.class,0);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				conditionOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				appendOperator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				functionRun();
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
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(249);
				misc();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(APPEND_OPERATOR_DECLARATION);
			setState(256);
			appendOperatorChildName();
			setState(257);
			appendOperatorToWord();
			setState(258);
			appendOperatorParentName();
			setState(259);
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
			setState(261);
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
			setState(263);
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
			setState(265);
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
		public TerminalNode COMMON_OPEN_BLOCK() { return getToken(XMLParser.COMMON_OPEN_BLOCK, 0); }
		public TerminalNode COMMON_CLOSE_BLOCK() { return getToken(XMLParser.COMMON_CLOSE_BLOCK, 0); }
		public FunctionDeclarationEndContext functionDeclarationEnd() {
			return getRuleContext(FunctionDeclarationEndContext.class,0);
		}
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
			_la = _input.LA(1);
			if ( !(_la==FUNCTION_WORD || _la==FUNCTION_WORD_SHORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			match(FUNC_NAME);
			setState(275);
			match(COMMON_OPEN_BLOCK);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(276);
				insideBlockCode();
				}
				break;
			}
			setState(279);
			match(COMMON_CLOSE_BLOCK);
			setState(280);
			functionDeclarationEnd();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					misc();
					}
					} 
				}
				setState(286);
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

	public static class FunctionDeclarationEndContext extends ParserRuleContext {
		public TerminalNode CONDITION_END() { return getToken(XMLParser.CONDITION_END, 0); }
		public FunctionDeclarationEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterFunctionDeclarationEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitFunctionDeclarationEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitFunctionDeclarationEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationEndContext functionDeclarationEnd() throws RecognitionException {
		FunctionDeclarationEndContext _localctx = new FunctionDeclarationEndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDeclarationEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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

	public static class FunctionRunContext extends ParserRuleContext {
		public TerminalNode RUN_FUNCTION_WORD() { return getToken(XMLParser.RUN_FUNCTION_WORD, 0); }
		public TerminalNode FUNC_RUN_WORD() { return getToken(XMLParser.FUNC_RUN_WORD, 0); }
		public TerminalNode FUNC_RUN_END() { return getToken(XMLParser.FUNC_RUN_END, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public FunctionRunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterFunctionRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitFunctionRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitFunctionRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionRunContext functionRun() throws RecognitionException {
		FunctionRunContext _localctx = new FunctionRunContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionRun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(289);
				misc();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(RUN_FUNCTION_WORD);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(296);
				misc();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(FUNC_RUN_WORD);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(303);
				misc();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(FUNC_RUN_END);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					misc();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> FUNC_RUN_WORD() { return getTokens(XMLParser.FUNC_RUN_WORD); }
		public TerminalNode FUNC_RUN_WORD(int i) {
			return getToken(XMLParser.FUNC_RUN_WORD, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XMLParserVisitor ) return ((XMLParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC_RUN_WORD) {
				{
				{
				setState(316);
				match(FUNC_RUN_WORD);
				}
				}
				setState(321);
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
		enterRule(_localctx, 52, RULE_conditionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(IF);
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
			setState(335);
			match(CONDITION_BRACKETS_OPEN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(336);
				misc();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(CONDITION_WORD);
			setState(343);
			conditionType();
			setState(344);
			match(CONDITION_WORD);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(345);
				misc();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(CONDITION_BRACKETS_CLOSE);
			setState(352);
			ifCondition();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(353);
				elseCondition();
				}
			}

			setState(356);
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
		enterRule(_localctx, 54, RULE_conditionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 56, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(360);
				misc();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(COMMON_OPEN_BLOCK);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(367);
				insideBlockCode();
				}
				break;
			}
			setState(370);
			match(COMMON_CLOSE_BLOCK);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(371);
				misc();
				}
				}
				setState(376);
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
		enterRule(_localctx, 58, RULE_conditionExitFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 60, RULE_elseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ELSE);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(380);
				misc();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(COMMON_OPEN_BLOCK);
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(387);
				insideBlockCode();
				}
				break;
			}
			setState(390);
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
		public List<FunctionRunContext> functionRun() {
			return getRuleContexts(FunctionRunContext.class);
		}
		public FunctionRunContext functionRun(int i) {
			return getRuleContext(FunctionRunContext.class,i);
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
		enterRule(_localctx, 62, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					misc();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(398);
						tagVariable();
						}
						break;
					case 2:
						{
						setState(399);
						documentVariable();
						}
						break;
					case 3:
						{
						setState(400);
						attrVariable();
						}
						break;
					case 4:
						{
						setState(401);
						conditionOperator();
						}
						break;
					case 5:
						{
						setState(402);
						function();
						}
						break;
					case 6:
						{
						setState(403);
						appendOperator();
						}
						break;
					case 7:
						{
						setState(404);
						functionRun();
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					misc();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 64, RULE_insideBlockCode);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					misc();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(422);
						variable();
						}
						break;
					case 2:
						{
						setState(423);
						operator();
						}
						break;
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
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
		enterRule(_localctx, 66, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(435);
				prolog();
				}
			}

			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					misc();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(444);
			scriptOpen();
			setState(445);
			constants();
			setState(446);
			scriptBodyOpen();
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(447);
				code();
				}
				break;
			}
			setState(450);
			scriptBodyClose();
			setState(451);
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
		enterRule(_localctx, 68, RULE_scriptOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(453);
				misc();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(OPEN_SCRIPT_TAG);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(460);
				misc();
				}
				}
				setState(465);
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
		enterRule(_localctx, 70, RULE_scriptClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(466);
				misc();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(CLOSE_SCRIPT_TAG);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(473);
				misc();
				}
				}
				setState(478);
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
		enterRule(_localctx, 72, RULE_scriptBodyOpen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(479);
				misc();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(OPEN_SCRIPT_BODY_TAG);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					misc();
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 74, RULE_scriptBodyClose);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(492);
				misc();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(CLOSE_SCRIPT_BODY_TAG);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					misc();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		enterRule(_localctx, 76, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(OPEN_CONSTANTS_TAG);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << TAG_VAR) | (1L << DOCUMENT_VAR) | (1L << ATTRIBUTE_VAR) | (1L << FUNCTION_WORD) | (1L << FUNCTION_WORD_SHORT))) != 0)) {
				{
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(506);
					documentVariable();
					}
					break;
				case 2:
					{
					setState(507);
					tagVariable();
					}
					break;
				case 3:
					{
					setState(508);
					attrVariable();
					}
					break;
				case 4:
					{
					setState(509);
					function();
					}
					break;
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
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
		enterRule(_localctx, 78, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(XMLDeclOpen);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(518);
				attribute();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		enterRule(_localctx, 80, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 82, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Name);
			setState(529);
			match(EQUALS);
			setState(530);
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
		enterRule(_localctx, 84, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 86, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\7\5h\n"+
		"\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5"+
		"\7\5y\n\5\f\5\16\5|\13\5\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\7\6\u0090\n\6\f\6"+
		"\16\6\u0093\13\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\7\7\u009d"+
		"\n\7\f\7\16\7\u00a0\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a7\n\7\f\7\16\7\u00aa"+
		"\13\7\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b7"+
		"\n\b\3\b\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\t\7\t\u00c1\n\t\f\t\16"+
		"\t\u00c4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13"+
		"\t\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00dd"+
		"\n\n\f\n\16\n\u00e0\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00f5\n\22\3\23\3\23"+
		"\3\23\5\23\u00fa\n\23\3\24\7\24\u00fd\n\24\f\24\16\24\u0100\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\7\30\u010f"+
		"\n\30\f\30\16\30\u0112\13\30\3\30\3\30\3\30\3\30\5\30\u0118\n\30\3\30"+
		"\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\3\31\3\31\3\32\7\32"+
		"\u0125\n\32\f\32\16\32\u0128\13\32\3\32\3\32\7\32\u012c\n\32\f\32\16\32"+
		"\u012f\13\32\3\32\3\32\7\32\u0133\n\32\f\32\16\32\u0136\13\32\3\32\3\32"+
		"\7\32\u013a\n\32\f\32\16\32\u013d\13\32\3\33\7\33\u0140\n\33\f\33\16\33"+
		"\u0143\13\33\3\34\7\34\u0146\n\34\f\34\16\34\u0149\13\34\3\34\3\34\7\34"+
		"\u014d\n\34\f\34\16\34\u0150\13\34\3\34\3\34\7\34\u0154\n\34\f\34\16\34"+
		"\u0157\13\34\3\34\3\34\3\34\3\34\7\34\u015d\n\34\f\34\16\34\u0160\13\34"+
		"\3\34\3\34\3\34\5\34\u0165\n\34\3\34\3\34\3\35\3\35\3\36\7\36\u016c\n"+
		"\36\f\36\16\36\u016f\13\36\3\36\3\36\5\36\u0173\n\36\3\36\3\36\7\36\u0177"+
		"\n\36\f\36\16\36\u017a\13\36\3\37\3\37\3 \3 \7 \u0180\n \f \16 \u0183"+
		"\13 \3 \3 \5 \u0187\n \3 \3 \3!\7!\u018c\n!\f!\16!\u018f\13!\3!\3!\3!"+
		"\3!\3!\3!\3!\7!\u0198\n!\f!\16!\u019b\13!\3!\7!\u019e\n!\f!\16!\u01a1"+
		"\13!\3\"\7\"\u01a4\n\"\f\"\16\"\u01a7\13\"\3\"\3\"\7\"\u01ab\n\"\f\"\16"+
		"\"\u01ae\13\"\3\"\7\"\u01b1\n\"\f\"\16\"\u01b4\13\"\3#\5#\u01b7\n#\3#"+
		"\7#\u01ba\n#\f#\16#\u01bd\13#\3#\3#\3#\3#\5#\u01c3\n#\3#\3#\3#\3$\7$\u01c9"+
		"\n$\f$\16$\u01cc\13$\3$\3$\7$\u01d0\n$\f$\16$\u01d3\13$\3%\7%\u01d6\n"+
		"%\f%\16%\u01d9\13%\3%\3%\7%\u01dd\n%\f%\16%\u01e0\13%\3&\7&\u01e3\n&\f"+
		"&\16&\u01e6\13&\3&\3&\7&\u01ea\n&\f&\16&\u01ed\13&\3\'\7\'\u01f0\n\'\f"+
		"\'\16\'\u01f3\13\'\3\'\3\'\7\'\u01f7\n\'\f\'\16\'\u01fa\13\'\3(\3(\3("+
		"\3(\3(\7(\u0201\n(\f(\16(\u0204\13(\3(\3(\3)\3)\7)\u020a\n)\f)\16)\u020d"+
		"\13)\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\6\3\2\31\32"+
		"\3\2\6\7\4\2\b\bFF\4\2\3\3\b\b\2\u0233\2\\\3\2\2\2\4^\3\2\2\2\6b\3\2\2"+
		"\2\bi\3\2\2\2\n\u0080\3\2\2\2\f\u009e\3\2\2\2\16\u00ae\3\2\2\2\20\u00c2"+
		"\3\2\2\2\22\u00d3\3\2\2\2\24\u00e1\3\2\2\2\26\u00e3\3\2\2\2\30\u00e5\3"+
		"\2\2\2\32\u00e7\3\2\2\2\34\u00e9\3\2\2\2\36\u00ed\3\2\2\2 \u00ef\3\2\2"+
		"\2\"\u00f4\3\2\2\2$\u00f9\3\2\2\2&\u00fe\3\2\2\2(\u0107\3\2\2\2*\u0109"+
		"\3\2\2\2,\u010b\3\2\2\2.\u0110\3\2\2\2\60\u0121\3\2\2\2\62\u0126\3\2\2"+
		"\2\64\u0141\3\2\2\2\66\u0147\3\2\2\28\u0168\3\2\2\2:\u016d\3\2\2\2<\u017b"+
		"\3\2\2\2>\u017d\3\2\2\2@\u018d\3\2\2\2B\u01a5\3\2\2\2D\u01b6\3\2\2\2F"+
		"\u01ca\3\2\2\2H\u01d7\3\2\2\2J\u01e4\3\2\2\2L\u01f1\3\2\2\2N\u01fb\3\2"+
		"\2\2P\u0207\3\2\2\2R\u0210\3\2\2\2T\u0212\3\2\2\2V\u0216\3\2\2\2X\u0218"+
		"\3\2\2\2Z]\5\b\5\2[]\5\n\6\2\\Z\3\2\2\2\\[\3\2\2\2]\3\3\2\2\2^_\7H\2\2"+
		"_`\7N\2\2`a\7O\2\2a\5\3\2\2\2bc\7I\2\2cd\7N\2\2de\7O\2\2e\7\3\2\2\2fh"+
		"\5X-\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7"+
		"\t\2\2mn\7G\2\2no\5\4\3\2os\5\6\4\2pr\5T+\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vz\7L\2\2wy\5X-\2xw\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\t\3\2\2\2|z\3\2\2\2}\177\5X-\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\7\t\2\2\u0084\u0085\7G\2\2\u0085\u0086\5\4"+
		"\3\2\u0086\u008a\5\6\4\2\u0087\u0089\5T+\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0091\7J\2\2\u008e\u0090\5\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\5\f\7\2\u0095\u0097\5X"+
		"-\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5X-\2"+
		"\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2"+
		"\u00a3\7M\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a8\7J\2\2\u00a5\u00a7\5X-\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\5X-\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5"+
		"\24\13\2\u00b3\u00b6\7,\2\2\u00b4\u00b7\5\26\f\2\u00b5\u00b7\7)\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\7-"+
		"\2\2\u00b9\u00bb\5X-\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\5X-\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2"+
		"\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\7\27\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\'\2\2\u00c8\u00c9\5\32\16"+
		"\2\u00c9\u00cd\7(\2\2\u00ca\u00cc\5X-\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\21\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d2\5X-\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9\7\62\2\2"+
		"\u00d9\u00da\5\34\17\2\u00da\u00de\7\63\2\2\u00db\u00dd\5X-\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\23\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\25\3\2\2\2\u00e3"+
		"\u00e4\7*\2\2\u00e4\27\3\2\2\2\u00e5\u00e6\7%\2\2\u00e6\31\3\2\2\2\u00e7"+
		"\u00e8\7%\2\2\u00e8\33\3\2\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\60"+
		"\2\2\u00eb\u00ec\5 \21\2\u00ec\35\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\37"+
		"\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0!\3\2\2\2\u00f1\u00f5\5\16\b\2\u00f2"+
		"\u00f5\5\20\t\2\u00f3\u00f5\5\22\n\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3"+
		"\2\2\2\u00f4\u00f3\3\2\2\2\u00f5#\3\2\2\2\u00f6\u00fa\5\66\34\2\u00f7"+
		"\u00fa\5&\24\2\u00f8\u00fa\5\62\32\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00f8\3\2\2\2\u00fa%\3\2\2\2\u00fb\u00fd\5X-\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\33\2\2\u0102\u0103\5"+
		"(\25\2\u0103\u0104\5,\27\2\u0104\u0105\5*\26\2\u0105\u0106\79\2\2\u0106"+
		"\'\3\2\2\2\u0107\u0108\7\67\2\2\u0108)\3\2\2\2\u0109\u010a\7\67\2\2\u010a"+
		"+\3\2\2\2\u010b\u010c\78\2\2\u010c-\3\2\2\2\u010d\u010f\5X-\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\t\2\2\2\u0114\u0115\7\64"+
		"\2\2\u0115\u0117\7\34\2\2\u0116\u0118\5B\"\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\35\2\2\u011a\u011e\5"+
		"\60\31\2\u011b\u011d\5X-\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f/\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0122\7\36\2\2\u0122\61\3\2\2\2\u0123\u0125\5X-\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012d\7 \2\2\u012a\u012c\5X-"+
		"\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\7!\2\2\u0131"+
		"\u0133\5X-\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013b"+
		"\7#\2\2\u0138\u013a\5X-\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\63\3\2\2\2\u013d\u013b\3\2\2"+
		"\2\u013e\u0140\7!\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\65\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0146\5X-\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e"+
		"\7\24\2\2\u014b\u014d\5X-\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0155\7;\2\2\u0152\u0154\5X-\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7:\2\2\u0159\u015a\58\35\2\u015a\u015e\7:\2"+
		"\2\u015b\u015d\5X-\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\7=\2\2\u0162\u0164\5:\36\2\u0163\u0165\5> \2\u0164\u0163\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5<\37\2\u0167\67"+
		"\3\2\2\2\u0168\u0169\7?\2\2\u01699\3\2\2\2\u016a\u016c\5X-\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\34\2\2\u0171\u0173\5"+
		"B\"\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0178\7\35\2\2\u0175\u0177\5X-\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179;\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017c\7\36\2\2\u017c=\3\2\2\2\u017d\u0181\7\25\2\2\u017e"+
		"\u0180\5X-\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2"+
		"\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186"+
		"\7\34\2\2\u0185\u0187\5B\"\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7\35\2\2\u0189?\3\2\2\2\u018a\u018c\5X-\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0199\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0198\5\16\b\2\u0191"+
		"\u0198\5\20\t\2\u0192\u0198\5\22\n\2\u0193\u0198\5\66\34\2\u0194\u0198"+
		"\5.\30\2\u0195\u0198\5&\24\2\u0196\u0198\5\62\32\2\u0197\u0190\3\2\2\2"+
		"\u0197\u0191\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2\2\u0197\u0194"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019f\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019e\5X-\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0A\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\5X-\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u01ac\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab"+
		"\5\"\22\2\u01a9\u01ab\5$\23\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\5X-\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3C\3\2\2\2"+
		"\u01b4\u01b2\3\2\2\2\u01b5\u01b7\5P)\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\5X-\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\5F$\2\u01bf\u01c0\5N(\2\u01c0\u01c2"+
		"\5J&\2\u01c1\u01c3\5@!\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\5L\'\2\u01c5\u01c6\5H%\2\u01c6E\3\2\2\2\u01c7"+
		"\u01c9\5X-\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d1"+
		"\7\13\2\2\u01ce\u01d0\5X-\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2G\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d6\5X-\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01de\7\f\2\2\u01db\u01dd\5X-\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2"+
		"\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfI\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e3\5X-\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01eb\7\r\2\2\u01e8\u01ea\5X-\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecK\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\5X-\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2"+
		"\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f4\u01f8\7\16\2\2\u01f5\u01f7\5X-\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9M\3\2\2\2"+
		"\u01fa\u01f8\3\2\2\2\u01fb\u0202\7\17\2\2\u01fc\u0201\5\20\t\2\u01fd\u0201"+
		"\5\16\b\2\u01fe\u0201\5\22\n\2\u01ff\u0201\5.\30\2\u0200\u01fc\3\2\2\2"+
		"\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0206\7\20\2\2\u0206O\3\2\2\2\u0207\u020b\7\n\2\2"+
		"\u0208\u020a\5T+\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e"+
		"\u020f\7K\2\2\u020fQ\3\2\2\2\u0210\u0211\t\3\2\2\u0211S\3\2\2\2\u0212"+
		"\u0213\7P\2\2\u0213\u0214\7N\2\2\u0214\u0215\7O\2\2\u0215U\3\2\2\2\u0216"+
		"\u0217\t\4\2\2\u0217W\3\2\2\2\u0218\u0219\t\5\2\2\u0219Y\3\2\2\2>\\is"+
		"z\u0080\u008a\u0091\u0098\u009e\u00a8\u00ae\u00b6\u00bc\u00c2\u00cd\u00d3"+
		"\u00de\u00f4\u00f9\u00fe\u0110\u0117\u011e\u0126\u012d\u0134\u013b\u0141"+
		"\u0147\u014e\u0155\u015e\u0164\u016d\u0172\u0178\u0181\u0186\u018d\u0197"+
		"\u0199\u019f\u01a5\u01aa\u01ac\u01b2\u01b6\u01bb\u01c2\u01ca\u01d1\u01d7"+
		"\u01de\u01e4\u01eb\u01f1\u01f8\u0200\u0202\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}