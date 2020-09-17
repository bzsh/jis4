package by.jrr.task.calculator.impl;

import by.jrr.task.calculator.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Division implements Calculator {
    public static final Logger LOGGER = LogManager.getLogger(Division.class);
    private double a;
    private double b;

    public Division(double a, double b) {
        LOGGER.info("Division object is created");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        LOGGER.info("Division calculate method has been called");
        if (b != 0) {
            return a / b;
        }
        LOGGER.error("Error ! Divide by zero !");
        return 0;

    }


}
