package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main extends TestCase {

    public Main(String testName) {
        super(testName);
    }

    public static TestSuite suite() {
        TestSuite suite = new TestSuite(Main.class);
        // $JUnit-BEGIN$
        suite.addTestSuite(MyTest.class);
        // $JUnit-END$
        return suite;
    }
}