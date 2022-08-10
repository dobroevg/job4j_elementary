package dzpyatoe;

public class Zadanie9 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 0; i < 1000; i++) {
           if (i % 3 == 0 || i % 5 == 0) {
              summa = summa + i;
           }
        }
        System.out.println("Сумма натуральных чисел: " + summa);
    }
}
