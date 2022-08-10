package uroki;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Lesson16two {
    static void log(int num) {
        LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println(now + ": " + num);
    }

    static void log(String str) {
        LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println(now + ": String" + str);
    }

    public static void main(String[] args) {
        log(16);
        log("Hello log");

    }
}
