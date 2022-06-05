package dztretye;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanx1 = new Scanner(System.in);
            System.out.println("Введите число x1");
            int x1 = scanx1.nextInt();
            Scanner scany1 = new Scanner(System.in);
            System.out.println("Введите число y1");
            int y1 = scany1.nextInt();
            Scanner scanx2 = new Scanner(System.in);
            System.out.println("Введите число x2");
            int x2 = scanx2.nextInt();
            Scanner scany2 = new Scanner(System.in);
            System.out.println("Введите число y2");
            int y2 = scany2.nextInt();
            if (x1 == x2) {
                System.out.println("Отвесная дорога");
            }
            if (y1 == y2) {
                System.out.println("Ровная дорога");
            }
            if (y1 < y2) {
                System.out.println("Подъем");
            }
            if (y1 > y2) {
                System.out.println("Спуск");
            }
        }
    }
}
