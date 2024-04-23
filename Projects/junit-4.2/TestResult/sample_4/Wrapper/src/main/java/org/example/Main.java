package org.example;


import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main {
    
    public static void main(String[] args) {
        TestResult testResult = new TestResult();
        TestSuite testSuite = new TestSuite();
        
        // Add tests here
        
        testSuite.run(testResult);
        System.out.println("Number of test cases run: " + testResult.runCount());
        System.out.println("Number of failures: " + testResult.failureCount());
    }
}