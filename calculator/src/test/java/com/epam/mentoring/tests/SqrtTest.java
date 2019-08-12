package com.epam.mentoring.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @DataProvider(name = "valuesForSqrtCalculatorTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {25, 5},
                {30.25, 5.5},
                {0, 0}
        };
    }

    @Test(groups = {"otherOperations"}, dataProvider = "valuesForSqrtCalculatorTest")
    public void sqrtOfNumbersTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.sqrt(a), expectedValue, "Invalid result of sqrt operation!");
    }

    @Test(groups = {"otherOperations"}, expectedExceptions = {NumberFormatException.class})
    public void sqrtOfNegativeNumberTest() {
        Assert.assertEquals(calculator.sqrt(-4), new NumberFormatException(), "invalid operation: Attempt to sqrt negative number");
    }
}
