package dzSemTriOdinInterfeysy;

public class Radio extends Flashlight{

    public Radio(Battery battery) {
        super(battery);
        setDischarge(1/1.5);
    }
}
