package dzshestodinmetody;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
    static int[][] createDiagonalUnitMatrix (int count) {
        int[][] mass = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == i) {
                    mass[i][j] = 1;
                }
            }
        }
        return mass;
    }

    static int[][] createNullMatrix (int count) {
        int[][] mass = new int[count][count];
        return mass;
    }
    static int[][] sumMatrix (int[][] array1, int[][] array2) {
        int[][] mass = new int [array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                mass[i][j] = array1[i][j] + array2[i][j];
                }
            }
        return mass;
    }

    static int[][] multSkalyarMatrix (int[][] array, int mult) {
        int[][] mass = new int [array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                mass[i][j] = mult * array[i][j];
            }
        }
        return mass;
    }

    static int determinantMatrix (int[][] array) {
        int determinant = 0;
        if (array.length == 1) {
            determinant = array[0][0];
        }
        if (array.length == 2) {
            determinant = array[0][0] * array[1][1] - array[0][1] * array[1][0];
        }
        if (array.length >= 3) {
            int[][] matrix = new int [array.length][2 * array.length - 1];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    matrix[i][j] = array[i][j];
                    if (j < array.length - 1) {
                        matrix[i][array.length + j] = array[i][j];
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                int mult1 = 1;
                int mult2 = 1;
                for (int j = 0; j < array.length; j++) {
                        mult1 *= matrix[j][i + j];
                        mult2 *= matrix[j][array.length - 1 + i - j];
                }
                determinant = determinant + mult1 - mult2;
            }
        }
        return determinant;
    }

    static void printMatrix (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность диагональной и нулевой матриц: ");
        int n = sc.nextInt();
        printMatrix(createDiagonalUnitMatrix(n));
        printMatrix(createNullMatrix(n));
        int[][] mass1 = {{3, 5, 3}, {8, -6, 12}, {7, 8, 29}};
        int[][] mass2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Сложение двух матриц mass1 и mass2: ");
        printMatrix(sumMatrix(mass1, mass2));
        System.out.println("Введите множитель для матрицы mass1: ");
        int m = sc.nextInt();
        printMatrix(multSkalyarMatrix(mass1, m));
        System.out.println("Детерминант матрицы mass1 равен: " + determinantMatrix(mass1));
    }
}
