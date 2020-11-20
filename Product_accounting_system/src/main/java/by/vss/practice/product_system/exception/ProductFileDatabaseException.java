package by.vss.practice.product_system.exception;

public class ProductFileDatabaseException extends Exception{
    public ProductFileDatabaseException(String message) {
        super(message);
    }

    public ProductFileDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductFileDatabaseException(Throwable cause) {
        super(cause);
    }
}
