package uroki;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите математическое выражение: ");
        int number1 = scanner.nextInt();
        String operation = scanner.next();
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        System.out.printf("%d %s %d = %d", number1, operation, number2, result);
        scanner.close();
    }
}
