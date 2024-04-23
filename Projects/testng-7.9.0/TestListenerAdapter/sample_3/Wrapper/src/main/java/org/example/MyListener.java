package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

class MyListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successful: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test Failed With Timeout: " + result.getName());
    }
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Started running tests: " + context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finished running tests: " + context.getName());
    }
}