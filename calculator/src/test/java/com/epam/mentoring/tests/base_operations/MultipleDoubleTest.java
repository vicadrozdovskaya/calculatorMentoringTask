package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.listeners.BaseOperationTestListener;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(BaseOperationTestListener.class)
public class MultipleDoubleTest extends BaseTest {

    @Test(groups = {"baseOperation","doubleTypeOfData"},dataProviderClass = ValuesForBaseOperations.class,dataProvider = "valuesForDoubleMultipleCalculatorTest" )
    public void multipleOfTwoNumbersTest(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.mult(a, b), expectedValue, "Invalid result of multi operation!");
    }

    @Test(groups = {"baseOperation","doubleTypeOfData"},description = "method must throw exception about result value bigger than long",expectedExceptions = Exception.class)
    public void multipleOfTwoLongNumbersTest() {
        Assert.assertEquals(calculator.mult(9223372036854775807.0, 9223372036854775807.0), new Exception(), "Invalid result of multi operation!");
    }
}
