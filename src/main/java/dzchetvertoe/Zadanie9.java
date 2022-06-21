package dzchetvertoe;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        System.out.println("Введите число M: ");
        int m = sc.nextInt();
        if ((n ^ m) >= 0) {
            System.out.println("Знак одинаковый");
        } else {
            System.out.println("Знак разный");
        }
    }
}
