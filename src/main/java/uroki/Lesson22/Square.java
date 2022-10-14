package uroki.Lesson22;

public class Square extends Figure {
    public Square(double x, double y, double size) {
        super(x, y);
        this.size = size;
        System.out.printf("Square constructor: size = %.2f\n", size);
    }

    @Override
    public double getSquare() {
        return size * size;
    }

    @Override
    public double getPerimeter() {
        return 4 * size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    private double size;
}
