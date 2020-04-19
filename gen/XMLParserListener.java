// Generated from D:/Projects/XML-language-parser/src/main/resources\XMLParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(XMLParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(XMLParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#tag_name_attr}.
	 * @param ctx the parse tree
	 */
	void enterTag_name_attr(XMLParser.Tag_name_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tag_name_attr}.
	 * @param ctx the parse tree
	 */
	void exitTag_name_attr(XMLParser.Tag_name_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#tag_value_attr}.
	 * @param ctx the parse tree
	 */
	void enterTag_value_attr(XMLParser.Tag_value_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tag_value_attr}.
	 * @param ctx the parse tree
	 */
	void exitTag_value_attr(XMLParser.Tag_value_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#simple_tag}.
	 * @param ctx the parse tree
	 */
	void enterSimple_tag(XMLParser.Simple_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#simple_tag}.
	 * @param ctx the parse tree
	 */
	void exitSimple_tag(XMLParser.Simple_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#complex_tag}.
	 * @param ctx the parse tree
	 */
	void enterComplex_tag(XMLParser.Complex_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#complex_tag}.
	 * @param ctx the parse tree
	 */
	void exitComplex_tag(XMLParser.Complex_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#complex_tag_close}.
	 * @param ctx the parse tree
	 */
	void enterComplex_tag_close(XMLParser.Complex_tag_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#complex_tag_close}.
	 * @param ctx the parse tree
	 */
	void exitComplex_tag_close(XMLParser.Complex_tag_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#conditionOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperator(XMLParser.ConditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#conditionOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperator(XMLParser.ConditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#cycleOperator}.
	 * @param ctx the parse tree
	 */
	void enterCycleOperator(XMLParser.CycleOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#cycleOperator}.
	 * @param ctx the parse tree
	 */
	void exitCycleOperator(XMLParser.CycleOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(XMLParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(XMLParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(XMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(XMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#scriptOpen}.
	 * @param ctx the parse tree
	 */
	void enterScriptOpen(XMLParser.ScriptOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#scriptOpen}.
	 * @param ctx the parse tree
	 */
	void exitScriptOpen(XMLParser.ScriptOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#scriptClose}.
	 * @param ctx the parse tree
	 */
	void enterScriptClose(XMLParser.ScriptCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#scriptClose}.
	 * @param ctx the parse tree
	 */
	void exitScriptClose(XMLParser.ScriptCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#scriptBodyOpen}.
	 * @param ctx the parse tree
	 */
	void enterScriptBodyOpen(XMLParser.ScriptBodyOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#scriptBodyOpen}.
	 * @param ctx the parse tree
	 */
	void exitScriptBodyOpen(XMLParser.ScriptBodyOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#scriptBodyClose}.
	 * @param ctx the parse tree
	 */
	void enterScriptBodyClose(XMLParser.ScriptBodyCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#scriptBodyClose}.
	 * @param ctx the parse tree
	 */
	void exitScriptBodyClose(XMLParser.ScriptBodyCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(XMLParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(XMLParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(XMLParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(XMLParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(XMLParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(XMLParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(XMLParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(XMLParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(XMLParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(XMLParser.MiscContext ctx);
}