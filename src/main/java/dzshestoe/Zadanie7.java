package dzshestoe;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = sc.nextLong();
        int size = 0;
        long power10 = 1;
        for (long i = number; i > 0; i /= 10) {
            size++;
            power10 *= 10;
        }
        long n = 0;
        long s = 0;
        for (long i = number; i > 0; i /= 10) {
            n = i % 10 * power10;
            s = s + n;
            power10 /= 10;
        }
        System.out.println(s / 10);
    }
}