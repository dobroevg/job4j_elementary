package dzSemChetyreGeneric;

import java.util.Arrays;

public class MyArrayList<T> {
    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public MyArrayList(T[] array) {
        this.data = Arrays.copyOf(array, array.length);
        this.size = array.length;
    }

    /**
     * Добавляет новое значение в конец коллекции
     * @param value добавляемое значение
     */
    public void pushBack(T value) {
        ensureCapacity();
        data[size] = value;
        size++;
    }

    /**
     * Удаляет элемент из конца коллекции и возвращает его. Если коллекция уже
     * пуста, выдает ошибку.
     * @return удаленный элемент
     */
    public T popBack() {
        if (size == 0) {
            System.err.println("Error Size!");
            return null;
        } else {
            return data[--size];
        }
    }

    /**
     * Добавляет новое значение в начало коллекции
     * @param value добавляемое значение
     */
    public void pushFront(T value) {
        ensureCapacity();
        for (int i = size - 1; i >= 0; i--) {
            data[i + 1] = data[i];
        }
        data[0] = value;
        size++;
    }

    /**
     * Удаляет элемент из начала коллекции и возвращает его. Если коллекция уже
     * пуста, выдает ошибку.
     * @return удаленный элемент
     */
    public T popFront() {
        if (size == 0) {
            System.err.println("Error Size!");
            return null;
        } else {
            T firstElement = data[0];
            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            size--;
            return firstElement;
        }
    }

    /**
     * Усекает емкость коллекции до ее размера
     */
    public void truncate() {
        data = Arrays.copyOf(data, size);
    }

    /**
     * Количесвто элементов коллекции, логический размер
     * @return размер коллекции
     */
    public int getSize() {
        return size;
    }

    /**
     * Текущая емкость коллекции, фактический размер
     * @return емкость коллекции
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * Возвращает элемент коллекции по индексу
     * @param index индекс элемента
     * @return значение элемента коллекции
     */
    public T get(int index) {
        return data[index];
    }

    /**
     * Задает элемент коллекции по индексу
     * @param index индекс элемента
     * @param value новое значение элемента коллекции
     */
    public void set(int index, T value) {
        if (index >= size) {
            System.err.println("Error!");
        } else {
            data[index] = value;
        }

    }

    /**
     * Гарантирует свободное место для добавления хотя бы одного элемента
     */
    private void ensureCapacity() {
        if (size == getCapacity()) {
            int capacity = (int) (data.length * 1.5) + 1;
            data = Arrays.copyOf(data, capacity);
        }
    }

    /**
     * Количесвто элементов коллекции (логический размер)
     */
    private int size;

    /**
     * Массив обобщенного типа с элементами коллекции
     */
    private T[] data = null;
}
