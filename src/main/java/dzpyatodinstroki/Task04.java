package dzpyatodinstroki;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова на латинице: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if ((words[i].startsWith("a") || words[i].startsWith("A") || words[i].startsWith("e")
                    || words[i].startsWith("E") || words[i].startsWith("i") || words[i].startsWith("I")
                    || words[i].startsWith("o") || words[i].startsWith("O") ||  words[i].startsWith("u")
                    || words[i].startsWith("U") || words[i].startsWith("y") || words[i].startsWith("Y"))
                    && !(words[i].endsWith("a") || words[i].endsWith("A") || words[i].endsWith("e")
                    || words[i].endsWith("E") || words[i].endsWith("i") || words[i].endsWith("I")
                    || words[i].endsWith("o") || words[i].endsWith("O") || words[i].endsWith("u")
                    || words[i].endsWith("U") || words[i].endsWith("y") || words[i].endsWith("Y"))) {
                System.out.println(words[i]);
            }
        }
    }
}
