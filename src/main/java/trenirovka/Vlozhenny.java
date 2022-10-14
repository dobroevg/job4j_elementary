package trenirovka;

import java.util.Arrays;

public class Vlozhenny {
    public static void main(String[] args) {
        ArrayUtils1 uArray = new ArrayUtils1(50);
        uArray.fill(3);
        uArray.print();
        uArray.sum(new ArrayUtils1.
                OnCalculationListener() {
            @Override
            public void getResult(int sum) {
                System.out.println("Array sum = " + sum);
            }
        });
    }
}
class ArrayUtils1 {
    private int[] array;
    public ArrayUtils1(int count) {
        array = new int[count];
        fill(1);
    }
    public void fill(int value) {
        Arrays.fill(array, value);
    }
    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void sum
            (OnCalculationListener calculationListener)
    { int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        if (calculationListener != null)
            calculationListener.getResult(sum);
    }
    interface OnCalculationListener {
        void getResult(int sum);
    }
}
