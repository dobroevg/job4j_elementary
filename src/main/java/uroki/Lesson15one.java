package uroki;

import java.util.Random;

public class Lesson15one {
    public static void main(String[] args) {
        char[] charList = new char[20];
        Random rand = new Random();

        String template = "ABCDEFGHIKLMNOPRSTUF 1234567890";

        for (int i = 0; i < charList.length; i++) {
            int index = rand.nextInt(0, template.length());
            char ch = template.charAt(index);
            charList[i] = ch;
        }

        String str = new String(charList);
        System.out.println(str);

    }
}
