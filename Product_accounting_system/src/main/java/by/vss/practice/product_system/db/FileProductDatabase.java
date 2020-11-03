package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static by.vss.practice.product_system.constant.config.ConfigHolder.*;
import static by.vss.practice.product_system.constant.error.ErrorHolder.JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE;

public final class FileProductDatabase implements FileDBInterface<Product> {
    private static final FileProductDatabase INSTANCE = new FileProductDatabase();
    private final ObjectMapper mapper;
    private final Path path;

    @JsonDeserialize(as = ArrayList.class)
    private List<Product> products;

    private FileProductDatabase() {
        mapper = new ObjectMapper();
        path = Path.of(JSON_PATH_STRING);
    }

    public static FileProductDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public void addAllToFile(List<Product> products) throws ProductFileDatabaseException {
        try {
            String string = mapper.writeValueAsString(products);
            Files.writeString(path, string);
        } catch (IOException e) {
            throw new ProductFileDatabaseException(JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE, e);
        }
    }

    @Override
    public List<Product> getAllFromFile() throws ProductFileDatabaseException {
        String jsonString;
        try {
            jsonString = Files.readString(path);
            products = mapper.readValue(jsonString, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Product.class));
        } catch (IOException e) {
            throw new ProductFileDatabaseException(JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE, e);
        }
        return products;
    }
}
