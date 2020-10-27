package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductFileException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileProductDatabase implements FileDBInterface<Product> {
    private static final FileProductDatabase INSTANCE = new FileProductDatabase();
    private final ObjectMapper MAPPER;
    private final String URI = "src/main/resources/db.json";
    private final Path PATH;

    @JsonDeserialize(as = ArrayList.class)
    List<Product> products;

    private FileProductDatabase() {
        MAPPER = new ObjectMapper();
        PATH = Path.of(URI);
    }

    public static FileProductDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public void addAllToFile(List<Product> products) throws ProductFileException {
        try {
           String string =  MAPPER.writeValueAsString(products);
            Files.writeString(PATH,string);
        } catch (IOException e) {
            throw new ProductFileException("Error json parsing in FileDatabase", e);
        }
    }

    @Override
    public List<Product> getAllFromFile() throws ProductFileException {
        String jsonString = null;
        try {
            jsonString = Files.readString(PATH);
            products = MAPPER.readValue(jsonString, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class,Product.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;

    }
}
