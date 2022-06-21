package dzchetvertoe;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        int k = 0;
        for (int i = 0; i < 32; i++) {
            k = k + ((n & (1 << i)) >>> i);
        }
        System.out.println("Число N в двоичном виде: " + Integer.toBinaryString(n));
        System.out.println("Число единиц в двоичном виде: " + k);
    }
}