package dzpyatoe;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        for (int i = 1; i < 32; i++) {
            int result = (int) ((n & (1 << (31 - i))) / Math.pow(2, (31 - i)));
            System.out.print(result);
        }
    }
}
