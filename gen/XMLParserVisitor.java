// Generated from D:/Projects/XML-language-parser/src/main/resources\XMLParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XMLParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(XMLParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#tag_name_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_name_attr(XMLParser.Tag_name_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#tag_value_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_value_attr(XMLParser.Tag_value_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#simple_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_tag(XMLParser.Simple_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#complex_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_tag(XMLParser.Complex_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#complex_tag_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_tag_close(XMLParser.Complex_tag_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#tagVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagVariable(XMLParser.TagVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#documentVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentVariable(XMLParser.DocumentVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attrVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVariable(XMLParser.AttrVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#tagVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagVariableName(XMLParser.TagVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#tagVariableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagVariableValue(XMLParser.TagVariableValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#docVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocVariableName(XMLParser.DocVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#docVariableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocVariableValue(XMLParser.DocVariableValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attrVariableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVariableValue(XMLParser.AttrVariableValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(XMLParser.AttrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(XMLParser.AttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#appendOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendOperator(XMLParser.AppendOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#appendOperatorChildName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendOperatorChildName(XMLParser.AppendOperatorChildNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#appendOperatorParentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendOperatorParentName(XMLParser.AppendOperatorParentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#appendOperatorToWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendOperatorToWord(XMLParser.AppendOperatorToWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(XMLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#conditionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperator(XMLParser.ConditionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#conditionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionType(XMLParser.ConditionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(XMLParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(XMLParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(XMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#scriptOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptOpen(XMLParser.ScriptOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#scriptClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptClose(XMLParser.ScriptCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#scriptBodyOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBodyOpen(XMLParser.ScriptBodyOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#scriptBodyClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBodyClose(XMLParser.ScriptBodyCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(XMLParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog(XMLParser.PrologContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(XMLParser.MiscContext ctx);
}