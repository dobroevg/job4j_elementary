package dzshestoe;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = sc.nextLong();
        int size = 0;
        long n = 0;
        for (long i = number; i > 0; i /= 10) {
            size++;
            n = n + i % 10;
        }
        System.out.printf("Разрядность числа %d, сумма цифр в числе %d", size, n);
    }
}
