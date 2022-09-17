package dzSemDvaNasledovanie.Task01;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;

public class Start {

    private String[] name;

    private String[] oplata;

    private int[] timeWork;

    private int[] stavki;


    public Start(String[] name, String[] oplata, int[] timeWork, int[] stavki) {

        this.name = name;
        this.oplata = oplata;
        this.timeWork = timeWork;
        this.stavki = stavki;
    }

    public void calculation() {
        Oplata oplata1 = new Oplata(timeWork, oplata, stavki);
        int[] kOplate = oplata1.summ();
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", name),
                new StringColumn("Вид оплаты", oplata),
                new IntColumn("Отработанное время", timeWork),
                new IntColumn("Сумма к оплате, грн", kOplate)
        };

        Table table = new Table(columnList, name.length, summed(kOplate));
        table.print();
    }

    public String[] getName() {
        return name;
    }

    public String[] getOplata() {
        return oplata;
    }

    public int[] getTimeWork() {
        return timeWork;
    }

    public int[] getStavki() {
        return stavki;
    }
}
