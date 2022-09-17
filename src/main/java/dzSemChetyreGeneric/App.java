package dzSemChetyreGeneric;

import java.util.Scanner;

public class App {
    static <T> void printCollection(MyArrayList<T> list) {
        System.out.println("<begin>");
        // вывод обычных элементов
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("  " + i + ": " + list.get(i));
        }

        if (list.getCapacity() > 0) {
            // вывод того, что лежит в коллекции за пределами размера
            System.out.println("  <capacity>");
            for (int i = list.getSize(); i < list.getCapacity(); i++) {
                System.out.println("    " + i + ": " + list.get(i));
            }
            System.out.println("  </capacity>");
        }
        System.out.println("<end>\n");
    }

    public static void main(String[] args) {
        var sc = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");

        var list = new MyArrayList<>(5);
        System.out.println("Создана коллекция емкостью " + list.getCapacity() + ":");
        printCollection(list);

        System.out.println("Заполнение всей емкости коллекции:");
        int cap = list.getCapacity(); // лучше вынести, чтобы гарантировать, что коллекция не расришится в процессе заполения
        for (int i = 0; i < cap; i++) {
            String str = sc.nextLine();
            list.pushBack(str);
        }
        printCollection(list);

        System.out.println("Добавили один элемент сверх емкости:");
        list.pushBack("-- 1 --");
        printCollection(list);

        System.out.println("Снова заполнили текущую емкость:");
        list.pushBack("-- 2 --");
        list.pushBack("-- 3 --");
        printCollection(list);

        System.out.println("Добавили еще элемент, вызвали расширение коллекции:");
        list.pushBack("-- 4 --");
        printCollection(list);

        System.out.println("С конца удалили элемент: " + list.popBack());
        printCollection(list);

        System.out.println("Добавили в конец другой:");
        list.pushBack("-- 5 --");
        printCollection(list);

        System.out.println("С начала удалили элемент: " + list.popFront());
        printCollection(list);

        System.out.println("Добавили в начало другой:");
        list.pushFront("FIRST");
        printCollection(list);


        System.out.printf("Удалили пару элементов с начала: %s, %s\n", list.popFront(), list.popFront());
        printCollection(list);

        System.out.printf("Удалили пару элементов с конца: %s, %s\n", list.popBack(), list.popBack());
        printCollection(list);

        System.out.println("Обрезали емкость коллекции до её размера:");
        list.truncate();
        printCollection(list);


//		System.out.println("Числовая коллекция");
//		var numList = new SimpleCollection<Double>(0);
//		numList.pushBack(4.6);
//		numList.pushBack(-1.0);
//		numList.pushBack(777.0);
//		printCollection(numList);

        sc.close();
    }
}
