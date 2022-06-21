package dzpyatoe;

public class Zadanie3 {
    @SuppressWarnings("checkstyle:OperatorWrap")
    public static void main(String[] args) {
        for (int i = 10; i < 1_000_000; i++) {
            int e1 = i % 10;
            int e2 = i / 10 % 10;
            int e3 = i / 100 % 10;
            int e4 = i / 1000 % 10;
            int e5 = i / 10000 % 10;
            int e6 = i / 100000 % 10;
            double summa = 0;
            int st = 0;
            if (e6 > 0) {
                st = 6;
                summa = Math.pow(e6, st) + Math.pow(e5, st) + Math.pow(e4, st) + Math.pow(e3, st) + Math.pow(e2, st)
                        + Math.pow(e1, st);
            } else {
                if (e5 > 0) {
                    st = 5;
                    summa = Math.pow(e5, st) + Math.pow(e4, st) + Math.pow(e3, st) + Math.pow(e2, st)
                            + Math.pow(e1, st);
                } else {
                    if (e4 > 0) {
                        st = 4;
                        summa = Math.pow(e4, st) + Math.pow(e3, st) + Math.pow(e2, st) + Math.pow(e1, st);
                    } else {
                        if (e3 > 0) {
                            st = 3;
                            summa = Math.pow(e3, st) + Math.pow(e2, st) + Math.pow(e1, st);
                        } else {
                            st = 2;
                            if (e2 > 0) {
                                summa = Math.pow(e2, st) + Math.pow(e1, st);
                            }
                        }
                    }
                }
            }
            if (i == (int) summa) {
                System.out.println(i);
            }
        }
    }
}