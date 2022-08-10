package uroki;

import java.util.Arrays;
import java.util.Random;

public class Lesson19 {

    static int compare1(Integer a, Integer b) {
        return a - b;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100, 200);
        }
        System.out.println("origin:\n" + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("usual sort:\n" + Arrays.toString(array));

//        Arrays.sort(array, Lesson19::compare1);

        System.out.println("sort with compare:\n" + Arrays.toString(array));
    }
}
