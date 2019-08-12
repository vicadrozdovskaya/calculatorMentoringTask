package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SumDoubleTest extends BaseTest {

    @Test(groups = {"baseOperation","doubleTypeOfData"},dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForSumDoubleTest")
    public void sumOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Invalid result of sum operation!");
    }

}
