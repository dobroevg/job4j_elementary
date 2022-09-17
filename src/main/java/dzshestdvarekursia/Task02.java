package dzshestdvarekursia;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int a = sc.nextInt();
        printAnswer(2, a);

    }

    static void printAnswer(int a, int n) {
        if (a > n) {
            System.out.println("NO");
        }
        if (a <= n) {
            if (n == a) {
                System.out.println("YES");
            } else {
                a = a * 2;
                printAnswer(a, n);
            }
        }
    }
}
