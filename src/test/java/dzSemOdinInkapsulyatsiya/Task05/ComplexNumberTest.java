package dzSemOdinInkapsulyatsiya.Task05;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void comparisonTestTrue1() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(-1.0, -3.0, 0, 0);
        assertTrue(number1.comparison(number2));
    }

    @Test
    void comparisonTestTrue2() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(0, 0, -1, -3);
        assertTrue(number1.comparison(number2));
    }

    @Test
    void comparisonTestFalse() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(-1.0, +3.0, 0, 0);
        assertFalse(number1.comparison(number2));
    }

    @Test
    void addTest1() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(-1.1, 0, 0, 2);
        assertEquals("-2.1-1i", (number1.add(number2)).printComplexNumber());
    }

    @Test
    void addTest2() {
        ComplexNumber number1 = new ComplexNumber(0, 0, 1, -3);
        ComplexNumber number2 = new ComplexNumber(1.1, 2.0, 0, 0);
        assertEquals("2.1-1.0i", (number1.add(number2)).printComplexNumber());
    }

    @Test
    void subtractionTest1() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(-1.5, 2.1, 0, 0);
        assertEquals("0.5-5.1i", (number1.subtraction(number2)).printComplexNumber());
    }

    @Test
    void subtractionTest2() {
        ComplexNumber number1 = new ComplexNumber(0, 0, -1, -3);
        ComplexNumber number2 = new ComplexNumber(1.5, -3.0, 0, 0);
        assertEquals("-2.5+0i", (number1.subtraction(number2)).printComplexNumber());
    }

    @Test
    void multiplicactionTest1() {
        ComplexNumber number1 = new ComplexNumber(0, 0, 1, 1);
        ComplexNumber number2 = new ComplexNumber(0, 0, 1, 1);
        assertEquals("0+2i", (number1.multiplication(number2)).printComplexNumber());
    }

    @Test
    void multiplicactionTest2() {
        ComplexNumber number1 = new ComplexNumber(0, 0, 1, 1);
        ComplexNumber number2 = new ComplexNumber(0, 0, 1, -1);
        assertEquals("2+0i", (number1.multiplication(number2)).printComplexNumber());
    }
}