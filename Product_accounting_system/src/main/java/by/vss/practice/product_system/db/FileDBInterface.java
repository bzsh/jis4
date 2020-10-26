package by.vss.practice.product_system.db;

import java.util.List;

public interface FileDBInterface<T> {
    void addAllToFile(List<T> types) throws Exception;

    List<T> getAllFromFile() throws Exception;
}
