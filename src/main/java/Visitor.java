
import org.antlr.v4.runtime.tree.ParseTree;
import tag.ComplexTag;
import tag.ConstantTag;
import tag.SimpleTag;

import java.util.*;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Visitor extends XMLParserBaseVisitor<ConstantTag> {
    private Stack<ComplexTag> nestingStack;
    private List<ConstantTag> constants;

    public Visitor(){
            this.nestingStack = new Stack<>();
            this.constants = new ArrayList<>();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public ConstantTag visitSimple_tag(XMLParser.Simple_tagContext ctx) {
        String name = ctx.tag_name_attr().STRING().getText().replaceAll("\"", "");
        String value = ctx.tag_value_attr().STRING().getText().replaceAll("\"", "");
        List<XMLParser.AttributeContext> attributeContexts = ctx.attribute();
        Map<String, String> attributes = new HashMap<>();
        for (XMLParser.AttributeContext context : attributeContexts) {
            attributes.put(context.Name().getText().trim(), context.STRING().getText().replaceAll("\"", ""));
        }
        ConstantTag simpleTag = new SimpleTag(name, value, attributes);
        if (nestingStack.isEmpty()){
            constants.add(simpleTag);
        } else {
            nestingStack.peek().getChildes().add(simpleTag);
        }
        return simpleTag;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public ConstantTag visitComplex_tag(XMLParser.Complex_tagContext ctx) {
        List<XMLParser.TagContext> innerTags = ctx.tag();
        List<ConstantTag> childs = new ArrayList<>();
        String name = ctx.tag_name_attr().STRING().getText().replaceAll("\"", "");
        String value = ctx.tag_value_attr().STRING().getText().replaceAll("\"", "");
        List<XMLParser.AttributeContext> attributeContexts = ctx.attribute();
        Map<String, String> attributes = new HashMap<>();
        for (XMLParser.AttributeContext context : attributeContexts) {
            attributes.put(context.Name().getText().trim(), context.STRING().getText().replaceAll("\"", ""));
        }
        ComplexTag complexTag = new ComplexTag(name, value, attributes);
        complexTag.setChildes(childs);
        nestingStack.push(complexTag);
        innerTags.forEach(tag ->{
            XMLParser.Complex_tagContext complexTagContext = tag.complex_tag();
            XMLParser.Simple_tagContext simpleTag = tag.simple_tag();
            if (complexTagContext != null){
                visitComplex_tag(complexTagContext);
            } else {
                visitSimple_tag(simpleTag);
            }
        });
        nestingStack.pop();
        if (nestingStack.isEmpty()){
            constants.add(complexTag);
        }else{
            nestingStack.peek().getChildes().add(complexTag);
        }
        return complexTag;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public ConstantTag visitComplex_tag_close(XMLParser.Complex_tag_closeContext ctx) {
        ComplexTag complexTag = nestingStack.pop();
        if (nestingStack.isEmpty()){
            constants.add(complexTag);
        }else{
            nestingStack.peek().getChildes().add(complexTag);
        }
        return complexTag;
    }

    @Override
    public ConstantTag visit(ParseTree tree) {
        return super.visit(tree);
    }

    public List<ConstantTag> getConstants(){
        return constants;
    }

}
