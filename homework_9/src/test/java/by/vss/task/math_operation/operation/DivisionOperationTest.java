package by.vss.task.math_operation.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionOperationTest {

    @Test
    public void compute() {
        var division = new DivisionOperation();
        double expected = 2.6;
        double actual = division.compute(6.5, 2.5);
        assertEquals(expected, actual, 0);
    }
}