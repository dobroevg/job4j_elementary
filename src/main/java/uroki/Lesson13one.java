package uroki;

import java.util.Locale;
import java.util.Scanner;

public class Lesson13one {
    public static void main(String[] args) {
        String str = "синий---фиолетовый-желтый--красный------голубой-красный";
        String current = null;
        String next = str;

        do {
           current = next;
            System.out.println(current);
           next = next.replace("--", "-");
        } while (!current.equals(next));

        System.out.println(current);
        int n = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");

        String str2 = "синий--красный--фиолетовый-желтый--красный------голубой-красный";
        String color = "красный";
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.indexOf(color, i);
            if (index != n && index != -1) {
                System.out.println(index);
                n = index;
            }
        }

        String str1 = "public (static) void main((String[] args))";
        String inside = "";
        String open = "((";
        String close = "))";
        int start = str1.indexOf(open);
        if (start >= 0) {
            start += open.length();
            int end = str1.indexOf(close, start);
            if (end >= 0) {
                inside = str1.substring(start, end);
            }
        }
        System.out.println(inside);
    }
}
