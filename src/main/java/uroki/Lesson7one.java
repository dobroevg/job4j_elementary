package uroki;

public class Lesson7one {
    public static void main(String[] args) {
        int num = 32;
        String binNum = Integer.toBinaryString(num);
        System.out.printf("%3d -> %32s\n", num, binNum);
        int res = ~num;
        String binRes = Integer.toBinaryString(res);
        System.out.printf("%3d -> %32s\n", res, binRes);
    }
}
