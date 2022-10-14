// ссылка на диаграмму классов
// www.plantuml.com/plantuml/png/VPBDJiCm3CVFv2bot43P2y1XV8WJI1DzWcpna2KtgP9qCC7UdHZoqVP0J_RF7x7_xZP4xUFOaq0RmH_r0UGR6hqda5_YwkRaq4YF1bOfBiC0ODO5nz7RrHDw3uU8pafJJKxPEqUWhSJmwavetrUrBaGt9EyoURBxm3xbj2T30lzMFDDvLd2aSyidRSrllZYG3a4-QfyoPVucIwqhL7K_SSbL3qx7REv8MsZDE39fg9QxrXRTE81F1Tcz7wDRp99HcwGXdgZNdnqFrSAAmpia5wKkLjkq1LcPwhNhlM2FaOLYGknqZ6VdLJLsovtB_t3tlTdmzg9SYy6VIdoD3B9Moo9EAuLpA9AHY59DhKAAO48KvQuPrhMtOCtOqmy0
// 
// добавлена еще пара классов, AutoCar и AutoPilot чтобы показать еще одну связь - композицию
// композиция - это связь часть-целое
// в примере есть классы автоматической машины и автопилота,
// автоматическая машина содержит объект автопилота как свою часть - это отношение композиции
// на схеме связь обозначается линией с закрашенным ромбиком вконце, ромбик указывает на владельца
//
// в домашней работе на схеме должна присутствовать композиция

package uroki.Lesson23;

import uroki.Lesson23.Ridable.Dirrection;

public class App {
	static void example1() {
		System.out.println("CAR");
		Car car = new Car();
		car.ride();
		System.out.println();
		System.out.println("is moving: " + car.isMoving());
		//Dirrection dir = Dirrection.LEFT;
		car.turn(Dirrection.LEFT);

		System.out.println("BOAT");
		Boat boat = new Boat();
		boat.swim();
		System.out.println();

		System.out.println("PLANE");
		Plane plane = new Plane();
		plane.fly();
		System.out.println();
		plane.land();
		System.out.println();

		System.out.println("SUPERCAR");
		SuperCar superCar = new SuperCar();
		superCar.ride();
		System.out.println();
		System.out.println("is moving: " + car.isMoving());
		car.turn(Dirrection.FORWARD);

		System.out.println("VEZDEHOD");
		CarBoat vezdehod = new CarBoat();
		vezdehod.ride(25);
		System.out.println();
		vezdehod.stop();
		System.out.println("is moving: " + vezdehod.isMoving());
		vezdehod.turn(Dirrection.RIGHT);
		vezdehod.swim();
		System.out.println();
	}

	
	static void useRidable(Ridable ridable, int speed, Dirrection dirrection) {
		ridable.ride(speed);
		System.out.println();
		System.out.println("is moving: " + ridable.isMoving());
		ridable.turn(dirrection);
		ridable.stop();
	}
	
	static void useSwiming(Swiming swiming) {
		swiming.swim();
		System.out.println();
		swiming.stop();
	}
	
	static void useFlying(Flying flying) {
		flying.fly();
		System.out.println();
		flying.land();
		System.out.println();
	}
	
	static void example2() {
//		Ridable ridable = new Car();
//		Car castExample = (Car)ridable;
		System.out.println("CAR");
		Car car = new Car();
		useRidable(car, 60, Dirrection.LEFT);
		System.out.println();

		System.out.println("SUPERCAR");
		SuperCar superCar = new SuperCar();
		useRidable(superCar, 100, Dirrection.FORWARD);
		System.out.println();

		System.out.println("BOAT");
		Boat boat = new Boat();
		useSwiming(boat);
		// useRidable(boat, 60, Dirrection.LEFT); // ошибка
		System.out.println();

		System.out.println("PLANE");
		Plane plane = new Plane();
		useFlying(plane);
		System.out.println();

		System.out.println("VEZDEHOD");
		CarBoat vezdehod = new CarBoat();
		useRidable(vezdehod, 40, Dirrection.RIGHT);
		useSwiming(vezdehod);
	}
	
	public static void main(String[] args) {
		example2();
	}
}









