package uroki;

public class Lesson15tree {
    public static void main(String[] args) {
        long[][] rows = new long[5][7];

        int count = 1;

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                rows[i][j] = count++;
            }
        }
        long[] tmp = rows[0];
        rows[0] = rows[4];
        rows[4] = tmp;


        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                System.out.printf("%2d ", rows[i][j]);
            }
            System.out.println();

        }
    }
}
