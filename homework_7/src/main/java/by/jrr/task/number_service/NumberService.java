package by.jrr.task.number_service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberService {
    public static final Logger LOGGER = LogManager.getLogger(NumberService.class);
    private NumberService() {
    }

    public static int range(int start, int finish) {
        LOGGER.info("range method has been called");
        int i = start;
        int res = start;
        if (start < finish) {
            while (i < finish) {
                i++;
                res = res + i;
            }
        } else if (start > finish) {
            while (i > finish) {
                i--;
                res = res + i;
            }
        }
        return res;
    }

    public static int rangeEvenCount(int start, int finish) {
        LOGGER.info("rangeEvenCount method has been called");
        int i = start;
        int res = 0;
        if (start < finish) {
            while (i <= finish) {
                if (i % 2 == 0) {
                    res++;
                }
                i++;
            }
        } else if (start > finish) {
            while (i >= finish) {
                if (i % 2 == 0) {
                    res++;
                }
                i--;
            }
        }
        return res;
    }
}
