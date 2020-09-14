package by.jrr.task.circle.service;

import by.jrr.task.circle.bean.Circle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircleService {
    public static final Logger LOGGER = LogManager.getLogger(CircleService.class);
    private Circle circle;

    public CircleService(Circle circle) {
        LOGGER.info("CircleService object has been created !");
        this.circle = circle;
    }

    public double calculateArea(){
        LOGGER.info("CircleService calculateArea method has been called !");
        return Math.PI * (circle.getRadius() * circle.getRadius());
    }
}
