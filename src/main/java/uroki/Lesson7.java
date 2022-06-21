package uroki;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня");
        int num = sc.nextInt();
        int result = num & -2;
        System.out.println(result);
    }
}