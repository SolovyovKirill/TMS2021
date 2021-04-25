package Homework9.com;

public class StartException extends Exception {
    public StartException() {
    }

    public StartException(String message) {
        super(message);
    }

    public StartException(String message, Throwable cause) {
        super(message, cause);
    }

    public StartException(Throwable cause) {
        super(cause);
    }

    public StartException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
