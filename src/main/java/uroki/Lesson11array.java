package uroki;

import java.util.Locale;
import java.util.Scanner;

public class Lesson11array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Введите количество дней: ");
        double[] income = new double[sc.nextInt()];
        System.out.println("Введите доход на каждый день: ");
        for (int i = 0; i < income.length; i++) {
            System.out.printf("День №%d: ", i + 1);
            income[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }
        System.out.println("Общий доход: " + sum);
        System.out.println("Доход по дням: ");
        for (int i = income.length - 1; i >= 0; i--) {
            System.out.printf(" %f", income[i]);
        }
        System.out.println("Эдементы массивов с повтором: ");
        for (int i = 0; i < 100; i++) {
            int index = i % income.length;
            System.out.println(i);
            System.out.println(income.length);
            System.out.printf("%f ", income[index]);
        }
        sc.close();
    }
}
