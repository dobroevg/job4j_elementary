package ru.job4j;

public class Ecalculator {
    public static void plus(int first, int second, int third) { //описание метода и объявление переменных
        int result = first + second - third; //действия
        System.out.println(result);
    }

    public static void main(String[] args) {
        Ecalculator.plus(1, 2, 4); // имя класса Ecalculator, потом имя метода, потом аргументы
        Ecalculator.plus(10, 11, 12);
        Ecalculator.plus(342, 15, 122);
    }
}
