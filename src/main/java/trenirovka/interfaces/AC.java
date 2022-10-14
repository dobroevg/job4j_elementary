package trenirovka.interfaces;

public class AC extends A{

    public int c;

    public AC(int a, int b, int c) {
        super(a, b);
        this.c = c;
        sum(a, b);
        div(a, b);
        umn(a, b);
        str(a, b, c);
    }

    public String str(int a, int b, int c) {
        System.out.println(getA());
        A.setCount(3);
        System.out.println(getA());
        return Integer.toString(a + b +c);
    }

}
