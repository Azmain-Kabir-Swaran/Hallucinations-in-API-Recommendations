package org.example;


import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main extends TestSuite {
    public Main(String name) {
        super(name);
        addTest(new TestCase1("testCase1"));
        addTest(new TestCase2("testCase2"));
    }

    public static Test suite() {
        return new Main("Main");
    }

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(suite());
    }
}