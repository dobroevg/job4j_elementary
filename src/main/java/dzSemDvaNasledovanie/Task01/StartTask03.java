package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class StartTask03 extends StartTask02{

    public String[] getChildren() {
        return children;
    }

    private String[] children;

    public StartTask03(String[] name, String[] oplata, int[] timeWork, int[] stavki, String[] children) {
        super(name, oplata, timeWork, stavki);
        this.children = children;
    }

    @Override
    public void calculation() {

        OplataTask03 oplata1 = new OplataTask03(getTimeWork(), getOplata(), getStavki(), nalog(), children);
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", getName()),
                new StringColumn("Вид оплаты", getOplata()),
                new IntColumn("Отработанное время", getTimeWork()),
                new IntColumn("Сумма, грн", oplata1.summ()),
                new StringColumn("Наличие детей", children),
                new IntColumn("Налог, %", nalog()),
                new IntColumn("К оплате, грн", oplata1.summNalog())
        };


        Table table = new Table(columnList, getName().length, summed(oplata1.summNalog()));
        table.print();

    }
    @Override
    public int[] nalog() {
        int[] nalog = new int[getOplata().length];
        for (int i = 0; i < getOplata().length; i++) {
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i])) && "есть дети".equals(children[i])) {
                nalog[i] = 20;
            }
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i])) && "нет детей".equals(children[i])) {
                nalog[i] = 25;
            }
            if ("сдельная".equals(getOplata()[i]) && "есть дети".equals(children[i])) {
                nalog[i] = 15;
            }
            if ("сдельная".equals(getOplata()[i]) && "нет детей".equals(children[i])) {
                nalog[i] = 20;
            }
        }
        return nalog;
    }

}
