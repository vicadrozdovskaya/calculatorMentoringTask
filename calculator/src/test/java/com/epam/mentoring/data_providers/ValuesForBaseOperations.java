package com.epam.mentoring.data_providers;

import org.testng.annotations.DataProvider;

public class ValuesForBaseOperations {

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9},
                {9223372036854775806L, 1, 9223372036854775807L}
        };
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSumDouble() {
        return new Object[][]{
                {10.10, 23.23, 33.33},
                {10.08, -1.06, 9.02},
                {0, 0, 0},
                {-1.09, 10.09, 9.0},
                {9223372036854775809.12345, 1, 9223372036854775810.12345}
        };
    }


    @DataProvider(name = "valuesForMinusLongCalculatorTest")
    public Object[][] valuesForMinus() {
        return new Object[][]{
                {10, 23, -13},
                {10, -1, 11},
                {0, 0, 0},
                {10, 1, 9},
                {9223372036854775806L, 9223372036854775805L, 1}
        };
    }

    @DataProvider(name = "valuesForMinusDoubleCalculatorTest")
    public Object[][] valuesForMinusDouble() {
        return new Object[][]{
                {10.13, 23.13, -12.999999999999998234},
                {10.09, -1.04, 11.129999999999999},
                {0, 0, 0},
                {10.0005, 1.0005, 9.0},
                {9223372036854775806.034, 9223372036854773805.034, 2048.0}
        };
    }

    @DataProvider(name = "valuesForLongMultipleCalculatorTest")
    public Object[][] valuesForMultiple() {
        return new Object[][]{
                {10, 20, 200},
                {10, -1, -10},
                {0, 3, 0},
                {-10, -1, 10}
        };
    }

    @DataProvider(name = "valuesForDoubleMultipleCalculatorTest")
    public Object[][] valuesForDoubleMultiple() {
        return new Object[][]{
                {10.01, 20.0, 200.20},
                {10.0, -1.01, -10.1},
                {0.0, 3.0, 0.0},
                {-10.0, -1.01, 10.1},
                {9223372036854775807.0, 9223372036854775807.0, 18446744073709552614.0}
        };
    }

    @DataProvider(name = "valuesForLongDivisionCalculatorTest")
    public Object[][] valuesForDivision() {
        return new Object[][]{
                {100, 20, 5},
                {10, -1, -10},
                {0, 3, 0},
                {-10, -1, 10},
                {9223372036854775806L, 9223372036854775806L, 1}
        };
    }

    @DataProvider(name = "valuesForDoubleDivisionCalculatorTest")
    public Object[][] valuesForDivisionDouble() {
        return new Object[][]{
                {100.20, 20, 5.01},
                {10.01, -1, -10.01},
                {0, 3, 0},
                {-10, -1, 10},
                {9223372036854775806.01, 9223372036854775806.01, 1}
        };
    }
}
