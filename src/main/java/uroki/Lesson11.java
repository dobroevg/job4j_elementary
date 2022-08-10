package uroki;

import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        final int size = 10;
        for (int j = 1; j < size; j++) {
            System.out.print(". ");
        }
        System.out.print("@ \n");
        for (int i = 1; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.print(". ");
            }
            System.out.print("@ ");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("_ ");
            }
            System.out.print("@ \n");
        }
        for (int j = 0; j < size; j++) {
            System.out.print("@ ");
        }
        System.out.println();
    }
}
