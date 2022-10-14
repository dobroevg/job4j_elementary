package uroki.Lesson23;

public class Car implements Ridable {
	public void ride() {
		ride(40);
	}

	@Override
	public void ride(int speed) {
		this.speed = speed;
		System.out.printf("автомобиль едет со скоростью %d км/ч по дороге", speed);
	}

	@Override
	public void turn(Dirrection dirrection) {
		switch (dirrection) {
		case FORWARD:
			System.out.println("автомобиль движется прямо");
			break;
		case LEFT:
			System.out.println("автомобиль поворачивает налево");
			break;
		case RIGHT:
			System.out.println("автомобиль поворачивает направо");
			break;
		}
	}

	@Override
	public boolean isMoving() {
		return speed != 0;
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("автомобиль остановился");
	}
	

	
	private int speed;
}
