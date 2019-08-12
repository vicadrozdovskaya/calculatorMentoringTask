package com.epam.mentoring.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositiveNumbersTest extends BaseTest {


    @Test(groups = {"defineNumber"},description = "test with positive number")
    @Parameters(value = "positiveNumber")
    public void PositiveNumberTest(long a) {
        Assert.assertTrue(calculator.isPositive(a), "Invalid result of isPositive operation!");
    }

    @Test (groups = {"defineNumber"},description = "test with negative number")
    @Parameters(value = "negativeNumber")
    public void NegativeNumberTest(long a) {
        Assert.assertFalse(calculator.isPositive(a), "Invalid result of isPositive operation!");
    }

    @Test (groups = {"defineNumber"},description = "test with zero number")
    public void ZeroNumberTest() {
        Assert.assertFalse(calculator.isPositive(0), "Invalid result of isPositive operation!");
    }

}
