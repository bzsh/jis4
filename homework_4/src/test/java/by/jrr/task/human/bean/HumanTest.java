package by.jrr.task.human.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Human humanOne = new Human("Sasha", 16);
        Human humanTwo = new Human("Sasha", 16);
        boolean expected = humanOne.equals(humanTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Human humanOne = new Human("Sasha", 16);
        Human humanTwo = new Human("Sasha", 17);
        boolean expected = humanOne.equals(humanTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        Human human = new Human("Sasha", 16);
        int expected = -1825636333;
        int actual = human.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Human human = new Human("Sasha", 16);
        String expected = "Human{name='Sasha', age=16}";
        String actual = human.toString();
        assertEquals(expected, actual);
    }
}