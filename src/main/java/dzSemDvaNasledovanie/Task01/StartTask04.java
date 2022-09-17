package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class StartTask04 extends StartTask03{

    public int getKurs() {
        return kurs;
    }

    private int kurs;
    public StartTask04(String[] name, String[] oplata, int[] timeWork, int[] stavki, String[] children, int kurs) {
        super(name, oplata, timeWork, stavki, children);
        this.kurs = kurs;
    }

    @Override
    public void calculation() {

        OplataTask04 oplata1 = new OplataTask04(getTimeWork(), getOplata(), getStavki(), nalog(), getChildren(), kurs);
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", getName()),
                new StringColumn("Вид оплаты", getOplata()),
                new IntColumn("Отработанное время", getTimeWork()),
                new IntColumn("Сумма, грн", oplata1.summ()),
                new StringColumn("Наличие детей", getChildren()),
                new IntColumn("Налог, %", nalog()),
                new StringColumn("К оплате (грн/тугрики). Курс 1/" + kurs, oplata1.perevodVTugriki()),
                new IntColumn("Все в грн", oplata1.summNalog())
        };


        Table table = new Table(columnList, getName().length, summed(oplata1.summNalog()));
        table.print();

    }

}
