package uroki;

import java.util.Random;
import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(5, 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 20);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество число от 0 до 20: ");
        int[] number = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            if (number == array) {
                System.out.println(i);
                System.out.println(number);
                break;
            }
        }
    }
}
