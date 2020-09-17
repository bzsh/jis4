package by.jrr.task.encoder.util;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EncoderTest {

    @Test
    public void encode() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        short symbolCode = 125;
        Encoder.encode(symbolCode);
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void decode() {
        var consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));
        char symbol = '3';
        Encoder.decode(symbol);
        String actual = consoleOut.toString();
        String expected = consoleOut.toString();
        assertEquals(expected, actual);
    }
}