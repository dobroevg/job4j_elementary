package dzSemOdinInkapsulyatsiya.Task03;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MonneyTest {

    @Test
    void addTest() {
        Monney sum1 = new Monney((long)9, (byte)99);
        Monney sum2 = new Monney((long)10, (byte)98);
        assertEquals("20,97", sum1.add(sum2).printSum());
    }

    @Test
    void subtractionTest() {
        Monney sum1 = new Monney((long)100, (byte)0);
        Monney sum2 = new Monney((long)99, (byte)99);
        assertEquals("0,01", sum1.subtraction(sum2).printSum());
    }

    @Test
    void comparisonTest1() {
        Monney sum1 = new Monney((long)100, (byte)0);
        Monney sum2 = new Monney((long)99, (byte)99);
        assertTrue(sum1.comparison(sum2));
    }

    @Test
    void comparisonTest2() {
        Monney sum1 = new Monney((long)99, (byte)99);
        Monney sum2 = new Monney((long)100, (byte)0);
        assertFalse(sum1.comparison(sum2));
    }

    @Test
    void divisionTest() {
        Monney sum1 = new Monney((long)3, (byte)33);
        Monney sum2 = new Monney((long)1, (byte)11);
        assertEquals("3.0", Double.toString(sum1.division(sum2)));
    }

    @Test
    void divisionFractionTest1() {
        Monney sum1 = new Monney((long)3, (byte)33);
        assertEquals("6,66", sum1.divisionFraction(2, 4).printSum());
    }

    @Test
    void divisionFractionTest2() {
        Monney sum1 = new Monney((long)3, (byte)33);
        assertEquals("6,66", sum1.divisionFraction(1, 2).printSum());
    }
}