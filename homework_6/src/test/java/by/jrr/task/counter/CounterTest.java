package by.jrr.task.counter;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void increment() {
        Counter counter = new Counter();
        counter.setValue(0);
        counter.increment();
        int expected = 1;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void decrement() {
        Counter counter = new Counter();
        counter.setValue(1);
        counter.decrement();
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void incrementMaxLimit() {
        Counter counter = new Counter();
        counter.setValue(100);
        counter.increment();
        int expected = 100;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void decrementMinLimit() {
        Counter counter = new Counter();
        counter.setValue(0);
        counter.decrement();
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void clearValue() {
        Counter counter = new Counter();
        counter.setValue(12);
        counter.clear();
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void clearStep() {
        Counter counter = new Counter();
        counter.setStep(6);
        counter.clear();
        int expected = 1;
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }

    @Test
    public void setValueMaxLimit() {
        Counter counter = new Counter();
        counter.setValue(0);
        counter.setValue(150);
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void setValueMinLimit() {
        Counter counter = new Counter();
        counter.setValue(0);
        counter.setValue(-5);
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void setStepMaxLimit() {
        Counter counter = new Counter();
        counter.setStep(1);
        counter.setStep(11);
        int expected = 1;
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }

    @Test
    public void setStepMinLimit() {
        Counter counter = new Counter();
        counter.setStep(1);
        counter.setStep(-5);
        int expected = 1;
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }
}