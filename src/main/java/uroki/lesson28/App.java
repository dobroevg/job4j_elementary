package uroki.lesson28;

import java.util.Scanner;

public class App {
    static <T> void print(SimpleCollection<T> list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        var sc = new Scanner("a\nb\nc\nd\ne\n");


        var list = new SimpleCollection<String>(5);
        print(list);
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            String str = sc.nextLine();
            list.pushBack(str);
        }
        System.out.println();

        print(list);
        System.out.println();



        list.pushBack("-- 1 --");
        list.pushBack("-- 2 --");
        list.pushBack("-- 3 --");
        print(list);
        System.out.println();
        list.pushBack("-- 4 --");

        print(list);
        System.out.println();

        System.out.println("Значение удаленного элемента: " + list.popBack());
        print(list);
        System.out.println();
//        list.add("-- 5 --");
//        print(list);
//        System.out.println();
        list.pushFront("FIRST");

        print(list);
        System.out.println();

        System.out.println("Значение удаленного ПЕРВОГО элемента: " + list.popFront());

        print(list);
        System.out.println();

//        list.truncate();
//        print(list);
//        System.out.println();



//        var numList = new SimpleCollection<Double>(2);
//        numList.add(4.6);
//        numList.add(-0.3);
//
//        print(numList);
//        System.out.println();

        sc.close();
    }
}
