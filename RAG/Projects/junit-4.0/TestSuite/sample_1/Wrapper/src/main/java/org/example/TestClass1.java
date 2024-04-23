package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClass1 extends TestCase {

    public TestClass1(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for testing");
        suite.addTestSuite(TestClass1.class);
        suite.addTestSuite(TestClass2.class);
        return suite;
    }

    public void testMethod() {
        // Testing Code
    }
}