package dzSemDvaNasledovanie;

public class Table {
    public Table(Column[] columnList, int size) {
        this.columnList = columnList;
        this.size = size;
    }

    void print() {
        for (var col : columnList) {
            System.out.printf("|%s", col.getHeader());
        }
        System.out.println("|");
        for (int i = 0; i < size; i++) {
            for (var col : columnList) {
                System.out.printf("|%s", col.getCell(i));
            }
            System.out.println("|");
        }
    }
    Column[] columnList;
    int size;

}
