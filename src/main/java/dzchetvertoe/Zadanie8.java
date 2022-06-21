package dzchetvertoe;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        int result = n << 1;
        result = result >>> 1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(result));
    }
}
