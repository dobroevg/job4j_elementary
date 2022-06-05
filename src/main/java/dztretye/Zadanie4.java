package dztretye;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanx = new Scanner(System.in);
            System.out.println("Введите координату x");
            double x = scanx.nextDouble();
            Scanner scany = new Scanner(System.in);
            System.out.println("Введите координату y");
            double y = scany.nextDouble();
            if (x < -10 || x > 10 || y < -10 || y > 10) {
                System.out.println("Координаты введены неверно, введите еще раз");
            } else {
                if (x > 0 && y > 0) {
                    System.out.println("Квадрант I");
                }
                if (x > 0 && y < 0) {
                    System.out.println("Квадрант IV");
                }
                if (x < 0 && y < 0) {
                    System.out.println("Квадрант III");
                }
                if (x < 0 && y > 0) {
                    System.out.println("Квадрант II");
                }
                if (x == 0 || y == 0) {
                    System.out.println("Координаты на границе квадрантов");
                }
            }
        }
    }
}
