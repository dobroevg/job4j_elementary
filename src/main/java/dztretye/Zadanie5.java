package dztretye;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите день рождения число месяц год");
            Scanner scanday = new Scanner(System.in);
            int day = scanday.nextInt();
            int month = scanday.nextInt();
            int year = scanday.nextInt();
            if (day < 0 || day > 31 || month < 0 || month > 12 || year <= 0) {
                System.out.println("Дата введена неверно, введите еще раз");
            } else {
                if ((day >= 21 && month == 3) || (day <= 19 && month == 4)) {
                    System.out.println("Овен");
                }
                if ((day >= 20 && month == 4) || (day <= 20 && month == 5)) {
                    System.out.println("Телец");
                }
                if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) {
                    System.out.println("Близнецы");
                }
                if ((day >= 21 && month == 6) || (day <= 22 && month == 7)) {
                    System.out.println("Рак");
                }
                if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
                    System.out.println("Лев");
                }
                if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
                    System.out.println("Дева");
                }
                if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
                    System.out.println("Весы");
                }
                if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
                    System.out.println("Скорпион");
                }
                if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
                    System.out.println("Стрелец");
                }
                if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) {
                    System.out.println("Козерог");
                }
                if ((day >= 21 && month == 1) || (day <= 18 && month == 2)) {
                    System.out.println("Водолей");
                }
                if ((day >= 19 && month == 2) || (day <= 20 && month == 3)) {
                    System.out.println("Рыбы");
                }
                if (year % 12 == 0) {
                    System.out.println("Год Обезьяны");
                }
                if ((year - 1) % 12 == 0) {
                    System.out.println("Год Петуха");
                }
                if ((year - 2) % 12 == 0) {
                    System.out.println("Год Собаки");
                }
                if ((year - 3) % 12 == 0) {
                    System.out.println("Год Свиньи");
                }
                if ((year - 4) % 12 == 0) {
                    System.out.println("Год Крысы");
                }
                if ((year - 5) % 12 == 0) {
                    System.out.println("Год Быка");
                }
                if ((year - 6) % 12 == 0) {
                    System.out.println("Год Тигра");
                }
                if ((year - 7) % 12 == 0) {
                    System.out.println("Год Кролика");
                }
                if ((year - 8) % 12 == 0) {
                    System.out.println("Год Дракона");
                }
                if ((year - 9) % 12 == 0) {
                    System.out.println("Год Змея");
                }
                if ((year - 10) % 12 == 0) {
                    System.out.println("Год Лошади");
                }
                if ((year - 11) % 12 == 0) {
                    System.out.println("Год Козы");
                }
            }
        }
    }
}
