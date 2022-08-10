package dzpyatodinstroki;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку символ: ");
        String str = sc.nextLine();
        System.out.println("Введите искомый символ: ");
        String word = sc.next();
        int counter = 0;
        if (word.length() == 1) {
            char ch = word.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.printf("Количество повторений символа %s в строке %d", word, counter);
            } else {
                System.out.printf("Символ %s в строке отсутсвует", word);
            }
        } else {
            System.out.println("Ошибка! Введено более одного символа!");
        }
    }
}
