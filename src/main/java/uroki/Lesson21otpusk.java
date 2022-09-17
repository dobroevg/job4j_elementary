package uroki;

public class Lesson21otpusk {
    public Lesson21otpusk() {
        this(0, 0, 1, 1);
    }

    public Lesson21otpusk(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double perimetr() {
        return 2 * (width + height);
    }

    public double square() {
        return width * height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double setY() {
        return width;
    }

    public void setHeight() {
//        return height;
    }

    private double x;
    private double y;
    private double width;
    private double height;
}
