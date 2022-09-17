package dzSemDvaNasledovanie;

public class StringColumn implements Column{
    private String header;

    private String[] column;
    private int width;

    public StringColumn(String header, String[] column, int width) {
        this.column = column;
        this.header = header;
        this.width = width;
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
