package dztretye;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanx = new Scanner(System.in);
            System.out.println("Введите число x");
            int x = scanx.nextInt();
            Scanner scany = new Scanner(System.in);
            System.out.println("Введите число y");
            int y = scany.nextInt();
            if (x % 2 == 0 && y % 2 == 0) {
                System.out.println("YES");
            }
        }
    }
}
