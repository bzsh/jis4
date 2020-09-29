package by.vss.task.shop.bean;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testEqualsShouldReturnFalse() {
        Product productOne = new Product("Apple", new BigDecimal(788533568));
        Product productTwo = new Product("Potato", new BigDecimal(734992758));
        boolean result = productOne.equals(productTwo);
        assertFalse(result);
    }

    @Test
    public void testEqualsShouldReturnTrue() {
        Product productOne = new Product("Apple", new BigDecimal(788533568));
        Product productTwo = new Product("Apple", new BigDecimal(788533568));
        boolean result = productOne.equals(productTwo);
        assertTrue(result);
    }

    @Test
    public void testHashCode() {
        Product product = new Product("Apple", new BigDecimal(788533568));
        int expected = 642510471;
        int actual = product.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Product product = new Product("Apple", new BigDecimal(788533568));
        String expected = "Product{bane='Apple', cost=788533568}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}