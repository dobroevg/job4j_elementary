package dzchetvertoe;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        System.out.println("Введите количество последних битов i, которые не обнуляться: ");
        int i = sc.nextInt();
        int result = n >> (32 - i);
        result = result << (32 - i);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(result));
    }
}
