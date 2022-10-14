package uroki.lesson32;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class RandomException extends Exception {
    public RandomException(String message) {
        super(message);
    }
}

public class App {
    
    static int readInt(Scanner sc) throws IOException, RandomException {
        if (sc == null) {
            throw new NullPointerException("необходим сканнер");
        }

        int x = sc.nextInt();
        Random rand = new Random();
        if (rand.nextInt(0, 2) == 0) {
            throw new RandomException("unlucky exc");
        }
        if (x < 0) {
            throw new IOException("number must be");
        }

        return x;
    }

    static void askAge() throws RandomException {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while (true) {
            try {
                System.out.println("Введите свой возраст: ");
                age = readInt(sc);
                break;
            } catch (IOException e) {
            }



        }
        System.out.println("Ваш возраст " + age);

    }

    public static void main(String[] args) {
        try {
            askAge();
        } catch (Exception e) {
            System.out.println("непредвиденная ошибка " + e);
        }



    }
}
