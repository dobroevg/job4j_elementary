package trenirovka;

public class Dostup {
    public class OverrideprivateInnerclass {
        private String msg = "GeeksforGeeks";
        private void fun() {
            System.out.println("Outer fun()");
        }
        class Inner extends OverrideprivateInnerclass {
            private void fun() {
                System.out.println("Accessing Private Member of Outer: " + msg);
            }
        }

    }
}
