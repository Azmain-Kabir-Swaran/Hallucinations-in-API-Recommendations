package org.example;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

public class Main extends TestCase {

    public Main(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for sample.Math");
        suite.addTestSuite(MathTest.class);
        return suite;
    }

    public void testApp() {
        assertTrue(true);
    }
}