package dzshestdvarekursia;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();
        printSum(n, 0);
    }

    static void printSum(int a, int sum) {
        if (a / 10 == 0) {
            sum = sum + a % 10;
            System.out.println("Сумма цифр числа: " + sum);
        }
        if (a / 10 > 0) {
            sum = sum + a % 10;
            a = a / 10;
            printSum(a, sum);
        }
    }
}
