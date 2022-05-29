package ru.job4j;

import java.awt.*;

public class Eploshadpryam {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return s;
    }

    public static void printSquare(double p, double k) { //вывод длины
        System.out.println("result s (" + p + ", " + k + ") = " + square(p, k));
    }

    public static void main(String[] args) {
        Eploshadpryam.printSquare(10.1,0.55);
        Eploshadpryam.printSquare(15.1,1);
    }
}
