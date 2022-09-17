package dzSemOdinInkapsulyatsiya.Task03;

public class Monney {
    private long grn;

    private byte kop;

    public Monney(long grn, byte kop) {
        this.grn = grn;
        this.kop = kop;
    }

    public void setGrn(long grn) {
        this.grn = grn;
    }

    public void setKop(byte kop) {
        this.kop = kop;
    }

    public long getGrn() {
        return grn;
    }

    public byte getKop() {
        return kop;
    }

    public String printSum() {
        String kopeyki;
        if (kop < 10) {
            kopeyki = "0" + Byte.toString(kop);
        } else {
            kopeyki = Byte.toString(kop);
        }
        String summ = Long.toString(grn) + "," + kopeyki;
        return summ;
    }

    public Monney add(Monney sum2) {
        long addGrn;
        byte addKop;
        if (this.kop + sum2.kop >= 100) {
            addGrn = this.grn + sum2.grn + 1;
            addKop = (byte)(this.kop + sum2.kop - 100);
        } else {
            addGrn = this.grn + sum2.grn;
            addKop = (byte)(this.kop + sum2.kop);
        }
        return new Monney(addGrn, addKop);
    }

    public Monney subtraction(Monney sum2) {
        double rez = 100 * this.grn + this.kop - 100 * sum2.grn - sum2.kop;
        long subGrn = (long) Math.abs(rez/100);
        byte subKop = (byte)Math.abs(rez % 100);
        return new Monney(subGrn, subKop);
    }

    public double division(Monney sum2) {
        double div = 0;
        if ((this.grn == 0 && this.kop == 0) || (sum2.grn == 0 && sum2.kop == 0)) {
            System.out.println("Ошибка! одна из сумм равна нулю!");
            return 0;
        } else {
            double var1 = this.grn + (double)this.kop/100.0;
            double var2 = sum2.grn + (double)sum2.kop/100.0;
            div = var1 / var2;
            return div;
        }
    }

    public Monney divisionFraction(int num1, int num2) {
        double answer = (this.grn + (double)this.kop/100.0) * (double) num2 / (double) num1;
        long divGrn = (long)answer;
        byte divKop = (byte)((answer * 100) % 100);
        return new Monney(divGrn, divKop);
    }

    public boolean comparison(Monney sum2) {
        boolean more = true;
        if(this.grn < sum2.grn || (this.grn == sum2.grn && this.kop <= sum2.kop)) {
            more = false;
        }
        return more;
    }
}
