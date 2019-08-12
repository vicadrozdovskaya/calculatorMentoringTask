package com.epam.mentoring.tests.base_operations;

import com.epam.mentoring.data_providers.ValuesForBaseOperations;
import com.epam.mentoring.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MultipleLongTest extends BaseTest {

    @Test(groups = {"baseOperation","longTypeOfData"},dataProviderClass = ValuesForBaseOperations.class,dataProvider = "valuesForLongMultipleCalculatorTest" )
    public void multipleOfTwoNumbersTest(long a, long b, long expectedValue) {
        Assert.assertEquals(calculator.mult(a, b), expectedValue, "Invalid result of multi operation!");
    }

    @Test(groups = {"baseOperation","longTypeOfData"},description = "method must throw exception about result value bigger than long",expectedExceptions = Exception.class)
    public void multipleOfTwoLongNumbersTest2() {
        Assert.assertEquals(calculator.mult(9223372036854775806L, 9223372036854775806L), new Exception(), "Invalid result of multi operation!");
    }
}
