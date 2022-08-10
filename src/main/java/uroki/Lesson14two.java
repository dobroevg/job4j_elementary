package uroki;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson14two {
    public static void main(String[] args) {
        String text = "Aopk n gg Lghch guyff,\n"
                + "jhjfh bg kuy k tu f jfyryuu jfuyfuy\n"
                + "jhjkgff hghj jgft\n"
                + "###";

        Scanner sc = new Scanner(text);

        String[] buf = new String[1024];
        int strCount = 0;

        while (sc.hasNext()) {
            buf[strCount++] = sc.next();
        }

        String[] lines = Arrays.copyOf(buf, strCount);

         String[] sorted = Arrays.copyOf(lines, strCount);

        for (int i = 1; i < sorted.length; i++) {
            for (int j = 1; j < sorted.length - i + 1; j++) {
                if (sorted[j - 1].compareToIgnoreCase(sorted[j]) > 0) {
                    String tmp = sorted[j - 1];
                    sorted[j - 1] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.printf("%10s : %10s\n", lines[i], sorted[i]);
        }

        System.out.println();



        sc.close();
    }
}
