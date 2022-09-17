package dzSemOdinInkapsulyatsiya.Task04;

import java.util.Arrays;

public class MainString {
    private int length;

    private char[] mass;

    public MainString() {
    }

    public MainString(String s) {
        this.mass = s.toCharArray();
        this.length = s.length();
    }

    public MainString(char c) {
        String s1 = Character.toString(c);
        this.mass = s1.toCharArray();
         this.length = 1;
    }

    public int getLength() {
        return length;
    }

    public String getMass() {
        return Arrays.toString(mass);
    }

    public String clear (String s) {
       s = "";
       length = 0;
       return s;
    }

    public int search(String s) {
        return s.indexOf("i");
    }

}
