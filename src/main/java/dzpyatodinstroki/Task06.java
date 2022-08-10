package dzpyatodinstroki;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] mass = new int[100000];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        String[] str = new String[100000];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(mass[i]);
        }
        String number1 = "4";
        String number2 = "13";
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(number1) || str[i].contains(number2)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
