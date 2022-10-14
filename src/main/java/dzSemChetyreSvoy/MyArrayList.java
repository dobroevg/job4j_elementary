package dzSemChetyreSvoy;

import java.util.Arrays;
import java.util.Random;

public class MyArrayList <T> implements Cloneable {
    private T[] data;

    public int getSize() {
        return size;
    }

    private int size;

    public int getCapacity() {
        return capacity;
    }

    /**
     * Возвращение значения элемента по индексу с проверкой индекса
     * @param index проверятся что больше либо равен 0 и меньше size
     * @return значение элемента если индекс верный и null если индекс неверный
     */
    public T getElement(int index) {
        if (index < size && index >= 0) {
            return data[index];
        } else {
            return null;
        }

    }

    int capacity = 10;

    /**
     * @param capacity  в конструкторе MyArrayList задается емкость
     */
    public MyArrayList (int capacity){
        data = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public MyArrayList () {
        this(10);
        data = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * Переопределение метода toString
     * @return возвращает элементы массива в строке через пробел
     */
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                str = str + data[i];
            } else {
                str = str + data[i] + " ";
            }
        }
        return str;
    }

    /**
     * Увеличение емкости в случае когда размер массива достигает размера емкости
     */
    private void ensureCapacity() {
        if(capacity == size) {
             data = Arrays.copyOf(data, ((int) (size * 1.5 + 1)));
             capacity = data.length;
        }
    }

    /**
     * @param value добавляется в массив в качестве последнего элемента
     */
    public void pushBack(T value) {
        ensureCapacity();
        data[size] = value;
        size++;
    }

    /**
     * удаление первого элемента из массива
     */
    public void popFront() {
        if(size > 0) {
            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            size--;
        }
    }

    /**
     * @param value добавляется в массив в качестве первого элемента
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
     * @param value добавляется в массив в качестве элемента с индексом index
     */
    public void insert(int index, T value) {
        ensureCapacity();
        if (index < size) {
            for (int i = size - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = value;
            size++;
        } else {
            System.out.println("Индекс вне диапазона!");
        }
    }

    /**
     * @param index удаляется из массива элемент с данным индексом
     */
    public void removeAt(int index) {
        if (index < size) {
            for (int i = index + 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            size--;
        } else {
            System.out.println("Индекс вне диапазона!");
        }
    }

    /**
     * @param value из массива удаляется первый найденный элемент с данным значением
     */
    public void remove(T value) {
        int remove = 0;
        boolean removes = false;
        for (int i = 0; i < size; i++) {
            if (value.equals(data[i])) {
                remove = i;
                removes = true;
                break;
            }
        }
        if (removes) {
            for (int i = remove + 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            size--;
        } else {
            System.out.println("Элемент не найден!");
        }
    }

    /**
     * @param value из массива удаляются все элементы с данным значением
     */
    public void removeAll(T value) {
        int remove = 0;
        boolean removes = false;
        boolean removes1 = false;
        for (int i = 0; i < size; i++) {
            removes = false;
            if (value.equals(data[i])) {
                remove = i;
                removes = true;
                removes1 = true;
            }
            if (removes) {
                for (int j = remove + 1; j < size; j++) {
                    data[j - 1] = data[j];
                }
                size--;
            }
        }
        if (!removes1) {
            System.out.println("Элемент не найден!");
        }
    }

    /**
     * из массива удаляются последний элемент
     */
    public void popBack() {
        if(size > 0) {
            size--;
        }
    }

    /**
     * очистка массива: всем элементам присваивается значение null, размер массива 0
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
            size = 0;
        }
    }

    /**
     * проверка что размер массива 0
     * @return true если массив пустой
     */
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (size == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    /**
     * емкость массива приводится в соотвествие с размером массива
     */
    public void trimToSize() {
        data = Arrays.copyOf(data, size);
        capacity = data.length;
    }

    /**
     * поиск заданного элемеента слева массива
     * @param value подается элемент, который ищем
     * @return возвращвет его индекс в массиве
     */
    public int indexOf(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(data[i].equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * поиск заданного элемеента справа массива
     * @param value подается элемент, который ищем
     * @return возвращвет его индекс в массиве
     */
    public int lastIndexOf(T value) {
        int index = -1;
        for (int i = size - 1; i >= 0; i--) {
            if(data[i].equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * перестановка элементов массива в обратном порядке
     */
    public void reverse() {
        ensureCapacity();
        if (size > 1) {
            for (int i = 0; i < size / 2; i++) {
                data[size] = data[i];
                data[i] = data[size - 1 - i];
                data[size - 1 - i] = data[size];
            }
        }
    }

    /**
     * перемешивание элементов массива в случайном порядке
     */
    public void shuffle() {
        ensureCapacity();
        if (size > 1) {
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                int num = rand.nextInt(i, size);
                data[size] = data[i];
                data[i] = data[num];
                data[num] = data[size];
            }
        }
    }

    /**
     * Сравнение двух объектов класса MyArrayList
     * @param mass подается на вход
     * @return возвращает результат сравнение массивов
     */
    public boolean equals(MyArrayList <T> mass) {
        if(mass.getSize() != size) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (!mass.toString().equals(toString())) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * неглубокое копирование объекта
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }





}
