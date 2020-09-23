package by.vss.task.math_operation.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionOperationTest {

    @Test
    public void compute() {
        var subtraction = new SubtractionOperation();
        double expected = 4.0;
        double actual = subtraction.compute(6.5, 2.5);
        assertEquals(expected, actual, 0);
    }
}