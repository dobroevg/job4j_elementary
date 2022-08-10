package dzpyatoe;

public class Zadanie8 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 24; i++) {
            int k = 0;
            for (; k < 60; k++) {
                int h2 = i / 10 % 10;
                int h1 = i % 10;
                int m2 = k / 10 % 10;
                int m1 = k % 10;
                if ((h2 == m1) && (h1 == m2)) {
                    System.out.println("Время: " + h2 + h1 + ":" + m2 + m1);
                    number = number + 1;
                }
            }
        }
        System.out.println("Количество комбиций: " + number);
    }
}
