package ru.job4j;

public class Ecalculators {
    public static int func1(int x) { //объявление метода int для сохранения результата в инт и объявл. переменной
        int y = x * x + 1; //формула метода
        System.out.println("Функция1= " + y);
        return y; // указывает что является результатом вычисления
    }

    public static int func2(int x) {
        int y = x + 2;
        System.out.println("Функция2= " + y);
        return y;
    }

    public static void main(String[] args) {
        int result1 = Ecalculators.func1(2); //инициализация переменной в методе func1 и инициализаия переменной для метода main
        int result2 = Ecalculators.func2(10);
        int result3 = Ecalculators.func1(100);
        int total = result1 + result2 + result3;
        System.out.println("Общий итог " + total);
    }
}
