package dzSemOdinInkapsulyatsiya.Task01;

public class Diapazon {
    private int start;
    private int end;

    public Diapazon (int start, int end) {
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
}
