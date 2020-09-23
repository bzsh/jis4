package by.vss.task.animal.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    @Test
    public void sleep() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "Dog is sleeping";
        String actual = dog.sleep();
        assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "Dog is eating";
        String actual = dog.eat();
        assertEquals(expected, actual);
    }

    @Test
    public void move() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "Dog is moving";
        String actual = dog.move();
        assertEquals(expected, actual);
    }

    @Test
    public void say() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "The Dog says : Hau HAu";
        String actual = dog.say();
        assertEquals(expected, actual);
    }

    @Test
    public void testNotEquals() {
        Animal dogOne = new Dog("Brown", "Male", 4,10, 8, "street hound");
        Animal dogTwo = new Dog("Brown", "Male", 4,7, 10, "street hound");
        assertNotEquals(dogOne, dogTwo);
    }

    @Test
    public void testEquals() {
        Animal dogOne = new Dog("Brown", "Male", 4,10, 8, "street hound");
        Animal dogTwo = new Dog("Brown", "Male", 4,10, 8, "street hound");
        assertEquals(dogOne, dogTwo);
    }

    @Test
    public void testEqualsToNull() {
        Animal dogOne = new Dog("Brown", "Male", 4,10, 8, "street hound");
        Animal dogTwo = null;
        assertNotEquals(dogOne, dogTwo);
    }

    @Test
    public void testHashCode() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        int expected = 5528446;
        int actual = dog.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "Dog{dogBreed='street hound', color='Brown', gender='Male', numberOfLegs=4, weight=10, age=8}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
}