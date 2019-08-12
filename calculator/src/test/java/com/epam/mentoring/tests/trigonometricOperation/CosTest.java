package com.epam.mentoring.tests.trigonometricOperation;

import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.PI;


public class CosTest extends BaseTest {

    @DataProvider(name = "valuesForCosCalculatorTest")
    public Object[][] valuesForCos() {
        return new Object[][]{
                {0, 1},
                {30.2, 0.3474682721812599},
                {45, 0.5253219888177297},
                {-180, -0.5984600690578581},
                {PI / 2, 0},
                {PI / 6, 0.8660254037844387},
                {-PI / 6, 0.8660254037844387},
                {PI / 4, 0.7071067811865476},
                {PI / 3, 0.5},
                {PI, -1}
        };
    }

    @Test(groups = {"trigonometricOperation"},dataProvider = "valuesForCosCalculatorTest")
    public void cosOfNumbersTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.cos(a), expectedValue, "Invalid result of cos operation!");
    }


}
