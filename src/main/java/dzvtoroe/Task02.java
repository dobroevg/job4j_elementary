package dzvtoroe;

public class Task02 {
    public static void main(String[] args) {
        int n = 222;
        System.out.println("сумма цифр числа " + n + " равна " + ((n / 100) + (n / 10) - ((n / 100) * 10) + (n % 10)));
    }
}
