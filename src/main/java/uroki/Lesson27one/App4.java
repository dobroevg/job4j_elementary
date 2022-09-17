package uroki.Lesson27one;

class Array<T> {
    public Array(T[] array) {
        this.array = array;
    }

    int getSize() {
        return array.length;
    }

    T get(int index) {
        return array[calcIndex(index)];
    }

    void set(int index, T value) {
        array[calcIndex(index)] = value;
    }

    private int calcIndex(int index) {
        int i = index % getSize();
        if (i < 0) {
            i += getSize();
        }
        return i;
    }

    private T[] array = null;
}



public class App4 {
    public static void main(String[] args) {
        Array<Long> arr = new Array<>(new Long[4]);
        for (int i = 0; i < arr.getSize(); i++) {
            arr.set(i, (long)(7 + i * i));
        }

        System.out.println("Элементы массива кругу: ");
        for (int i = -10; i <= 10; i++) {
            var element = arr.get(i); // Long element
            System.out.print(element + " ");
        }
        System.out.println();


        for (int i = -10; i <= 10; i++) {
            if (arr.get(i) % 2 == 0) {
                arr.set(i, 0L);
            }
        }
        System.out.println("Элементы массива кругу после зануления четных чисел: ");
        for (int i = -10; i <= 10; i++) {
            long element = arr.get(i);
            System.out.print(element + " ");
        }
        System.out.println();

        // arr.set(6, "seven"); // ошибка компиляции
    }
}