package by.jrr.task.color_detector;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {
    @Test
    public void detectShouldReturnViolet() {
        int waweLight = 381;
        String expected = "Violet";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnBlue() {
        int waweLight = 451;
        String expected = "Blue";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnGreen() {
        int waweLight = 496;
        String expected = "Green";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnYellow() {
        int waweLight = 571;
        String expected = "Yellow";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnOrange() {
        int waweLight = 591;
        String expected = "Orange";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnRed() {
        int waweLight = 621;
        String expected = "Red";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnInvisibleLightLowValue() {
        int waweLight = 379;
        String expected = "Invisible Light";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnInvisibleLightHighValue() {
        int waweLight = 751;
        String expected = "Invisible Light";
        String actual = LightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

}