package com.epam.mentoring.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseOperationTestListener implements ITestListener {
    private static final Logger logger = Logger.getLogger(BaseOperationTestListener.class);

    public void onTestStart(ITestResult iTestResult) {
        logger.info("Base operation Start test : " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        logger.info("Base operation Test Success " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        logger.info("Base operation Test Fail " + iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        logger.info("Base operation Test Skipped " + iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
