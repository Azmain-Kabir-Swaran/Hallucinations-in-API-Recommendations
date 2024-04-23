package org.example;


import junit.framework.TestSuite;
import junit.framework.TestResult;
import junit.framework.Test;
import junit.framework.TestCase;
import java.util.*;

public class Main extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestCase(Main.class, "testAdd"));
        suite.addTest(new TestCase(Main.class, "testSub"));
        suite.addTest(new TestCase(Main.class, "testMul"));
        suite.addTest(new TestCase(Main.class, "testDiv"));
        return suite;
    }

    public static Test suite(Class theClass) {
        return new TestSuite(theClass);
    }

    public static void main(String[] args) {
        TestResult result = new TestResult();
        TestSuite suite = suite();
        suite.run(result);
        System.out.println(result.summary());
    }
}