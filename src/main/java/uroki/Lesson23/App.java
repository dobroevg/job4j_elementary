package uroki.Lesson23;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();
        SuperClass scar = new SuperClass();

        car.ride();
        boat.swim();
        plane.fly();
        scar.ride();

    }
}
