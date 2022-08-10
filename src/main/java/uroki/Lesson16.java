package uroki;

public class Lesson16 {
    static int sum(int x, int y) {
        int res = x + y;
        System.out.printf("%d + %d = %d\n", x, y, res);
        return res;
    }

    static int sum2(int x, int y) {
        return x + y;
    }

    static double power(double base, int degree) {
        if (degree == 0) {
           return 1;
        }

        double result = base;
        for (int i = 1; i < degree; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        double num = 1.5;
        int k = 0;
        double result = power(num, k);

        System.out.println(result);
    }
}
