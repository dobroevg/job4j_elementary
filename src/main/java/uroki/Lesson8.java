package uroki;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввежите начало и конец диапазона: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        for  (; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
