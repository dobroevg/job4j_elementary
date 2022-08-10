package dzsedmoe;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int[] number = new int[sc.nextInt()];
        System.out.printf("Введите %d чисел: ", number.length);
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        String answer = "Yes";
        int start = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] != number[0]) {
                answer = "No";
                break;
            }
        }
        System.out.printf(answer);
    }
}
