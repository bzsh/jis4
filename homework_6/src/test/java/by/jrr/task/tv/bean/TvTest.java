package by.jrr.task.tv.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class TvTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        Tv tvOne = new Tv(20, 33, "Philips", false);
        Tv tvTwo = new Tv(20, 33, "Philips", false);
        boolean excepted = tvOne.equals(tvTwo);
        assertTrue(excepted);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        Tv tvOne = new Tv(20, 33, "Philips", false);
        Tv tvTwo = new Tv(20, 33, "Panasonic", false);
        boolean excepted = tvOne.equals(tvTwo);
        assertFalse(excepted);
    }

    @Test
    public void testHashCodeShouldReturnTrue() {
        Tv tvOne = new Tv(20, 33, "Philips", false);
        Tv tvTwo = new Tv(20, 33, "Philips", false);
        boolean expected = tvOne.hashCode() == tvTwo.hashCode();
        assertTrue(expected);
    }

    @Test
    public void testHashCodeShouldReturnFalse() {
        Tv tvOne = new Tv(20, 33, "Philips", false);
        Tv tvTwo = new Tv(20, 33, "Panasonic", false);
        boolean expected = tvOne.hashCode() == tvTwo.hashCode();
        assertFalse(expected);
    }

    @Test
    public void testToString() {
        Tv tv = new Tv(20, 33, "Philips", false);
        String expected = "Tv{currentChannel=20, getCurrentVolume=33, manufacture='Philips', isTunedOn=false}";
        String actual = tv.toString();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}