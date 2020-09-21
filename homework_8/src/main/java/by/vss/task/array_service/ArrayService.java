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

    public void sort(int[] array) {
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public void swap(int[] array) {
        int t = 0;
        for (int i = 0, j = array.length - 1; i < array.length/2; i++, j--) {
            t = array[j];
            array[j] = array[i];
            array[i] = t;
        }
    }
}