package by.vss.task.simple_database.service;

import by.vss.task.simple_database.bean.Book;
import by.vss.task.simple_database.exception.ItemNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class BookRepositoryTest {
    BookRepository repository;
    Book one;
    Book two;
    Book three;
    Book four;

    @Before
    public void setup() {
        repository = new BookRepository();

        one = new Book("1", "One", "One", 1);
        two = new Book("2", "Two", "Two", 1);
        three = new Book("3", "Three", "Three", 1);
        four = new Book("4", "Four", "Four", 1);

        repository.save(one);
        repository.save(two);
        repository.save(three);
        repository.save(four);
    }

    @Test
    public void save() {
        int expected = 4;
        int actual = repository.size();
        assertEquals(expected, actual);
    }

    @Test
    public void findAll() {
        List<Book> expected = Arrays.asList(one,two,three,four);
        expected.sort(Comparator.comparing(Book::getId));
        List<Book> actual = repository.findAll();
        actual.sort(Comparator.comparing(Book::getId));
        assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        Book expected = one;
        Book actual = repository.findById("1");
        assertEquals(expected, actual);
    }

    @Test(expected = ItemNotFoundException.class)
    public void findByIdShouldThrowException() {
        Book expected = one;
        Book actual = repository.findById("5");
        assertEquals(expected, actual);
    }

    @Test
    public void delete() {
        List<Book> expected = Arrays.asList(one,three,four);
        expected.sort(Comparator.comparing(Book::getId));

        repository.delete("2");

        List<Book> actual = repository.findAll();
        actual.sort(Comparator.comparing(Book::getId));

        assertEquals(expected, actual);
    }

    @Test(expected = ItemNotFoundException.class)
    public void deleteShouldThrowException() {
        repository.delete("5");
    }
}