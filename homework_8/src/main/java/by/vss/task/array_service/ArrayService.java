package by.vss.task.array_service;

import java.util.Random;

public class ArrayService {
    Random rnd = new Random();

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
    }

    public String printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i : array) {
            builder.append(i).append(",");
        }
        return builder.toString();
    }

    public int sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public double avg(int[] array) {
        double result = 0;
        if (array.length != 0) {
            for (int i : array) {
                result += i;
            }
            return result / array.length;
        }
        return result;
    }
}