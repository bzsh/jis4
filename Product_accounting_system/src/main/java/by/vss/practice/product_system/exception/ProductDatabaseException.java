package by.vss.practice.product_system.exception;

public class ProductDatabaseException extends Exception{
    public ProductDatabaseException(String message) {
        super(message);
    }

    public ProductDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductDatabaseException(Throwable cause) {
        super(cause);
    }
}
