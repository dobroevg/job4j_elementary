package uroki;

public class Lesson10two {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == width - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
