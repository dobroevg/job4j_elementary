package trenirovka.interfaces;

public class A implements Start, Rus{
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        A.count = count;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int a;

    public int b;

    private static int count;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
        sum(a, b);
        div(a, b);
        umn(a, b);
        stat();
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sum(int a, int b, String s) {
        return 0;
    }

    @Override
    public int tree(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    public int umn(int a, int b) {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public static void stat() {
        count = 1;
        count++;
    }
}
