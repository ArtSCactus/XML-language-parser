package operator;

import interpreter.VariablesStorage;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public interface Command {
    void execute(VariablesStorage storage);
}
