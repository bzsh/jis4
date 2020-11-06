package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;


public class FileProductDatabaseTest {
    FileProductJsonReaderWriter fileDatabase;
    List<Product> products;

    @Autowired
    FileProductJsonReaderWriter fileProductDatabase;

    @Before
    public void setup() {
        products = List.of(
                new Product(1, "product1", new BigDecimal("123.0"), Category.MILK, new BigDecimal("0.1"), "description"),
                new Product(2, "product2", new BigDecimal("123.0"), Category.FISH, new BigDecimal("0.0"), "description"),
                new Product(3, "product3", new BigDecimal("123.0"), Category.FISH, new BigDecimal("0.0"), "description"),
                new Product(4, "product4", new BigDecimal("123.0"), Category.FISH, new BigDecimal("0.2"), "description"),
                new Product(5, "product5", new BigDecimal("123.0"), Category.MILK, new BigDecimal("0.3"), "description"),
                new Product(6, "product6", new BigDecimal("123.0"), Category.FRUIT, new BigDecimal("0.2"), "description"),
                new Product(7, "product7", new BigDecimal("123.0"), Category.FRUIT, new BigDecimal("0.1"), "description"),
                new Product(8, "product8", new BigDecimal("123.0"), Category.ALCOHOL, new BigDecimal("0.05"), "description"),
                new Product(9, "product9", new BigDecimal("123.0"), Category.ALCOHOL, new BigDecimal("0.05"), "description"),
                new Product(10, "product10", new BigDecimal("123.0"), Category.ALCOHOL, new BigDecimal("0.05"), "description"));
    }

    @Test
    public void getInstance() {
        assertEquals(fileDatabase, fileProductDatabase);
    }

    @Test
    public void addAllToFile() throws ProductFileDatabaseException {
        fileDatabase.addAllToFile(products);
        List<Product> actual =  fileDatabase.getAllFromFile();
        assertEquals(products, actual);
    }

    @Test
    public void getAllFromFile() throws ProductFileDatabaseException {
        List<Product> actual =  fileDatabase.getAllFromFile();
        assertEquals(products,actual);
    }
}
