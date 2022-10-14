package trenirovka;

public class File {
    String name;
    private String data;

    public static int staticField = 1;

    public File() {
        System.out.println("File()");
    }

    File(String name) {
        this.name = name;
        System.out.println("File(String name)");
    }

    File(String name, String data) {
        this.name = name;
        this.data = data;
        System.out.println("File(String name, String data)");
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public File coping() {
        File filen = new File ();
        filen.data = this.data + "12";
        filen.name = this.name + " (copy)";
        return filen;
    }

    public String coping1() {
        File filen = new File ();
        filen.data = this.data + "12";
        filen.name = this.name + " (copy)";
        return name;
    }

    public static int spec (int enter) {
        return 5 * enter;
    }

    public Number abc () {
        return 1;
    }

    public void d2 () {
        System.out.println(0);
    }

}
