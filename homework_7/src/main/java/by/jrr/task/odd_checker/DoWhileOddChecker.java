package by.jrr.task.odd_checker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoWhileOddChecker {
    public static final Logger LOGGER = LogManager.getLogger(DoWhileOddChecker.class);

    private DoWhileOddChecker(){}

    public static void check() {
        int i = 0;
        do {
            if (i % 2 == 1) {
                LOGGER.info(i);
            }
            i++;
        } while (i < 50);

    }
}
