package com.epam.mentoring.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeNumbersTest extends BaseTest {

    @Test(groups = {"defineNumber"})
    @Parameters(value = "positiveNumber")
    public void PositiveNumberTest(long number) {
        Assert.assertFalse(calculator.isNegative(number), "Invalid result of isPositive operation!");
    }

    @Test(groups = {"defineNumber"})
    @Parameters(value = "negativeNumber")
    public void NegativeNumberTest(long number) {
        Assert.assertTrue(calculator.isNegative(number), "Invalid result of isPositive operation!");
    }

    @Test(groups = {"defineNumber"})
    public void ZeroNumberTest() {
        Assert.assertFalse(calculator.isPositive(0), "Invalid result of isPositive operation!");
    }

}
