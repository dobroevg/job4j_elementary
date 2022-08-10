package uroki;

import java.util.Random;

public class Lesson15 {
    public static void main(String[] args) {
        char[] charList = new char[20];
        char ch = (char) 0x00CC;
        Random rand = new Random();

        int start = (int) 'A';
        int end = (int) 'Z';

        for (int i = 0; i < charList.length; i++) {
            int code = rand.nextInt(start, end + 1);
            ch = (char) code;
            charList[i] = ch;
        }

        String str = new String(charList);
        System.out.println(str);

    }
}
