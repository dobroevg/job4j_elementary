package trenirovka;

import java.util.Scanner;

public class Raznoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        System.out.println(a1);

//        System.out.print("Напишите число в двоичном виде (не больше 32 цифр): ");
//
//        // строка с числом, записанным в двоичной виде
//        String originBin = sc.next(); // для примера попробуйте 1100000100110110101
//        // число, которое было в строке
//        int origin = Integer.parseInt(originBin, 2);
//        System.out.printf("origin:%32s = %d\n", originBin, origin);
//
//        // в двоичном виде 15 - это 1111
//        // так как int из четырех байт, то 15 будет храниться как:
//        // 00000000 00000000 00000000 00001111
//        // если его сдвинуть влево на 3 бита, получится:
//        // 00000000 00000000 00000000 01111000
//        int mask = 15 << 3; // еще это 15 * (2 в степени 3)
//        String maskBin = Integer.toBinaryString(mask);
//        System.out.printf("mask:%32s = %d\n", maskBin, mask);
//
//        // Если в origin 00000000 00000110 00001001 10110101, то:
//        //   00000000 00000110 00001001 10110101
//        // & 00000000 00000000 00000000 01111000
//        //   -----------------------------------
//        //   00000000 00000000 00000000 00110000
//        int result = origin & mask;
//        String resultBin = Integer.toBinaryString(result);
//        System.out.printf("result:%32s = %d\n", resultBin, result);

        sc.close();
    }
}
