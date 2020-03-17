/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Walker extends XMLParserBaseListener {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterProgramOpen(XMLParser.ProgramOpenContext ctx) {
        System.out.println("Enter program: "+ctx.getText());
        super.enterProgramOpen(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitProgramOpen(XMLParser.ProgramOpenContext ctx) {
        System.out.println("Exit program:"+ctx.getText());
        super.exitProgramOpen(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterVariables(XMLParser.VariablesContext ctx) {
        System.out.println("Entering in variables: "+ctx.getText());
        super.enterVariables(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitVariables(XMLParser.VariablesContext ctx) {
        System.out.println("Exit variables: "+ctx.getText());
        super.exitVariables(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterProgramBodyOpen(XMLParser.ProgramBodyOpenContext ctx) {
        System.out.println("Entering in program body: "+ctx.getText());
        super.enterProgramBodyOpen(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitProgramBodyOpen(XMLParser.ProgramBodyOpenContext ctx) {
        System.out.println("Exiting program body: "+ctx.getText());
        super.exitProgramBodyOpen(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDocument(XMLParser.DocumentContext ctx) {
        System.out.println("Document: "+ctx.start.getText());
        super.enterDocument(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDocument(XMLParser.DocumentContext ctx) {
      //  System.out.println("Document: "+ctx.getText());
        super.exitDocument(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterProlog(XMLParser.PrologContext ctx) {
        System.out.println("Prolog: "+ctx.getText());
        super.enterProlog(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitProlog(XMLParser.PrologContext ctx) {
        super.exitProlog(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterContent(XMLParser.ContentContext ctx) {
        super.enterContent(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitContent(XMLParser.ContentContext ctx) {
        super.exitContent(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterElement(XMLParser.ElementContext ctx) {
        System.out.println("Element: "+ctx.getText());
        super.enterElement(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitElement(XMLParser.ElementContext ctx) {
        super.exitElement(ctx);
    }
}
