// Generated from D:/Projects/XML-language-parser/src/main/resources\XMLParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(XMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(XMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(XMLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#programOpen}.
	 * @param ctx the parse tree
	 */
	void enterProgramOpen(XMLParser.ProgramOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#programOpen}.
	 * @param ctx the parse tree
	 */
	void exitProgramOpen(XMLParser.ProgramOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(XMLParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(XMLParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#programBodyOpen}.
	 * @param ctx the parse tree
	 */
	void enterProgramBodyOpen(XMLParser.ProgramBodyOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#programBodyOpen}.
	 * @param ctx the parse tree
	 */
	void exitProgramBodyOpen(XMLParser.ProgramBodyOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#programClose}.
	 * @param ctx the parse tree
	 */
	void enterProgramClose(XMLParser.ProgramCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#programClose}.
	 * @param ctx the parse tree
	 */
	void exitProgramClose(XMLParser.ProgramCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#programBodyClose}.
	 * @param ctx the parse tree
	 */
	void enterProgramBodyClose(XMLParser.ProgramBodyCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#programBodyClose}.
	 * @param ctx the parse tree
	 */
	void exitProgramBodyClose(XMLParser.ProgramBodyCloseContext ctx);
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
	 * Enter a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(XMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(XMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(XMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(XMLParser.ElementContext ctx);
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