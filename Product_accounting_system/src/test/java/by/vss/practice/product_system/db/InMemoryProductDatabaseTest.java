package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import by.vss.practice.product_system.exception.ProductDatabaseException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class InMemoryProductDatabaseTest {
    InMemoryProductDatabase inMemoryDatabase;
    Product product;
    List<Product> products;

    @Before
    public void setup() {
        inMemoryDatabase = InMemoryProductDatabase.getInstance();
        product = new Product(1, "product", new BigDecimal("123.1"), Category.MILK, new BigDecimal("0.12"), "description");
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
        InMemoryProductDatabase actual = InMemoryProductDatabase.getInstance();
        assertEquals(inMemoryDatabase, actual);
    }

    @Test
    public void resetDatabase() {
        int expected = 0;
        inMemoryDatabase.addAll(products);
        inMemoryDatabase.resetDatabase();
        int actual = inMemoryDatabase.getDatabaseSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getDatabaseSize() {
        int expected = 0;
        int actual = inMemoryDatabase.getDatabaseSize();
        assertEquals(expected, actual);
    }

    @Test
    public void add() {
        int expected = 1;
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.add(product);
        int actual = inMemoryDatabase.getDatabaseSize();
        assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        int expected = 10;
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.addAll(products);
        int actual = inMemoryDatabase.getDatabaseSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getAll() throws ProductDatabaseException {
        List<Product> expected = products;
        inMemoryDatabase.addAll(products);
        List<Product> actual = inMemoryDatabase.getAll();
        assertEquals(expected, actual);
    }

    @Test(expected = ProductDatabaseException.class)
    public void getAllShouldReturnException() throws ProductDatabaseException {
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.getAll();
    }

    @Test
    public void get() throws ProductDatabaseException {
        Product expected = new Product(1, "product", new BigDecimal("123.1"), Category.MILK, new BigDecimal("0.12"), "description");
        inMemoryDatabase.add(expected);
        Product actual = inMemoryDatabase.get(1L);
        assertEquals(expected, actual);
    }

    @Test(expected = ProductDatabaseException.class)
    public void getShouldReturnException() throws ProductDatabaseException {
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.get(1L);
    }

    @Test
    public void remove() throws ProductDatabaseException {
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.add(product);
        int expected = 0;
        inMemoryDatabase.remove(1L);
        int actual = inMemoryDatabase.getDatabaseSize();
        assertEquals(expected, actual);
    }

    @Test(expected = ProductDatabaseException.class)
    public void removeShouldReturnException() throws ProductDatabaseException {
        inMemoryDatabase.resetDatabase();
        inMemoryDatabase.remove(1L);
    }
}