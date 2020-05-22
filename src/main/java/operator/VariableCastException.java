package operator;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class VariableCastException extends RuntimeException {

    public VariableCastException() {
    }

    public VariableCastException(String message) {
        super(message);
    }

    public VariableCastException(String message, Throwable cause) {
        super(message, cause);
    }

    public VariableCastException(Throwable cause) {
        super(cause);
    }

    public VariableCastException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
