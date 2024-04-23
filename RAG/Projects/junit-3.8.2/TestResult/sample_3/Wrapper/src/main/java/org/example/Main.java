package org.example;


import junit.framework.TestCase;
import junit.framework.TestResult;

public class Main extends TestCase {

    public static void main(String[] args) {
        TestResult result = new TestResult();
        Main test = new Main();
        test.run(result);
    }

    public void test() {
        assertTrue(true);
    }
}