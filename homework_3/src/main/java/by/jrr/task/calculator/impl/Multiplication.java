package by.jrr.task.calculator.impl;

import by.jrr.task.calculator.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Multiplication implements Calculator {
    public static final Logger LOGGER = LogManager.getLogger(Multiplication.class);
    private double a;
    private double b;

    public Multiplication(double a, double b) {
        LOGGER.info("Multiplication object is created");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        LOGGER.info("Multiplication calculate method has been called");
        return a * b;
    }
}
