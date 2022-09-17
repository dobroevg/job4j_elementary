package dzSemDvaNasledovanie;

public class IntColumn implements Column{

    private String header;

    private int[] column;
    private int width;

    public IntColumn(String header, int[] column, int width) {
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
        return String.format("%" + width + "d", getValue(index));
    }

    public int getValue(int index) {
        return column[index];
    }


}
