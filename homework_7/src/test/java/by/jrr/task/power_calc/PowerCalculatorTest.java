package by.jrr.task.power_calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void computeZeroPower() {
        int expected = 1;
        int actual = PowerCalculator.compute(5, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void computeNegativePower() {
        int expected = 1;
        int actual = PowerCalculator.compute(0, -3);
        assertEquals(expected, actual);
    }

    @Test
    public void computeOnePower() {
        int expected = 5;
        int actual = PowerCalculator.compute(5, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void computeMoreThanOnePower() {
        int expected = 125;
        int actual = PowerCalculator.compute(5, 3);
        assertEquals(expected, actual);
    }
}