package dztretye;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie7 {
    public static void main(String[]args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите символ:");
            String simvol = sc.nextLine();
            Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
            Matcher matlatletter = patlatletter.matcher(simvol);
            Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
            Matcher matkirletter = patkirletter.matcher(simvol);
            Pattern patnumber = Pattern.compile("[0-9]{1}");
            Matcher matnumber = patnumber.matcher(simvol);
            if (matlatletter.matches() == true) {
                System.out.println("Латиница");
            } else if (matkirletter.matches() == true) {
                System.out.println("Кирилица");
            } else if (matnumber.matches() == true) {
                System.out.println("Цифра");
            } else {
                System.out.println("Невозможно определить");
            }
        }
    }
}