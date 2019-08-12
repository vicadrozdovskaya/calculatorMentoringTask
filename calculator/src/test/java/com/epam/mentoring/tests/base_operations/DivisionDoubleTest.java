package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DivisionDoubleTest extends BaseTest {

    @Test(groups = {"baseOperation","doubleTypeOfData"}, dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForDoubleDivisionCalculatorTest")
    public void divisionOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Invalid result of sum operation!");
    }

    @Test(groups = {"baseOperation","doubleTypeOfData"}, expectedExceptions = {ArithmeticException.class})
    public void divisionOnZeroTest() {
        Assert.assertEquals(calculator.div(67.03456, 0), new ArithmeticException(), "invalid operation: don't to divide by zero");
    }
}
