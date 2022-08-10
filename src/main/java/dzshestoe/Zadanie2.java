package dzshestoe;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту фигуры: ");
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j == height - 1) || i == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
