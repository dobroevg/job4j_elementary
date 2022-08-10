package uroki;

import java.util.Arrays;
import java.util.Random;

public class Lesson14one {
    public static void main(String[] args) {
        Random rand = new Random();
        byte[] numbers = new byte[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (byte) (rand.nextInt(21) + 20);
        }

        for (byte num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println("Сортировка");

        //byte[] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        //Arrays.sort(numbers);

        for (byte num : numbers) {
            System.out.printf("%d ", num);
        }
        int counter = 0;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i + 1; j++) {
                if (numbers[j - 1] < numbers[j]) {
                    byte tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
                counter++;
            }
        }
        System.out.println("Оригинальный массив ");
        System.out.println(Arrays.toString(numbers));
        System.out.println(counter);
    }
}
