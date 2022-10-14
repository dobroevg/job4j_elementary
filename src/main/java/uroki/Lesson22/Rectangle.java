package uroki.Lesson22;

public class Rectangle extends Figure {
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
        System.out.printf("Rectangle constructor: width = %.2f, height = %.2f\n", width, height);
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }


    private double width;
    private double height;
}
