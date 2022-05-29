package dzvtoroe;

public class Task11 {
    public static void main(String[] args) {
        int t = 30_768_757;
        int day = t / 86400;
        int h = t / 3600 - day * 24;
        int m = t / 60 - day * 24 * 60 - h * 60;
        int s = t - day * 24 * 3600 - h * 3600 - m * 60;
        System.out.println(day + " дней " + h + " часов " + m + " минут " + s + " секунд ");
    }
}
