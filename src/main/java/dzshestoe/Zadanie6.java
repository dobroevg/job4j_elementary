package dzshestoe;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количествр ступеней: ");
        int number = sc.nextInt();
        int height;
        if (number == 1) {
            height = 1;
        } else {
            height = 2 * number - 1;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height + 1; j++) {
                if ((j == i && i % 2 == 0) || j == i + 1 || ((j == i + 2) && (i % 2 == 0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
