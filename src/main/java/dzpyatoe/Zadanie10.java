package dzpyatoe;

public class Zadanie10 {
    public static void main(String[] args) {
        for (int i = 20; i < 1000000000; i++) {
            if (i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0
                    && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
                System.out.println("Минимальное число: " + i);
                break;
            }
        }
    }
}
