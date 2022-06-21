package dzchetvertoe;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = (sc.nextInt() >>> 1);
        n = (n << 1);
        System.out.println(Integer.toBinaryString(n));
    }
}
