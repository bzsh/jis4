package by.jrr.task.randomgenerator;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RandomGeneratorUtilTest {
    @Test
    public void generateRandomNumberShouldReturnTrue() {
        int num = RandomGeneratorUtil.generateRandomNumber();
        boolean expected = true;
        boolean actual = num <= 100;
        assertEquals(expected, actual);
    }

    @Test
    public void generateRandomNumberShouldReturnFalse() {
        int num = RandomGeneratorUtil.generateRandomNumber();
        boolean expected = false;
        boolean actual = num < 0;
        assertEquals(expected, actual);
    }

    @Test()
    public void printToConsoleTest() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        RandomGeneratorUtil.printToConsole(12345);
        String expected = "12345";
        String actual = consoleOut.toString();
        assertEquals(expected, actual);
    }
}