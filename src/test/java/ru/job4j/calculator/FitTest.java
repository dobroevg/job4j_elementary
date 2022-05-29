package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenman180Tnen92() {
        short in = 180;
        double excepted = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenwoman170Then69() {
        short in = 170;
        double excepted = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }
}