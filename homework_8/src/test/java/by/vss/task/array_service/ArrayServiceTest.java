package by.vss.task.array_service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayServiceTest {

    ArrayService arrayService;
    @Before
    public void setup(){
        arrayService = new ArrayService();
    }
    @Test
    public void create() {
        int[] expected = new int[5];
        int[] actual = arrayService.create(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void fillRandomly() {
        int[] array = new int[5];
        int expected = Arrays.hashCode(array);
        arrayService.fillRandomly(array);
        int actual = Arrays.hashCode(array);
        assertNotEquals(expected, actual);

    }

    @Test
    public void printArray() {
        int[] array = new int[]{1,2,3,4,5};
        String expected = "1,2,3,4,5,";
        String actual = arrayService.printArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void sum() {
        int[] array = new int[]{1,2,3,4,5};
        int expected = 15;
        int actual = arrayService.sum(array);
        assertEquals(expected, actual);
    }

    @Test
    public void avg() {
        int[] array = new int[]{1,2,3,4,5};
        double expected = 3;
        double actual = arrayService.avg(array);
        assertEquals(expected, actual, 0);
    }
}