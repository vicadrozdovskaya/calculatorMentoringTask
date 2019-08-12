package com.epam.mentoring.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class PowTest extends BaseTest {

    @DataProvider(name = "valuesForPowCalculatorTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {2, 1, 2},
                {10.5, -1, 0.09523809523809523},
                {0, 3, 0},
                {-10, -1, -0.1},
                {5, 0, 1},
                {9223372036854775806L, 9223372036854775806L, Infinity}
        };
    }

    @Test(groups = {"otherOperations"},dataProvider = "valuesForPowCalculatorTest")
    public void sumOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.pow(a, b), expectedValue, "Invalid result of sum operation!");
    }
}
