package exam1;

public class Employee {

    private String name;
    private String birthDay;
    private String gender;
    private String phone;
    private String position;
    private String division;
    private String chief;

    private String employmentDate;

    private int wage;

    public Employee(String name, String birthDay, String gender, String phone, String position, String division,
                    String chief, String employmentDate, int wage) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.phone = phone;
        this.position = position;
        this.division = division;
        this.chief = chief;
        this.employmentDate = employmentDate;
        this.wage = wage;
    }

    private static final String[] titles = ("name,birth Day,gender,phone,position,division,chief,employmentDate," +
            "wage").split(",");

    public Employee() {
    }

    public static String[] getTitles() {
        return titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
