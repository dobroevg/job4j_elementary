package uroki.Lesson23;

public class SuperClass extends Car {
    @Override
    public void ride() {
        System.out.print("быстро ");
        super.ride();
    }
}
