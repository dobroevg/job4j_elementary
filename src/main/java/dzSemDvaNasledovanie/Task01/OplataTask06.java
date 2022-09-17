package dzSemDvaNasledovanie.Task01;

import java.util.Random;

public class OplataTask06 extends OplataTask05{

    private int premiya;

    public OplataTask06(int[] timeWork, String[] oplata, int[] stavki, int[] nalog1, String[] children, int kurs,
                        String[] offshores, int premiya) {
        super(timeWork, oplata, stavki, nalog1, children, kurs, offshores);
        this.premiya = premiya;
    }

    @Override
    public int[] summ() {
        int[] summ = new int[getTimeWork().length];
        for (int i = 0; i < getTimeWork().length; i++) {
            if ("ставка".equals(getOplata()[i])) {
                summ[i] = stavka(getTimeWork()[i], getStavki()[0]);
            } else {
                if ("сдельная".equals(getOplata()[i])) {
                    summ[i] =  getTimeWork()[i];
                } else {
                    if ("почасовая".equals(getOplata()[i]) && getTimeWork()[i] > 200 &&
                            "Не в оффшоре".equals(getOffshores()[i])) {
                        summ[i] = (int) ((onHour(getTimeWork()[i], getStavki()[1])) * (1.0 + premiya/100.0));
                    } else {
                        summ[i] = onHour(getTimeWork()[i], getStavki()[1]);
                    }
                }
            }

        }
        return summ;
    }

    @Override
    public int[] summNalog() {
        int[] summ = new int[getTimeWork().length];
        for (int i = 0; i < getTimeWork().length; i++) {
            if ("ставка".equals(getOplata()[i])) {
                summ[i] = (int)(summ()[i] * (100 - getNalog()[i]) / 100.0);
            }
            if ("почасовая".equals(getOplata()[i])) {
                summ[i] = (int)(summ()[i] * (100 - getNalog()[i])/ 100.0);
            }
            if ("сдельная".equals(getOplata()[i])) {
                summ[i] = (int)(summ()[i] * (100 - getNalog()[i]) / 100.0);
            }
        }

        return summ;
    }
}
