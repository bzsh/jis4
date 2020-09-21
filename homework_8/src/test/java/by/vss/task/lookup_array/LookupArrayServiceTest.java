package by.vss.task.lookup_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LookupArrayServiceTest {

    @Test
    public void findMax() {
        int[] array = {1, 5, 4, 3, 7, 11, 2, 14, 8};
        int expected = 14;
        int actual = LookupArrayService.findMax(array);
        assertEquals(expected, actual);
    }

    @Test
    public void findMin() {
        int[] array = {1, 5, 4, 3, 7, 11, 2, 14, 8};
        int expected = 1;
        int actual = LookupArrayService.findMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxShouldReturnZero() {
        int[] array = new int[0];
        int expected = 0;
        int actual = LookupArrayService.findMax(array);
        assertEquals(expected, actual);
    }

    @Test
    public void findMinShouldReturnZero() {
        int[] array = new int[0];
        int expected = 0;
        int actual = LookupArrayService.findMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMax() {
        int[] array = {1, 5, 4, 3, 7, 11, 2, 14, 8};
        int expected = 7;
        int actual = LookupArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }
    @Test
    public void indexOfMin() {
        int[] array = {1, 5, 4, 3, 7, 11, 2, 14, 8};
        int expected = 0;
        int actual = LookupArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        int[] array = new int[0];
        int value = 3;
        int expected = -1;
        int actual = LookupArrayService.indexOf(array, value);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMaxShouldReturnMinusOne() {
        int[] array = new int[0];
        int expected = -1;
        int actual = LookupArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMinShouldReturnMinusOne() {
        int[] array = new int[0];
        int expected = -1;
        int actual = LookupArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfShouldReturnMinusOne() {
        int[] array = new int[0];
        int value = 3;
        int expected = -1;
        int actual = LookupArrayService.indexOf(array, value);
        assertEquals(expected, actual);
    }
}