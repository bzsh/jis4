package by.jrr.task.odd_checker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WhileOddChecker {
    public static final Logger LOGGER = LogManager.getLogger(WhileOddChecker.class);

    private WhileOddChecker(){}

    public static void check() {
        int i = 0;
        while (i < 50) {
            if (i % 2 == 1) {
                LOGGER.info(i);
            }
            i++;
        }
    }
}
