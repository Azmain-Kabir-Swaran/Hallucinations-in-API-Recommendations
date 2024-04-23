package org.example;


import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

public class Main {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(SimpleTest.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(Main.suite());
    }
}