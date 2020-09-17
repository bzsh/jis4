package by.jrr.task.calculator;

import by.jrr.task.calculator.impl.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void multiplicationTest() {
        Calculator multiplicationCalc = new Multiplication(3, 5);
        double expected = 15;
        double actual = multiplicationCalc.calculate();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void additionTest() {
        Calculator additionCalc = new Addition(3, 5);
        double expected = 8;
        double actual = additionCalc.calculate();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void divisionTest() {
        Calculator divisionCalc = new Division(3, 5);
        double expected = 0.6;
        double actual = divisionCalc.calculate();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractionTest() {
        Calculator subtrationCalc = new Subtraction(3, 5);
        double expected = -2;
        double actual = subtrationCalc.calculate();
        assertEquals(expected, actual, 0);
    }

    @Test
    public  void reminderTest() {
        Calculator reminderCalc = new Remainder(3, 5);
        double expected = 3;
        double actual = reminderCalc.calculate();
        assertEquals(expected, actual, 0);
    }
}