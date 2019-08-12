package com.epam.mentoring.tests.trigonometricOperation;

import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

public class SinTest extends BaseTest {

    @DataProvider(name = "valuesForSinCalculatorTest")
    public Object[][] valuesForSin() {
        return new Object[][]{
                {0, 0},
                {30.2, -0.9376917403002811},
                {45, 0.8509035245341184},
                {-180, 0.8011526357338304},
                {PI / 2, 1},
                {PI / 6, 0.49999999999999994},
                {-PI / 6, -0.49999999999999994},
                {PI / 4, 0.7071067811865475},
                {PI / 3, 0.8660254037844386}
        };
    }

    @Test(groups = {"trigonometricOperation"},dataProvider = "valuesForSinCalculatorTest")
    public void sinOfNumbersTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.cos(a), expectedValue, "Invalid result of sin operation!");
    }

}
