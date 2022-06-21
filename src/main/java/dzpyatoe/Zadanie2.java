package dzpyatoe;

public class Zadanie2 {
    public static void main(String[] args) {
        one: for (int i = 2; i < 1_000_000; i++) {
            int k = 2;
            for (; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    continue one;
                }
            }
        System.out.println(i);
        }
    }
}