package uroki.Lesson33File;

import java.io.*;
import java.util.Scanner;

public class App2 {

    static void inputExample() throws IOException {
        FileReader reader = new FileReader("data/input.txt");
        char[] buf = new char[1024];
        reader.read(buf);
        String str = new String(buf);
        System.out.println(str);
        reader.close();
    }

    static void smartInputExample() throws IOException {
        FileReader reader = new FileReader("data/input.txt");
        Scanner sc = new Scanner(reader);
        String str = sc.nextLine();
        int inNum =sc.nextInt();
        double floatNum = sc.nextDouble();
        System.out.println(str);
        System.out.println(inNum);
        System.out.println(floatNum);

        sc.close();
    }

    static void outputEample() throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        String str = "Название проекта/ static void outputEample() throws IOException";
        writer.write(str + '\n');
        writer.close();
    }

    public static void main(String[] args) {
//        try {
//            inputExample();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            smartInputExample();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            outputEample();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
