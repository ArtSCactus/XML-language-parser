
import builder.MainConstructor;
import interpreter.VariableStorageImpl;
import interpreter.VariablesStorage;
import operator.Command;
import operator.ConditionOperator;
import org.antlr.v4.runtime.tree.ParseTree;
import tag.*;

import java.util.*;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Visitor extends XMLParserBaseVisitor<Tag> {
    private Stack<ComplexTag> nestingStack;
    private Stack<ConditionOperator> conditionOperatorsStack;
    private List<Tag> constants;
    private MainConstructor mainConstructor;
    private VariablesStorage variablesStorage;

    @Override
    public Tag visitConstants(XMLParser.ConstantsContext ctx) {
        variablesStorage = new VariableStorageImpl();
        for (XMLParser.DocumentVariableContext doc :ctx.documentVariable()){
            variablesStorage.addDocument(doc.docVariableName().DOCUMENT_WORD().getText(), new DefaultDocument(doc.docVariableValue().DOCUMENT_WORD().getText()));
        }
        for (XMLParser.TagVariableContext tag : ctx.tagVariable()){
            variablesStorage.addTagVariable(tag.tagVariableName().TAG_WORD().getText(), new ComplexTag(tag.tagVariableName().TAG_WORD().getText()));
        }
        for (XMLParser.AttrVariableContext attr : ctx.attrVariable()){
            variablesStorage.addAttribute(attr.ATTRIBUTE_WORD().getText(), new AttributeImpl(
                    attr.attrVariableValue().attrName().ATTRIBUTE_WORD().getText(),
                    attr.attrVariableValue().attrValue().ATTRIBUTE_WORD().getText()));
        }
        return super.visitConstants(ctx);
    }

    @Override
    public Tag visitScript(XMLParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }

    @Override
    public Tag visitCode(XMLParser.CodeContext ctx) {
        List<XMLParser.AppendOperatorContext> commands = ctx.appendOperator();
        List<Command> parsedCommands = new ArrayList<>();
        for (XMLParser.AppendOperatorContext curCtx : commands){
          //  parsedCommands.add(new Append())
        }
        return super.visitCode(ctx);
    }

    @Override
    public Tag visitConditionOperator(XMLParser.ConditionOperatorContext ctx) {
        return super.visitConditionOperator(ctx);
    }

    @Override
    public Tag visitTagVariable(XMLParser.TagVariableContext ctx) {
        variablesStorage.addTagVariable(ctx.tagVariableName().TAG_WORD().getText(),
                new ComplexTag(ctx.tagVariableValue().TAG_WORD().getText()));
        return super.visitTagVariable(ctx);
    }

    @Override
    public Tag visitAttrVariable(XMLParser.AttrVariableContext ctx) {
        return super.visitAttrVariable(ctx);
    }

    public Visitor(){
            this.nestingStack = new Stack<>();
            this.constants = new ArrayList<>();
            mainConstructor = new MainConstructor();
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
    public Tag visitSimple_tag(XMLParser.Simple_tagContext ctx) {
        String name = ctx.tag_name_attr().STRING().getText().replaceAll("\"", "");
        String value = ctx.tag_value_attr().STRING().getText().replaceAll("\"", "");
        List<XMLParser.AttributeContext> attributeContexts = ctx.attribute();
        Map<String, String> attributes = new HashMap<>();
        for (XMLParser.AttributeContext context : attributeContexts) {
            attributes.put(context.Name().getText().trim(), context.STRING().getText().replaceAll("\"", ""));
        }
        Tag simpleTag = new SimpleTag(name, value, attributes);
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
    public Tag visitComplex_tag(XMLParser.Complex_tagContext ctx) {
        List<XMLParser.TagContext> innerTags = ctx.tag();
        List<Tag> childs = new ArrayList<>();
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
    public Tag visitComplex_tag_close(XMLParser.Complex_tag_closeContext ctx) {
        ComplexTag complexTag = nestingStack.pop();
        if (nestingStack.isEmpty()){
            constants.add(complexTag);
        }else{
            nestingStack.peek().getChildes().add(complexTag);
        }
        return complexTag;
    }

    @Override
    public Tag visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Tag visitAppendOperator(XMLParser.AppendOperatorContext ctx) {
        System.out.println("Append operator call. Args: "+ctx.appendOperatorParentName().APPEND_OPERATOR_WORD().getText()+" to "+
                ctx.appendOperatorChildName().APPEND_OPERATOR_WORD().getText());
        return super.visitAppendOperator(ctx);
    }

    public List<Tag> getConstants(){
        return constants;
    }

}
