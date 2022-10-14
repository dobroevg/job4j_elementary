package dzSemTriOdinInterfeysy;

public class FlashLightLED extends FlashlightWith2Battery{

    private Battery battery3;

    public FlashLightLED(Battery battery1, Battery battery2, Battery battery3) {
        super(battery1, battery2);
        this.battery3 = battery3;
        setDischarge(1/3.0);
    }

    @Override
    public void on() {
        if (!isWork()) {
            getWork(getBattery().charge(getDischarge() / 3) &&
                    getBattery2().charge(getDischarge() / 3) &&
                    battery3.charge(getDischarge() / 3));

        }
    }

    public double viewCharge() {
        double charge = battery3.getCharge() + getBattery().getCharge() + getBattery2().getCharge();
        return charge;
    }



}
