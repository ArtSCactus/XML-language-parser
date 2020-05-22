import builder.MainConstructor;
import interpreter.VariableStorageImpl;
import interpreter.VariablesStorage;
import operator.AppendOperator;
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
    private Stack<ConditionOperator> conditionNesting;



    @Override
    public Tag visitConstants(XMLParser.ConstantsContext ctx) {
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
        conditionNesting = new Stack<>();
        variablesStorage = new VariableStorageImpl();
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
        if (conditionNesting == null){
            conditionNesting = new Stack<>();
        }
        ConditionOperator operator = new ConditionOperator();
        operator.setFirstArg(ctx.CONDITION_WORD(0).getText());
        operator.setSecondArg(ctx.CONDITION_WORD(1).getText());
        conditionNesting.push(operator);
        return super.visitConditionOperator(ctx);
    }

    @Override
    public Tag visitIfCondition(XMLParser.IfConditionContext ctx) {
        ConditionOperator operator = conditionNesting.peek();
        List<XMLParser.VariableContext> varContexts = ctx.insideBlockCode().variable();
        List<XMLParser.OperatorContext> operatorContexts = ctx.insideBlockCode().operator();
        for (XMLParser.VariableContext context : varContexts){
            if (!context.attrVariable().isEmpty()){
                operator.addAttribute(context.attrVariable().ATTRIBUTE_WORD().getText(),
                        new AttributeImpl(
                                context.attrVariable().attrVariableValue().attrName().ATTRIBUTE_WORD().getText(),
                                context.attrVariable().attrVariableValue().attrValue().ATTRIBUTE_WORD().getText()));
                continue;
            }
            if (!context.documentVariable().isEmpty()){
                operator.addDocument(context.documentVariable().docVariableName().DOCUMENT_WORD().getText(), new DefaultDocument(context.documentVariable().docVariableValue().DOCUMENT_WORD().getText()));
                continue;
            }
            if (!context.tagVariable().isEmpty()){
                operator.addTag(context.tagVariable().tagVariableName().TAG_WORD().getText(),
                        new ComplexTag(context.tagVariable().tagVariableValue().TAG_WORD().getText()));
                continue;
            }
        }
        for (XMLParser.OperatorContext operatorContext : operatorContexts){
            if (!operatorContext.appendOperator().isEmpty()){
                operator.addIfCommand(new AppendOperator(operatorContext.appendOperator().appendOperatorParentName().APPEND_OPERATOR_WORD().getText(),
                        operatorContext.appendOperator().appendOperatorChildName().APPEND_OPERATOR_WORD().getText()));
            }
        }
        return super.visitIfCondition(ctx);
    }

    @Override
    public Tag visitConditionExitFlag(XMLParser.ConditionExitFlagContext ctx) {
        ConditionOperator operator = conditionNesting.pop();
        variablesStorage.applyCommand(operator);
        return super.visitConditionExitFlag(ctx);
    }

    @Override
    public Tag visitElseCondition(XMLParser.ElseConditionContext ctx) {
        ConditionOperator operator = conditionNesting.peek();
        List<XMLParser.VariableContext> varContexts = ctx.insideBlockCode().variable();
        List<XMLParser.OperatorContext> operatorContexts = ctx.insideBlockCode().operator();
        for (XMLParser.VariableContext context : varContexts){
            if (!context.attrVariable().isEmpty()){
                operator.addAttribute(context.attrVariable().ATTRIBUTE_WORD().getText(),
                        new AttributeImpl(
                                context.attrVariable().attrVariableValue().attrName().ATTRIBUTE_WORD().getText(),
                                context.attrVariable().attrVariableValue().attrValue().ATTRIBUTE_WORD().getText()));
                continue;
            }
            if (!context.documentVariable().isEmpty()){
                operator.addDocument(context.documentVariable().docVariableName().DOCUMENT_WORD().getText(), new DefaultDocument(context.documentVariable().docVariableValue().DOCUMENT_WORD().getText()));
                continue;
            }
            if (!context.tagVariable().isEmpty()){
                operator.addTag(context.tagVariable().tagVariableName().TAG_WORD().getText(),
                        new ComplexTag(context.tagVariable().tagVariableValue().TAG_WORD().getText()));
                continue;
            }
        }
        for (XMLParser.OperatorContext operatorContext : operatorContexts){
            if (!operatorContext.appendOperator().isEmpty()){
                operator.addElseCommand(new AppendOperator(operatorContext.appendOperator().appendOperatorParentName().APPEND_OPERATOR_WORD().getText(),
                        operatorContext.appendOperator().appendOperatorChildName().APPEND_OPERATOR_WORD().getText()));
            }
        }
        return super.visitElseCondition(ctx);
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
        String parent = ctx.appendOperatorParentName().APPEND_OPERATOR_WORD().getText();
        String child = ctx.appendOperatorChildName().APPEND_OPERATOR_WORD().getText();
        System.out.println("Append operator call. Args: child->"+child+" to parent->"+
                parent);
        if (conditionNesting.isEmpty()){
            variablesStorage.applyCommand(new AppendOperator(parent, child));
        }
        return super.visitAppendOperator(ctx);
    }

    public List<Tag> getConstants(){
        return constants;
    }

    public Map<String, Document> getDocuments(){
        return variablesStorage.getAllDocuments();
    }

}
