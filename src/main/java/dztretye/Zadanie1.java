package dztretye;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер дня недели от 1 до 7: ");
            int sc = scan.nextInt();
            if (sc < 1 || sc > 7) {
                System.out.println("Число введено неверно, введите еще раз");
            } else {
                switch (sc) {
                    case 1: System.out.printf("%d это понедельник", sc);
                    System.out.println(" ");
                    break;
                    case 2: System.out.printf("%d это вторник", sc);
                    System.out.println(" ");
                    break;
                    case 3: System.out.printf("%d это среда", sc);
                    System.out.println(" ");
                    break;
                    case 4: System.out.printf("%d это четверг", sc);
                    System.out.println(" ");
                    break;
                    case 5: System.out.printf("%d это пятница", sc);
                    System.out.println(" ");
                    break;
                    case 6: System.out.printf("%d это суббота", sc);
                    System.out.println(" ");
                    break;
                    case 7: System.out.printf("%d это воскресенье", sc);
                    System.out.println(" ");
                    break;
                    }
            }
        }
    }
}
