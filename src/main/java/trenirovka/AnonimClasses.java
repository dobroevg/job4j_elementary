package trenirovka;

import java.util.Arrays;

public class AnonimClasses {
    public static void main(String[] args) {
        ArrayUtils uArray = new ArrayUtils(34);
        uArray.fill(3);
        uArray.print();
        ArrayUtils.Inn a1 = uArray.new Inn(11);
        a1.srt();
        uArray.print();
        ArrayUtils.Inn2 a2 = uArray.new Inn2(10, 4);
        uArray.print();
        System.out.println(a2.srt());
        uArray.print();

        uArray.sum(new ArrayUtils.OnCalculationListeners() {
            @Override
            public void getResult(int sum) {
                if (sum > 100) {
                    System.out.println("Сумма больше 100");

                }
                System.out.println("Array sum = " + sum);
            }
        });
    }
}
class ArrayUtils {
    private int[] array;
    public ArrayUtils(int count) {
        array = new int[count];
        fill(8);
    }
    public void fill(int value) {
        Arrays.fill(array, value);
    }

    public class Inn {

        public int getSqr() {
            return sqr;
        }

        public void setSqr(int sqr) {
            this.sqr = sqr;
        }

        private int sqr;


        public Inn (int sqr) {
            this.sqr = sqr;
            srt();
        }

        public int srt() {
            array[1] = sqr * array[1];
            return sqr * array[1];
        }

    }

    public class Inn2 extends Inn {

        private int s;
        public Inn2(int sqr, int s) {
            super(sqr);
            this.s = s;
        }

        @Override
        public int srt() {
            array[10] = getSqr() * array[10];
            return s * array[1];
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public void sum (OnCalculationListeners calculationListener1) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        if (calculationListener1 != null)
            calculationListener1.getResult(sum);
    }
    interface OnCalculationListeners {
        void getResult(int sum);
    }
}
