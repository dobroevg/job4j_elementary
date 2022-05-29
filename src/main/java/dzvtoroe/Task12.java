package dzvtoroe;

public class Task12 {
    public static void main(String[] args) {
        int n = 133;
        int p1 = 2 * n;
        double m1 = n * 0.2;
        int m11 = (int) Math.ceil(m1 / 0.9);
        System.out.println("количество пирожков " + p1);
        System.out.println("количество пакетов молока " + m11);
        int p2 = (int) Math.ceil(2 * n * 0.6 + n * 0.4);
        double m2 = n * 0.2 * 0.6;
        int m22 = (int) Math.ceil(m2 / 0.9);
        System.out.println("количество пирожков " + p2);
        System.out.println("количество пакетов молока " + m22);
        int p3 = (int) Math.ceil(2 * n * 0.01 + n * 0.99);
        double m3 = n * 0.2 * 0.01;
        int m33 = (int) Math.ceil(m3 / 0.9);
        System.out.println("количество пирожков " + p3);
        System.out.println("количество пакетов молока " + m33);
    }
}
