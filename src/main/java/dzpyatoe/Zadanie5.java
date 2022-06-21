package dzpyatoe;

import java.util.Scanner;

public class Zadanie5 {
    @SuppressWarnings("checkstyle:OperatorWrap")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        int e1 = n % 10;
        int e2 = n / 10 % 10;
        int e3 = n / 100 % 10;
        int e4 = n / 1000 % 10;
        int e5 = n / 10000 % 10;
        int e6 = n / 100000 % 10;
        int e7 = n / 1000000 % 10;
        int e8 = n / 10000000 % 10;
        int e9 = n / 100000000 % 10;
        int e10 = n / 1000000000 % 10;
        int summa = 0;
        String answer = "NO";
        if (e10 > 0) {
            if (e10 == e1 && e9 == e2 && e8 == e3 && e7 == e4 && e6 == e5) answer = "YES";
            } else {
                if (e9 > 0) {
                    if (e9 == e1 && e8 == e2 && e7 == e3 && e6 == e4) answer = "YES";
                    } else {
                        if (e8 > 0) {
                            if (e8 == e1 && e7 == e2 && e6 == e3 && e5 == e4) answer = "YES";
                            } else {
                                if (e7 > 0) {
                                    if (e7 == e1 && e6 == e2 && e5 == e3) answer = "YES";
                                    } else {
                                        if (e6 > 0) {
                                            if (e6 == e1 && e5 == e2 && e4 == e3) answer = "YES";
                                            } else {
                                                if (e5 > 0) {
                                                    if (e5 == e1 && e4 == e2) answer = "YES";
                                                    } else {
                                                        if (e4 > 0) {
                                                            if (e4 == e1 && e3 == e2) answer = "YES";
                                                            } else {
                                                                if (e3 > 0) {
                                                                    if (e3 == e1) answer = "YES";
                                                                     } else {
                                                                        if (e2 > 0) {
                                                                            if (e2 == e1) answer = "YES";
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        System.out.println(answer);
    }
}