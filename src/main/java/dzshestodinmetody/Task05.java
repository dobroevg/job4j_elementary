package dzshestodinmetody;

import java.util.Scanner;

public class Task05 {
    static int[] input() {
        int[] mass = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите здоровье Дракона: ");
        mass[0] = sc.nextInt();
        System.out.println("Введите атаку Дракона: ");
        mass[1] = sc.nextInt();
        System.out.println("Введите здоровье одного Копейщика: ");
        mass[2] = sc.nextInt();
        System.out.println("Введите атаку одного Копейщика: ");
        mass[3] = sc.nextInt();
        return mass;
    }

    static boolean calculation(int[] array, int kop) {
        boolean win = false;
        int a = array[0];
        int b = array[1];
        int c = array[2];
        int d = array[3];
        int e;
        int f = c * kop;
        int remain = 0;
        for (int i = 0; a > 0 && f > 0; i++) {
            e = d * kop;
            a = a - e;
            if (a > 0) {
                System.out.printf("Копейщики атакуют (урон - %d) - у дракона осталось %d жизней", e, a);
                System.out.println();
            } else {
                System.out.println("Ура! Копейщики атакуют и побеждают!");
                win = true;
                System.out.println();
                break;
            }
            f = f - b;
            kop = (int)Math.ceil((double)f / c);
            remain = f % c;
            if (f > 0) {
                System.out.printf("Дракон атакует - осталось %d копейщиков", kop);
                if (remain > 0) {
                    System.out.printf(", один из которых ранен (осталось %d жизней)", remain);
                }
                System.out.println();
            } else {
                System.out.println("Дракон атакует и побеждает");
                System.out.println();
                break;
            }
        }
        return win;
    }

    public static void main(String[] args) {
        int[] mass = input();
        int count = 1;
        boolean winKop = false;
        for (int i = 1; !winKop; i++) {
            System.out.println("Итерация " + count);
            winKop = calculation(mass, i);
            count++;
            if (winKop == true) {
                System.out.println("Минимально необходимое количество копейщиков для победы над Драконом - " + i);
            }
        }
    }
}
