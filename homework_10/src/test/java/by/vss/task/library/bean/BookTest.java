package by.vss.task.library.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testEqualsShouldReturnFalse() {
        Book bookOne = new Book("Anna Karenina", "Tolstoy");
        Book bookTwo = new Book("Master and Margarita", "Bulhakov");
        boolean result = bookOne.equals(bookTwo);
        assertFalse(result);
    }

    @Test
    public void testEqualsShouldReturnTrue() {
        Book bookOne = new Book("Anna Karenina", "Tolstoy");
        Book bookTwo =  new Book("Anna Karenina", "Tolstoy");
        boolean result = bookOne.equals(bookTwo);
        assertTrue(result);
    }

    @Test
    public void testHashCode() {
        Book book = new Book("Anna Karenina", "Tolstoy");
        int expected = 1147345830;
        int actual = book.hashCode();
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Book book = new Book("Anna Karenina", "Tolstoy");
        String expected = "Book{name='Anna Karenina', author='Tolstoy'}";
        String actual = book.toString();
        assertEquals(expected, actual);
    }
}