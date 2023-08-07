package tasks;

import java.util.Random;

/*
 * Найти среднее арифметическое всех элементов
 * слева от побочной и главной диагонали целочисленной
 * квадратной матрицы (включая прилегающие элементы диагоналей)
 * */
public class task_7 {

    public static void main(String[] args) {
        System.out.println(getSum(matrix(5)));
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;
        int count = 0;
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                if (i >= j) {
                    System.out.print(matrix[i][j] + "\t");
                    sum = sum + matrix[i][j];
                    count++;
                }
            }
            System.out.print("\n");
        }
        return sum / count;
    }

    private static int[][] matrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = new Random().nextInt(10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        return matrix;
    }
}
