package by.jrr.task.odd_checker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForOddChecker {
    public static final Logger LOGGER = LogManager.getLogger(ForOddChecker.class);

    private ForOddChecker(){}

    public static void check() {
        for (int i = 0; i < 50; i++) {
            if(i % 2 == 1){
                LOGGER.info(i);
            }
        }
    }
}
