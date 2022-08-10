package uroki;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lesson15two {
    public static void main(String[] args) {
        long[] mas = new long[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas.length - 1;
        }

        long[][] rows = new long[5][];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new long[i + 1];
        }
        int count = 1;

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                rows[i][j] = count++;
                System.out.printf("%2d ", rows[i][j]);
            }
            System.out.println();
        }
    }
}
