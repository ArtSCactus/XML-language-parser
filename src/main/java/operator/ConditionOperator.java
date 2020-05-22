package operator;

import interpreter.VariableStorageImpl;
import interpreter.VariablesStorage;
import tag.Attribute;
import tag.Document;
import tag.Tag;
import tag.Variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class ConditionOperator implements Command {
    private String firstArg;
    private String secondArg;
    private VariablesStorage vars;
    private Stack<Command> ifCommands;
    private Stack<Command> elseCommands;

    public ConditionOperator(VariablesStorage vars, Stack<Command> ifCommands, Stack<Command> elseCommands) {
        this.vars = vars;
        this.ifCommands = ifCommands;
        this.elseCommands = elseCommands;
    }

    public ConditionOperator() {
        vars = new VariableStorageImpl();
        ifCommands = new Stack<>();
        elseCommands= new Stack<>();
    }

    public String getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(String firstArg) {
        this.firstArg = firstArg;
    }

    public String getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(String secondArg) {
        this.secondArg = secondArg;
    }

    public Stack<Command> getIfCommands() {
        return ifCommands;
    }

    public void setIfCommands(Stack<Command> ifCommands) {
        this.ifCommands = ifCommands;
    }

    public Stack<Command> getElseCommands() {
        return elseCommands;
    }

    public void setElseCommands(Stack<Command> elseCommands) {
        this.elseCommands = elseCommands;
    }

    public void addTag(String name, Tag tag){
        vars.addTagVariable(name, tag);
    }
    public void addDocument(String name, Document document){
        vars.addDocument(name, document);
    }
    public void addAttribute(String name, Attribute attribute){
        vars.addAttribute(name, attribute);
    }

    public void addIfCommand(Command command){
        ifCommands.push(command);
    }

    public void addElseCommand(Command command){
        elseCommands.push(command);
    }

    @Override
    public void execute(VariablesStorage storage) {
        storage.addAllAttributes(vars.getAllAttributes());
        storage.addAllDocuments(vars.getAllDocuments());
        storage.addAllTags(vars.getAllTags());
        if (storage.getVariable(firstArg).equals(storage.getVariable(secondArg))){
            for (Command cmd : ifCommands){
                cmd.execute(storage);
            }
        } else {
            for (Command cmd : elseCommands){
                cmd.execute(storage);
            }
        }
        storage.removeTemporaryAttributeVariables(vars.getAllAttributes());
        storage.removeTemporaryTagVariables(vars.getAllTags());
        storage.removeTemporaryDocumentVariables(vars.getAllDocuments());
    }
}
