package by.vss.task.shape.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square square;

    @Before
    public void setup() {
        square = new Square("Square", 9);
    }

    @Test
    public void getName() {
        String expected = "Square";
        String actual = square.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getArea() {
        double expected = 81.0;
        double actual = square.getArea();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        Square squareOne = new Square("Square", 9);
        Square squareTwo = new Square("Square", 9);
        assertEquals(squareOne, squareTwo);
    }

    @Test
    public void testNotEquals() {
        Square squareOne = new Square("Square", 22);
        Square squareTwo = new Square("SquareTwo", 9);
        assertNotEquals(squareOne, squareTwo);
    }

    @Test
    public void testEqualsWithNull() {
        Square squareOne = new Square("Square", 22);
        Square squareTwo = null;
        assertNotEquals(squareOne, squareTwo);
    }

    @Test
    public void testEqualsWithSameObj() {
        Square squareOne = new Square("Square", 22);
        Square squareTwo = squareOne;
        assertEquals(squareOne, squareTwo);
    }

    @Test
    public void testHashCode() {
        int expected = -1728851269;
        int actual = square.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        String expected = "Square{side=9.0}";
        String actual = square.toString();
        assertEquals(expected, actual);
    }
}