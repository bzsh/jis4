package by.jrr.task.randomgenerator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class RandomGeneratorUtil {
    public static final Logger LOGGER = LogManager.getLogger(RandomGeneratorUtil.class);
    private static final Random rnd = new Random();

    private RandomGeneratorUtil(){}

    public static int generateRandomNumber() {

        return rnd.nextInt(101);
    }

    public static void printToConsole(int num) {
        LOGGER.info(num);
    }
}
