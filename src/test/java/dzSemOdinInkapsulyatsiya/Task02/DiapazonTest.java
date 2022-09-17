package dzSemOdinInkapsulyatsiya.Task02;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DiapazonTest {

    @Test
    void intersectionTrue() {
        Diapazon diap1 = new Diapazon(1, 3);
        Diapazon diap2 = new Diapazon(2, 5);
        assertTrue(diap1.intersection(diap2));
    }

    @Test
    void intersectionFalse() {
        Diapazon diap1 = new Diapazon(1, 3);
        Diapazon diap2 = new Diapazon(4, 5);
        assertFalse(diap1.intersection(diap2));
    }
}