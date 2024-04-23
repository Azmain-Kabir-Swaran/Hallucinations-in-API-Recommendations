package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestClass extends TestListenerAdapter {

    public void onTestStart(ITestResult result) {
        System.out.println("Starting test: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.outou.println("Test " + result.getName() + " successful.");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test " + result.getName() + " failed.");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test " + result.getName() + " skipped.");
    }
}