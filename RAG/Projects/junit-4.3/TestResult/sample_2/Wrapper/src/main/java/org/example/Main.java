package org.example;


import org.junit.runner.RunWith;
import org.junit.runners.model.TestResult;
import org.junit.runners.JUnit4;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        TestResult result = new TestResult(true); // create a new TestResult
        Test test = new MyTest(); // create a new Test instance
        test.run(result); // run the test
        Assert.assertEquals("test count", 0, result.getFailureCount()); // check if there were no failures
    }

    private static class MyTest {
        void run(TestResult result) {
            // add your actual test logic here
        }
    }
}