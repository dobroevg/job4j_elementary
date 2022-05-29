package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*; //ссылка на пакет из которого берем методы

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second); //действия с методами из другого пакета
    }

    public static double vychAndDelen(double first, double second) {
        return vych(first, second) + delen(first, second);
    }

    public static double sumvse(double first, double second) {
        return vych(first, second) + delen(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен " + sumAndMultiply(15, 18));
        System.out.println("Результат расчета 2 равен " + vychAndDelen(30, 15));
        System.out.println("Результат расчета 3 равен " + sumvse(45, 33));
    }
}
