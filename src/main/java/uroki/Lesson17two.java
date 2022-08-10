package uroki;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson17two {
    static void fillRandom(int[] array, int start, int end, Random rand) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(start, end);
        }
    }

    static int[] generateRandomArray(int size, int start, int end, Random rand) {
        int[] array = new int[size];
        fillRandom(array, start, end, rand);
        return array;
    }

    static void fillRandom(int[][] array, int start, int end, Random rand) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(start, end);
            }
        }
        for (int[] row: array) {
            fillRandom(row, start, end, rand);
        }
    }

    static int[][] generateRandomArray(int size1, int size2, int start, int end, Random rand) {
        int[][] array = new int[size1][size2];
        fillRandom(array, start, end, rand);
        return array;
    }

    public static void main(String[] args) {
        int[][] table = generateRandomArray(6, 10, 0, 10, new Random());
        int[] tnull = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 0) {
                    tnull[i] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(tnull));
    }
}
