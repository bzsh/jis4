package by.jrr.task.stock.bean;

import by.jrr.task.user_login.bean.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Stock stockOne = new Stock("Google",1200);
        Stock stockOTwo = new Stock("Google",1200);
        boolean expected = stockOne.equals(stockOTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Stock stockOne = new Stock("Google",1200);
        Stock stockOTwo = new Stock("Yahoo",1200);
        boolean expected = stockOne.equals(stockOTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        Stock stock = new Stock("Admin",1200);
        int expected = -902451038;
        int actual = stock.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Stock stock = new Stock("Google",1200);
        String expected = "Company = \"Google\", Current Price = 1200, Min Price = 1200, Max Price = 1200";
        String actual = stock.toString();
        assertEquals(expected, actual);
    }
}