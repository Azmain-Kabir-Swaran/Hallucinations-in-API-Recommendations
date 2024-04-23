package org.example;

import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main extends TestCase {

    private TestResult result = new TestResult();
    private TestSuite suite = new TestSuite(Main.class);

    public void setUp() {
        // setup code goes here
    }

    public void tearDown() {
        // teardown code goes here
    }

    public static void main(String args[]) {
        // use args if you need
        TestRunner.run(suite);
    }

    public void testSomething() {
        // actual test code goes here
    }
}