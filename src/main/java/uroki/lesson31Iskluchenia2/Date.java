package uroki.lesson31Iskluchenia2;

import java.util.IllegalFormatException;
import java.util.IllegalFormatPrecisionException;

import static java.lang.Integer.parseInt;

public class Date {
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
// Дата в формате 23-08-2023
    public static Date fromString(String str, String separator) {
        String[] words = str.split(separator);
        if (words.length != 3) {
            throw new WrongDateFormatException("Не соответствует формату ДД-ММ-ГГГГ");
        }

        int day = parseInt(words[0]);
        int month = parseInt(words[1]);
        int year = parseInt(words[2]);
        if (day < 0 || month < 0 || year < 1 || day > 31 || month > 12) {
            throw new WrongDateFormatException("Дата за пределами допустимого диапазона");
        }

        return new Date(day, month, year);
    }
    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", day, month, year);
    }
}
