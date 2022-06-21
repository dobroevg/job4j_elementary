package uroki;

import java.util.Scanner;

public class Lesson6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите доход");
      double x = sc.nextDouble();
      System.out.println("Введите издержки");
      double y = sc.nextDouble();
      double max = ((x - y) / y * 100 <= 100 && (x - y) / y * 100 >= 0 ? (x - y) / y * 100 : ((x - y) / y * 100 >= 100 ? 100 : 0));
      System.out.println(max);
   }
}
