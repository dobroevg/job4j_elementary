package uroki.Lesson23;

public class Plane implements Flying {
	@Override
	public void fly() {
		System.out.print("самолет летит по небу");
	}
	
	@Override
	public void land() {
		System.out.print("самолет приземляется");
	}
}
