package dzpyatoe;

public class Zadanie4 {
    public static void main(String[] args) {
        for (int i = 1; i < 1_000_000; i++) {
            int k = 1;
            int summa = 0;
            for (; k < i; k++) {
                if (i % k == 0) {
                    summa = summa + k;
                }
            }
            if (i == summa) {
                System.out.println(i);
            }
        }
    }
}
