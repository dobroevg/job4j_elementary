package uroki.lesson34;

import java.io.*;
import java.util.Random;

public class App1 {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\projects\\job4j_elementary\\src\\main\\java\\uroki\\lesson34\\Resources\\data.txt";
        FileReader reader = new FileReader(fileName);
        BufferedReader bufReader = new BufferedReader(reader);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\projects\\job4j_elementary\\src\\main\\" +
                "java\\uroki\\lesson34\\Resources\\dataOut.txt"));
        Random rand = new Random();

        try {
            String str;
            while ((str = bufReader.readLine()) != null) {
                int num = rand.nextInt(4);
                if (num == 0) {
                    throw new RuntimeException("Error Random!");
                }
                System.out.println(str);
                writer.write(str + "\n");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            bufReader.close();
            writer.close();
        }


    }
}
