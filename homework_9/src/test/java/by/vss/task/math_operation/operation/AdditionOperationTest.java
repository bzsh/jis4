package by.vss.task.math_operation.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionOperationTest {

    @Test
    public void compute() {
        var addition = new AdditionOperation();
        double expected = 9.0;
        double actual = addition.compute(2.5, 6.5);
        assertEquals(expected, actual, 0);
    }
}