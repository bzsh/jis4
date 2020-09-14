package by.jrr.task.human.service;

import by.jrr.task.human.bean.Human;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HumanServiceTest {

    @Test
    public void greet() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        HumanService service = new HumanService(new Human());
        service.greet();
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual);
    }
}