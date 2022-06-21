package dzchetvertoe;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        System.out.println("Введите число M: ");
        int m = sc.nextInt();
        if (((n - m) >>> 31) == 1) {
            System.out.println("Минимальное число " + n);
        } else {
            System.out.println("Минимальное число " + m);
        }
    }
}
