package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class MyTest extends TestCase {
    public MyTest(String testName) {
        super(testName);
    }

    public void test1() {
        // This will be the first test method
    }

    public void test2() {
        // This will be the second test method
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for MyTest");
        suite.addTest(new MyTest("test1"));
        suite.addTest(new MyTest("test2"));
        return suite;
    }

    public static void main(String[] args) {
        TestRunner.run(suite());
    }
}