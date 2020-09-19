package by.jrr.task.number_service;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void range() {
        int expected = 25;
        int actual = NumberService.range(3, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void rangeEvenCount() {
        int expected = 11;
        int actual = NumberService.rangeEvenCount(0, 20);
        assertEquals(expected, actual);
    }

    @Test
    public void rangeTwo() {
        int expected = 3;
        int actual = NumberService.range(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void rangeEvenCountTwo() {
        int expected = 2;
        int actual = NumberService.rangeEvenCount(2, 0);
        assertEquals(expected, actual);
    }
}