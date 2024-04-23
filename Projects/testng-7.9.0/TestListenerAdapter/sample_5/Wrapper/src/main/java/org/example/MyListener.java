package org.example;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        System.out.println("Test started: " + tr.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out
        System.out.println("Test passed: " + tr.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("Test failed: " + tr.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        System.out.println("Test skipped: " + tr.getTestName());
    }
}