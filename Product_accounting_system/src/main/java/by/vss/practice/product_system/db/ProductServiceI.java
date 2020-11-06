package by.vss.practice.product_system.db;

import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.List;

public interface ProductServiceI<T> {
    void resetDatabase();

    int getDatabaseSize();

    void add(T t);

    void addAll(List<T> types);

    T get(Long id) throws ProductDatabaseException;

    List<T> getAll() throws ProductDatabaseException;

    void remove(Long id) throws ProductDatabaseException;
}
