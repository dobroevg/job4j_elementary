package dzshestodinmetody;

import java.util.Arrays;

public class Task02 {
    static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    static void print(String[] array) {

        System.out.println(Arrays.toString(array));
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    static void print(float[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 5};
        print(mass1);
        String[] mass2 = {"one", "two", "free", "four"};
        print(mass2);
        int[][] mass3 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        print(mass3);
        float[][] mass4 = {{13.3f, -5.666f}, {-876.98f, 876f, 13.7f}, {32.3f}};
        print(mass4);
    }
}
