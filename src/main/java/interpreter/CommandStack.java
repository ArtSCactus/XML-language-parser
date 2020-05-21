package interpreter;

import operator.Command;

import java.util.Stack;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class CommandStack {
private Stack<Command> commandStack;

    public CommandStack(Stack<Command> commandStack) {
        this.commandStack = commandStack;
    }

    public CommandStack() {
        this.commandStack = new Stack<>();
    }

    public Command nextCommand(){
        return commandStack.pop();
    }

    public void add(Command command){
        commandStack.add(command);
    }

    public void remove(Command command){
        commandStack.remove(command);
    }
}
