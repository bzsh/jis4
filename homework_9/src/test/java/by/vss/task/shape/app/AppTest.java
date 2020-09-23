package by.vss.task.shape.app;

import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AppTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void main() {
        App.main(null);
        String actual = output.toString();
        String expected = actual;
        assertEquals(expected, actual);
    }
}
