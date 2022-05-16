package ru.job4j;
import java.util.Scanner;
public class Dz_220510 {
    public static void main(String args[]) {
        int a = 14;
        int b = 5;//hjgj
        float c = 8.4F;
        float d = 9.1F;
        int ab = a + b;
        int ba = a - b;
        float cd = c / d;
        float dc = c * d;
        int aba = a % b;
        System.out.println("ПЕРВАЯ ЧАСТЬ - ПРОСТЫЕ ОПЕРАЦИИ:");
        System.out.println("Сложение a и b= " + ab);
        System.out.println("Вычитание a и b= " + ba);
        System.out.println("Деление c и d= " + cd);
        System.out.println("Умножение c и d= " + dc);
        System.out.println("Остаток a на b= " + aba);
        System.out.println("ВТОРАЯ ЧАСТЬ - УГАДАЙ ЧИСЛО:");
        Scanner scmin = new Scanner(System.in);
        System.out.println("Введите число min: ");
        int number1 = scmin.nextInt();
        Scanner scmax = new Scanner(System.in);
        System.out.println("Введите число max: ");
        int number2 = scmax.nextInt();
        int e = (int) ( Math.random() * (number2+1-number1) + number1);
        while (true){
            Scanner scnum = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number3 = scnum.nextInt();
            if(number3 > e){
                System.out.println("Ввведите меньше");
            }else if(number3 < e){
                System.out.println("Ввведите больше");
            }else {
                System.out.println("Вы угадали, это число " + e);
                break;
                }
            }
    }
}