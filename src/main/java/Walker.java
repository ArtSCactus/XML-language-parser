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
    public void enterDocument(XMLParser.DocumentContext ctx) {
        System.out.println("Document start: "+ctx.start.getText());
        System.out.println("Document: "+ctx.children);
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
        System.out.println("Document end: "+ctx.stop.getText());
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
        System.out.println("Prolog start: "+ctx.start.getText());
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
        System.out.println("Prolog end: "+ctx.stop.getText());
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
        System.out.println("Content start: "+ctx.start.getText());
        System.out.println("Content: "+ctx.children);
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
        System.out.println("Content start: "+ctx.stop.getText());
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
        System.out.println("Element start: "+ctx.stop.getText());
        System.out.println("Content: "+ctx.children);
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
        System.out.println("Element end: "+ctx.stop.getText());
        super.exitElement(ctx);
    }
}
