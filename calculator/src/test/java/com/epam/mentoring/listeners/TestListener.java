package com.epam.mentoring.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
    private static final Logger log = LoggerFactory.getLogger(TestListener.class);

    public void onTestStart(ITestResult iTestResult) {
        log.info("Start test : " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        log.info("Test Success " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        log.info("Test Fail " + iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        log.info("Test Skipped " + iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
