package by.vss.practice.product_system.exception;

public class ProductFileException extends Exception{
    public ProductFileException(String message) {
        super(message);
    }

    public ProductFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductFileException(Throwable cause) {
        super(cause);
    }
}
