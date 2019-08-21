package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.listeners.BaseOperationTestListener;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(BaseOperationTestListener.class)
public class DivisionLongTest extends BaseTest {

    @Test(groups = {"baseOperation", "longTypeOfData"}, dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForLongDivisionCalculatorTest")
    public void divisionOfTwoNumbersTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.div(a, b), expectedValue, "Invalid result of sum operation!");
    }

    @Test(groups = {"baseOperation", "longTypeOfData"}, expectedExceptions = {ArithmeticException.class})
    public void divisionOnZeroTest() {
        Assert.assertEquals(calculator.div(4, 0), new ArithmeticException(), "invalid operation: don't to divide by zero");
    }
}
