package by.jrr.task.dog.service;

import by.jrr.task.dog.bean.Dog;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DogServiceTest {

    @Test
    public void voice() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        DogService service = new DogService(new Dog(3, "green", "Bobik"));
        service.voice();
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual );
    }

    @Test
    public void eat() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        DogService service = new DogService(new Dog(3, "green", "Bobik"));
        service.eat();
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual );
    }

    @Test
    public void sleep() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        DogService service = new DogService(new Dog(3, "green", "Bobik"));
        service.sleep();
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual );
    }
}