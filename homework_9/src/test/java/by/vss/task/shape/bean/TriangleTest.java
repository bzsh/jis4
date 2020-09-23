package by.vss.task.shape.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle;

    @Before
    public void setup() {
        triangle = new Triangle("Triangle", 6, 9);
    }

    @Test
    public void getName() {
        String expected = "Triangle";
        String actual = triangle.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getArea() {
        double expected = 27.0;
        double actual = triangle.getArea();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        Triangle triangleOne = new Triangle("Triangle", 6, 9);
        Triangle triangleTwo = new Triangle("Triangle", 6, 9);
        assertEquals(triangleOne, triangleTwo);
    }

    @Test
    public void testNotEquals() {
        Triangle triangleOne = new Triangle("Triangle", 6, 9);
        Triangle triangleTwo = new Triangle("TriangleTwo", 7, 15);
        assertNotEquals(triangleOne, triangleTwo);
    }

    @Test
    public void testEqualsWithNull() {
        Triangle triangleOne = new Triangle("Triangle", 6, 9);
        Triangle triangleTwo = null;
        assertNotEquals(triangleOne, triangleTwo);
    }

    @Test
    public void testEqualsWithSameObj() {
        Triangle triangleOne = new Triangle("Triangle", 6, 9);
        Triangle triangleTwo = triangleOne;
        assertEquals(triangleOne, triangleTwo);
    }

    @Test
    public void testHashCode() {
        int expected = -1622855718;
        int actual = triangle.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        String expected = "Triangle{base=6.0, height=9.0, name='Triangle'}";
        String actual = triangle.toString();
        assertEquals(expected, actual);
    }
}