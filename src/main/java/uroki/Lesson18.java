package uroki;

public class Lesson18 {
    static String join(String delimiter, String... elements) {
        if (delimiter == null) {
            return null;
        }

        String res = "[";
        if (elements.length == 0) {
            return "[]";
        }
        for (int i = 0; i < elements.length - 1; i++) {
                res += elements[i] + delimiter;
            }
            res += elements[elements.length - 1] + ']';
            return res;

    }
    //static String join(CharSequence delimiter, CharSequence... elements) {

    public static void main(String[] args) {
        String[] list = {"red", "blue", "green"};
        String result = '[' + String.join(",", list) + ']';
        System.out.println(result);
    }
}
