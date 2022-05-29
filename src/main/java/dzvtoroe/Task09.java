package dzvtoroe;

public class Task09 {
    public static void main(String[] args) {
        double x = 10.1;
        if (x % 1 > 0.00001) {
            System.out.println("у x есть вещественная часть");
        } else {
                System.out.println("у x нет вещественной части");
        }
    }
}
