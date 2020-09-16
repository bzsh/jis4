package by.jrr.task.counter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Counter {
    public static final Logger LOGGER = LogManager.getLogger(Counter.class);
    private int value;
    private int step;

    public Counter() {
        LOGGER.info("Counter object has been created");
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        LOGGER.info("Counter incremented value");
        if (value + step <= 100) {
            value += step;
        }
    }

    public void decrement() {
        LOGGER.info("Counter decremented value");
        if (value - step >= 0) {
            value -= step;
        }
    }

    public void clear() {
        LOGGER.info("Counter cleared");
        value = 0;
        step = 1;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
            LOGGER.info("a new value has been set");
        }else {LOGGER.info("a new value has no been set, cause new value is out of diapason");}
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        if (step >= 1 && step <= 10) {
            this.step = step;
            LOGGER.info("a new step has been set");
        }else {LOGGER.info("a new step has no been set, cause new step is out of diapason");}

    }

    public int getStep() {
        return step;
    }
}
