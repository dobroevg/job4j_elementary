package trenirovka;

public class FileNasl extends File{

    private String name;

    private int izm;

    public FileNasl (String name) {
        super(name);

    }

    public FileNasl (String name, String data, int izm) {
        super(name, data);
        this.izm = izm;
        System.out.println("Задан izm");
        this.name = name;
        System.out.println("Задан name = " + super.name);
    }

    public FileNasl () {
        super();
    }

    public String coping1(int izm) {
        File filen = new File (name);
        filen.setName(filen.getName() + " (copy)" + this.izm);
        return filen.getName();
    }

    public int sum() {
        return 7 + izm;
    }

    @Override
    public Integer abc() {
        return 333;
    }

    public void d2 () {
        System.out.println(super.abc());
    }



}
