package dzSemDvaNasledovanie.Task01;

import java.util.Arrays;
import java.util.Collections;

public class IntColumn implements Column {

    private String header;

    private int[] column;
    private int width;

    public IntColumn(String header, int[] column) {
        this.column = column;
        this.header = header;
        int max = 0;
        for (int i = 0; i < column.length; i++) {
           max = Math.max(column[i], max);
            }
        int size = 0;
        for (int i = max; i > 0; i /= 10) {
            size++;
        }
        this.width = Math.max(size, header.length()) + 1;
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
