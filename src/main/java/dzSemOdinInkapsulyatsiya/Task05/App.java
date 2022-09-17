package dzSemOdinInkapsulyatsiya.Task05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вещественную часть первого числа целым или не целым числом: ");
        boolean isInt1 = sc.hasNextInt();
        int realInt1 = 0;
        double realDouble1 = 0;
        if(isInt1) {
            realInt1 = sc.nextInt();
        } else {
            realDouble1 = sc.nextDouble();
        }
        System.out.println("Введите мнимую часть первого числа целым или не целым числом: ");
        boolean isInt2 = sc.hasNextInt();
        int imaginaryInt1 = 0;
        double imaginaryDouble1 = 0;
        if(isInt2) {
            imaginaryInt1 = sc.nextInt();
        } else {
            imaginaryDouble1 = sc.nextDouble();
        }
        System.out.println("Введите вещественную часть второго числа целым или не целым числом: ");
        boolean isInt3 = sc.hasNextInt();
        int realInt2 = 0;
        double realDouble2 = 0;
        if(isInt3) {
            realInt2 = sc.nextInt();
        } else {
            realDouble2 = sc.nextDouble();
        }
        System.out.println("Введите мнимую часть второго числа целым или не целым числом: ");
        boolean isInt4 = sc.hasNextInt();
        int imaginaryInt2 = 0;
        double imaginaryDouble2 = 0;
        if(isInt4) {
            imaginaryInt2 = sc.nextInt();
        } else {
            imaginaryDouble2 = sc.nextDouble();
        }
        ComplexNumber number1 = new ComplexNumber(realDouble1, imaginaryDouble1, realInt1, imaginaryInt1);
        ComplexNumber number2 = new ComplexNumber(realDouble2, imaginaryDouble2, realInt2, imaginaryInt2);
        System.out.println("Комплексное число 1: " +  number1.printComplexNumber());
        System.out.println("Комплексное число 2: " +  number2.printComplexNumber());
        if(number1.comparison(number2)) {
            System.out.println("Комплексные числа равны");
        } else {
            System.out.println("Комплексные числа НЕ равны");
        }
        System.out.println("Сумма комплексных чисел: " + (number1.add(number2)).printComplexNumber());
        System.out.println("Разность комплексное число1 минус комплексное число2: " + (number1.subtraction(number2)).printComplexNumber());
        System.out.println("Умножение комплексного числа1 и комплексного числа2: " + (number1.multiplication(number2)).printComplexNumber());
    }
}
