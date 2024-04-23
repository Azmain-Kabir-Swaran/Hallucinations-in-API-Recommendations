package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main {
    public static void main(String[] args) {
        // Create the test suite and add tests to it
        TestSuite suite = new TestSuite();
        suite.addTestSuite(MyTest1.class);
        suite.addTestSuite(MyTest2.class);
        suite.addTestSuite(MyTest3.class);
        
        // Run the suite
        junit.textui.TestRunner.run(suite);
    }
}