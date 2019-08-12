package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusLongTest extends BaseTest {

    @Test(groups = {"baseOperation", "longTypeOfData"}, dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForMinusLongCalculatorTest")
    public void minusOfTwoNumbersTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.sub(a, b), expectedValue, "Invalid result of minus operation!");
    }


}
