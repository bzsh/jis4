package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductFileException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static by.vss.practice.product_system.constant.config.ConfigHolder.*;

public final class FileProductDatabaseI implements FileDBInterface<Product> {
    private static final FileProductDatabaseI INSTANCE = new FileProductDatabaseI();
    private final ObjectMapper MAPPER;
    private final Path PATH;

    @JsonDeserialize(as = ArrayList.class)
    private List<Product> products;

    private FileProductDatabaseI() {
        MAPPER = new ObjectMapper();
        PATH = Path.of(JSON_PATH_STRING);
    }

    public static FileProductDatabaseI getInstance() {
        return INSTANCE;
    }

    @Override
    public void addAllToFile(List<Product> products) throws ProductFileException {
        try {
            String string = MAPPER.writeValueAsString(products);
            Files.writeString(PATH, string);
        } catch (IOException e) {
            throw new ProductFileException("Error json serialization in FileDatabase", e);
        }
    }

    @Override
    public List<Product> getAllFromFile() throws ProductFileException {
        String jsonString;
        try {
            jsonString = Files.readString(PATH);
            products = MAPPER.readValue(jsonString, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Product.class));
        } catch (IOException e) {
            throw new ProductFileException("Error json deserialization in FileDatabase", e);
        }
        return products;
    }
}
