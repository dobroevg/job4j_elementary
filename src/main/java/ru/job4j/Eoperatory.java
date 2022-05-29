package ru.job4j;

public class Eoperatory {
    public static void main(String args[]) {
        int i = 38;
        String currentBinary = Integer.toBinaryString(i);
        System.out.println(currentBinary); //перевод в двоичное представление
        int x = 6;
        boolean r = x < 8;
        System.out.println(r); // сравнение
        boolean t = i > x || i < 5;
        System.out.println(t);
        int a = (i > x) ? i : x; //тринарный оператор
        System.out.println(a);
        String vozrast = (x > 1 && x < 19) ? "подросток" : "не подросток"; //
        System.out.println(vozrast);
        int y = 5;
        switch (y) {
            case 1 : System.out.println(1);
            break;
            case 2 : System.out.println(2);
            break;
            case 3 : System.out.println(3);
            break;
            default: System.out.println("другое");
            break;
        }
    }
}