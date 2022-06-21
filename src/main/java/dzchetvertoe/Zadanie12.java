package dzchetvertoe;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        if (((~ n) ^ 0) != 0) {
            System.out.println("Есть нули в двоичном виде");
        } else  {
            System.out.println("Нет нулей в двоичном виде");
        }
        System.out.println("Число N в двоичном виде: " + Integer.toBinaryString(n));
    }
}