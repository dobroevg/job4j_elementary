package uroki;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите арифметическое выражение: ");
            double num1 = sc.nextDouble();
            String operation = sc.next();
            double num2 = sc.nextDouble();
            boolean isError = false;
            double result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                case ":":
                    result = num1 / num2;
                    break;
                default:
                    isError = true;
            }
            if (isError) {
                System.out.println("Ошибка вычмсления");
            } else {
                System.out.println(" = " + result);
            }
            System.out.println("Хотите ли продолжить вычисления?");
            answer = sc.next();
        } while (answer.equals("да"));
        sc.close();
    }
}