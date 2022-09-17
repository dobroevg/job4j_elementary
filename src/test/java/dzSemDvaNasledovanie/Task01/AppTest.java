package dzSemDvaNasledovanie.Task01;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static dzSemDvaNasledovanie.Task01.Oplata.summed;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void proverka1Task01() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        Start table = new Start(name, oplata, timeWork, stavki);
        int excepted = 3000;
        Oplata oplata1 = new Oplata(timeWork, oplata, stavki);
        Assert.assertEquals(excepted, summed(oplata1.summ()));
    }

    @Test
    void proverka2Task01() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "сдельная", "сдельная"};
        int[] timeWork = {20, 200, 2000};
        int[] stavki = {100, 10};
        Start table = new Start(name, oplata, timeWork, stavki);
        int excepted = 4200;
        Oplata oplata1 = new Oplata(timeWork, oplata, stavki);
        Assert.assertEquals(excepted, summed(oplata1.summ()));
    }
    @Test
    void proverka1Task02() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        StartTask02 table1 = new StartTask02(name, oplata, timeWork, stavki);
        int excepted = 2450;
        int[] nalogi = table1.nalog();
        OplataTask02 oplata1 = new OplataTask02(timeWork, oplata, stavki, nalogi);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka2Task02() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "сдельная", "сдельная"};
        int[] timeWork = {20, 200, 2000};
        int[] stavki = {100, 10};
        StartTask02 table1 = new StartTask02(name, oplata, timeWork, stavki);
        int excepted = 3470;
        int[] nalogi = table1.nalog();
        OplataTask02 oplata1 = new OplataTask02(timeWork, oplata, stavki, nalogi);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka1Task03() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"есть дети", "нет детей", "нет детей"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        StartTask03 table1 = new StartTask03(name, oplata, timeWork, stavki, children);
        int excepted = 2350;
        int[] nalogi = table1.nalog();
        OplataTask03 oplata1 = new OplataTask03(timeWork, oplata, stavki, nalogi, children);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka2Task03() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"нет детей", "нет детей", "нет детей"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        StartTask03 table1 = new StartTask03(name, oplata, timeWork, stavki, children);
        int excepted = 2300;
        int[] nalogi = table1.nalog();
        OplataTask03 oplata1 = new OplataTask03(timeWork, oplata, stavki, nalogi, children);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka1Task05() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"есть дети", "нет детей", "нет детей"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        int kurs = 5;
        String[] offshores = {"В оффшоре", "Не в оффшоре", "Не в оффшоре"};
        StartTask05 table1 = new StartTask05(name, oplata, timeWork, stavki, children, kurs, offshores);
        int excepted = 2550;
        int[] nalogi = table1.nalog();
        OplataTask05 oplata1 = new OplataTask05(timeWork, oplata, stavki, nalogi, children, kurs, offshores);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka2Task05() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"нет детей", "нет детей", "нет детей"};
        int[] timeWork = {10, 100, 1000};
        int[] stavki = {100, 10};
        int kurs = 5;
        String[] offshores = {"В оффшоре", "В оффшоре", "В оффшоре"};
        StartTask05 table1 = new StartTask05(name, oplata, timeWork, stavki, children, kurs, offshores);
        int excepted = 3000;
        int[] nalogi = table1.nalog();
        OplataTask05 oplata1 = new OplataTask05(timeWork, oplata, stavki, nalogi, children, kurs, offshores);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }
    @Test
    void proverka1Task06() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"есть дети", "нет детей", "нет детей"};
        int[] timeWork = {10, 250, 1000};
        int[] stavki = {100, 10};
        int kurs = 5;
        int premiya = 100;
        String[] offshores = {"В оффшоре", "Не в оффшоре", "В оффшоре"};
        StartTask06 table1 = new StartTask06(name, oplata, timeWork, stavki, children, kurs, offshores, premiya);
        int excepted = 5750;
        int[] nalogi = table1.nalog();
        OplataTask06 oplata1 = new OplataTask06(timeWork, oplata, stavki, nalogi, children, kurs, offshores, premiya);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

    @Test
    void proverka2Task06() {
        String[] name = {"A", "B", "C"};
        String[] oplata = {"ставка", "почасовая", "сдельная"};
        String[] children = {"есть дети", "нет детей", "нет детей"};
        int[] timeWork = {10, 250, 1000};
        int[] stavki = {100, 10};
        int kurs = 5;
        int premiya = 100;
        String[] offshores = {"В оффшоре", "В оффшоре", "В оффшоре"};
        StartTask06 table1 = new StartTask06(name, oplata, timeWork, stavki, children, kurs, offshores, premiya);
        int excepted = 4500;
        int[] nalogi = table1.nalog();
        OplataTask06 oplata1 = new OplataTask06(timeWork, oplata, stavki, nalogi, children, kurs, offshores, premiya);
        Assert.assertEquals(excepted, summed(oplata1.summNalog()));
    }

}