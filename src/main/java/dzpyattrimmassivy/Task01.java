package dzpyattrimmassivy;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * i;
        }
        System.out.println(Arrays.toString(mass));
    }
}
