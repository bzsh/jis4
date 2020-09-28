package by.vss.task.library.service;

import by.vss.task.library.bean.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public final Logger logger = LogManager.getLogger(Library.class);
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
        logger.info("Book has been successfully added to the Library");
    }

    public void remove(Book book) {
        books.remove(book);
        logger.info("Book has been successfully removed to the Library");
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Book findBookByName(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }
}
