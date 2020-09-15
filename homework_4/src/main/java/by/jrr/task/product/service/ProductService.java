package by.jrr.task.product.service;

import by.jrr.task.product.bean.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductService {
    public static final Logger LOGGER = LogManager.getLogger(ProductService.class);
    private Product product;

    public ProductService(Product product) {
        LOGGER.info("ProductService object has been created");
        this.product = product;
    }

    public double actualPrice() {
        LOGGER.info("ProductService actualPrice method has been called !");
        return product.getRegularPrice() - (product.getRegularPrice() * (product.getDiscount() / 100));

    }

    public void printInformation() {
        LOGGER.info("ProductService printInformation method has been called !");
        System.out.println("Product name = \"" + product.getName() + "\", regular price = " + product.getRegularPrice() + " EUR, discount = " + product.getDiscount() + "%, actual price = " + actualPrice() + " EUR");
    }
}
