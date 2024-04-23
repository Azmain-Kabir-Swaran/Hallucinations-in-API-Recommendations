package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteRunner {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite(MyTestCase.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}