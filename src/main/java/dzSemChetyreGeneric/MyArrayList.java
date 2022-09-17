package dzSemChetyreGeneric;

import java.util.Arrays;

public class MyArrayList<T> {
    /**
     * Создает коллекцию заданной ёмкости, то есть с запасом.
     * Логически коллекция считается пустой.
     * @param capacity ёмкость коллекции, колечество элементов,
     * 		  которое можно добавить без пересоздания массива
     */
    @SuppressWarnings("unchecked") // подавляет предупрежение о подозрителном приведении типа
    public MyArrayList(int capacity) {
        array = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * Создает коллекцию на основе существующего массива
     *
     * @param array существующий массив
     */
    public MyArrayList(T[] array) {
        // безопаснее скопировать массив, иначе снаружи останется доступ к внутренностям
        // коллекции
        this.array = Arrays.copyOf(array, array.length);
        this.size = array.length;
    }

    /**
     * Добавляет новое значение в конец коллекции
     * @param value добавляемое значение
     */
    public void pushBack(T value) {
        ensureCapacity();
        array[size] = value;
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
            return array[--size];
        }
    }

    /**
     * Добавляет новое значение в начало коллекции
     * @param value добавляемое значение
     */
    public void pushFront(T value) {
        ensureCapacity();
        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = value;
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
            T firstElement = array[0];
            for (int i = 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
            return firstElement;
        }
    }

    /**
     * Усекает емкость коллекции до ее размера
     */
    public void truncate() {
        array = Arrays.copyOf(array, size);
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
        return array.length;
    }

    /**
     * Возвращает элемент коллекции по индексу
     * @param index индекс элемента
     * @return значение элемента коллекции
     */
    public T get(int index) {
        return array[index];
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
            array[index] = value;
        }

    }

    /**
     * Гарантирует свободное место для добавления хотя бы одного элемента
     */
    private void ensureCapacity() {
        if (size == getCapacity()) {
            int capacity = (int) (array.length * 1.5) + 1;
            array = Arrays.copyOf(array, capacity);
        }
    }

    /**
     * Количесвто элементов коллекции (логический размер)
     */
    private int size;

    /**
     * Массив обобщенного типа с элементами коллекции
     */
    private T[] array = null;
}
