package ru.job4j.math;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 5);
        System.out.println(rsl);
        rsl = Max.max(4, 2);
        System.out.println(rsl);
        rsl = Max.max(8, 8);
        System.out.println(rsl);
    }
}
