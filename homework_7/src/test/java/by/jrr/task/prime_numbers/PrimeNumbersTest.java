package by.jrr.task.prime_numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void getSumOfPrimeNumbersTest() {
        int[] expected = {5501,50};
        int[] actual = PrimeNumbers.getSumOfPrimeNumbers();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void printResultTest() {
        int[] result = PrimeNumbers.getSumOfPrimeNumbers();
        String expected = "The sum of prime numbers is 5501\n" + "The quantity of prime numbers is 50";
        String actual = PrimeNumbers.printResult(result);
        assertEquals(expected, actual);
    }

}