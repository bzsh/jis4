package by.vss.task.copy_range;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    @Test
    public void copyInRange() {
        Copy copy = new Copy();
        int[] array = {40, 75, 23, 36, 87, 95, 54, 11, 62};
        int[] expected = {40,75,36,54,62};
        int[] actual = copy.copyInRange(array, 30, 75);
        assertArrayEquals(expected, actual);
    }
}