package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.exception.ProductDatabaseException;

import java.util.*;

public class InMemoryDatabase implements DBInterface<Product>{
    private static final InMemoryDatabase INSTANCE = new InMemoryDatabase();
    Map<Long, Product> products;

    private InMemoryDatabase(){
        products = new HashMap<>();
    }

    public static InMemoryDatabase getInstance() {
        return INSTANCE;
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public List<Product> getAll() throws ProductDatabaseException {                         //todo use Stream API
        List<Product> result = new ArrayList<>(products.values());
        if(result.size() > 0){
            return result;
        }
        throw new ProductDatabaseException("There are no any products in database!");
    }

    @Override
    public Product get(long id) throws ProductDatabaseException{
        for(Map.Entry<Long, Product> productEntry : products.entrySet()){                     //todo use Stream API
            if(productEntry.getKey().equals(id)){
                return productEntry.getValue();
            }
        } throw new ProductDatabaseException("There are no products with such Id");
    }

    @Override
    public void remove(long id) throws ProductDatabaseException{
        for(Map.Entry<Long, Product> productEntry : products.entrySet()){                      //todo use Stream API
            if(productEntry.getKey().equals(id)){
                products.remove(productEntry.getKey(), productEntry.getValue());
            }
        } throw new ProductDatabaseException("There are no products with such Id to remove");
    }
}
