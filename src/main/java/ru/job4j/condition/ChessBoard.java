package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 - x2 == y1 - y2 || x1 - x2 == -(y1 - y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(way(1, 1, 3, 3));
        System.out.println(way(5, 7, 2, 4));
        System.out.println(way(3, 1, 1, 3));
        System.out.println(way(1, 4, 1, 3));
        System.out.println(way(7, 8, 7, 8));
    }
}