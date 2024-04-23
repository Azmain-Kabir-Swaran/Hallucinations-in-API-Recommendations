package org.example;


import junit.framework.TestCase;
import junit.framework.TestResult;

public class Main extends TestCase {

    private TestResult result;

    @Override
    protected void setUp() {
        result = new TestResult();
    }

    public void testOne() {
        assertTrue(true);
    }

    public void testTwo() {
        assertTrue(false);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setUp();
        main.testOne();
        main.testTwo();
    }
}