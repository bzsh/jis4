package by.jrr.task.calculator.impl;

import by.jrr.task.calculator.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addition implements Calculator {
    public static final Logger LOGGER = LogManager.getLogger(Addition.class);
    private double a;
    private double b;

    public Addition(double a, double b) {
        LOGGER.info("Division object is created");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        LOGGER.info("Addition calculate method has been called");
        return a + b;
    }
}
