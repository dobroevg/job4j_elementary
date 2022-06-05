package dztretye;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        while (true) {
            Scanner scann = new Scanner(System.in);
            System.out.println("Введите номер квартиры N");
            int n = scann.nextInt();
            Scanner scanm = new Scanner(System.in);
            System.out.println("Введите число квартир на этаже M");
            int m = scanm.nextInt();
            double result = Math.ceil((double)n / (m * 9));
            System.out.println("Подъезд № " + (int) result);
        }
    }
}
