package by.jrr.task.power_calc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PowerCalculator {
    public static final Logger LOGGER = LogManager.getLogger(PowerCalculator.class);

    private PowerCalculator() {
    }

    public static int compute(int number, int power) {
        LOGGER.info("raising to the power");
        int result = 1;

        if (number >= 0 && power > 1) {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
            return result;
        }
        return power <= 0 ? 1 : number;
    }
}
