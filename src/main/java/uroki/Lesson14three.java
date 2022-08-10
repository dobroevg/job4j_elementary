package uroki;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson14three {
    public static void main(String[] args) {
        String text = "Aopk n gg Lghch guyff,\n"
                + "jhjfh bg kuy kgfdd tu f jfyryuu jfuyfuy \n";

        Scanner sc = new Scanner(text);

        String[] buf = new String[1024];
        int strCount = 0;

        while (sc.hasNext()) {
            buf[strCount++] = sc.next();
        }

        String[] lines = Arrays.copyOf(buf, strCount);

        int strCount1 = 0;

        for (String line : lines) {
            if (line.length() < 3) {
                strCount1++;

            }
        }
        System.out.println(strCount1);
        int i = 0;
        String[] filtered = new String[strCount1];
        for (String line : lines) {
            if (line.length() < 3) {
                filtered[i++] = line;
            }
        }

        System.out.println("filtered: ");

        for (String line : filtered) {
            System.out.println(line);
        }

    }
}
