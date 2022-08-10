package uroki;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        long[] longNumbers;
        Scanner sc = new Scanner(System.in);
        boolean isFive = sc.next().equals("five");
        if (isFive) {
            longNumbers = new long[5];
        } else {
            longNumbers = new long[10];
        }
        for (int i = 0; i < longNumbers.length; i++) {
            longNumbers[i] = (i + 1) * (i + 1);
        }
        System.out.print("LongNumbers 1: ");
        for (int i = 0; i < longNumbers.length; i++) {
            System.out.print(longNumbers[i] + " ");
        }
        longNumbers = new long[] {17, 23, 5, 3, 115, 6};
        System.out.print("LongNumbers 2: ");
        for (int i = 0; i < longNumbers.length; i++) {
            System.out.print(longNumbers[i] + " ");
        }
        System.out.print("longNumbers --> " + longNumbers);
        System.out.print(Arrays.toString(longNumbers));
        String[] words = new String[] {"Что", "тут", "происходит"};

    }
}
