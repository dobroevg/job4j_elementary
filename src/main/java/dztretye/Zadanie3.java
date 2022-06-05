package dztretye;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Номера животных: 1 - кошка, 2 - собака, 3 - корова, 4 - соловей, " +
                "5 - голубь, 6 - курица, 7 - петух , 8 - свинья, 9 - баран, 10 - лошадь");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер животного");
            int sc = scan.nextInt();
            if (sc < 1 || sc > 10) {
                System.out.println("Число введено неверно, введите еще раз");
            } else {
                switch (sc) {
                    case 1: System.out.println("мяу");
                        System.out.println(" ");
                        break;
                    case 2: System.out.println("гав");
                        System.out.println(" ");
                        break;
                    case 3: System.out.println("муу");
                        System.out.println(" ");
                        break;
                    case 4: System.out.println("тиутиу");
                        System.out.println(" ");
                        break;
                    case 5: System.out.println("гули-гули");
                        System.out.println(" ");
                        break;
                    case 6: System.out.println("ко-ко");
                        System.out.println(" ");
                        break;
                    case 7: System.out.println("кукареку");
                        System.out.println(" ");
                        break;
                    case 8: System.out.println("хрююю");
                        System.out.println(" ");
                        break;
                    case 9: System.out.println("беее");
                        System.out.println(" ");
                        break;
                    case 10: System.out.println("игого");
                        System.out.println(" ");
                        break;
                }
            }
        }
    }
}
