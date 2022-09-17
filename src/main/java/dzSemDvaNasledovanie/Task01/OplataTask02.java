package dzSemDvaNasledovanie.Task01;

import java.util.Random;

public class OplataTask02 extends Oplata{
    public int[] getNalog() {
        return nalog;
    }

    private int[] nalog;



    public OplataTask02(int[] timeWork, String[] oplata, int[] stavki, int[] nalog1) {
        super(timeWork, oplata, stavki);
        this.nalog = nalog1;
    }

    public int[] summNalog() {
        int[] summ = new int[getTimeWork().length];
        for (int i = 0; i < getTimeWork().length; i++) {
            if ("ставка".equals(getOplata()[i])) {
                summ[i] = (int)((stavka(getTimeWork()[i], getStavki()[0]) * (100 - nalog[i])) / 100.0);
            }
            if ("почасовая".equals(getOplata()[i])) {
                summ[i] = (int)((onHour(getTimeWork()[i], getStavki()[1]) * (100 - nalog[i])) / 100.0);
            }
            if ("сдельная".equals(getOplata()[i])) {
                summ[i] = (int)((getTimeWork()[i] * (100 - nalog[i])) / 100.0);
            }
        }

        return summ;
    }


}
