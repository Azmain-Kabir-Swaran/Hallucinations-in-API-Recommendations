package org.example;

import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void someTest(ITestResult result) {
        System.out.println("Running test: " + result.getName());
    }
}