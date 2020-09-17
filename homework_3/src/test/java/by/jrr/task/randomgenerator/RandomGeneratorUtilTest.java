package by.jrr.task.randomgenerator;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomGeneratorUtilTest {
    @Test
    public void generateRandomNumberShouldReturnTrue() {
        int num = RandomGeneratorUtil.generateRandomNumber();
        boolean actual = num <= 100;
        assertTrue(actual);
    }

    @Test
    public void generateRandomNumberShouldReturnFalse() {
        int num = RandomGeneratorUtil.generateRandomNumber();
        boolean actual = num < 0;
        assertFalse(actual);
    }

    @Test()
    public void printToConsoleTest() {
        RandomGeneratorUtil.printToConsole(12345);
        String expected = "12345";
        String actual = RandomGeneratorUtil.printToConsole(12345);
        assertEquals(expected, actual);
    }
}