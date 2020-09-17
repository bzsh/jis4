package by.jrr.task.product.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Product productOne = new Product("Apple",1.0,1.2);
        Product productTwo = new Product("Apple",1.0,1.2);
        boolean expected = productOne.equals(productTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Product productOne = new Product("Apple",1.0,1.2);
        Product productTwo = new Product("Carrot",1.1,1.3);
        boolean expected = productOne.equals(productTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        Product product = new Product("Apple",1.0,1.2);
        int expected = -20897511;
        int actual = product.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Product product = new Product("Apple",1.0,1.2);
        String expected = "Product{name='Apple', regularPrice=1.0, discount=1.2}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}