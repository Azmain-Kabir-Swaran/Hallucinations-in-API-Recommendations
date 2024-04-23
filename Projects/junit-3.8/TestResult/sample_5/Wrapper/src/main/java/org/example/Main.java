package org.example;


import junit.framework.TestResult;

public class Main {
    public static void main(String[] args) {
        // Create an instance of TestResult
        TestResult testResult = new TestResult();

        // Call TestResult methods
        testResult.startTest("Test Case 1");
        // assert something here
        testResult.endTest(testResult.run());
    }
}