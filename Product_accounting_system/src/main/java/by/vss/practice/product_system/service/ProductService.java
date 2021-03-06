package by.vss.practice.product_system.service;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import by.vss.practice.product_system.db.FileProductDatabase;
import by.vss.practice.product_system.db.InMemoryProductDatabase;
import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;
import by.vss.practice.product_system.utill.IdCreator;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static by.vss.practice.product_system.constant.error.ErrorHolder.*;


public class ProductService implements ProductServiceInterface {
    private final InMemoryProductDatabase inMemoryDatabase = InMemoryProductDatabase.getInstance();
    private final FileProductDatabase fileDatabase = FileProductDatabase.getInstance();

    @Override
    public void addProductToDatabase(String[] arr) {
        Product product = this.createProduct(arr[0], arr[1], arr[2], arr[3], arr[4]);
        this.inMemoryDatabase.add(product);
    }

    @Override
    public void deleteProductFromDatabase(long productId) throws ProductDatabaseException {
        this.inMemoryDatabase.remove(productId);
    }

    @Override
    public List<String> getAllProductsInfo() throws ProductDatabaseException {
        List<Product> products = getAllProductsFromDatabase();
        return products.stream().map(this::getProductToViewString).collect(Collectors.toList());
    }

    @Override
    public List<String> getAllProductsInfoByCategory(String categoryString) throws ProductDatabaseException {
        Category category = Category.valueOf(categoryString);
        List<Product> products = getAllProductsFromDatabase();
        List<String> result = products.stream()
                .filter(a -> a.getCategory() == category)
                .map(this::getProductToViewString)
                .collect(Collectors.toList());
        if (!result.isEmpty()) {
            return result;
        } else {
            throw new ProductDatabaseException(GET_PRODUCT_BY_CATEGORY_ERROR_MESSAGE);
        }
    }

    @Override
    public String getProductInfoById(long id) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        return getProductToViewString(product);
    }

    @Override
    public void updateAllProductsDiscountsByCategory(String categoryString, String discountString) throws ProductDatabaseException {
        Category category = Category.valueOf(categoryString);
        BigDecimal discount = new BigDecimal(discountString);
        List<Product> products = getAllProductsFromDatabase().stream()
                .filter(a -> a.getCategory() == category)
                .peek(a -> a.setDiscount(discount))
                .collect(Collectors.toList());
        if (products.isEmpty()) {
            throw new ProductDatabaseException(UPDATE_ALL_BY_CATEGORY_ERROR_MESSAGE);
        }
    }

    @Override
    public void updateProductName(Long id, String name) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        if (!product.getName().equals(name) && !name.isEmpty()) {
            product.setName(name);
        } else {
            throw new ProductDatabaseException(UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE);
        }
    }

    @Override
    public void updateProductPrice(Long id, String priceString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        BigDecimal price = new BigDecimal(priceString);
        if (product.getPrice().compareTo(price) != 0) {
            product.setPrice(price);
        } else {
            throw new ProductDatabaseException(UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE);
        }
    }

    @Override
    public void updateProductCategory(Long id, String categoryString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        Category category = Category.valueOf(categoryString);
        if (!product.getCategory().equals(category)) {
            product.setCategory(category);
        } else {
            throw new ProductDatabaseException(UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE);
        }
    }

    @Override
    public void updateProductDiscount(Long id, String discountString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        BigDecimal discount = new BigDecimal(discountString);
        if (product.getDiscount().compareTo(discount) != 0) {
            product.setDiscount(discount);
        } else {
            throw new ProductDatabaseException(UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE);
        }
    }

    @Override
    public void loadFromFileToMemoryDatabase() throws ProductFileDatabaseException {
        inMemoryDatabase.addAll(fileDatabase.getAllFromFile());
    }

    @Override
    public void saveToFileFromMemoryDatabase() throws ProductDatabaseException, ProductFileDatabaseException {
        fileDatabase.addAllToFile(getAllProductsFromDatabase());
    }

    @Override
    public void updateProductDescription(Long id, String description) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        if (!product.getDescription().equals(description) && !description.isEmpty()) {
            product.setDescription(description);
        } else {
            throw new ProductDatabaseException(UPDATE_VALUE_EXCEPTION_ERROR_MESSAGE);
        }
    }

    private Product createProduct(String name, String price, String category, String discount, String description) {
        BigDecimal bigDecimalPrice = new BigDecimal(price);
        BigDecimal bigDecimalDiscount = new BigDecimal(discount);
        Category categoryEnum = Category.valueOf(category);
        return new Product(IdCreator.createId(), name, bigDecimalPrice, categoryEnum, bigDecimalDiscount, description);
    }

    private Product getProductByIdFromDatabase(Long id) throws ProductDatabaseException {
        return this.inMemoryDatabase.get(id);
    }

    private List<Product> getAllProductsFromDatabase() throws ProductDatabaseException {
        return this.inMemoryDatabase.getAll();
    }

    private String getProductToViewString(Product product) {
        String discount = "";
        if (product.getDiscount().compareTo(new BigDecimal("0.0")) >= 0) {
            discount = "Discount: " + (product.getDiscount().multiply(new BigDecimal("100")).toString()) + "%" + "\n";
        }
        return "\nProduct information:\n" +
                "Id: " + product.getId() + "\n" +
                "Name: " + product.getName() + "\n" +
                "Category: " + product.getCategory().toString() + "\n" +
                "Description: " + product.getDescription() + "\n" +
                discount +
                "Actual price: " + product.getPrice().toString();
    }
}
