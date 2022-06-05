package dztretye;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        while (true) {
            Scanner scann = new Scanner(System.in);
            System.out.println("Введите шестизначное число");
            int n = scann.nextInt();
            int a1 = n / 100_000;
            int a2 = n / 10_000 - a1 * 10;
            int a3 = n / 1_000 - a1 * 100 - a2 * 10;
            int b1 = n / 100 - a1 * 1000 - a2 * 100 - a3 * 10;
            int b2 = n / 10 - a1 * 10000 - a2 * 1000 - a3 * 100 - b1 * 10;
            int b3 = n - a1 * 100000 - a2 * 10000 - a3 * 1000 - b1 * 100 - b2 * 10;
            if (a1 + a2 + a3 == b1 + b2 + b3) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
