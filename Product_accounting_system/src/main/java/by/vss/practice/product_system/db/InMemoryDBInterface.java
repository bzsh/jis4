package by.vss.practice.product_system.db;

import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.List;

public interface InMemoryDBInterface<T> {
    void add(T t);

    void addAll(List<T> types);

    T get(Long id) throws Exception;

    List<T> getAll() throws Exception;

    void remove(Long id) throws Exception;
}
