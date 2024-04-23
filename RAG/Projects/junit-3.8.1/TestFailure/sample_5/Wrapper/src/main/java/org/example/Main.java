package org.example;


import junit.framework.Assert;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestCase;

public class Main {
    public static void main(String[] args) {
        // create a test
        TestCase test = new TestCase("testMethod") {
            public void runTest() throws Exception {
                Assert.fail("test failure message");
            }
        };

        // run the test
        TestResult result = new TestResult();
        test.run(result);

        // access the result using TestFailure API
        if (result.wasSuccessful()) {
            System.out.println("Test was successful");
        } else {
            TestFailure failure = (TestFailure) result.failure();
            System.out.println("Test failed due to " + failure.failedTest());
            System.out.println("Test failure message: " + failure.thrownException().getMessage());
        }
    }
}