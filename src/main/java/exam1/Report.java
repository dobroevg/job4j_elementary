package exam1;

public class Report extends Divisons{
    private String chief;

    private String employers;

    public Report(String division, int amount, int wage, String chief, String employers) {
        super(division, amount, wage);
        this.chief = chief;
        this.employers = employers;
    }


    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getEmployers() {
        return employers;
    }

    public void setEmployers(String employers) {
        this.employers = employers;
    }
}
