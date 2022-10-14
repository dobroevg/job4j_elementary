package trenirovka;

import java.util.Arrays;

public class Shablony {
    public static void main(String[] args) {
        VirtualCollection<String> collection = new VirtualCollection<String>();
        collection.add("Привет");
        collection.add("Шаг");
        collection.add("и");
        collection.add("весь");
        collection.add("Мир!");
        collection.print();
        System.out.print("Второй элемент: " + collection.get(1));
    }
}
class VirtualCollection<T extends Object> {
    private T[] array;
    public VirtualCollection() {
        array = (T[]) new Object[0];
    }

    public void print() {
        for (T anArray : array)
            System.out.print(anArray + " "); System.out.println();
    }

    public void add(T newValue) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        this.array = newArray;
        array[array.length - 1] = newValue;
    }

    public T get(int position) {
        if (position >= 0 && position < array.length)
            return array[position];
        else return null;
    }

}
