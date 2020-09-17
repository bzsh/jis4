package by.jrr.task.circle.bean;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Circle circleOne = new Circle(10);
        Circle circleTwo = new Circle(10);
        boolean expected = circleOne.equals(circleTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Circle circleOne = new Circle(10);
        Circle circleTwo = new Circle(11);
        boolean expected = circleOne.equals(circleTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        Circle circle = new Circle(10);
        int expected = 1076101151;
        int actual = circle.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(10);
        String expected = "Circle{radius=10.0}";
        String actual = circle.toString();
        assertEquals(expected, actual);
    }
}