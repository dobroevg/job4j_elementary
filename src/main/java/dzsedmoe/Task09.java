package dzsedmoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел n: ");
        int n = sc.nextInt();
        int[] mass = new int[n];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-2, n + 1);
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(mass));
        boolean negative = false;
        int[] mass1 = mass;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] < 0) {
                negative = true;
                break;
            }
        }
        if (negative) {
            for (int i = 0; i < mass1.length; i++) {
                if (mass1[i] < 0) {
                    int result = mass1[i] * mass1[i];
                    mass1[i] = result;
                }
            }
        }
        System.out.println("Результирующий массив: ");
        System.out.println(Arrays.toString(mass1));
        sc.close();
    }
}
