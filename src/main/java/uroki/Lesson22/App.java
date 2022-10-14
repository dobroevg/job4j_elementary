package uroki.Lesson22;

public class App {
    public static void main(String[] args) {
//		Figure fig = new Figure(11., 2.); // ошибка, нельзя создать объект абстрактного класса

        Rectangle rect = new Rectangle(4., 0., 10., 15.);
        System.out.println("square = " + rect.getSquare());
        System.out.println("perimater = " + rect.getPerimeter());
        System.out.println("x = " + rect.getX() + ", y = " + rect.getY() + "\n");


        Square square = new Square(1., 5., 3.);
        System.out.println("square = " + square.getSquare());
        System.out.println("perimater = " + square.getPerimeter());
        System.out.println("x = " + square.getX() + ", y = " + square.getY() + "\n");

        Circle circle = new Circle(-1., -1., 1. / Math.PI);
        System.out.println("square = " + circle.getSquare());
        System.out.println("perimater = " + circle.getPerimeter());
        System.out.println("x = " + circle.getX() + ", y = " + circle.getY() + "\n");
    }
}
