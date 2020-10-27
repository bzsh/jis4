package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.*;

public final class InMemoryProductDatabaseI implements InMemoryDBInterface<Product> {
    private static final InMemoryProductDatabaseI INSTANCE = new InMemoryProductDatabaseI();
    private final Map<Long, Product> products;

    private InMemoryProductDatabaseI() {
        products = new HashMap<>();
    }

    public static InMemoryProductDatabaseI getInstance() {
        return INSTANCE;
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void addAll(List<Product> productList) {
        for (Product product : productList) {
            products.put(product.getId(), product);
        }
    }

    @Override
    public List<Product> getAll() throws ProductDatabaseException {                         //todo
        List<Product> result = new ArrayList<>(products.values());
        if (result.size() > 0) {
            return result;
        }
        throw new ProductDatabaseException("There are no any products in database!");
    }

    @Override
    public Product get(Long id) throws ProductDatabaseException {
        if (products.containsKey(id)) {
            for (Map.Entry<Long, Product> productEntry : products.entrySet()) {               //todo
                if (productEntry.getKey().equals(id)) {
                    return productEntry.getValue();
                }
            }
        }
        throw new ProductDatabaseException("There are no products with such Id");
    }

    @Override
    public void remove(Long id) throws ProductDatabaseException {                              //todo
        if (products.containsKey(id)) {
            products.entrySet().removeIf(entry -> entry.getKey().equals(id));
        } else {
            throw new ProductDatabaseException("There are no products with such Id to remove");
        }
    }
}
