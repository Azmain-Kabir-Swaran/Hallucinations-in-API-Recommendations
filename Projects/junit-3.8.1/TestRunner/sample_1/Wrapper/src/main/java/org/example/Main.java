package org.example;

import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main extends TestCase {
    public static void main(String args[]) {
        TestSuite suite = new TestSuite();
        suite.addTest(new MyTestCase("testMethod"));
        TestRunner.run(suite);
    }
}