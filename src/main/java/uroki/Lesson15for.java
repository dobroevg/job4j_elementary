package uroki;

import java.util.Random;

public class Lesson15for {
    public static void main(String[] args) {
        Random rand = new Random(23);
        double[][] temperature = new double[10][7];

        for (int i = 0; i < temperature.length; i++) {
            for (int j = 0; j < temperature[i].length; j++) {
                temperature[i][j] = rand.nextDouble(14, 31);
            }
        }
        System.out.println("Температура по дням недели");
        for (int i = 0; i < temperature.length; i++) {
            for (int j = 0; j < temperature[i].length; j++) {
                System.out.printf("%f ", temperature[i][j]);
            }
            System.out.println();
        }
        double[] average = new double[temperature[0].length];
        for (int i = 0; i < temperature[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < temperature.length; j++) {
                sum += temperature[j][i];
            }
            average[i] = sum / temperature.length;
        }
        System.out.println("Средняя температура по дням недели");
        for (int i = 0; i < average.length; i++) {
            System.out.printf("%f ", average[i]);
        }
    }
}
