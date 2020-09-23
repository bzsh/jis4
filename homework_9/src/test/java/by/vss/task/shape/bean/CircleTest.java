package by.vss.task.shape.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle circle;

    @Before
    public void setup(){
        circle = new Circle("Circle", 5);
    }

    @Test
    public void getName() {
        String expected = "Circle";
        String actual =  circle.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getArea() {
        double expected = 79.0;
        double actual = circle.getArea();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        Circle circleOne = new Circle("Circle", 7);
        Circle circleTwo = new Circle("Circle", 7);
        assertEquals(circleOne, circleTwo);
    }

    @Test
    public void testNotEquals() {
        Circle circleOne = new Circle("Circle", 7);
        Circle circleTwo = new Circle("CircleTwo", 10);
        assertNotEquals(circleOne, circleTwo);
    }

    @Test
    public void testEqualsWithNull() {
        Circle circleOne = new Circle("Circle", 7);
        Circle circleTwo = null;
        assertNotEquals(circleOne, circleTwo);
    }

    @Test
    public void testEqualsWithSameObj() {
        Circle circleOne = new Circle("Circle", 7);
        Circle circleTwo = circleOne;
        assertEquals(circleOne, circleTwo);
    }

    @Test
    public void testHashCode() {
       int expected = 1828197806;
       int actual = circle.hashCode();
       assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        String expected = "Circle{radius=5.0}";
        String actual = circle.toString();
        assertEquals(expected, actual);
    }
}