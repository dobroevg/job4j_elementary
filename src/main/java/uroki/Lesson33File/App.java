package uroki.Lesson33File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class App {
    static void outputexample() throws IOException, FileNotFoundException {


            FileOutputStream output = new FileOutputStream("output.txt", true);
            String str = "Запись 2";
            byte[] array = str.getBytes(StandardCharsets.UTF_8);
            output.write(str.getBytes());
            output.close();
    }

    static void inputexample() throws IOException {
        FileInputStream input = new FileInputStream("data/input.txt");
        byte[] array = input.readAllBytes();
        String str = new String(array, StandardCharsets.US_ASCII);
        System.out.println(str);
        input.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("white");
        list.add("blue");

        System.out.println("start");
        try {
            inputexample();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
