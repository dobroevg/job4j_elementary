package ru.job4j.math;

public class Max1 {
    public static void main(String[] args) {
        max(1, 3);
        max(3, 5);
        max(10, 10);
    }

    public static void max(int left, int right) {
        int rsl = left < right ? right : left;
        System.out.println(rsl);
    }
}
