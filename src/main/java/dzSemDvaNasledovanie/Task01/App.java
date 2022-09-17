package dzSemDvaNasledovanie.Task01;

import java.util.Random;

public class App {

    public static int[] stavki() {
        int[] stavki = new int[2];
        Random rand = new Random();
        stavki[0] = rand.nextInt(50, 151);
        stavki[1] = rand.nextInt(8, 21);
        return  stavki;
    }

    public static String[] name() {
        String[] name = {"Иванов", "Петров", "Сидоров", "Орлов", "Соколов", "Ветров", "Зайцев", "Волков", "Конев",
                "Лосев", "Коровин", "Оленин"};
        return name;
    }

    public static String[] oplata(String[] name) {
        Random rand = new Random();
        String[] stavka = new String[name.length];
        for (int i = 0; i < stavka.length; i++) {
            int num = rand.nextInt(1, 4);
            switch (num) {
                case 1 : stavka[i] = "ставка";
                    break;
                case 2 : stavka[i] = "почасовая";
                    break;
                case 3 : stavka[i] = "сдельная";
                    break;
            }
        }
        return stavka;
    }

    public static int[] timeWork(String[] oplata) {
        Random rand = new Random();
        int[] timeWork = new int[oplata.length];
        for (int i = 0; i < oplata.length; i++) {
            if ("ставка".equals(oplata[i])) {
                timeWork[i] = rand.nextInt(15, 26);
            }
            if ("почасовая".equals(oplata[i])) {
                timeWork[i] = rand.nextInt(195, 211);
            }
            if ("сдельная".equals(oplata[i])) {
                timeWork[i] =  rand.nextInt(1500, 2501);
            }
        }
        return timeWork;
    }

    public static String[] children(String[] name) {
        Random rand = new Random();
        String[] children = new String[name.length];
        for (int i = 0; i < children.length; i++) {
            int num = rand.nextInt(1, 3);
            switch (num) {
                case 1 : children[i] = "есть дети";
                    break;
                case 2 : children[i] = "нет детей";
                    break;
            }
        }
        return children;
    }

    public static int kurs() {
        Random rand = new Random();
        return rand.nextInt(2, 8);
    }

    public static String[] offshore(String[] name) {
        Random rand = new Random();
        String[] offshore = new String[name.length];
        for (int i = 0; i < name.length; i++) {
            int num = rand.nextInt(1, 3);
            switch (num) {
                case 1 : offshore[i] = "В оффшоре";
                    break;
                case 2 : offshore[i] = "Не в оффшоре";
                    break;
            }
        }
        return offshore;
    }

    public static int premiya() {
        Random rand = new Random();
        return rand.nextInt(20, 50);
    }


    public static void main(String[] args) {
        String[] name = name();
        String[] oplata = oplata(name);
        int[] timeWork = timeWork(oplata);
        int[] stavki = stavki();
        String[] children1 = children(name);
        int kurs = kurs();
        String[] offshore = offshore(name);


//        Start table = new Start(name, oplata, timeWork, stavki);
//        table.calculation();

//        StartTask02 table1 = new StartTask02(name, oplata, timeWork, stavki);
//        table1.calculation();

//        StartTask03 table1 = new StartTask03(name, oplata, timeWork, stavki, children1);
//        table1.calculation();

//        StartTask04 table1 = new StartTask04(name, oplata, timeWork, stavki, children1, kurs);
//        table1.calculation();

//        StartTask05 table1 = new StartTask05(name, oplata, timeWork, stavki, children1, kurs, offshore);
//        table1.calculation();

        StartTask06 table1 = new StartTask06(name, oplata, timeWork, stavki, children1, kurs, offshore, premiya());
        table1.calculation();
    }
}
