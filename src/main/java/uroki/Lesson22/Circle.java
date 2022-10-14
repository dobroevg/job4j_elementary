package uroki.Lesson22;

public class Circle extends Figure{
    public Circle (double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
        System.out.printf("Circle constructor: radius = %.2f\n", radius);
    }

    @Override
    public double getSquare() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    private double radius;
}
