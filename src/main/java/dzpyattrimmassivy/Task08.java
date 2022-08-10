package dzpyattrimmassivy;

import java.util.Scanner;

public class Task08 {
    @SuppressWarnings("checkstyle:MethodLength")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность квадратного массива: ");
        int n = sc.nextInt();
        int max = n * n;
        int n1 = n;
        int[][] mass = new int[n][n];
        for (int i = 1; i < n * n; i++) {
            if (i <= n) {
                mass[0][i - 1] = i;
            }
            if (i > n && i < 2 * n) {
                mass[i - n][n - 1] = i;
            }
            if (i >= 2 * n && i < 3 * n - 1) {
                mass[n - 1][3 * n - 2 - i] = i;
            }
            if (i >= 3 * n - 1 && i < 4 * n - 3) {
                mass[4 * n - 3 - i][0] = i;
            }
        }
        int s = 4 * (n - 1);
        for (int k = 1; k <= n1 / 2; k++) {
            int s1 = 0;
            n = n - 2;
            for (int i = k; i <= n1 * n1; i++) {
                for (int j = 1; j <= n; j++) {
                    mass[k][j + k - 1] = s + j;
                    mass[j + k - 1][n - 1 + k] = s + j + n - 1;
                    mass[n + k - 1][n + 1 - j + k - 1] = s + j + n + n - 2;
                }
                for (int j = 1; j < n; j++) {
                    mass[n + 1 - j + k - 1][k] = s + j + n + n + n - 3;
                    s1 =  mass[n + 1 - j + k - 1][k];
                }
            }
            s = s1;
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.printf("%4d", mass[i][j]);
            }
            System.out.println();
        }
    }
}
