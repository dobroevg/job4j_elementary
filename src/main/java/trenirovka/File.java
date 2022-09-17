package trenirovka;

public class File {
    private String name;
    private String data;

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
}
