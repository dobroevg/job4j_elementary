package uroki.Lesson22;

public abstract class Figure {
    public Figure(double x, double y) {
        System.out.printf("Figure constructor: x = %.2f, y = %.2f\n", x, y);

        this.x = x;
        this.y = y;
    }

    // абстрактные методы вычисления площади и периметра
    // данная фигура слишком обобщенная, чтобы написать какой-то способ вычисления
    public abstract double getSquare();
    public abstract double getPerimeter();


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    private double x;
    private double y;
}
