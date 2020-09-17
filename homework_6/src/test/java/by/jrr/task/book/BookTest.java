package by.jrr.task.book;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Book bookOne = new Book("Pushkin", "poems", 100);
        Book bookTwo = new Book("Pushkin", "poems", 100);
        boolean excepted = bookOne.equals(bookTwo);
        assertTrue(excepted);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Book bookOne = new Book("Pushkin", "poems", 100);
        Book bookTwo = new Book("Putin", "poems", 186);
        boolean excepted = bookOne.equals(bookTwo);
        assertFalse(excepted);
    }

    @Test
    public void testHashCodeShouldReturnTrue() {
        Book bookOne = new Book("Pushkin", "poems", 100);
        Book bookTwo = new Book("Pushkin", "poems", 100);
        boolean expected = bookOne.hashCode() == bookTwo.hashCode();
        assertTrue(expected);
    }

    @Test
    public void testHashCodeShouldReturnFalse() {
        Book bookOne = new Book("Pushkin", "poems", 100);
        Book bookTwo = new Book("Pushkin", "poems", 101);
        boolean expected = bookOne.hashCode() == bookTwo.hashCode();
        assertFalse(expected);
    }

    @Test
    public void testToString() {
        Book book = new Book("Pushkin", "poems", 100);
        String expected = "Book{author='Pushkin', name='poems', pageNumber=100}";
        String actual = book.toString();
        assertEquals(expected, actual);
    }
}