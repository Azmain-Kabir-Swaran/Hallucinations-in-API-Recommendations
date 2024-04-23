package org.example;


import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestFailure;

public class Main extends TestCase {
    public Main(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(Main.class);
    }

    public void testMethod() {
        // test case logic here
        if (true) {
            fail("This test should have failed.");
        }
    }

    public static void main(String[] args) {
        TestResult result = new TestResult();
        Main test = new Main("testMethod");
        test.run(result);
        for (TestFailure failure : result.failures()) {
            System.out.println(failure.toString());
        }
    }
}