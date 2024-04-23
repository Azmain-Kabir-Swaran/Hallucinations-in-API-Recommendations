package org.example;


import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite(Main.class);
        suite.addTestSuite(TestClass.class);
        return suite;
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(Main.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}