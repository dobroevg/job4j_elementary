package dzSemOdinInkapsulyatsiya.Task03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите гривны из первой суммы: ");
        long grn1 = sc.nextLong();
        System.out.println("Введите копейки из первой суммы: ");
        byte kop1 = sc.nextByte();
        System.out.println("Введите гривны из второй суммы: ");
        long grn2 = sc.nextLong();
        System.out.println("Введите копейки из второй суммы: ");
        byte kop2 = sc.nextByte();
        Monney sum1 = new Monney(grn1, kop1);
        Monney sum2 = new Monney(grn2, kop2);
        System.out.println("Сумма1: " + sum1.printSum());
        System.out.println("Сумма2: " + sum2.printSum());
        System.out.println("Сложение суммы1 и суммы2: " + sum1.add(sum2).printSum());
        if(sum1.comparison(sum2)) {
            System.out.println("Сумма1 больше или равна сумме2");
            System.out.println("Вычитание суммы1 и суммы2: " + sum1.subtraction(sum2).printSum());
        } else {
            System.out.println("Сумма2 больше суммы1");
            System.out.println("Вычитание суммы1 и суммы2: " + "-" + sum1.subtraction(sum2).printSum());
        }
        System.out.println("Деление суммы1 на сумму2: " + sum1.division(sum2));
        System.out.println("Введите целый числитель дроби: ");
        int numerator = sc.nextInt();
        System.out.println("Введите целый знаменатель дроби: ");
        int denominator = sc.nextInt();
        System.out.println("Деление суммы1 на дробь: " + sum1.divisionFraction(numerator, denominator).printSum());
        System.out.println("Умножение суммы1 на дробь: " + sum1.divisionFraction(denominator, numerator).printSum());
    }
}
