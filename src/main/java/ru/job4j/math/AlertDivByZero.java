package ru.job4j.math;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-6);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Внимание 0!");
        }
        if (number < 0) {
                System.out.println("Внимание минус!");
        }
    }

}
