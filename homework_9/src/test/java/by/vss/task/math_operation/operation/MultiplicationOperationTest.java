package by.vss.task.math_operation.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest {

    @Test
    public void compute() {
        var multiplication = new MultiplicationOperation();
        double expected = 16.25;
        double actual = multiplication.compute(2.5, 6.5);
        assertEquals(expected, actual, 0);
    }
}