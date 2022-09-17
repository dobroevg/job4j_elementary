package dzSemOdinInkapsulyatsiya.Task01;

import dzshesttritestirovanie.PokerComparator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DiapazonTest {

    @Test
    void calculationLengthTrue() {
        Diapazon diap = new Diapazon(1, 3);
        assertEquals(2, diap.calculationLength());
    }

    @Test
    void calculationLengthFalse() {
        Diapazon diap = new Diapazon(3 ,1);
        assertEquals(0, diap.calculationLength());
    }

    @Test
    void verificationTrue() {
        Diapazon diap = new Diapazon(1, 3);
        assertEquals(true, diap.verification());
    }

    @Test
    void verificationFalse() {
        Diapazon diap = new Diapazon(3, 1);
        assertEquals(false, diap.verification());
    }
}