package dzSemDvaNasledovanie.Task01;

public class OplataTask03 extends OplataTask02{

    private String[] children;

    public OplataTask03(int[] timeWork, String[] oplata, int[] stavki, int[] nalog1, String[] children) {
        super(timeWork, oplata, stavki, nalog1);
        this.children = children;
    }



    @Override
    public int[] summNalog() {
        int[] summ = new int[getTimeWork().length];
        for (int i = 0; i < getTimeWork().length; i++) {
            if ("ставка".equals(getOplata()[i])) {
                summ[i] = (int)((stavka(getTimeWork()[i], getStavki()[0]) * (100 - getNalog()[i])) / 100.0);
            }
            if ("почасовая".equals(getOplata()[i])) {
                summ[i] = (int)((onHour(getTimeWork()[i], getStavki()[1]) * (100 - getNalog()[i])) / 100.0);
            }
            if ("сдельная".equals(getOplata()[i])) {
                summ[i] = (int)((getTimeWork()[i] * (100 - getNalog()[i])) / 100.0);
            }
        }

        return summ;
    }
}
