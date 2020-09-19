package com.epam.task.first.logic;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class DigitCalculatorTest {

    @Test
    public void testFindSquareLastDigitShouldCalculateWhenNumberIsPositive(){
        //given
        DigitCalculator calculator = new DigitCalculator();
        //when
        int actual = calculator.findSquareLastDigit(12);

        //then
        Assert.assertEquals(4, actual);
    }

    @Ignore
    @Test
    public void testFindSquareLastDigitShouldCalculateWhenNumberIsNegative(){
        //given
        DigitCalculator calculator = new DigitCalculator();
        //when
        int actual = calculator.findSquareLastDigit(-15);

        //then
        Assert.assertEquals(5, actual);
    }

}
