package dzpyattrimmassivy;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-10, 31);
        }
        int sum = 0;
        int firstnegative = mass.length;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0 && firstnegative == mass.length) {
                firstnegative = i;
            }
            if (i > firstnegative) {
                sum += mass[i];
            }
        }
        System.out.println("Massiv: " + Arrays.toString(mass));
        System.out.println("Сумма чисел после первого отрицательного числа: " + sum);
    }
}
