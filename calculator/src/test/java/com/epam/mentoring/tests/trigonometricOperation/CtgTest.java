package com.epam.mentoring.tests.trigonometricOperation;

import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class CtgTest extends BaseTest {

    @DataProvider(name = "valuesForCtgCalculatorTest")
    public Object[][] valuesForCtg() {
        return new Object[][]{
                {0, Infinity},
                {30.2, -0.37055703622811975},
                {45, 0.6173696237835551},
                {-180, -0.7469988144140444},
                {PI / 2, 6.123233995736766E-17},
                {PI / 6, 1.7320508075688776},
                {-PI / 6, -0.5773502691896257},
                {PI / 4, 1.0000000000000002},
                {PI / 3, 0.577350269189626},
                {PI, -8.165619676597685E15}
        };
    }

    @Test(groups = {"trigonometricOperation"},dataProvider = "valuesForCtgCalculatorTest")
    public void ctgOfNumbersTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.ctg(a), expectedValue, "Invalid result of ctg operation!");
    }

}
