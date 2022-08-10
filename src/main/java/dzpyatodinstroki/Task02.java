package dzpyatodinstroki;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String str = "";
        for (int value = 1; value < 500; value++) {
            str = str.concat(String.valueOf(value));
        }
        String str1 = str.substring(0, 1000);
        System.out.println(str1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите позицию n цифры: ");
        int number = sc.nextInt();
        char n = str1.charAt(number);
        System.out.println("Цифра с позиции n: " + n);
    }
}
