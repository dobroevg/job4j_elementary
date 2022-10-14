package exam1;

public class Divisons {
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    private String division;
    private int amount;
    private int wage;

    public Divisons(String division, int amount, int wage) {
        this.division = division;
        this.amount = amount;
        this.wage = wage;
    }
}
