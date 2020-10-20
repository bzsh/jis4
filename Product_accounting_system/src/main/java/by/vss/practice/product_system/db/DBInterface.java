package by.vss.practice.product_system.db;

import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.List;

public interface DBInterface <T>{
    void  add(T t);
    T get(long id) throws Exception;
    List<T> getAll() throws Exception;
    void remove(long id) throws Exception;
}
