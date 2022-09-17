package dzSemDvaNasledovanie.Task01;

public class OplataTask05 extends OplataTask04{

    public String[] getOffshores() {
        return offshores;
    }

    private String[] offshores;
    public OplataTask05(int[] timeWork, String[] oplata, int[] stavki, int[] nalog1, String[] children, int kurs,
                        String[] offshores) {
        super(timeWork, oplata, stavki, nalog1, children, kurs);
        this.offshores = offshores;
    }



}
