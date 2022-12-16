package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("case 1/1/2018")
    public void testDay1Month1Year2018(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
        String expected = "2/1/2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/1/2018")
    public void testDay31Month1Year2018(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDay.getLastDayMonth(dayTest, monthTest,yearTest);
        String expected = "1/2/2018";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("case 30/4/2018")
    public void testDay30Month4Year2018(){
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String result = NextDay.getLast30Day(dayTest, monthTest, yearTest);
        String expected = "1/5/2018";
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("case 28/2/2018")
    public void testDay28Month2Year2018(){
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String result = NextDay.getLast28Or29Day(dayTest, monthTest, yearTest);
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 29/2/2020")
    public void testDay29Month2Year2018(){
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String result = NextDay.getLast28Or29Day(dayTest, monthTest, yearTest);
        String expected = "1/3/2020";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/12/2018")
    public void testDay31Month12Year2018(){
        int datTest = 31;
        int monthTest = 12;
        int yearTest = 2018;
        String result = NextDay.getLast31Day(datTest, monthTest, yearTest);
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }
}