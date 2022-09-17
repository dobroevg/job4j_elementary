package dzSemOdinInkapsulyatsiya.Task01;

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
    }
}
