package by.jrr.task.randomgenerator;

import java.util.Random;

public class RandomGeneratorUtil {
    private static final Random rnd = new Random();

    private RandomGeneratorUtil() {
    }

    public static int generateRandomNumber() {

        return rnd.nextInt(101);
    }

    public static String printToConsole(int num) {
        return Integer.toString(num);
    }
}
