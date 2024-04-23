package org.example;


import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class MyTests extends TestSuite {
    
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new JUnitTest1());
        suite.addTest(new JUnitTest2());
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}