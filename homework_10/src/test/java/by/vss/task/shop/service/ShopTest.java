package by.vss.task.shop.service;

import by.vss.task.shop.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    List<Product> products;
    Shop shop;

    @Before
    public void setup() {
        products = new ArrayList<>();
        products.add(new Product("Apple", new BigDecimal(178)));
        products.add(new Product("Potato", new BigDecimal(113)));
        products.add(new Product("Peach", new BigDecimal(214)));
        shop = new Shop((products));
    }

    @Test
    public void add() {
        shop.add(new Product("Cherry", new BigDecimal(78)));
        int expected = 4;
        int actual = shop.getProductList().size();
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        shop.remove(new Product("Potato", new BigDecimal(113)));
        int expected = 2;
        int actual = shop.getProductList().size();
        assertEquals(expected, actual);
    }


    @Test
    public void findProductByName() {
        Product expected = new Product("Potato", new BigDecimal(113));
        Product actual = shop.findProductByName("potato");
        assertEquals(expected, actual);
    }

    @Test
    public void findProductByNameShouldReturnNull() {
        Product actual = shop.findProductByName("Onion");
        assertNull(actual);
    }

    @Test
    public void findProductsByCostRange() {
        BigDecimal minRange = new BigDecimal(100);
        BigDecimal maxRange = new BigDecimal(200);
        List<Product> expected = Arrays.asList(
                new Product("Apple", new BigDecimal(178)),
                new Product("Potato", new BigDecimal(113)));
        List<Product> actual = shop.findProductsByCostRange(minRange, maxRange);
        assertEquals(expected, actual);
    }

    @Test
    public void findProductsByCostRangeShouldNotFound() {
        BigDecimal minRange = new BigDecimal(0);
        BigDecimal maxRange = new BigDecimal(100);
        List<Product> expected = new ArrayList<>();
        List<Product> actual = shop.findProductsByCostRange(minRange, maxRange);
        assertEquals(expected, actual);
    }
}