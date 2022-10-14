package dzSemTriOdinInterfeysy;

public abstract class Battery implements ChinaBaterryInterface  {
    double getCharge() {
        return charge;
    }

    void setCharge(double charge) {
        this.charge = charge;
    }

    private double charge;

    public Battery() {
    }

    public boolean charge(double discharge) {
        if (charge >= discharge) {
            charge-= discharge;
            return true;
        } else {
            return false;
        }
    }
}
