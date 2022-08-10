package uroki;

import java.util.Random;
import java.util.Scanner;

public class Lesson16one {
    static void  print(int[] array) {
        for (int num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

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

    static boolean fillByKeyboard(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            if (!sc.hasNext()) {
                return false;
            }
            array[i] = sc.nextInt();
        }
        return true;
    }

    public static void main(String[] args) {
        int[] mas = new int[] {4, 10, 8, -3, 7, 10};
        print(mas);
        Random rand = new Random();
        int[] mas2 = new int[4];
        fillRandom(mas2, -10, 20, rand);
        print(mas2);

        System.out.println("mas4");
        int[] mas4 = generateRandomArray(7, 0, 5, rand);
        print(mas4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести массив");
        fillByKeyboard(mas4, sc);
        System.out.println("Вывод массива");
        print(mas4);

        sc.close();
    }
}
