package dzpyatoe;

public class Zadanie1 {
    public static void main(String[] args) {
        int k = 0;
        System.out.println(k);
        int n = 1;
        System.out.println(n);
        while ((n + k) < 10_000_000) {
            n = n + k;
            System.out.println(n);
            k = n - k;
        }
    }
}