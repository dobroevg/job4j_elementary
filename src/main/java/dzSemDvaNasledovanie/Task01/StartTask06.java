package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class StartTask06 extends StartTask05{

    public int getPremiya() {
        return premiya;
    }

    private int premiya;
    public StartTask06(String[] name, String[] oplata, int[] timeWork, int[] stavki, String[] children, int kurs,
                       String[] offshores, int premiya) {
        super(name, oplata, timeWork, stavki, children, kurs, offshores);
        this.premiya = premiya;
    }

    @Override
    public void calculation() {

        OplataTask06 oplata1 = new OplataTask06(getTimeWork(), getOplata(), getStavki(), nalog(), getChildren(), getKurs(),
                getOffshores(), premiya);
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", getName()),
                new StringColumn("Вид оплаты", getOplata()),
                new IntColumn("Отработанное время", getTimeWork()),
                new IntColumn("Сумма, грн", oplata1.summ()),
                new StringColumn("Наличие детей", getChildren()),
                new StringColumn("Нахождение в оффшорах", getOffshores()),
                new IntColumn("Премия, %", premiya()),
                new IntColumn("Налог, %", nalog()),
                new StringColumn("К оплате (грн/тугрики). Курс 1/" + getKurs(), oplata1.perevodVTugriki()),
                new IntColumn("Все в грн", oplata1.summNalog())
        };


        Table table = new Table(columnList, getName().length, summed(oplata1.summNalog()));
        table.print();

    }

    public int[] premiya() {
        int[] premiya = new int[getName().length];
        for (int i = 0; i < getName().length; i++) {
            if ("почасовая".equals(getOplata()[i]) && getTimeWork()[i] > 200 &&
                    "Не в оффшоре".equals(getOffshores()[i])) {
                premiya[i] = this.premiya;
            }
        }
        return premiya;
    }
}
