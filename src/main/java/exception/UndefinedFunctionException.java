package exception;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class UndefinedFunctionException extends RuntimeException {

    public UndefinedFunctionException() {
    }

    public UndefinedFunctionException(String message) {
        super(message);
    }

    public UndefinedFunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndefinedFunctionException(Throwable cause) {
        super(cause);
    }

    public UndefinedFunctionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
