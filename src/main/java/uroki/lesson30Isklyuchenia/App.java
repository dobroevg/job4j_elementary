package uroki.lesson30Isklyuchenia;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random rand = new Random(0);
        IntList list = new IntList(6);
        for (int i = 0; i < list.getSize(); i++) {
            list.set(i, rand.nextInt(0, 11));
        }

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i) + " ");
        }

        System.out.println();

        System.out.println(list.get(10));

//        System.out.println("index = -1" + list.get(-1));

        IntList wrongList = new IntList(-1);

    }
}
