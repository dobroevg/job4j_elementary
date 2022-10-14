package dzSemTriOdinInterfeysy;

public class Akkumulyator extends Battery{

    public Akkumulyator() {
        super();
        setCharge(70);
    }

    public void charger(double charger) {
        setCharge(Math.min(getCharge() + charger, 70));
    }

}
