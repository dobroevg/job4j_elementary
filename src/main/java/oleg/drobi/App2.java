package oleg.drobi;

public class App2 {
	public static void main(String[] args) {
		Fraction2 a = new Fraction2(1, 6);
		Fraction2 b = new Fraction2(2, 3);
		Fraction2 res = b.add(a);
		
		System.out.println(a + " + " + b + " = " + res);
	}
}
