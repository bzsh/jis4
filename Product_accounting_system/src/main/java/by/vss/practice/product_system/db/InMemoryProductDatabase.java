package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.*;

import static by.vss.practice.product_system.constant.error.ErrorHolder.*;

public final class InMemoryProductDatabase implements InMemoryDBInterface<Product> {
    private static final InMemoryProductDatabase INSTANCE = new InMemoryProductDatabase();
    private final Map<Long, Product> products;

    private InMemoryProductDatabase() {
        products = new HashMap<>();
    }

    public static InMemoryProductDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public void resetDatabase() {
        if (products.size() > 0) {
            products.clear();
        }
    }

    @Override
    public int getDatabaseSize() {
        return products.size();
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
    public List<Product> getAll() throws ProductDatabaseException {
        List<Product> result = new ArrayList<>(products.values());
        if (!result.isEmpty()) {
            return result;
        }
        throw new ProductDatabaseException(GET_ALL_PRODUCTS_ERROR_MESSAGE);
    }

    @Override
    public Product get(Long id) throws ProductDatabaseException {
        if (products.containsKey(id)) {
            for (Map.Entry<Long, Product> productEntry : products.entrySet()) {
                if (productEntry.getKey().equals(id)) {
                    return productEntry.getValue();
                }
            }
        }
        throw new ProductDatabaseException(GET_PRODUCT_BY_ID_ERROR_MESSAGE);
    }

    @Override
    public void remove(Long id) throws ProductDatabaseException {
        if (products.containsKey(id)) {
            products.entrySet().removeIf(entry -> entry.getKey().equals(id));
        } else {
            throw new ProductDatabaseException(REMOVE_PRODUCT_BY_ID_ERROR_MESSAGE);
        }
    }
}
