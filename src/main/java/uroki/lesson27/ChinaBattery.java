package uroki.lesson27;

public class ChinaBattery implements ChinaBaterryInterface {

    private int charge;

    public ChinaBattery(int charge) {
        this.charge = charge;
    }

    public boolean charge() {
        if (charge > 0) {
            charge--;
            return true;
        } else {
            return false;
        }
    }
}
