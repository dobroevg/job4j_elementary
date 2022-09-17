package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class StartTask05 extends StartTask04{

    public String[] getOffshores() {
        return offshores;
    }

    private String[] offshores;
    public StartTask05(String[] name, String[] oplata, int[] timeWork, int[] stavki, String[] children, int kurs,
                       String[] offshores) {
        super(name, oplata, timeWork, stavki, children, kurs);
        this.offshores = offshores;
    }

    @Override
    public void calculation() {

        OplataTask05 oplata1 = new OplataTask05(getTimeWork(), getOplata(), getStavki(), nalog(), getChildren(), getKurs(),
                offshores);
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", getName()),
                new StringColumn("Вид оплаты", getOplata()),
                new IntColumn("Отработанное время", getTimeWork()),
                new IntColumn("Сумма, грн", oplata1.summ()),
                new StringColumn("Наличие детей", getChildren()),
                new StringColumn("Нахождение в оффшорах", offshores),
                new IntColumn("Налог, %", nalog()),
                new StringColumn("К оплате (грн/тугрики). Курс 1/" + getKurs(), oplata1.perevodVTugriki()),
                new IntColumn("Все в грн", oplata1.summNalog())
        };


        Table table = new Table(columnList, getName().length, summed(oplata1.summNalog()));
        table.print();

    }

    public int[] nalog() {
        int[] nalog = new int[getOplata().length];
        for (int i = 0; i < getOplata().length; i++) {
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i]))
                    && "есть дети".equals(getChildren()[i]) && "Не в оффшоре".equals(offshores[i])) {
                nalog[i] = 20;
            }
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i]))
                    && "есть дети".equals(getChildren()[i]) && "В оффшоре".equals(offshores[i])) {
                nalog[i] = 0;
            }
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i]))
                    && "нет детей".equals(getChildren()[i]) && "Не в оффшоре".equals(offshores[i])) {
                nalog[i] = 25;
            }
            if (("ставка".equals(getOplata()[i]) || "почасовая".equals(getOplata()[i]))
                    && "нет детей".equals(getChildren()[i]) && "В оффшоре".equals(offshores[i])) {
                nalog[i] = 0;
            }
            if ("сдельная".equals(getOplata()[i]) && "есть дети".equals(getChildren()[i])
                    && "Не в оффшоре".equals(offshores[i])) {
                nalog[i] = 15;
            }
            if ("сдельная".equals(getOplata()[i]) && "есть дети".equals(getChildren()[i])
                    && "В оффшоре".equals(offshores[i])) {
                nalog[i] = 0;
            }
            if ("сдельная".equals(getOplata()[i]) && "нет детей".equals(getChildren()[i])
                    && "Не в оффшоре".equals(offshores[i])) {
                nalog[i] = 20;
            }
            if ("сдельная".equals(getOplata()[i]) && "нет детей".equals(getChildren()[i])
                    && "В оффшоре".equals(offshores[i])) {
                nalog[i] = 0;
            }
        }
        return nalog;
    }

}
