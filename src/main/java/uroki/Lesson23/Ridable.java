package uroki.Lesson23;

public interface Ridable {
	public enum Dirrection {
		LEFT, RIGHT, FORWARD
	}
	
	void ride(int speed);
	void turn(Dirrection dirrection);
	boolean isMoving();
	
	void stop(); 
}
