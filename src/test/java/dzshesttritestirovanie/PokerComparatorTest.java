package dzshesttritestirovanie;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokerComparatorTest {

    @Test
    public void testCompareWithNull() {
        String[] cards = {null};
        assertEquals(-1, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareWithNull1() {
        String[] cards = {"2T 3Т 4Т 5Т 6Т", " "};
        assertEquals(-1, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareWithNull2() {
        String[] cards = {","};
        assertEquals(-1, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareNotFiveCards() {
        String[] cards = {"2Ч 3Ч 4Ч 5Ч"};
        assertEquals(-2, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareNotFiveCards1() {
        String[] cards = {"2Ч 3Ч 4Ч 5Ч 6Ч 7Ч"};
        assertEquals(-2, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareValidCards() {
        String[] cards = {"2Ч 3Ч 4Ч 5Ч 10Ч"};
        assertEquals(1, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareNotValidCards() {
        String[] cards = {"10Ч 3Ч 4В 5Ч 6Ч"};
        assertEquals(-3, PokerComparator.compare(cards));
    }

    @Test
    public void testCompareNotValidCards1() {
        String[] cards = {"10Ч 3Ч 4В 5 6Ч"};
        assertEquals(-3, PokerComparator.compare(cards));
    }

    @Test
    public void testHighCard() {
        String[] cards = {"8Б 3Т ВБ КП 9Т", "ДП 3Ч ТТ 5Ч 8П", "КБ 10Ч 2Т 3Т ВП"};
        assertEquals(2, PokerComparator.compare(cards));
    }

    @Test
    public void testHighCard1() {
        String[] cards = {"8Б 3Т ВБ ТП 9Т", "ДП 3Ч КТ 5Ч 8П", "КБ 10Ч 2Т 3Т ВП"};
        assertEquals(1, PokerComparator.compare(cards));
    }

    @Test
    public void testHighCard2() {
        String[] cards = {"8Б 3Т ВБ КП 9Т", "ДП 3Ч КТ 5Ч 8П", "4Б 10Ч 2Т ТТ ВП"};
        assertEquals(3, PokerComparator.compare(cards));
    }

    @Test
    public void testOnePara() {
        String[] cards = {"8Б 3Т ВБ 9П 9Т", "ДП 3Ч ТТ ДЧ 8П", "КБ 10Ч 2Т КТ ВП"};
        assertEquals(3, PokerComparator.compare(cards));
    }

    @Test
    public void testOnePara1() {
        String[] cards = {"КБ 10Ч 2Т КТ ВП", "ДП 3Ч ТТ ДЧ 8П", "8Б 3Т ВБ ДБ ДТ"};
        assertEquals(1, PokerComparator.compare(cards));
    }

    @Test
    public void testOnePara2() {
        String[] cards = {"ДП 3Ч ТТ ДЧ 8П", "КБ 10Ч 2Т КТ ВП", "8Б 3Т ВБ ДБ ДТ"};
        assertEquals(2, PokerComparator.compare(cards));
    }

    @Test
    public void testTwoPara() {
        String[] cards = {"10Ч КТ 6Т КЧ 6П", "КП 3Т ВБ КБ 3П", "ДП ВЧ ВТ ДЧ 8Ч"};
        assertEquals(1, PokerComparator.compare(cards));
    }

    @Test
    public void testTwoPara1() {
        String[] cards = {"10Ч КТ 6Т КЧ 6П", "10Ч ДТ ТТ ДБ ТП", "ДП ВЧ ВТ ДЧ 8Ч"};
        assertEquals(2, PokerComparator.compare(cards));
    }

    @Test
    public void testTwoPara2() {
        String[] cards = {"10Ч КТ 6Т КЧ 6П", "ДП ВЧ ВТ ДЧ 8Ч", "10Ч ДТ ТТ ДБ ТП"};
        assertEquals(3, PokerComparator.compare(cards));
    }

    @Test
    public void testThreeCards() {
        String[] cards = {"10Ч ДТ 6Т ВЧ 6П", "КП 3Т КБ КЧ 2П", "ДП ДБ ВТ ДЧ 6Ч"};
        assertEquals(2, PokerComparator.compare(cards));
    }

    @Test
    public void testThreeCards1() {
        String[] cards = {"ДП ДБ 10Т 2Ч ДЧ", "ВП 3Т ВБ ВЧ 2П", "КП КБ 7Т 6Ч 6Т"};
        assertEquals(1, PokerComparator.compare(cards));
    }

    @Test
    public void testThreeCards2() {
        String[] cards = {"КП КБ 7Т 10Ч 10Т", "ВП 3Т ВБ ВЧ 2П", "ДП ДБ 10Т 2Ч ДЧ"};
        assertEquals(3, PokerComparator.compare(cards));
    }

    @Test
    public void testStreet() {
        String[] cards = {"3П 4Т 8Б 5Ч 6П", "10П ДТ ВБ КБ 9Ч", "10Ч ТТ ДБ КЧ ВТ"};
        assertEquals(3, PokerComparator.compare(cards));
    }

    @Test
    public void testStreet1() {
        String[] cards = {"3П 4Т 8Б 5Ч 6П", "10Ч ТТ ДБ КЧ ВТ", "ТБ ТП КП КТ ТЧ"};
        assertEquals(2, PokerComparator.compare(cards));
    }

    @Test
    public void testStreet2() {
        String[] cards = {"10Ч ТТ ДБ КЧ ВТ", "ТБ ТП КП КТ ТЧ", "3П 4Т 7Б 5Ч 6П"};
        assertEquals(1, PokerComparator.compare(cards));
    }
}