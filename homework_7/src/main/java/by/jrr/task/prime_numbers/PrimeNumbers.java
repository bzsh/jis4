package by.jrr.task.prime_numbers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumbers {
    public static final Logger LOGGER = LogManager.getLogger(PrimeNumbers.class);

    private PrimeNumbers() {
    }

    public static int[] getSumOfPrimeNumbers() {
        int[] result = new int[2];
        int dividers = 0;
        for (int i = 2; i <= 500; i++) {      // i = 2 т.к. первое простое число 2
            for (int j = 1; j <= i; j++) {    // делим число на все числа от единицы до самого числа
                if (i % j == 0) {             // если делится без остатка, то в счетчик делителей плюсуем единицу
                    dividers++;
                }
            }
            if (dividers <= 2) {              // если кол-во делителей не более 2х ( на 1 и на само себя), то это простое число.
                if (i == 17 || i == 71) {     // не учитываем эти числа, пропуская текущую итерацию
                    continue;
                }
                result[0] += i;               // суммирую значения простых чисел
                result[1]++;
            }
            if (result[1] == 50) {            // прекращаем, если колва простых чисел = 50
                return result;
            }
            dividers = 0;                     // сброс счетчика
        }
        return result;
    }

    public static String printResult(int[] result) {
        LOGGER.info(result[0]);
        LOGGER.info(result[1]);
        return "The sum of prime numbers is " + result[0] + "\n" + "The quantity of prime numbers is " + result[1];
    }
}
