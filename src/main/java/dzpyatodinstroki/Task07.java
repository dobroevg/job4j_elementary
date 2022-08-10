package dzpyatodinstroki;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = sc.nextLine();
        String res = "";
        char[] mass = str.toCharArray();
        for (int i = 0; i < mass.length; i++) {
            char str2 = mass[i];
            if (Character.isDigit(str2)) {
                mass[i] = '_';
            }
            if (Character.isLetter(str2)) {
                if (Character.isUpperCase(str2)) {

                    mass[i] = Character.toLowerCase(str2);
                } else {
                    mass[i] = Character.toUpperCase(str2);
                }
            }
            res += String.valueOf(mass[i]);
        }
        System.out.println(res);
    }
}
