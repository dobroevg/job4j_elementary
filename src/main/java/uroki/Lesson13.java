package uroki;

import java.util.Locale;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("public static void main(String[] args)");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print('.');
        }
        System.out.println();
        String result = (str + " ").repeat(3);
        System.out.println(result);
        String repeated = "";
        for (int i = 0; i < 4; i++) {
            repeated += str + " ";
        }
        System.out.println(repeated);

        String[] strList = new String[] {
                "public",
                "static",
                "void",
                "main(String[]",
                "args)"
        };
        String result1 = String.join(" -> ", strList);
        System.out.println(result1);
        String cont = "";
        for (int i = 0; i < strList.length; i++) {
           cont += strList[i] + " -> ";
        }
        System.out.println(cont);
        sc.close();
    }
}
