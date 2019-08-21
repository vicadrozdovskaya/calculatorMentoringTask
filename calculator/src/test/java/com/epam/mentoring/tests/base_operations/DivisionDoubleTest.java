package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.listeners.BaseOperationTestListener;
import com.epam.mentoring.tests.BaseTest;
import com.epam.mentoring.transformer.DescriptionTransformer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({BaseOperationTestListener.class, DescriptionTransformer.class})
public class DivisionDoubleTest extends BaseTest {

    @Test(groups = {"baseOperation","doubleTypeOfData"}, dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForDoubleDivisionCalculatorTest",
    description = "descr")
    public void divisionOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Invalid result of sum operation!");
    }

    @Test(groups = {"baseOperation","doubleTypeOfData"}, expectedExceptions = {ArithmeticException.class})
    public void divisionOnZeroTest() {
        Assert.assertEquals(calculator.div(67.03456, 0), new ArithmeticException(), "invalid operation: don't to divide by zero");
    }
}
