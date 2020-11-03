package by.vss.practice.product_system.db;

import by.vss.practice.product_system.exception.ProductFileDatabaseException;

import java.util.List;

public interface FileDBInterface<T> {
    void addAllToFile(List<T> types) throws ProductFileDatabaseException;

    List<T> getAllFromFile() throws ProductFileDatabaseException;
}
