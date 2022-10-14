package uroki.lesson31Iskluchenia2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tryCount = 1;

        Scanner sc = new Scanner(System.in);

        Date date = null;
        boolean isCorrect = true;
        while (date == null) {
            System.out.println("Началась попытка №" + tryCount);

            try {
                System.out.println("Введите дату: ");
                String str = sc.nextLine();
                date = Date.fromString(str, "-");
                System.out.println("Все верно, работаем дальше!");
            } catch (WrongDateFormatException e) {
                System.out.println("Неправильный формат даты!");
            }
            System.out.println("Закончилась попытка №" + tryCount);
            tryCount++;
        }
//        System.out.println("date: " + date);
//        sc.close();
//
//        Date data1 = new Date(18, 8, 2022);
//        System.out.println(data1);
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Введите дату: ");
//        String str = sc1.nextLine();
//        //!
//        Date data2 = Date.fromString(str, "/");
//        System.out.println(data2);
//        data2.setMonth(7);
//        System.out.println(data2);
//        sc.close();
    }
}
