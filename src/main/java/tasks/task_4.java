package tasks;

import java.util.Random;

/*
4. Найти среднее арифметическое всех элементов справа от побочной
 и главной диагонали целочисленной квадратной матрицы.
*/
public class task_4 {

    public static void main(String[] args) {
        System.out.println(getSum(matrix(9)));
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;
        int count = 0;
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                if (i + j > matrix.length - 1) {
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
        Random r = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        return matrix;
    }
}
