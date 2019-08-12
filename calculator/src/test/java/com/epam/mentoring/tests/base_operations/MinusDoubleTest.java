package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusDoubleTest extends BaseTest {

    @Test(groups = {"baseOperation", "doubleTypeOfData"},dataProviderClass= ValuesForBaseOperations.class, dataProvider = "valuesForMinusDoubleCalculatorTest")
    public void minusOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.sub(a, b), expectedValue, "Invalid result of minus operation!");
    }

    @Test(groups = {"baseOperation", "doubleTypeOfData"})
    public void minusOfTwoBigNumbersTest() {
        Assert.assertEquals(calculator.sub(9223372036854775806.034, 9223372036854775805.034), 1.0, "Invalid result of minus operation!");
    }

}
