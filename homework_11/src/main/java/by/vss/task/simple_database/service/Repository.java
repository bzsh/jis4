package by.vss.task.simple_database.service;

import by.vss.task.simple_database.exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;
}
