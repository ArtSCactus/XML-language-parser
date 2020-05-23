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
	 * Enter a parse tree produced by {@link XMLParser#tagVariable}.
	 * @param ctx the parse tree
	 */
	void enterTagVariable(XMLParser.TagVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tagVariable}.
	 * @param ctx the parse tree
	 */
	void exitTagVariable(XMLParser.TagVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#documentVariable}.
	 * @param ctx the parse tree
	 */
	void enterDocumentVariable(XMLParser.DocumentVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#documentVariable}.
	 * @param ctx the parse tree
	 */
	void exitDocumentVariable(XMLParser.DocumentVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attrVariable}.
	 * @param ctx the parse tree
	 */
	void enterAttrVariable(XMLParser.AttrVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attrVariable}.
	 * @param ctx the parse tree
	 */
	void exitAttrVariable(XMLParser.AttrVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#tagVariableName}.
	 * @param ctx the parse tree
	 */
	void enterTagVariableName(XMLParser.TagVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tagVariableName}.
	 * @param ctx the parse tree
	 */
	void exitTagVariableName(XMLParser.TagVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#tagVariableValue}.
	 * @param ctx the parse tree
	 */
	void enterTagVariableValue(XMLParser.TagVariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#tagVariableValue}.
	 * @param ctx the parse tree
	 */
	void exitTagVariableValue(XMLParser.TagVariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#docVariableName}.
	 * @param ctx the parse tree
	 */
	void enterDocVariableName(XMLParser.DocVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#docVariableName}.
	 * @param ctx the parse tree
	 */
	void exitDocVariableName(XMLParser.DocVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#docVariableValue}.
	 * @param ctx the parse tree
	 */
	void enterDocVariableValue(XMLParser.DocVariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#docVariableValue}.
	 * @param ctx the parse tree
	 */
	void exitDocVariableValue(XMLParser.DocVariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attrVariableValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrVariableValue(XMLParser.AttrVariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attrVariableValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrVariableValue(XMLParser.AttrVariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(XMLParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(XMLParser.AttrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(XMLParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(XMLParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(XMLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(XMLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(XMLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(XMLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#appendOperator}.
	 * @param ctx the parse tree
	 */
	void enterAppendOperator(XMLParser.AppendOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#appendOperator}.
	 * @param ctx the parse tree
	 */
	void exitAppendOperator(XMLParser.AppendOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#appendOperatorChildName}.
	 * @param ctx the parse tree
	 */
	void enterAppendOperatorChildName(XMLParser.AppendOperatorChildNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#appendOperatorChildName}.
	 * @param ctx the parse tree
	 */
	void exitAppendOperatorChildName(XMLParser.AppendOperatorChildNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#appendOperatorParentName}.
	 * @param ctx the parse tree
	 */
	void enterAppendOperatorParentName(XMLParser.AppendOperatorParentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#appendOperatorParentName}.
	 * @param ctx the parse tree
	 */
	void exitAppendOperatorParentName(XMLParser.AppendOperatorParentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#appendOperatorToWord}.
	 * @param ctx the parse tree
	 */
	void enterAppendOperatorToWord(XMLParser.AppendOperatorToWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#appendOperatorToWord}.
	 * @param ctx the parse tree
	 */
	void exitAppendOperatorToWord(XMLParser.AppendOperatorToWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(XMLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(XMLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#functionDeclarationEnd}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationEnd(XMLParser.FunctionDeclarationEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#functionDeclarationEnd}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationEnd(XMLParser.FunctionDeclarationEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#functionRun}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRun(XMLParser.FunctionRunContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#functionRun}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRun(XMLParser.FunctionRunContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(XMLParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(XMLParser.ArgsContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#conditionType}.
	 * @param ctx the parse tree
	 */
	void enterConditionType(XMLParser.ConditionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#conditionType}.
	 * @param ctx the parse tree
	 */
	void exitConditionType(XMLParser.ConditionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(XMLParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(XMLParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#conditionExitFlag}.
	 * @param ctx the parse tree
	 */
	void enterConditionExitFlag(XMLParser.ConditionExitFlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#conditionExitFlag}.
	 * @param ctx the parse tree
	 */
	void exitConditionExitFlag(XMLParser.ConditionExitFlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(XMLParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(XMLParser.ElseConditionContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#insideBlockCode}.
	 * @param ctx the parse tree
	 */
	void enterInsideBlockCode(XMLParser.InsideBlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#insideBlockCode}.
	 * @param ctx the parse tree
	 */
	void exitInsideBlockCode(XMLParser.InsideBlockCodeContext ctx);
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