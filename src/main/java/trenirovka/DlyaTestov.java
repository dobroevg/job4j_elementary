package trenirovka;

public class DlyaTestov {

    String dnaCode;

    public static void main (String[] args) {
        double a = 0/.0f;
        System.out.println(a);
        System.out.println(.0 - 1.1f != 2 - 1.1);
        float f = (2f + 3) / 5;
        System.out.println(f);
        char c = 6 * 12;
        System.out.println(c);

        int d = 4 - (5 % 6);
        System.out.println(d);
        double x = .333D;
        System.out.println(x);

        double e = .3;

        int a1 = 1;
        int b1 = 2;

        b1 = a1;
        a1 = 3;
        System.out.println("Integer " + b1);
        System.out.println("Integer " + a1);

        DlyaTestov man1 = new DlyaTestov();
        man1.dnaCode = "111122223333";

        DlyaTestov man2 = new DlyaTestov();
        man2.dnaCode = "111122223333";

        System.out.println(man1.equals(man2));
    }
}
