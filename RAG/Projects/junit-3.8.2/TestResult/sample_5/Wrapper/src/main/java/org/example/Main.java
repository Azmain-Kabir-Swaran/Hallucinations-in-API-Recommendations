package org.example;


import junit.framework.TestResult;
import junit.framework.TestFailure;
import junit.framework.TestSuite;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestingTestCase extends TestCase {

    public TestingTestCase(String name) {
        super(name);
    }

    public void testOne() {
        assertTrue(true);
    }
    
    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestingTestCase("Testing testOne()"));
        TestResult result = new TestResult();
        suite.run(result);
        for (int i = 0; i < result.getRunCount(); i++) {
            TestFailure failure = (TestFailure) result.failure(i);
            System.out.println("Failure: " + failure.failedTest());
        }
    }
}