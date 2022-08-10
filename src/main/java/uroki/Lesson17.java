package uroki;

import java.util.Random;
import java.util.Scanner;

public class Lesson17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] hall = null;
        do {
            System.out.println("Введите размер зала: ");
            int width = sc.nextInt();
            int heigh = sc.nextInt();
            if (width > 0 && heigh > 0) {
                hall = new boolean[heigh][width];
            }
        } while (hall == null);

        Random rand = new Random();
        for (boolean[] row : hall) {
            for (int i = 0; i < row.length; i++) {
                row[i] = rand.nextBoolean();
            }
        }
        for (boolean[] row : hall) {
            for (boolean sit : row) {
                System.out.print((sit ? "X" : "O") + " ");
            }
            System.out.println();
        }
        int sitCount = -1;
        do {
            System.out.println("Сколько нужно мест?");
            sitCount = sc.nextInt();
        } while (sitCount < 1);

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length - sitCount  + 1; j++) {
                int count = 0;
                boolean hasSits = true;
                for (int k = 0; k < sitCount; k++) {
                   if (hall[i][j + k]) {
                       hasSits = false;
                       break;
                   }
                }
                if (hasSits) {
                    System.out.print("ряд №" + (i + 1) + " места:");
                    for (int k = 0; k < sitCount; k++) {
                        System.out.print(" " + (j + k + 1));
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
