package dzsedmoe;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int k = 0;
        int n = 1;
        mass[0] = 0;
        mass[1] = 1;
        for (int i = 2; i < mass.length; i++) {
            n = n + k;
            k = n - k;
            mass[i] = n;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Четные числа Фибоначи: ");
        for (int number : mass) {
            if (number % 2 == 0 && number != 0) {
                System.out.printf("%d, ", number);
            }
        }
    }
}
