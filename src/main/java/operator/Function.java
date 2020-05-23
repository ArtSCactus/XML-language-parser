package operator;

import interpreter.VariableStorageImpl;
import interpreter.VariablesStorage;
import tag.Attribute;
import tag.Document;
import tag.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Function implements Command {
    private VariablesStorage vars;
    private List<Command> commandList;

    public Function() {
        vars= new VariableStorageImpl();
        commandList = new ArrayList<>();
    }

    public VariablesStorage getVars() {
        return vars;
    }

    public void setVars(VariablesStorage vars) {
        this.vars = vars;
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute(VariablesStorage storage) {
        addTempVars(vars, storage);
        for (Command cmd : commandList){
            cmd.execute(storage);
        }
        removeTempVars(vars, storage);
    }
    private void addTempVars(VariablesStorage tempVarsStorage, VariablesStorage mainVarsStorage){
        for (Map.Entry<String, Document> entry: tempVarsStorage.getAllDocuments().entrySet()){
            if (!mainVarsStorage.getAllDocuments().containsKey(entry.getKey())){
                mainVarsStorage.getAllDocuments().put(entry.getKey(), entry.getValue());
            }else {
                throw new VariableRedefinitionException("Variable "+entry.getKey()+" was redefined.");
            }
        }
        for (Map.Entry<String, Tag> entry: tempVarsStorage.getAllTags().entrySet()){
            if (!mainVarsStorage.getAllTags().containsKey(entry.getKey())){
                mainVarsStorage.getAllTags().put(entry.getKey(), entry.getValue());
            }else {
                throw new VariableRedefinitionException("Variable "+entry.getKey()+" was redefined.");
            }
        }
        for (Map.Entry<String, Attribute> entry: tempVarsStorage.getAllAttributes().entrySet()){
            if (!mainVarsStorage.getAllAttributes().containsKey(entry.getKey())){
                mainVarsStorage.getAllAttributes().put(entry.getKey(), entry.getValue());
            }else {
                throw new VariableRedefinitionException("Variable "+entry.getKey()+" was redefined.");
            }
        }
    }

    private void removeTempVars(VariablesStorage tempVarsStorage, VariablesStorage mainVarsStorage){
        for (Map.Entry<String, Document> entry: tempVarsStorage.getAllDocuments().entrySet()){
            mainVarsStorage.removeDocument(entry.getKey());
        }
        for (Map.Entry<String, Tag> entry: tempVarsStorage.getAllTags().entrySet()){
            mainVarsStorage.removeTagVariable(entry.getKey());

        }
        for (Map.Entry<String, Attribute> entry: tempVarsStorage.getAllAttributes().entrySet()){
            mainVarsStorage.removeAttribute(entry.getKey());
        }
    }
}
