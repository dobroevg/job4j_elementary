package dzpyattrimmassivy;

import java.util.Arrays;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[200];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(0, 201);
        }
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] / 10 == 0) {
                digit1 += 1;
            } else {
                if (mass[i] / 10 > 0 && mass[i] / 100 == 0) {
                    digit2 += 1;
                } else {
                    digit3 += 1;
                }
            }
        }
        System.out.println("Массив: " + Arrays.toString(mass));
        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
    }
}
