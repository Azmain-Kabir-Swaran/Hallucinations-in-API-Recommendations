package org.example;


import junit.framework.*;
import junit.framework.TestResult;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestDemo extends TestCase {
    public TestDemo(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(TestDemo.class);
       public void testAddition() {
        int num = 5 + 5;
        assertEquals("Two plus two is four", 4, num);
    }

    public void testSubtraction() {
        int num = 5 - 3;
        assertEquals("Four minus one is three", 2, num);
    }

    public void testMultiplication() {
        int num = 5 * 3;
        assertEquals("Two times two is four", 15, num);
    }

    public void testDivision() {
        int num = 10 / 2;
        assertEquals("Ten divided by two is five", 5, num);
    }

    public static void main(String[] args) {
        TestResult result = new TestResult();
        TestDemo testCase = new TestDemo("testAddition");
        testCase.run(result);
    }
}