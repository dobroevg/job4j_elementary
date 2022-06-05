package dztretye;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите время от 0 до 24 часов: ");
            int sc = scan.nextInt();
            if (sc < 0 || sc > 24) {
                System.out.println("Число введено неверно, введите еще раз");
            } else {
                if ((sc >= 0 && sc <= 6) || sc == 24) {
                    System.out.println("Спокойной ночи!");
                }
                if (sc >= 7 && sc <= 11) {
                    System.out.println("Доброе утро!");
                }
                if (sc >= 12 && sc <= 19) {
                    System.out.println("Добрый день!");
                }
                if (sc >= 20 && sc <= 23) {
                    System.out.println("Добрый вечер!");
                }
            }
        }
    }
}