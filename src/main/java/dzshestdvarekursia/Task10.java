package dzshestdvarekursia;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int a = Math.abs(sc.nextInt());
        System.out.println("Введите число 2: ");
        int b = Math.abs(sc.nextInt());
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        nod(min, max, min);
    }

    static void nod(int min, int max, int c) {
        if (max % c == 0 && min % c == 0) {
            System.out.println("Наибольший общий делитель обоих чисел: " + c);
        } else {
            c -= 1;
            nod(min, max, c);
        }
    }
}
