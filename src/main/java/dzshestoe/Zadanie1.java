package dzshestoe;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту фигуры: ");
        int height = sc.nextInt();
         for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j == height - 1) || (i == height - 1) || (j == height - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= height - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}