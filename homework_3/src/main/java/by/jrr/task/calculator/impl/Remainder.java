package by.jrr.task.calculator.impl;

import by.jrr.task.calculator.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Remainder implements Calculator {
    public static final Logger LOGGER = LogManager.getLogger(Remainder.class);
    private double a;
    private double b;

    public Remainder(double a, double b) {
        LOGGER.info("Remainder object is created");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        LOGGER.info("Remainder calculate method has been called");
        return a % b;
    }

}
