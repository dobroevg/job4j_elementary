package dzsedmoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел n: ");
        int[] mass = new int[sc.nextInt()];
        Random rand = new Random();
         for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(3, 14);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            int count = 1;
            int element = mass[i];
            boolean repeat = false;
            boolean repeat1 = true;
            for (int j = i + 1; j < mass.length; j++) {
                for (int l = 0; l < i; l++) {
                    if (mass[i] == mass[l]) {
                        repeat1 = false;
                        break;
                    }
                }
                if (mass[j] == mass[i] && repeat1) {
                    count++;
                    repeat = true;
                }
            }
            if (repeat) {
                System.out.printf("%d - %d раза", element, count);
                System.out.println();
            }
        }
    }
}
