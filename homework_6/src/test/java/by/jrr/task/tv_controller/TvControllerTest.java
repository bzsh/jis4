package by.jrr.task.tv_controller;

import by.jrr.task.tv.bean.Tv;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvControllerTest {
    Tv tv;
    TvController controller;

    @Before
    public void setUp() {
        tv = new Tv(20, 33, "Philips", false);
        controller = new TvController();
        controller.setTv(tv);
    }

    @Test
    public void setTv() {
        var tvController = new TvController();
        tvController.setTv(tv);
        assertNotNull(tvController.getTv());
    }

    @Test
    public void nextChannel() {
        controller.nextChannel();
        int expected = 21;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        controller.prevChannel();
        int expected = 19;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        controller.volumeUp();
        int expected = 34;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        controller.volumeDown();
        int expected = 32;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void turnOn() {
        controller.turnOn();
        assertTrue(tv.isTurnedOn());
    }

    @Test
    public void turnOff() {
        controller.turnOff();
        assertFalse(tv.isTurnedOn());
    }

}