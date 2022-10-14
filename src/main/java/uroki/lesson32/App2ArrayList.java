package uroki.lesson32;

import java.util.ArrayList;
import java.util.Random;

public class App2ArrayList {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        int size = 14;
        for (Integer i = 0; i < size; i++) {
            list.add(rand.nextInt(0, 100));
        }

        System.out.println("Сгенерированный список чисел: ");

        for (int element : list) {
            System.out.print(element + " ");
        }

        System.out.println("Сгенерированный список чисел: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");;
        }

        System.out.println();

        int number = 40;
        if (list.contains(number)) {
            System.out.println("содержит число " + number);
        }


    }
}
