package dzsedmoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел n: ");
        int[] mass = new int[sc.nextInt()];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(0, 34);
        }
        System.out.println(Arrays.toString(mass));
        int result = -1;
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i - 1] != 0 && mass[i + 1] != 0) {
                if (mass[i] % mass[i - 1] == 0 && mass[i] % mass[i + 1] == 0) {
                    result = i;
                    System.out.println("Индекс элемента: " + result);
                    break;
                }
            }
        }
        if (result == -1) {
            System.out.println(result);
        }
    }
}
