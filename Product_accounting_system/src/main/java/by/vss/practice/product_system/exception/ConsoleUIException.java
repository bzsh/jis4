package by.vss.practice.product_system.exception;

public class ConsoleUIException extends Exception{
    public ConsoleUIException(String message) {
        super(message);
    }

    public ConsoleUIException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsoleUIException(Throwable cause) {
        super(cause);
    }
}
