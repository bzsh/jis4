package by.vss.practice.product_system.service;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import by.vss.practice.product_system.db.FileProductDatabaseI;
import by.vss.practice.product_system.db.InMemoryProductDatabaseI;
import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.exception.ProductFileException;
import by.vss.practice.product_system.utill.IdCreator;

import java.math.BigDecimal;
import java.util.List;


public class ProductService {
    private final InMemoryProductDatabaseI inMemoryDatabase = InMemoryProductDatabaseI.getInstance();
    private final FileProductDatabaseI fileDatabase = FileProductDatabaseI.getInstance();
    private BigDecimal bigDecimalPrice;
    private BigDecimal bigDecimalDiscount;
    private Category categoryEnum;
    private Product product;

    public void addProductToDatabase(String[] arr) {
        Product product = this.createProduct(arr[0], arr[1], arr[2], arr[3], arr[4]);
        this.inMemoryDatabase.add(product);
    }

    public void deleteProductFromDatabase(long productId) throws ProductDatabaseException {
        this.inMemoryDatabase.remove(productId);
    }

    public String[] getAllProductsInfo() throws ProductDatabaseException {
        List<Product> products = getAllProductsFromDatabase();
        String[] result = new String[products.size()];
        for (int i = 0; i < products.size(); ++i) {
            result[i] = products.get(i).toString();
        }
        return result;
    }

    public String getProductInfoById(long id) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        return product.toString();
    }

    public void updateProductName(Long id, String name) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        if (!product.getName().equals(name) && !name.isEmpty()) {
            product.setName(name);
        } else {
            throw new ProductDatabaseException("The new value is same");
        }
    }

    public void updateProductPrice(Long id, String priceString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        BigDecimal price = new BigDecimal(priceString);
        if (product.getPrice().compareTo(price) != 0) {
            product.setPrice(price);
        } else {
            throw new ProductDatabaseException("The new value is same");
        }
    }

    public void updateProductCategory(Long id, String categoryString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        Category category = Category.valueOf(categoryString);
        if (!product.getCategory().equals(category)) {
            product.setCategory(category);
        } else {
            throw new ProductDatabaseException("The new value is same");
        }
    }

    public void updateProductDiscount(Long id, String discountString) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        BigDecimal discount = new BigDecimal(discountString);
        if (product.getDiscount().compareTo(discount) != 0) {
            product.setDiscount(discount);
        } else {
            throw new ProductDatabaseException("The new value is same");
        }
    }

    public void loadFromFileToMemoryDatabase() throws ProductFileException {
        inMemoryDatabase.addAll(fileDatabase.getAllFromFile());
    }

    public void saveToFileFromMemoryDatabase() throws ProductDatabaseException, ProductFileException {
        fileDatabase.addAllToFile(getAllProductsFromDatabase());
    }

    public void updateProductDescription(Long id, String description) throws ProductDatabaseException {
        Product product = getProductByIdFromDatabase(id);
        if (!product.getDescription().equals(description) && !description.isEmpty()) {
            product.setDescription(description);
        } else {
            throw new ProductDatabaseException("The new value is same");
        }
    }

    private Product createProduct(String name, String price, String category, String discount, String description) {
        bigDecimalPrice = new BigDecimal(price);
        bigDecimalDiscount = new BigDecimal(discount);
        categoryEnum = Category.valueOf(category);
        product = new Product(IdCreator.createId(), name, bigDecimalPrice, categoryEnum, bigDecimalDiscount, description);

        return product;
    }

    private Product getProductByIdFromDatabase(Long id) throws ProductDatabaseException {
        return this.inMemoryDatabase.get(id);
    }

    private List<Product> getAllProductsFromDatabase() throws ProductDatabaseException {
        return this.inMemoryDatabase.getAll();
    }

}
