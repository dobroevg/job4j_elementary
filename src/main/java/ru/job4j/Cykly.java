package ru.job4j;

import java.util.ArrayList;

public class Cykly {
    public static void main (String args [] ) {
        int i = 0; // инициализация
        while (i < 5) { // условие выполнения цикла
            System.out.println("i равен " + i++); // вывод и  увеличение, обязательно должно быть изменение
        } // возврат в начало цикла
        System.out.println (i);
        int y = 0;
        do { // действие выполнится независимо от условия while
            y++;
            System.out.println ("y равен " + y);
        }
        while (y > 20); // проверка условия и возврат в начало цикла к do
        System.out.println (y);
        for (int x = 3, z = 5; x < 10; ++x, --z) { // инициализация, условие, счетчик (изм. переменных)
            System.out.println("x равен " + x + ", z равен " + z); // действие
        }
        int [] numbers = new int[] {5, 8, 10}; // создание массива
        for (int nomer : numbers) { // выборка номеров из массива
            System.out.println (nomer);
        }
        String[] seasons = new String [] {"winter", "Spring", "Summer", "Autumn"}; //формирование массива
        for (int q = 0; q < 4; q++) { //запуск цикла
            System.out.println(seasons[q]); // вывод каждого сезона поочередно
        }
        int p = 1; // инициализация переменной
        while (p < 10) { // запуск цикла с условием
            System.out.println(p);
            if (p >= 3) break; // условие для прерывания и уход в конец цикла
            p++;
        }
        for (int v = 10; v < 12; v++) {
            System.out.println ("v равен " + v);
            for (int w = 0; w < 2; w++) { // 2ой цикл проходит, потом начинает заново
                System.out.println ("w равен " + w);
                System.out.println ("разность равна " + (w - v));
            }
        }
        for (int r = 10; r < 15; r++) {
            System.out.println("r равен " + r);
            for (int u = 0; u < 4; u++) {
                System.out.println("u равен " + u);
                System.out.println("сумма равна " + (u + r));
                if (u + r > 13) break; //переход в начало 1 цикла при выполнении условия
            }
        }
        for (int o = 0; o < 10; ++o) {
            if (o % 2 == 1 && o < 5) continue;
            System.out.println("o равен " + o);
        }
    }
}
