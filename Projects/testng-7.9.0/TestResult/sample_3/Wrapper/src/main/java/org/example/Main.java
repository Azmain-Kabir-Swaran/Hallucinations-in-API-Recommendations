package org.example;

import org.testng.annotations.*;
import org.testng.ITestResult;

public class Main {
    @Test
    void testMethodOne() {
        System.out.println("Test Method One");
    }

    @Test
    void testMethodTwo() {
        System.out
                .println("Test Method Two");
        throw new RuntimeException("Test Method Two Failed");
    }

    @AfterMethod
    void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out
                    .println("Test Method '" + result.getName() + "' Failed with Reason : "
                            + result.getThrowable().getMessage());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            System.out
                    .println("Test Method '" + result.getName() + "' PASSED ");
        } else if (result.getStatus() == ITestResult.SKIP) {
            System.out
                    .println("Test Method '" + result.getName() + "' SKIPPED ");
        } else if (result.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILED) {
            System.out
                    .println("Test Method '" + result.getName() + "' FAILED ");
        }
    }
}