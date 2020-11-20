package by.vss.practice.product_system.service;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProductServiceTest {

    ProductService service;
    Product product;

    @Before
    public void setup() {
        service = new ProductService();
        product = new Product(1, "product", new BigDecimal("0.123"), Category.MILK, new BigDecimal("0.01"), "description");
    }

    @Test
    public void addProductToDatabase() {
    }

    @Test
    public void deleteProductFromDatabase() {
    }

    @Test
    public void getAllProductsInfo() {
    }

    @Test
    public void getAllProductsInfoByCategory() {
    }

    @Test
    public void getProductInfoById() {
    }

    @Test
    public void updateProductName() {
    }

    @Test
    public void updateProductPrice() {
    }

    @Test
    public void updateProductCategory() {
    }

    @Test
    public void updateProductDiscount() {
    }

    @Test
    public void loadFromFileToMemoryDatabase() {
    }

    @Test
    public void saveToFileFromMemoryDatabase() {
    }

    @Test
    public void updateProductDescription() {
    }
}