package dzSemTriOdinInterfeysy;

public class Flashlight implements FlihgtLightInterface {
    public Flashlight() {
        light = false;

    }

    private ChinaBattery battery = new ChinaBattery(5);

    public void on() {
        if (!light) {
            light = battery.charge();
        }
    }

    public void off() {
        light = false;

    }

    public boolean isLight() {
        return light;
    }

    private boolean light;
}

