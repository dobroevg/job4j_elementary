package dzSemOdinInkapsulyatsiya.Task04;

public class App {
    public static void main(String[] args) {
        System.out.println("Конструктор без параметров: ");
        MainString str1 = new MainString();
        System.out.println("Длина строки: " + str1.getLength());
        System.out.println("Массив символов: " + str1.getMass());
        System.out.println("Конструктор cо строковым литералов: ");
        String s = "MainString";
        MainString str2 = new MainString(s);
        System.out.println("Длина строки: " + str2.getLength());
        System.out.println("Массив символов: " + str2.getMass());
        System.out.println("Поиск символа i в строке: " + str2.search(s));
        System.out.println("Очистка строки: " + str2.clear(s));
        char ch = 'r';
        MainString str3 = new MainString(ch);
        System.out.println("Длина строки: " + str3.getLength());
        System.out.println("Массив символов: " + str3.getMass());
    }
}
