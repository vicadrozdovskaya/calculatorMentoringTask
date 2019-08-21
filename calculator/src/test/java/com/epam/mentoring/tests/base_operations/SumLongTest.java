package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.listeners.BaseOperationTestListener;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(BaseOperationTestListener.class)
@Test(groups = "somegroup")
public class SumLongTest extends BaseTest {

    @Test(groups={"baseOperation", "longTypeOfData"},dataProviderClass = ValuesForBaseOperations.class, dataProvider = "valuesForSumLongTest")
    public void sumOfTwoNumbersTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Invalid result of sum operation!");
    }


}
