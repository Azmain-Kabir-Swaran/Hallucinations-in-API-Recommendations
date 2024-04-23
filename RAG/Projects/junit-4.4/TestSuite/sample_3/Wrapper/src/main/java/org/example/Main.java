package org.example;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

public class TestSuiteExample {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestClass1.class);
        suite.addTestSuite(TestClass2.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(suite());
    }
}