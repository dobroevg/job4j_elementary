package dzpyattrimmassivy;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность квадратного массива: ");
        int n = sc.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            mass[0][i] = i + 1;
        }
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                mass[i][n - 1] = mass[i - 1][n - 1] + 1;
                for (int j = n - 2; j >= 0; j--) {
                    mass[i][j] = mass[i][j + 1] + 1;
                }
            }
            if (i % 2 == 0) {
                mass[i][0] = mass[i - 1][0] + 1;
                for (int j = 1; j < n; j++) {
                    mass[i][j] = mass[i][j - 1] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", mass[i][j]);
            }
            System.out.println();
        }
    }
}
