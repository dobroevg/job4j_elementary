package dzpyattrimmassivy;

import java.util.Scanner;

public class Task09 {
    @SuppressWarnings("checkstyle:MethodLength")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность n массива: ");
        int n = sc.nextInt();
        System.out.println("Введите размерность m массива: ");
        int m = sc.nextInt();
        int[][] mass = new int[n][m];
        mass[0][0] = 1;
        int s = mass[0][0];
        int length = Math.min(n, m);
        int length1 = Math.max(n, m);
        for (int i = 1; i < length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                mass[j][i - j] = s + j + 1;
            }
            s = mass[i][0];
        }
        if (m > n) {
            for (int i = 0; i <= m - n; i++) {
                for (int j = 0; j < length; j++) {
                    s = s + 1;
                    mass[j][length - 1 + i - j] = s;
                }
            }
            for (int i = length - 1; i > 0; i--) {
                for (int j = length - i; j < length; j++) {
                    s = s + 1;
                    mass[j][length1 - j + length - 1 - i] = s;
                }
            }
        }
        if (m < n) {
            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j < length; j++) {
                    s = s + 1;
                    mass[j + i][length - 1 - j] = s;
                }
            }
            for (int i = length - 1; i > 0; i--) {
                for (int j = length - i; j < length; j++) {
                    s = s + 1;
                    mass[n - m + j][length - j + length - 1 - i] = s;
                }
            }
        }
        if (m == n) {
            for (int i = length - 1; i >= 0; i--) {
                for (int j = length - i - 1; j < length; j++) {
                    s = s + 1;
                    mass[j][length - j + length - 2 - i] = s;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", mass[i][j]);
            }
            System.out.println();
        }
    }
}
