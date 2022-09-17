package uroki.lesson28;

import java.util.Arrays;

/**
 * Расширяемая циклическая коллекция. Элементы бесконечно повторяются в обоих направлениях.
 * <br><br>
 *
 * В первом конструкторе создается простой массив объектов (Object[]).
 * <br>
 * Во втором конструкторе создается массив под объекты выбранного класса.
 * <br>
 * Так как снаружи класса компиллятор проверяет, какие элементы подаеются внутрь
 * и автоматически приводит типы, разницы фактически нет.
 * Так что первый вариант лучше. Именно таким способом реализован стандартный класс ArrayList<T>.
 * <br>
 * Во втором конструкторе для создания внутреннего массива используется рефлексия.
 * Рефлексия (отражение) - механизм, с помощью которого объекты и классы
 * сами предоставляют о себе информацию.
 * Механизм такой мощный, что позволяет даже получить доступ к приватным членам класса,
 * что используется в некоторых библиотеках.
 *
 * @param <T> тип элемента коллекции
 */

public class SimpleCollection<T> {
    /**
     * Создает коллекцию заданного размера
     * @param
     */
    @SuppressWarnings("unchecked") // подавляет предупрежение о подозрителном приведении типа
    public SimpleCollection(int capacity) {
        array = (T[])new Object[capacity];
        this.size = 0;
    }

    /**
     * Создает коллекцию на основе существующего массива
     * @param array существующий массив
     */
    public SimpleCollection(T[] array) {
        this.array = array;
    }

    public T popBack () {
        if (size == 0) {
            System.err.println("Error Size!");
            return null;
        } else {
            return array[--size];
        }
    }

    private void ensureCapacity () {
        if (size == getCapacity()) {
            int capacity = (int) (array.length * 1.5) + 1;
            array = Arrays.copyOf(array, capacity);
        }
    }

    public void pushFront(T value) {
        ensureCapacity();
        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = value;
        size++;
    }

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


    public void truncate() {
        array = Arrays.copyOf(array, size);
    }


    public void pushBack(T value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    private int size;



    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    /**
     * Возвращает элемент коллекции по  индексу
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
     * Обычный массив типа {@link #}
     */
    private T[] array = null;
}
