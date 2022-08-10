package dzsedmoe;

import java.util.Arrays;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-10, 11);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            boolean repeat = false;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    repeat = true;
                    break;
                }
            }
            for (int j = i - 1; j > 0; j--) {
                if (mass[i] == mass[j]) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                System.out.printf("Значение уникального элемента %d под индексом %d", mass[i], i);
                System.out.println();
            }
        }
    }
}
