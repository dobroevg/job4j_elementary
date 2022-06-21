package dzpyatoe;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 10_000_000; i < 100_000_000; i++) {
            int e1 = i % 10;
            int e2 = i / 10 % 10;
            int e3 = i / 100 % 10;
            int e4 = i / 1000 % 10;
            int e5 = i / 10000 % 10;
            int e6 = i / 100000 % 10;
            int e7 = i / 1000000 % 10;
            int e8 = i / 10000000 % 10;
            if ((e1 == e2) || (e1 == e3) || (e1 == e4) || (e1 == e5) || (e1 == e6) || (e1 == e7) || (e1 == e8)
                    || (e2 == e3) || (e2 == e4) || (e2 == e5) || (e2 == e6) || (e2 == e7) || (e2 == e8) || (e3 == e4)
                    || (e3 == e5) || (e3 == e6) || (e3 == e7) || (e3 == e8) || (e4 == e5) || (e4 == e6) || (e4 == e7)
                    || (e4 == e8) || (e5 == e6) || (e5 == e7) || (e5 == e8) || (e6 == e7) || (e6 == e8) || (e7 == e8)) {
                continue;
            } else {
                if (i % 12345 != 0) {
                    continue;
                } else {
                    n++;
                    System.out.println(i);
                }
            }
        }
        System.out.println("Количество чисел: " + n);
    }
}