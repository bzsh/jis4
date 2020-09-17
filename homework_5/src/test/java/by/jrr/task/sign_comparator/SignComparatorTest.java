package by.jrr.task.sign_comparator;

import org.junit.Test;

import static by.jrr.task.sign_comparator.SignComparator.LOGGER;
import static org.junit.Assert.*;

public class SignComparatorTest {
    @Test
    public void compareShouldReturnStringWithZeroText() {
        LOGGER.info("Test : Number is equal to zero");
        int num = 0;
        String expected = "Number is equal to zero";
        String actual = SignComparator.compare(num);
        assertEquals(expected, actual);
    }

    @Test
    public void compareShouldReturnStringWithNegativeText() {
        LOGGER.info("Test : Number is negative");
        int num = -1;
        String expected = "Number is negative";
        String actual = SignComparator.compare(num);
        assertEquals(expected, actual);
    }

    @Test
    public void compareShouldReturnStringWithPositiveText() {
        LOGGER.info("Test : Number is positive");
        int num = 1;
        String expected = "Number is positive";
        String actual = SignComparator.compare(num);
        assertEquals(expected, actual);
    }
}