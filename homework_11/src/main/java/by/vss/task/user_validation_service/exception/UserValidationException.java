package by.vss.task.user_validation_service.exception;

public class UserValidationException extends Exception{
    public UserValidationException(String message) {
        super(message);
    }

    public UserValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserValidationException(Throwable cause) {
        super(cause);
    }
}
