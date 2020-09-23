package by.vss.task.animal.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void sleep() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        String expected = "Cat is sleeping";
        String actual = cat.sleep();
        assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        String expected = "Cat is eating";
        String actual = cat.eat();
        assertEquals(expected, actual);
    }

    @Test
    public void move() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        String expected = "Cat is moving";
        String actual = cat.move();
        assertEquals(expected, actual);
    }

    @Test
    public void say() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        String expected = "The Cat says : Miau-Miau";
        String actual = cat.say();
        assertEquals(expected, actual);
    }

    @Test
    public void testNotEquals() {
        Animal catOne = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        Animal catTwo = new Cat("Brown", "Male", 4,6, 4, "street cheshir");
        assertNotEquals(catOne, catTwo);
    }

    @Test
    public void testEquals() {
        Animal catOne = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        Animal catTwo = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        assertEquals(catOne, catTwo);
    }
    @Test
    public void testEqualsToNull() {
        Animal catOne = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        Animal catTwo = null;
        assertNotEquals(catOne, catTwo);
    }

    @Test
    public void testHashCode() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        int expected = 155042584;
        int actual = cat.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Animal cat = new Cat("Brown", "Male", 4,10, 8, "street cheshir");
        String expected = "Cat{catBreed='street cheshir', color='Brown', gender='Male', numberOfLegs=4, weight=10, age=8}";
        String actual = cat.toString();
        assertEquals(expected, actual);
    }
}