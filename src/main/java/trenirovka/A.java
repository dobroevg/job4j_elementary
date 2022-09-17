package trenirovka;

public class A {
    public int  staticField = 10;

    public static void main(String[] args) {
        File interes = new File();
        System.out.println(interes.getName());
        System.out.println(interes.getData());
        interes.setName("Interesno");
        interes.setData("1234");
        System.out.println(interes.getName());
        System.out.println(interes.getData());

        System.out.println();

        File intCop = interes.coping();
        System.out.println(intCop.getName());
        System.out.println(intCop.getData());

    }
}
