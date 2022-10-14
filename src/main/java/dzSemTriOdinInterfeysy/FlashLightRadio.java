package dzSemTriOdinInterfeysy;

public class FlashLightRadio extends FlashlightWith2Battery{

    public boolean isWorkRadio() {
        return workRadio;
    }

    public void setWorkRadio(boolean workRadio) {
        this.workRadio = workRadio;
    }

    private boolean workRadio;

    public FlashLightRadio(Battery battery1, Battery battery2) {
        super(battery1, battery2);
        workRadio = false;
    }

    @Override
    public void on() {
        if (!isWork()) {
            getWork(getBattery().charge(getDischarge() / 2) && getBattery2().charge(getDischarge() / 2));
        }
    }

    public void onRadio() {
        if (!workRadio) {
            workRadio = getBattery().charge(getDischarge() / (2 * 1.5)) &&
                    getBattery2().charge(getDischarge() / (2 * 1.5));
        }
    }

    public void offRadio() {
        workRadio = false;

    }

}
