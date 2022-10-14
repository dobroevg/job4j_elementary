package trenirovka.interfaces;

public class B implements Start{
    public int a;

    public int b;

    public B(int a, int b) {
        this.a = a;
        this.b = b;
        sum(a, b);
        div(a, b);
        square(b);
        A.setCount(3);
        A m = new A(1,3);
    }

    @Override
    public int sum(int a, int b) {
        return a + a + b;
    }

    @Override
    public int div(int a, int b) {
        return (a + a)/ b;
    }

    public int square( int c) {
        return c * c;
    }
}
