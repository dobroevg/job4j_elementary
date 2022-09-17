package dzSemDvaNasledovanie.Task01;

public class StringColumn implements Column {
    private String header;

    private String[] column;
    private int width;

    public StringColumn(String header, String[] column) {
        this.column = column;
        this.header = header;
        int length = 0;
        for (int i = 0; i < column.length; i++) {
            length = Math.max(column[i].length(), length);
            }
        this.width = Math.max(header.length(), length) + 1;
    }

    @Override
    public String getHeader() {
        return String.format("%" + width + "s", header);
    }

    @Override
    public String getCell(int index) {
        return String.format("%" + width + "s", getValue(index));
    }

    public String getValue(int index) {
        return column[index];
    }
}
