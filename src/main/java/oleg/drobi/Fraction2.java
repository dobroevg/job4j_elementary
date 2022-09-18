package oleg.drobi;

// дробь
public class Fraction2 {
	public Fraction2(long up, long down) {
		this.up = up;
		this.down = down;
	}
//	public Fraction() {
//		this(0, 1);
		
//		this.up = 0;
//		this.down = 1;
//	}

//	public long getUp() {
//		return up;
//	}
//	public void setUp(long up) {
//		this.up = up;
//	}
//
//	public long getDown() {
//		return down;
//	}
//	public void setDown(long down) {
//		this.down = down;
//	}

	public Fraction2 add(Fraction2 frac1) {
		// 1     2      1*3 + 2*2      7
		// -  +  -  =   ---------  =   -
		// 2     3        2 * 3        6
		
		long up = this.up * frac1.down + frac1.up * this.down;
		long down = this.down * frac1.down;

		return new Fraction2(up, down);
	}
	
	
	public String toString() {
		return up + "/" + down;
	}

	private long up;
	private long down;
}






