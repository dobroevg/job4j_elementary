package dzpyatodinstroki;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String res = "";
        for (Character c: str.toCharArray()) {
            if (Character.isLetter(c)) {
                res += c;
            }
        }
        int res1 = res.length() / words.length;
        System.out.println("средняя длина слова в строке: " + res1);
    }
}
