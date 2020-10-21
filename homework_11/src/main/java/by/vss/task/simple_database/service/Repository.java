package by.vss.task.simple_database.service;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(String id);

    void save(T item);

    void delete(String id);

    int size();
}
