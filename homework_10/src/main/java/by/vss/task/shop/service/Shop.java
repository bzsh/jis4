package by.vss.task.shop.service;

import by.vss.task.shop.bean.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public final Logger logger = LogManager.getLogger(Shop.class);
   private List<Product> productList;

    public Shop() {
        logger.info("Shop has been successfully created");
        this.productList = new ArrayList<>();
    }

    public Shop(List<Product> products) {
        logger.info("Shop has been successfully created");
        this.productList = products;
    }

    public void add(Product product) {
        productList.add(product);
        logger.info("Product has been successfully added to Shop");
    }

    public void remove(Product product) {
        productList.remove(product);
        logger.info("Product has been successfully removed from Shop");
    }

    public Product findProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                logger.info("Product has been successfully found");
                return product;
            }
        }
        logger.info("Product was not found");
        return null;
    }

    public List<Product> findProductsByCostRange(BigDecimal minCostRange, BigDecimal maxCostRange) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : productList) {
            int minResult = product.getCost().compareTo(minCostRange);
            int maxResult = product.getCost().compareTo(maxCostRange);
            if (minResult >= 0 && maxResult <= 0) {
                foundProducts.add(product);
            }
        }
        logger.info(foundProducts.isEmpty()? "No products found" : "At least one product was found");
        return foundProducts;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
