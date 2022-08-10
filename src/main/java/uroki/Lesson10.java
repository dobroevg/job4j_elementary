package uroki;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        int n = x;
        int size = 0;
        for (; n % 10 > 0; size++) {
            n /= 10;
        }
        System.out.println(size);
        int half = size / 2;
        int power10 = 1;
        for (int i = 0; i < half; i++) {
            power10 *= 10;
        }
        System.out.println(power10);
        int high = (int) (x / power10);
        int low = (int) (x % power10);
        System.out.println(high);
        System.out.println(low);
    }
}