package ru.job4j;

public class Echo {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 50;
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 1000;
        float euro = Echo.rubleToEuro(rubles);
        float dollar = Echo.rubleToDollar(rubles);
        System.out.println(euro);
        System.out.println(dollar);
    }
}
