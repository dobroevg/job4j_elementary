package dzSemTriOdinInterfeysy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class FlashlightTest {
    @Test
    void testFlashlightIsOff() {
        Flashlight flashlight = new Flashlight();
        assertFalse(flashlight.isLight());
    }

    @Test
    void testFlashlightIsOn() {
        Flashlight flashlight = new Flashlight();
        flashlight.on();
        assertTrue(flashlight.isLight());
    }

    @Test
    void testFlashlightIsOff2() {
        Flashlight flashlight = new Flashlight();
        flashlight.on();
        flashlight.off();
        assertFalse(flashlight.isLight());
    }

    @Test
    void testFlashlightIsFiveOn() {
        Flashlight flashlight = new Flashlight();
        for (int i = 0; i < 5; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isLight());
    }

    @Test
    void testFlashlightIsForOn() {
        Flashlight flashlight = new Flashlight();
        for (int i = 0; i < 4; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isLight());
    }

    @Test
    void testChargeBattery() {
        ChinaBattery battery = new ChinaBattery(5);
        for (int i = 0; i < 5; i++) {
            battery.charge();
        }
        assertFalse(battery.charge());
    }

    @Test
    void testFlashlightJustOn() {
        Flashlight flashlight = new Flashlight();
        for (int i = 0; i < 10; i++) {
            flashlight.on();
        }
        flashlight.on();
        assertTrue(flashlight.isLight());
    }

}