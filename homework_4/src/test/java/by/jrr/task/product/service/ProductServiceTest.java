package by.jrr.task.product.service;

import by.jrr.task.product.bean.Product;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void actualPrice() {
        ProductService service = new ProductService(new Product("potato", 0.8, 20));
        double actual = service.actualPrice();
        double expected = 0.64;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void printInformation() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        ProductService service = new ProductService(new Product("potato", 0.8, 20));
        service.printInformation();
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual);
    }
}