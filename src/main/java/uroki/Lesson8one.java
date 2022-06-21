package uroki;

import java.util.Scanner;

public class Lesson8one {
    public static void main(String[] args) {
        String englishword = "blue";
        String russianword = "синий";
        Scanner sc = new Scanner(System.in);
        String answer;
       do {
           System.out.printf("Напишите перевод слова \"%s\": ", englishword);
           answer = sc.next();
       } while (!russianword.equals(answer));
        System.out.println("Верно!");
        sc.close();
    }
}
