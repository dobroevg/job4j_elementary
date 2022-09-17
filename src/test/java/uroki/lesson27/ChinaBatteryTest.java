package uroki.lesson27;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class ChinaBatteryTest {
    @Test
    void testFlashlightIsOff() {
        Flashlight flashlight = new Flashlight();
        assertFalse(flashlight.isLight());
    }

}