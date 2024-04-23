package org.example;


import junit.framework.TestCase;
import junit.framework.TestResult;

public class Main {
    // Test case class extending TestCase
    public static class MyTest extends TestCase {
        public MyTest(String name) {
            super(name);
        }
        
        public void testMethod() {
            // Test code here
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Instance of MyTest
        MyTest test = new MyTest("testMethod");
        // Instance of TestResult
        TestResult result = new TestResult();

        // Running the test method with TestResult
        test.run(result);

        // Printing the result
        System.out.println("Test passed: " + result.wasSuccessful());
    }
}