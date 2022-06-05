package dztretye;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        while (true) {
            Scanner scana = new Scanner(System.in);
            System.out.println("Введите a");
            double a = scana.nextDouble();
            Scanner scanb = new Scanner(System.in);
            System.out.println("Введите b");
            double b = scanb.nextDouble();
            Scanner scanc = new Scanner(System.in);
            System.out.println("Введите c");
            double c = scanb.nextDouble();
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("Нет корней");
            }
            if (d == 0) {
                System.out.println("Один корень равен " + (-b / (2 * a)));
            }
            if (d > 0) {
                System.out.println("Корни равны: " + (-b + Math.sqrt(d))/(2 * a) + " и " + (-b - Math.sqrt(d))/(2 * a));
            }
        }
    }
}
