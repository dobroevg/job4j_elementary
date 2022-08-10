package dzsedmoe;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[30];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-70, 51);
        }
        System.out.println(Arrays.toString(mass));
        int start = mass[0];
        int count = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < start) {
                start = mass[i];
                count = i;
            }
        }
        System.out.printf("Минимальный элемент массива равен: %d, индекс массива: %d", start, count);
        System.out.println();
        start = mass[0];
        count = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > start) {
                start = mass[i];
                count = i;
            }
        }
        System.out.printf("Максимальный элемент массива равен: %d, индекс массива: %d", start, count);
    }
}
