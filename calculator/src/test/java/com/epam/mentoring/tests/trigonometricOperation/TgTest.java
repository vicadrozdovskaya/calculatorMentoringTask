package com.epam.mentoring.tests.trigonometricOperation;

import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;

public class TgTest extends BaseTest {

    @DataProvider(name = "valuesForTgCalculatorTest")
    public Object[][] valuesForTg() {
        return new Object[][]{
                {0, NaN},
                {30.2, -2.6986398913887766},
                {45, 1.6197751905438615},
                {-180, -1.3386902103511544},
                {PI / 2, 1.633123935319537E16},
                {PI / 6, 0.5773502691896257},
                {-PI / 6, -0.5773502691896257},
                {PI / 4, 0.9999999999999999},
                {PI / 3, 1.7320508075688767},
                {PI, -1.2246467991473532E-16}
        };
    }

    @Test(groups = {"trigonometricOperation"},dataProvider = "valuesForTgCalculatorTest")
    public void tgOfNumbersTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.cos(a), expectedValue, "Invalid result of tg operation!");
    }

}
