package by.vss.task.simple_database.service;

import by.vss.task.simple_database.bean.Book;
import by.vss.task.simple_database.exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    Map<String, Book> books;

    public BookRepository() {
        this.books = new HashMap<>();
    }


    @Override
    public List<Book> findAll() {
        return new ArrayList<Book>(books.values());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.getId().equals(id)) {
                return book;
            }
        }
        throw new ItemNotFoundException("Book is not found!");
    }

    @Override
    public void save(Book item) {
        books.put(item.toString(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.getId().equals(id)) {
                if (books.remove(entry.getKey(), book)) {
                    return;
                }
            }
        }
        throw new ItemNotFoundException("Book is not found!");
    }
}
