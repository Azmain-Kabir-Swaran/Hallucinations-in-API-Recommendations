package org.example;


import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(MyTest.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(suite());
    }
}