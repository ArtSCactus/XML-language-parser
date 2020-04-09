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
	 * Visit a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(XMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(XMLParser.ElementContext ctx);
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