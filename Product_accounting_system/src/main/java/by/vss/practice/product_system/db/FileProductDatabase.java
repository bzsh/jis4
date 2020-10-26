package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductFileException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class FileProductDatabase implements FileDBInterface<Product>{
    private static final FileProductDatabase INSTANCE = new FileProductDatabase();
    private final ObjectMapper mapper;

    private FileProductDatabase() {
        mapper = new ObjectMapper();
    }

    public static FileProductDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public void addAllToFile(List<Product> types) throws ProductFileException {

    }

    @Override
    public List<Product> getAllFromFile() throws ProductFileException {
        return null;
    }
    public void test(){}
}
