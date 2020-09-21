package by.vss.task.lookup_array;

public class LookupArrayService {
    private LookupArrayService(){}

    public static int findMax(int[] array) {
        int result = 0;
        if (array.length != 0) {
            result = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > result) {
                    result = array[i];
                }
            }
        }
        return result;
    }

    public static int findMin(int[] array) {
        int result = 0;
        if (array.length != 0) {
            result = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < result) {
                    result = array[i];
                }
            }
        }
        return result;
    }

    public static int indexOfMax(int[] array) {
        int result = 0;
        int index = -1;
        if (array.length != 0) {
            result = array[0];
            index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > result) {
                    result = array[i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static int indexOfMin(int[] array) {
        int result = 0;
        int index = -1;
        if (array.length != 0) {
            result = array[0];
            index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < result) {
                    result = array[i];
                    index = i;
                }
            }
        }
        return index;
    }

    public static int indexOf(int[] array, int value) {
        int index = -1;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    index = i;
                }
            }
        }
        return index;
    }
}
