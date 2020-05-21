/**
 * @author ArtSCactus
 * @version 1.0
 */
public class CustomBaseListener extends XMLParserBaseListener {



    public CustomBaseListener() {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterCode(XMLParser.CodeContext ctx) {
        super.enterCode(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterConditionOperator(XMLParser.ConditionOperatorContext ctx) {
        super.enterConditionOperator(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTag_name_attr(XMLParser.Tag_name_attrContext ctx) {
        super.enterTag_name_attr(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTag_value_attr(XMLParser.Tag_value_attrContext ctx) {
        super.enterTag_value_attr(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterSimple_tag(XMLParser.Simple_tagContext ctx) {
        super.enterSimple_tag(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterComplex_tag(XMLParser.Complex_tagContext ctx) {
        super.enterComplex_tag(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitComplex_tag_close(XMLParser.Complex_tag_closeContext ctx) {
        super.exitComplex_tag_close(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitSimple_tag(XMLParser.Simple_tagContext ctx) {
        super.exitSimple_tag(ctx);
    }

}
