package ru.job4j;

import java.awt.*;

public class Ecalcdvetochki {
    public static double distance(int x1, int y1, int x2, int y2) { //инициализация
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // формула вычисления длины
    }

    public static void printDistance(int x1, int y1, int x2, int y2) { //вывод длины
        System.out.println("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") = " + Point.distance(x1, y1, x2, y2));
    }

    public static void main(String[] args) { //задание координат
        Ecalcdvetochki.printDistance(5, 3, 1, 4);
        Ecalcdvetochki.printDistance(3, 4, 8, 10);
    }
}
