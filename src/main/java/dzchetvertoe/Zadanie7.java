package dzchetvertoe;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        System.out.println("Введите номер бита i: ");
        int i = sc.nextInt();
        int result = n & (1 << i);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(result));
    }
}
