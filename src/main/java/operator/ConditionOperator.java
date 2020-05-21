package operator;

import interpreter.VariablesStorage;

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
    private Map<String, Object> vars;
    private Stack<Command> ifCommands;
    private Stack<Command> elseCommands;

    public ConditionOperator(Map<String, Object> vars, Stack<Command> ifCommands, Stack<Command> elseCommands) {
        this.vars = vars;
        this.ifCommands = ifCommands;
        this.elseCommands = elseCommands;
    }

    public ConditionOperator() {
        vars = new HashMap<>();
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

    public Map<String, Object> getVars() {
        return vars;
    }

    public void setVars(Map<String, Object> vars) {
        this.vars = vars;
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

    public void addVar(String name, Object value){
        vars.put(name, value);
    }

    public void removeVar(String name){
        vars.remove(name);
    }

    @Override
    public void execute(VariablesStorage storage) {
        if (storage.getVariable(firstArg).equals(storage.getVariable(secondArg))){
            for (Command cmd : ifCommands){
                cmd.execute(storage);
            }
        } else {
            for (Command cmd : elseCommands){
                cmd.execute(storage);
            }
        }
    }
}
