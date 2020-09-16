package by.jrr.task.tv.service;

import by.jrr.task.tv.bean.Tv;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvServiceTest {

    @Test
    public void nextChannel() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.nextChannel();
        int expected = 21;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.prevChannel();
        int expected = 19;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.volumeUp();
        int expected = 34;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.volumeDown();
        int expected = 32;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void turnOn() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.turnOn();
        assertTrue(tv.isTunedOn());
    }

    @Test
    public void turnOff() {
        Tv tv = new Tv(20, 33, "Philips", false);
        TvService tvService = new TvService(tv);
        tvService.turnOff();
        assertFalse(tv.isTunedOn());
    }
}