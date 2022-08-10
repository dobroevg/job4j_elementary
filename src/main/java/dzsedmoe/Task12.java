package dzsedmoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел массива n: ");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        boolean result = true;
        for (int i = 0; i <= mass.length / 2 - 1; i++) {
            if (mass[i] != mass[mass.length - 1 - i]) {
                result = false;
            }
        }
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    sc.close();
    }
}
