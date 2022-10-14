package uroki.lesson35;

import trenirovka.File;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String fileName = "C:\\projects\\job4j_elementary\\src\\main" +
                "\\java\\uroki\\lesson35\\credentials.txt";
        boolean fileWasCreated = false;
        do {

            try (
                    BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String login = reader.readLine();
                String password = reader.readLine();
                fileWasCreated = false;

                System.out.println("Введите логин: ");
                String curLogin = sc.nextLine();
                System.out.println("Введите пароль: ");
                String curPassword = sc.nextLine();

                boolean hasAcces = false;
                if (curLogin.equals(login) && curPassword.equals(password)) {
                    hasAcces = true;
                }

                if (hasAcces) {
                    System.out.println("Доступ разрешен");
                } else {
                    System.out.println("Доступ запрещен");
                }
            } catch (FileNotFoundException e) {
                ArrayList<String> credentials = new ArrayList<>();
                fileWasCreated = true;
                System.out.println("Введите Новый логин: ");
                credentials.add(sc.nextLine());
                System.out.println("Введите Новый пароль: ");
                credentials.add(sc.nextLine());

                Path path = Paths.get(fileName);
                try {
                    Files.write(path, credentials, StandardCharsets.UTF_8);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


//                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//                    writer.write(curLogin + "\n" + curPassword);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (fileWasCreated);


    }
}
