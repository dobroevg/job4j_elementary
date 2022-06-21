package dzchetvertoe;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите степень n: ");
        int n = sc.nextInt();
        int result;
        if (n == 0) {
            result = 2 >> 1;
        } else {
            result = (2 << (n - 1));
        }
        System.out.printf("2 в степени %d равно %d", n, result);
    }
}
