package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static by.vss.practice.product_system.constant.error.ErrorHolder.JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE;

@Component
public final class FileProductJsonReaderWriter {

    @Autowired
    private ObjectMapper mapper;
    @Autowired
    Properties properties;


    @JsonDeserialize(as = ArrayList.class)
    private List<Product> products = new ArrayList<>();

    public void addAllToFile(List<Product> products) throws ProductFileDatabaseException {
        try {
            final Path path = Path.of(properties.get("db.path").toString());
            String string = mapper.writeValueAsString(products);
            Files.writeString(path, string);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ProductFileDatabaseException(JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE, e);
        }
    }

    public List<Product> getAllFromFile() throws ProductFileDatabaseException {
        String jsonString;
        try {
            final Path path = Path.of(properties.get("db.path").toString());
            jsonString = Files.readString(path);
            products = mapper.readValue(jsonString, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Product.class));
        } catch (IOException e) {
            throw new ProductFileDatabaseException(JSON_SERIALIZATION_EXCEPTION_ERROR_MESSAGE, e);
        }
        return products;
    }
}
