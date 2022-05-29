package dzvtoroe;

public class Task10 {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        final double height = 185;
        final double weight = 87;
        double ideal = height - 110;
        if (ideal >= weight) {
            System.out.println("Вам надо набрать кг " + (ideal - weight));
        } else {
            System.out.println("Вам надо сбросить кг " + (weight- ideal));
        }
    }
}
