package uroki.Lesson23;

public class Boat implements Swiming {
	@Override
	public void swim() {
		System.out.print("лодка плывет по воде");
	}

	@Override
	public void stop() {
		System.out.println("лодка встала на якорь");
	}
}
