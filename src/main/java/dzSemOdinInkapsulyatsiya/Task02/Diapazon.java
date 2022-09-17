package dzSemOdinInkapsulyatsiya.Task02;

public class Diapazon {
    private int start;
    private int end;

    public Diapazon(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setStart (int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public void setEnd (int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public boolean verification() {
        String verif = "Ошибка! Начало диапазона больше чем конец!";
        if (start > end) {
            return false;
//            System.out.print("Ошибка! Начало диапазона больше чем конец!");
        } else {
            return true;
        }
    }

    public int calculationLength() {
        if (verification()) {
            return end - start;
        } else {
            return 0;
        }
    }

    public boolean intersection(Diapazon range1) {
        boolean intersection = false;
        if (this.start >= range1.start && this.start <= range1.end || this.end >= range1.start
                && this.end <= range1.end) {
            intersection = true;
        }
        return intersection;
    }
}
