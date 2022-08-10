package dzpyatodinstroki;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова: ");
        String str = sc.nextLine();
        String[] words = str.split("[ :]+");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                n += 1;
            }
        }
        System.out.println("Количество слов с четным количеством букв: " + n);
    }
}
