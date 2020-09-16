package by.jrr.task.sign_comparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignComparator {
    public static final Logger LOGGER = LogManager.getLogger(SignComparator.class);
    private SignComparator(){}

    public static String compare(int num) {
        LOGGER.info("SignComparator method compare has been called");
        if (num > 0) {
            return "Number is positive";
        }
        return num < 0 ? "Number is negative" : "Number is equal to zero";
    }
}
