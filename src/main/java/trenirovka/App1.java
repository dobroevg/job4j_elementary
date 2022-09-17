package trenirovka;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        File file1 = new File();
        file1.setName("My file");
        file1.setData (String.valueOf(24082022));
        System.out.println(file1.getName());
        System.out.println(file1.getData());

        file1.setName("No My file");
        file1.setData (String.valueOf(11));
        System.out.println(file1.getName());
        System.out.println(file1.getData());

        File fileCopy = file1.coping();


        System.out.println("New file name: " + fileCopy.getName());
        System.out.println("New file data: " + fileCopy.getData());

        File file2 = new File();
        file2.setName("MY");
        file2.setData (String.valueOf(1));
        System.out.println(file2.getName());
        System.out.println(file2.getData());

        System.out.println(file1.getName());
        System.out.println(file1.getData());
    }
}
