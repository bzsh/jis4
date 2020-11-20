package by.vss.practice.product_system.service;

import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;

import java.util.List;

public interface ProductServiceInterface {

    String getProductInfoById(long id) throws ProductDatabaseException;

    List<String> getAllProductsInfo() throws ProductDatabaseException;

    List<String> getAllProductsInfoByCategory(String category) throws ProductDatabaseException;

    void addProductToDatabase(String[] arr);

    void deleteProductFromDatabase(long productId) throws ProductDatabaseException;

    void updateAllProductsDiscountsByCategory(String categoryString, String discountString) throws ProductDatabaseException;

    void updateProductName(Long id, String name) throws ProductDatabaseException;

    void updateProductPrice(Long id, String priceString) throws ProductDatabaseException;

    void updateProductCategory(Long id, String categoryString) throws ProductDatabaseException;

    void updateProductDiscount(Long id, String discountString) throws ProductDatabaseException;

    void loadFromFileToMemoryDatabase() throws ProductFileDatabaseException;

    void saveToFileFromMemoryDatabase() throws ProductDatabaseException, ProductFileDatabaseException;

    void updateProductDescription(Long id, String description) throws ProductDatabaseException;
}
