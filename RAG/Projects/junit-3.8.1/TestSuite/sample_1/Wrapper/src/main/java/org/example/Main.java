package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main extends TestCase {

    // Test Case 1
    public void testMethod1() {
        assertTrue(true);
    }

    // Test Case 2
    public void testMethod2() {
        assertTrue(true);
    }

    // Test Suite
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new Main("testMethod1"));
        suite.addTest(new Main("testMethod2"));
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}