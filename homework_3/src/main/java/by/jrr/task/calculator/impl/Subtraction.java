package by.jrr.task.calculator.impl;

import by.jrr.task.calculator.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Subtraction implements Calculator {
    public static final Logger LOGGER = LogManager.getLogger(Subtraction.class);
    private double a;
    private double b;

    public Subtraction(int a, int b) {
        LOGGER.info("Subtraction object is created");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        LOGGER.info("Subtraction calculate method has been called");
        return a - b;
    }
}
