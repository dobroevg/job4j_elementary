package dzpyatoe;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число пробега за первый день х, км: ");
        double x = sc.nextDouble();
        System.out.println("Введите число пробега y, км: ");
        double y = sc.nextDouble();
        int i = 0;
        double distance = x;
        for (; y > distance; i++) {
            distance = distance * 1.1;
            }
        System.out.println("Количество дней: " + i);
    }
}