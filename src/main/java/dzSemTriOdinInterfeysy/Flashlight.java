package dzSemTriOdinInterfeysy;

public class Flashlight extends СonsumerEnergy{

    public Battery getBattery() {
        return battery;
    }

    private Battery battery;

    private boolean work;

    public void getWork(boolean work) {
        this.work = work;
    }

    public void setDischarge(double discharge) {

        this.discharge = discharge;
    }

    public double getDischarge() {
        return discharge;
    }

    private double discharge;

    public Flashlight(Battery battery) {
        work = false;
        this.battery = battery;
        this.discharge = 1;
    }

    public void on() {
        if (!work) {
            work = battery.charge(discharge);
        }
    }


    public void off() {
        work = false;

    }

    public boolean isWork() {
        return work;
    }


}

