package dztretye;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите год");
            Scanner scanday = new Scanner(System.in);
            int year = scanday.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("366 дней");
            } else {
                System.out.println("365 дней");
            }
        }
    }    
}
