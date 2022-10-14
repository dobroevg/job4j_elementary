package trenirovka.parent;

public class Child extends Parent{
    protected void m2() {
        System.out.println("m2()");
    }
    private void m3() {
        System.out.println(" m3()");
    }

    public void m1() {
        super.m1();
        super.m2();
        System.out.println("m1()");
        System.out.println();
    }
}
