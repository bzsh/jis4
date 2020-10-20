package by.vss.practice.product_system.service;

import by.vss.practice.product_system.bean.Product;
import by.vss.practice.product_system.category.Category;
import by.vss.practice.product_system.db.InMemoryDatabase;
import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.utill.IdCreator;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class ProductService {
    InMemoryDatabase database = InMemoryDatabase.getInstance();

    public ProductService() {
    }

    private Product createProduct(String name, String price, String category, String discount, String description) {
        BigDecimal bigDecimalPrice;
        BigDecimal bigDecimalDiscount;
        Product product;
        Category categoryEnum;
        if (discount != null && description != null) {
            bigDecimalPrice = new BigDecimal(price);
            bigDecimalDiscount = new BigDecimal(discount);
            categoryEnum = Category.valueOf(category);
            product = new Product(IdCreator.createId(), name, bigDecimalPrice, categoryEnum, bigDecimalDiscount, description);
        } else {
            bigDecimalPrice = new BigDecimal(price);
            bigDecimalDiscount = BigDecimal.valueOf(0.0D);
            categoryEnum = Category.valueOf(category);
            String defaultDescription = "no description";
            product = new Product(IdCreator.createId(), name, bigDecimalPrice, categoryEnum, bigDecimalDiscount, defaultDescription);
        }

        return product;
    }

    public void addProductToDatabase(String[] arr) {
        Product product = this.createProduct(arr[0], arr[1], arr[2], arr[3], arr[4]);
        this.database.add(product);
    }

    public void deleteProductFromDatabase(String productId) throws ProductDatabaseException {
        this.database.remove(Long.parseLong(productId));
    }

    public String[] getAllProductsFromDatabase() throws ProductDatabaseException {
        List<Product> products = this.database.getAll();
        String[] result = new String[products.size()];

        for (int i = 0; i < products.size(); ++i) {
            result[i] = ((Product) products.get(i)).toString();
        }

        return result;
    }

    public String getProductByIdFromDatabase(long id) throws ProductDatabaseException {
        String result = "";
        List<Product> products = this.database.getAll();
        Iterator var5 = products.iterator();

        Product product;
        do {
            if (!var5.hasNext()) {
                return result;
            }

            product = (Product) var5.next();
        } while (product.getId() != id);

        result = product.toString();
        return result;
    }
}
