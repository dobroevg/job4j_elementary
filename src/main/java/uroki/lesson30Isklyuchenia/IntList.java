package uroki.lesson30Isklyuchenia;

public class IntList {

    private int size;
    private int[] mass;

    public IntList(int size) {
        if (size < 0) {
            throw new RuntimeException("Error: wrong List size");
//            System.err.println("Error: wrong List size");
        } else {
            this.size = size;
        }
        mass = new int[size];
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (index >= size) {
            System.err.println("Error: out of range");
            return 0;
        } else {
            return mass[index];
        }
    }

    public void set(int index, int value) {
        if (index >= size) {
            System.err.println("Error: out of range");
        } else {
            mass[index] = value;
        }
    }
}
