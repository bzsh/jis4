package by.vss.task.library.service;

import by.vss.task.library.bean.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library;

    @Before
    public void setup() {
        library = new Library();
    }

    @Test
    public void add() {
        library.add(new Book("Anna Karenina", "Tolstoy"));
        library.add(new Book("Master and Margarita", "Bulhakov"));
        library.add(new Book("Tom Soyer", "Tven"));
        int expected = 3;
        int actual = library.getBooks().size();
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        Book bookOne = new Book("Anna Karenina", "Tolstoy");
        Book bookTwo = new Book("Master and Margarita", "Bulhakov");
        Book bookThree = new Book("Tom Soyer", "Tven");
        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);
        int expected = 2;
        library.remove(bookTwo);
        int actual = library.getBooks().size();
        assertEquals(expected, actual);
    }

    @Test
    public void findBooksByAuthor() {
        Book bookOne = new Book("Anna Karenina", "Tolstoy");
        Book bookTwo = new Book("Master and Margarita", "Bulhakov");
        Book bookThree = new Book("Tom Soyer", "Tven");
        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);
        String name = "anna karenina";
        Book expected = bookOne;
        Book actual = library.findBookByName(name);
        assertEquals(expected, actual);
    }

    @Test
    public void findBookByName() {
        List<Book> expected = new ArrayList<>();
        Book bookOne = new Book("Anna Karenina", "Tolstoy");
        Book bookTwo = new Book("Master and Margarita", "Bulhakov");
        Book bookThree = new Book("Tom Soyer", "Tven");
        Book bookFour = new Book("Roman", "Bulhakov");
        expected.add(bookTwo);
        expected.add(bookFour);
        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);
        library.add(bookFour);
        String name = "Bulhakov";
        List<Book> actual = library.findBooksByAuthor(name);
        assertEquals(expected, actual);
    }
}