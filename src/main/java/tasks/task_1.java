package tasks;

/*
 * 1. Найти индекс начала наиболее короткой (не менее двух) и непрерывной
 * последовательности одинаковых чисел в целочисленном массиве.
 */

public class task_1 {
    public static void main(String[] args) {
        System.out.println(task(new int[]{1, 2, 2, 2, 3, 4, 4, 4, 4, 4, 1, 1, 4, 5, 6, 7, 8, 8, 9}));
    }

    private static int task(int[] array) {
        int[][] len = new int[2][array.length];
        int length = 0, count = 0;
        int element = array[0];
        for (int i = 1; i < array.length; i++) {
            if (element == array[i]) {
                length++;
            } else {
                element = array[i];
                if (length != 0) {
                    len[0][count] = i - length - 1;
                    len[1][count] = length + 1;
                    count++;
                    length = 0;
                }
            }
        }
        int[] min = {len[0][0], len[1][0]};
        for (int i = 0; i < array.length; i++) {
            if (len[1][i] != 0) {
                if (len[1][i] < min[1]) {
                    min = new int[]{len[0][i], len[1][i]};
                }
            }
        }
        return min[0];
    }
}
