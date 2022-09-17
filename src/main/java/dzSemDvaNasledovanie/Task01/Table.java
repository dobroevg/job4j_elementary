package dzSemDvaNasledovanie.Task01;

public class Table {
    public Table(Column[] columnList, int number, int summed) {
        this.columnList = columnList;
        this.number = number;
        this.summed = summed;
        setSize();
    }

    private int size;

    void setSize() {
        int size = 0;
        for (var col : columnList) {
            size += col.getHeader().length() + 1;
        }
        this.size = size;
    }

    void print() {

        printDefis ();

        for (var col : columnList) {
            System.out.printf("|%s", col.getHeader());
        }
        System.out.println("|");

        printDefis ();

        for (int i = 0; i < number; i++) {
            for (var col : columnList) {
                System.out.printf("|%s", col.getCell(i));
            }
            System.out.println("|");
            printDefis ();
        }
        System.out.printf("|%s", "Итого");


        System.out.printf(String.format("%" + (size - 6)  + "d", summed));
        System.out.println("|");

        printDefis();
    }
    Column[] columnList;
    private int number;

    private int summed;


    void printDefis (){
        for (int i = 0; i < size + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
