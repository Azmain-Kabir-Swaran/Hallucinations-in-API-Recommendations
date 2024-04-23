package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.AssertionFailedError;
import org.junit.TestFailure;
import org.junit.TestResult;

public class Main {
    public static void main(String[] args) {
        TestResult tr = new TestResult();
        try {
            // Call some test methods
        } catch (AssertionFailedError e) {
            // handle test failures
            tr.addFailure(new TestFailure(e));
        } finally {
            // get failures
            TestFailure[] failures = tr.getFailures();
            for (TestFailure failure : failures) {
                System.out.println("Test Failure: " + failure.toString());
            }
        }
    }

    @Test
    public void testSomething() {
        Assert.assertEquals(2, 1 + 1);  // this will pass
        //Assert.assertEquals(2, 1 - 1);  // this will fail
    }
}