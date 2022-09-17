package dzshestdvarekursia;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число А");
        int a = sc.nextInt();
        System.out.println("Введите целое число B");
        int b = sc.nextInt();
        show(a, b);
    }

    static void show(int start, int end) {
        if (start < end) {
            System.out.print(start + " ");
            show(start + 1, end);
            if (end - start == 1) {
                System.out.print(end);
            }
        }
        if (start > end) {
            System.out.print(start + " ");
            show(start - 1, end);
            if (start - end == 1) {
                System.out.print(end);
            }
        }
    }
}