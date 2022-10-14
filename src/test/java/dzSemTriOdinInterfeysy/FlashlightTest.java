package dzSemTriOdinInterfeysy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class FlashlightTest {
    @Test
    void testFlashlightIsOff() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashlightIsOn() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testFlashlightIsOff2() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        flashlight.on();
        flashlight.off();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashlightIsFiveOn() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 5; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashlightIsForOn() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 4; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testChargeBattery() {
        ChinaBattery battery = new ChinaBattery();
        for (int i = 0; i < 5; i++) {
            battery.charge(1);
        }
        assertFalse(battery.charge(1));
    }

    @Test
    void testFlashlightJustOn() {
        ChinaBattery battery = new ChinaBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 10; i++) {
            flashlight.on();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }


    @Test
    void testDuracellFlashlightIsOff() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        assertFalse(flashlight.isWork());
    }

    @Test
    void testDuracellFlashlightIsOn() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testDuracellFlashlightIsOff2() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        flashlight.on();
        flashlight.off();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testDuracellFlashlightIsFivtyOn() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 50; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testDuracellFlashlightIs49On() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 49; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testDuracellChargeBattery() {
        DuracellBattery battery = new DuracellBattery();
        for (int i = 0; i < 50; i++) {
            battery.charge(1);
        }
        assertFalse(battery.charge(1));
    }

    @Test
    void testDuracellFlashlightJustOn() {
        DuracellBattery battery = new DuracellBattery();
        Flashlight flashlight = new Flashlight(battery);
        for (int i = 0; i < 100; i++) {
            flashlight.on();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorFlashlightIsOff() {
        Akkumulyator akkum = new Akkumulyator();
        Flashlight flashlight = new Flashlight(akkum);
        assertFalse(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorFlashlightIsOn() {
        Akkumulyator akkum = new Akkumulyator();
        Flashlight flashlight = new Flashlight(akkum);
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorFlashlightIsOff2() {
        Akkumulyator akkum = new Akkumulyator();
        Flashlight flashlight = new Flashlight(akkum);
        flashlight.on();
        flashlight.off();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorFlashlightIsSeventyOn() {
        Akkumulyator akkum = new Akkumulyator();
        Flashlight flashlight = new Flashlight(akkum);
        for (int i = 0; i < 70; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorFlashlightIs69On() {
        Akkumulyator akkum = new Akkumulyator();
        Flashlight flashlight = new Flashlight(akkum);
        for (int i = 0; i < 5; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testAkkumulyatorChargeBattery() {
        Akkumulyator akkum = new Akkumulyator();
        for (int i = 0; i < 70; i++) {
            akkum.charge(1);
        }
        assertFalse(akkum.charge(1));
    }

    @Test
    void testAkkumulyatorViewCharge() {
        Akkumulyator akkum = new Akkumulyator();
        for (int i = 0; i < 50; i++) {
            akkum.charge(1);
        }
        Assert.assertEquals(20, 20, 0.0001);
    }

    @Test
    void testAkkumulyatorCharger() {
        Akkumulyator akkum = new Akkumulyator();
        for (int i = 0; i < 50; i++) {
            akkum.charge(1);
        }
        akkum.charger(20);
        Assert.assertEquals(40, 40, 0.0001);
    }

    @Test
    void testAkkumulyatorSuperCharger() {
        Akkumulyator akkum = new Akkumulyator();
        for (int i = 0; i < 50; i++) {
            akkum.charge(1);
        }
        akkum.charger(90);
        Assert.assertEquals(70, 70, 0.0001);
    }

    @Test
    void testAkkumulyatorZeroCharger() {
        Akkumulyator akkum = new Akkumulyator();
        for (int i = 0; i < 70; i++) {
            akkum.charge(1);
        }
        akkum.charger(30);
        Assert.assertEquals(30, 30, 0.0001);
    }

    @Test
    void testRadioChinaIs8On() {
        ChinaBattery battery = new ChinaBattery();
        Radio radio = new Radio(battery);
        for (int i = 0; i < 7; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertFalse(radio.isWork());
    }

    @Test
    void testRadioChinaWorkIsOff() {
        ChinaBattery battery = new ChinaBattery();
        Radio radio = new Radio(battery);
        assertFalse(radio.isWork());
    }

    @Test
    void testRadioChinaWorkIsOn() {
        ChinaBattery battery = new ChinaBattery();
        Radio radio = new Radio(battery);
        radio.on();
        assertTrue(radio.isWork());
    }

    @Test
    void testRadioChinaIs7On() {
        ChinaBattery battery = new ChinaBattery();
        Radio radio = new Radio(battery);
        for (int i = 0; i < 6; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertTrue(radio.isWork());
    }

    @Test
    void testRadioDuracellIs76On() {
        DuracellBattery battery = new DuracellBattery();
        Radio radio = new Radio(battery);
        for (int i = 0; i < 75; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertFalse(radio.isWork());
    }

    @Test
    void testRadioDuracellIs75On() {
        DuracellBattery battery = new DuracellBattery();
        Radio radio = new Radio(battery);
        for (int i = 0; i < 74; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertTrue(radio.isWork());
    }

    @Test
    void testRadioAkkumIs76On() {
        Akkumulyator akkum = new Akkumulyator();
        Radio radio = new Radio(akkum);
        for (int i = 0; i < 105; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertFalse(radio.isWork());
    }

    @Test
    void testRadioAkkumIs75On() {
        Akkumulyator akkum = new Akkumulyator();
        Radio radio = new Radio(akkum);
        for (int i = 0; i < 104; i++) {
            radio.on();
            radio.off();
        }
        radio.on();
        assertTrue(radio.isWork());
    }

    @Test
    void testFlashligh2ChinaBatterytIs10On() {
        ChinaBattery battery1 = new ChinaBattery();
        ChinaBattery battery2 = new ChinaBattery();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 10; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashligh2ChinaBatterytIs9On() {
        ChinaBattery battery1 = new ChinaBattery();
        ChinaBattery battery2 = new ChinaBattery();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 9; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testFlashligh2DuracellBatterytIs100On() {
        DuracellBattery battery1 = new DuracellBattery();
        DuracellBattery battery2 = new DuracellBattery();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 100; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashligh2DuracellBatterytIs99On() {
        DuracellBattery battery1 = new DuracellBattery();
        DuracellBattery battery2 = new DuracellBattery();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 99; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testFlashligh2AkkumIs140On() {
        Akkumulyator battery1 = new Akkumulyator();
        Akkumulyator battery2 = new Akkumulyator();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 140; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertFalse(flashlight.isWork());
    }

    @Test
    void testFlashligh2DuracellBatterytIs139On() {
        Akkumulyator battery1 = new Akkumulyator();
        Akkumulyator battery2 = new Akkumulyator();
        FlashlightWith2Battery flashlight = new FlashlightWith2Battery(battery1, battery2);
        for (int i = 0; i < 139; i++) {
            flashlight.on();
            flashlight.off();
        }
        flashlight.on();
        assertTrue(flashlight.isWork());
    }

    @Test
    void testRadioFlashlight2Akkum() {
        Akkumulyator akkum1 = new Akkumulyator();
        Akkumulyator akkum2 = new Akkumulyator();
        FlashLightRadio gadget = new FlashLightRadio(akkum1, akkum2);
        assertFalse(gadget.isWork());
        assertFalse(gadget.isWorkRadio());
        gadget.on();
        assertTrue(gadget.isWork());
        assertFalse(gadget.isWorkRadio());
        gadget.onRadio();
        assertTrue(gadget.isWork());
        assertTrue(gadget.isWorkRadio());
        gadget.offRadio();
        assertTrue(gadget.isWork());
        assertFalse(gadget.isWorkRadio());
        gadget.off();
        assertFalse(gadget.isWork());
        assertFalse(gadget.isWorkRadio());
        akkum1.charger(10);
        akkum2.charger(10);
        for (int i = 0; i < 84; i++) {
            gadget.on();
            gadget.onRadio();
            gadget.off();
            gadget.offRadio();
        }
        gadget.on();
        gadget.onRadio();
        assertFalse(gadget.isWork());
        assertFalse(gadget.isWorkRadio());
        akkum1.charger(70);
        akkum2.charger(70);
        for (int i = 0; i < 82; i++) {
            gadget.on();
            gadget.onRadio();
            gadget.off();
            gadget.offRadio();
        }
        gadget.on();
        gadget.onRadio();
        assertTrue(gadget.isWork());
        assertTrue(gadget.isWorkRadio());
    }

    @Test
    void testFlashlightLED3Akkum() {
        Akkumulyator akkum1 = new Akkumulyator();
        Akkumulyator akkum2 = new Akkumulyator();
        Akkumulyator akkum3 = new Akkumulyator();
        FlashLightLED flashLight = new FlashLightLED(akkum1, akkum2, akkum3);
        assertFalse(flashLight.isWork());
        flashLight.on();
        assertTrue(flashLight.isWork());
        flashLight.off();
        assertFalse(flashLight.isWork());
        akkum1.charger(1);
        akkum2.charger(1);
        akkum3.charger(1);
        for (int i = 0; i < 629; i++) {
            flashLight.on();
            flashLight.off();

        }
        flashLight.on();
        assertFalse(flashLight.isWork());
        akkum1.charger(70);
        akkum2.charger(70);
        akkum3.charger(70);
        for (int i = 0; i < 628; i++) {
            flashLight.on();
            flashLight.off();

        }
        flashLight.on();
        assertTrue(flashLight.isWork());
    }
}