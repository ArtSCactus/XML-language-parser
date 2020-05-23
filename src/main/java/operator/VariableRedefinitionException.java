package operator;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class VariableRedefinitionException extends RuntimeException {
    public VariableRedefinitionException() {
    }

    public VariableRedefinitionException(String message) {
        super(message);
    }

    public VariableRedefinitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public VariableRedefinitionException(Throwable cause) {
        super(cause);
    }

    public VariableRedefinitionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
