package by.vss.task.shape.app;

import by.vss.task.shape.bean.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    public static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle", 6),
                new Square("Square", 4),
                new Triangle("Triangle", 6, 3)};

        for (Shape shape : shapes) {
            LOGGER.info("Area of {} = {}", shape.getName(), shape.getArea());
        }
    }
}
