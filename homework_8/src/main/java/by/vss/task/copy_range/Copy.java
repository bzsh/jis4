package by.vss.task.copy_range;

public class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int cnt = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                cnt++;
            }
        }
        int[] result = new int[cnt];
        cnt = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                result[cnt] = in[i];
                cnt++;
            }
        }
        return result;
    }
}
