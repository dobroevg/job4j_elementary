package dzSemDvaNasledovanie.Task01;

import java.util.Random;

public class Oplata {

    private int[] timeWork;

    private String[] oplata;

    private int[] stavki;

    public Oplata(int[] timeWork, String[] oplata, int[] stavki) {
        this.timeWork = timeWork;
        this.oplata = oplata;
        this.stavki = stavki;

    }

    public int[] summ() {
        Random rand = new Random();
        int[] summ = new int[timeWork.length];
        for (int i = 0; i < timeWork.length; i++) {
            if ("ставка".equals(oplata[i])) {
                summ[i] = stavka(timeWork[i], stavki[0]);
            }
            if ("почасовая".equals(oplata[i])) {
                summ[i] = onHour(timeWork[i], stavki[1]);
            }
            if ("сдельная".equals(oplata[i])) {
                summ[i] =  timeWork[i];
            }
        }

        return summ;
    }

    static int stavka(int day, int stavka) {
        return stavka * day;
    }

    static int onHour(int hour, int stavka) {
        return stavka * hour;
    }

    static int summed(int[] summ) {
        int summed = 0;
        for (int row : summ) {
            summed += row;
        }
        return summed;
    }

    public int[] getTimeWork() {
        return timeWork;
    }

    public String[] getOplata() {
        return oplata;
    }

    public int[] getStavki() {
        return stavki;
    }
}
