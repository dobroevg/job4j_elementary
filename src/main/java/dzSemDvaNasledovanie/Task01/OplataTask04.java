package dzSemDvaNasledovanie.Task01;

public class OplataTask04 extends OplataTask03{
    private int kurs;

    public OplataTask04(int[] timeWork, String[] oplata, int[] stavki, int[] nalog1, String[] children, int kurs) {
        super(timeWork, oplata, stavki, nalog1, children);
        this.kurs = kurs;
    }

    public String[] perevodVTugriki() {
        int[] summ1 = summNalog();
        String[] perevod = new String[summ1.length];
        for (int i = 0; i < summ1.length; i++) {
            if ("почасовая".equals(getOplata()[i])) {
                perevod[i] = Integer. toString(summ1[i] / 2) + "/" + Integer. toString((summ1[i] / 2) / kurs);
            } else {
                perevod[i] = Integer. toString(summ1[i]);
            }
        }
        return perevod;
    }
}
