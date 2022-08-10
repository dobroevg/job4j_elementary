package dzsedmoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-10, 11);
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
