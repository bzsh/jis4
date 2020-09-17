package by.jrr.task.dog.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Dog dogOne = new Dog(10,"Brown","Bobik");
        Dog dogTwo = new Dog(10,"Brown","Bobik");
        boolean expected = dogOne.equals(dogTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Dog dogOne = new Dog(10,"Brown","Bobik");
        Dog dogTwo = new Dog(11,"Red","Vaska");
        boolean expected = dogOne.equals(dogTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        Dog dog = new Dog(10,"Brown","Bobik");
        int expected = 2062626058;
        int actual = dog.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Dog dog = new Dog(10,"Brown","Bobik");
        String expected = "Dog{age=10, color='Brown', name='Bobik'}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
}