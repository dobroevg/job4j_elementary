package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class EcalcdvetochkiTest {

    @Test
    public void when00to02Then2() {
        double excepted = 2;
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Ecalcdvetochki.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void when40to00Then4() {
        double excepted = 4;
        int x1 = 4;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Ecalcdvetochki.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, out, 0.01);
    }
}