package tasks;

import java.util.Arrays;

/*
 * 8. Найти медиану в массиве вещественных чисел.
 * Для вычисления медианы массив следует упорядочить
 * по возрастанию и, в случае нечётного количества членов,
 * взять средний элемент, а в случае чётного количества
 * членов взять среднее арифметическое между двумя «средними» членами.
 */

public class task_8 {
    public static void main(String[] args) {
        System.out.println(median(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

    private static int median(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
        if (sortedArray.length % 2 != 0) {
            return sortedArray[(sortedArray.length - 1) / 2];
        } else {
            return (sortedArray[sortedArray.length / 2] + sortedArray[sortedArray.length / 2 - 1]) / 2;
        }
    }
}
