package by.jrr.task.number_service;

public class NumberService {
    private NumberService() {
    }

    public static int range(int start, int finish) {
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
