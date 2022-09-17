package dzSemOdinInkapsulyatsiya.Task02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите диапазоны чисел через запятую: ");
        Scanner sc = new Scanner(System.in);
        String diapazons = sc.nextLine();
        String[] s = diapazons.split(",");
        int[][] diapazon = new int[s.length][2];
        for (int i = 0; i < diapazon.length; i++) {
            Scanner s2 = new Scanner(s[i]);
            for (int j = 0; j < 2; j++) {
                diapazon[i][j] = s2.nextInt();
            }
        }
        Diapazon diap = new Diapazon(0, 0);
        for (int i = 0; i < diapazon.length; i++) {
            diap.setStart(diapazon[i][0]);
            diap.setEnd(diapazon[i][1]);
            if (diap.verification()) {
                System.out.print(diap.calculationLength());
            } else {
                System.out.print("Ошибка! Начало диапазона больше чем конец!");
            }
            if (i < diapazon.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        intersection(diapazon);
    }

    public static void intersection(int[][] mass) {
        boolean intersection = false;
        if (mass.length > 1) {
            for (int i = 0; i < mass.length - 1; i++) {
                for (int j = i + 1; j < mass.length; j++) {
                    Diapazon diap1 = new Diapazon(mass[i][0], mass[i][1]);
                    Diapazon diap2 = new Diapazon(mass[j][0], mass[j][1]);
                    if (diap1.intersection(diap2)){
                        intersection = true;
                    }
                }
            }
            if (intersection) {
                System.out.println("Диапазоны пересекаются.");
            } else {
                System.out.println("Диапазоны НЕ пересекаются.");
            }
        }
    }
}
