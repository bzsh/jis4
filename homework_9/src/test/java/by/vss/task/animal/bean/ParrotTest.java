package by.vss.task.animal.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTest {
    @Test
    public void sleep() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "Parrot is sleeping";
        String actual = parrot.sleep();
        assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "Parrot is eating";
        String actual = parrot.eat();
        assertEquals(expected, actual);
    }

    @Test
    public void move() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "Parrot is moving";
        String actual = parrot.move();
        assertEquals(expected, actual);
    }

    @Test
    public void say() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "The Parrot says : Tiu tiu";
        String actual = parrot.say();
        assertEquals(expected, actual);
    }

    @Test
    public void fly() {
        Bird parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "Parrot is flying";
        String actual = parrot.fly();
        assertEquals(expected, actual);

    }

    @Test
    public void testNotEquals() {
        Animal parrotOne = new Parrot("orange", "female", 2, 1, 3, "yellow");
        Animal parrotTwo = new Parrot("orange", "female", 2, 2, 6, "yellow");
        assertNotEquals(parrotOne, parrotTwo);
    }

    @Test
    public void testEquals() {
        Animal parrotOne = new Parrot("orange", "female", 2, 1, 3, "yellow");
        Animal parrotTwo = new Parrot("orange", "female", 2, 1, 3, "yellow");
        assertEquals(parrotOne, parrotTwo);
    }

    @Test
    public void testEqualsToNull() {
        Animal parrotOne = new Parrot("orange", "female", 2, 1, 3, "yellow");
        Animal catTwo = null;
        assertNotEquals(parrotOne, catTwo);
    }

    @Test
    public void testHashCode() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        int expected = -572564079;
        int actual = parrot.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Animal parrot = new Parrot("orange", "female", 2, 1, 3, "yellow");
        String expected = "Parrot{parrotBreed='null', featherColor='yellow', color='orange', gender='female', numberOfLegs=2, weight=1, age=3}";
        String actual = parrot.toString();
        assertEquals(expected, actual);


    }
}