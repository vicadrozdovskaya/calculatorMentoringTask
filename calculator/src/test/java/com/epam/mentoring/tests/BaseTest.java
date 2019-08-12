package com.epam.mentoring.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.internal.annotations.TestOrConfiguration;

public class BaseTest extends TestOrConfiguration {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }
}
