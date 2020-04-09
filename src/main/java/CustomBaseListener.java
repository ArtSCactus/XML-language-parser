import tag.ComplexTag;
import tag.ConstantTag;
import tag.SimpleTag;

import java.util.*;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class CustomBaseListener extends XMLParserBaseListener {
    private Stack<ComplexTag> nestingStack;
    private List<ConstantTag> constants;
    private ConstantTag currentTag;



    public CustomBaseListener() {
        this.nestingStack = new Stack<>();
        this.constants = new ArrayList<>();
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
        String name = ctx.tag_name_attr().STRING().getText().replaceAll("\"", "");
        String value = ctx.tag_value_attr().STRING().getText().replaceAll("\"", "");
        List<XMLParser.AttributeContext> attributeContexts = ctx.attribute();
        Map<String, String> attributes = new HashMap<>();
        for (XMLParser.AttributeContext context : attributeContexts) {
            attributes.put(context.Name().getText().trim(), context.STRING().getText().replaceAll("\"", ""));
        }
      //  System.out.println(new SimpleTag(name, value, attributes));
        currentTag = new SimpleTag(name, value, attributes);
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
        String name = ctx.tag_name_attr().STRING().getText().replaceAll("\"", "");
        String value = ctx.tag_value_attr().STRING().getText().replaceAll("\"", "");
        List<XMLParser.AttributeContext> attributeContexts = ctx.attribute();
        Map<String, String> attributes = new HashMap<>();
        for (XMLParser.AttributeContext context : attributeContexts) {
            attributes.put(context.Name().getText().trim(), context.STRING().getText().replaceAll("\"", ""));
        }
        ComplexTag complexTag = new ComplexTag(name, value, attributes);
        nestingStack.push(complexTag);
     //   System.out.println(nestingStack);
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
        ComplexTag complexTag = nestingStack.pop();
        if (nestingStack.isEmpty()){
            constants.add(complexTag);
        }else{
            nestingStack.peek().getChildes().add(complexTag);
        }
        System.out.println(constants.toString());
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
        if (nestingStack.isEmpty()){
            constants.add(currentTag);
        } else {
            nestingStack.peek().getChildes().add(currentTag);
        }
        super.exitSimple_tag(ctx);
    }

    public List<ConstantTag> getConstants(){
        return constants;
    }
}
