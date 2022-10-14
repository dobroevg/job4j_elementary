package dzSemTriOdinInterfeysy;

public class FlashlightWith2Battery extends Flashlight{

    public Battery getBattery2() {
        return battery2;
    }

    private Battery battery2;

    public FlashlightWith2Battery(Battery battery1, Battery battery2) {
        super(battery1);
        this.battery2 = battery2;
    }

    @Override
    public void on() {
        if (!isWork()) {
            getWork(getBattery().charge(getDischarge() / 2) && battery2.charge(getDischarge() / 2));
        }
    }
}
