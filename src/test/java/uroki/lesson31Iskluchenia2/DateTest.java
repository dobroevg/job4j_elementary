package uroki.lesson31Iskluchenia2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testDateFromCorrectNumbers() {
        Date data = new Date(1, 3, 1973);
        assertEquals(1, data.getDay());
        assertEquals(3, data.getMonth());
        assertEquals(1973, data.getYear());
    }

    @Test
    void testDateFromString() {
        Date data = Date.fromString("01-03-1973", "-");
        assertEquals(1, data.getDay());
        assertEquals(3, data.getMonth());
        assertEquals(1973, data.getYear());
    }

    void createDateString() {
        Date.fromString("04-10-76-1973", "-");
    }

    @Test
    void testDateFromStringManyNumbers() {
        WrongDateFormatException exception = assertThrows(
                WrongDateFormatException.class,
                this::createDateString
        );
        var expected = "Не соответствует формату ДД-ММ-ГГГГ";
        assertEquals(expected, exception.getMessage());
    }
}