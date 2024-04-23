package org.example;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
    private Calculator calculator;

    public void setUp() {
        calculator = new Calculator();
    }

    public void testAdd() {
        int actualResult = calculator.add(10, 20);
        assertEquals(30, actualResult);
    }

    public void testSubtract() {
        int actualResult = calculator.subtract(20, 10);
        assertEquals(10, actualResult);
    }
}