package ru.job4j.math;

import org.junit.Test;

import org.junit.Assert;

public class Max1Test {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
}