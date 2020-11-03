package by.vss.practice.product_system.constant.error;

public final class ErrorHolder {
    public static final String UPDATE_ALL_BY_CATEGORY_ERROR_MESSAGE = "There no products with such category in database to update";
    public static final String UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE = "The new value is same";
    public static final String JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE = "Error json serialization in FileDatabase";
    public static final String GET_ALL_PRODUCTS_ERROR_MESSAGE = "There are no any products in database!";
    public static final String GET_PRODUCT_BY_ID_ERROR_MESSAGE = "There are no products with such Id";
    public static final String GET_PRODUCT_BY_CATEGORY_ERROR_MESSAGE = "There are no products with such Category";
    public static final String REMOVE_PRODUCT_BY_ID_ERROR_MESSAGE = "There are no products with such Id to remove";

    private ErrorHolder() {
    }
}
