package by.vss.task.math_operation.util;

import by.vss.task.math_operation.operation.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OperationExecutorTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void execute() {
        MathOperations[] operations = {
                new AdditionOperation(),
                new DivisionOperation(),
                new MultiplicationOperation(),
                new SubtractionOperation()
        };
        OperationExecutor.execute(operations, 8.5, 2.5);
        String actual = output.toString();
        String expected = actual;
        assertEquals(expected, actual);
    }
}