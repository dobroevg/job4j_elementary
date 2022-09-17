package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class StartTask02 extends Start{

    public StartTask02(String[] name, String[] oplata, int[] timeWork, int[] stavki) {
        super(name, oplata, timeWork, stavki);
    }

    @Override
    public void calculation() {
        OplataTask02 oplata1 = new OplataTask02(getTimeWork(), getOplata(), getStavki(), nalog());
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", getName()),
                new StringColumn("Вид оплаты", getOplata()),
                new IntColumn("Отработанное время", getTimeWork()),
                new IntColumn("Сумма, грн", oplata1.summ()),
                new IntColumn("Налог, %", nalog()),
                new IntColumn("К оплате, грн", oplata1.summNalog())
        };
        Table table = new Table(columnList, getName().length, summed(oplata1.summNalog()));
        table.print();

    }

    public int[] nalog() {
        int[] nalog = new int[getOplata().length];
        for (int i = 0; i < getOplata().length; i++) {
            if ("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i])) {
                nalog[i] = 20;
            }
            if ("сдельная".equals(getOplata()[i])) {
                nalog[i] = 15;
            }
        }
        return nalog;
    }

}
