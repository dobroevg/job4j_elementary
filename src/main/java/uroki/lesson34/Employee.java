package uroki.lesson34;

public class Employee {


    public Employee(String name, String phone, String email, int numberrange, double currency) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.numberrange = numberrange;
        this.currency = currency;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberrange() {
        return numberrange;
    }

    public void setNumberrange(int numberrange) {
        this.numberrange = numberrange;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    private String name;
    private String phone;
    private String email;
    private int numberrange;
    private double currency;

    private static final String[] titles = "name,phone,email,numberrange,currency".split(",");

    public static String[] getTitles() {
        return titles;
    }

}
