package dzshestdvarekursia;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало диапазона: ");
        int a = sc.nextInt();
        System.out.println("Введите конец диапазона: ");
        int b = sc.nextInt();
        summ(a, b, 0);
    }

    static void summ(int a, int b, int summ) {
        if (b - a == 1) {
            summ = summ + a + b;
            System.out.println("Сумма чисел в диапазоне " + summ);
        } else {
            summ = summ + a;
            a = a + 1;
            summ(a, b, summ);
        }
    }
}
