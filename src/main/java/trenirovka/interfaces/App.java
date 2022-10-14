package trenirovka.interfaces;

public class App {

    public static void main(String[] args) {

        Start st = new Start() {
            @Override
            public int sum(int a, int b) {
                return a;
            }

            @Override
            public int div(int a, int b) {
                return b;
            }
        };

        int a = st.sum(1,5);
        System.out.println(a);

        Start[] st1 = new Start[] {
                new A(2,5),
                new B(100, 200),
                new AC(10, 20,30),
                new A(4,6),
        };

        A a1 = new A(3, 4);
        a1.a = 5;
        A.stat();
        A.stat();
        A.stat();
        A.setCount(4);
        System.out.println(A.getCount());
    }
}
