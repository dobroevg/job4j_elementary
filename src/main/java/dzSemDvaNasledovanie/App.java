package dzSemDvaNasledovanie;

public class App {
    public static void main(String[] args) {
        Column[] columnList = new Column[] {
                new StringColumn("ФИО", new String[]{"Иванов", "Петров", "Сидоров"}, 10),
                new StringColumn("Вид оплаты", new String[]{"ставка", "почасовая", "сдельная"}, 10),
                new IntColumn("Сумма", new int[]{3000, 800, 5500}, 6)
        };
        Table table = new Table(columnList, 3);
        table.print();
    }
}
