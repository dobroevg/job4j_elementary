package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class EchoTest {

    @Test
    public void whenConvert1000RblThen10Euro() { //метод проверка конвертации 1000 рублей в 100 евро
        float in = 100; //входные данные
        float excepted = 1; //ожидаемый результат
        float out = Echo.rubleToEuro(in); // ссылка на класс.метод
        float eps = 0.0001f; //точность сравнения
        Assert.assertEquals(excepted, out, eps); //вызов метода сравнения
    }

    @Test
    public void whenConvert1000RblThen20Dollar() {
        float in = 250;
        float excepted = 5;
        float out = Echo.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(excepted, out, eps);
    }
}