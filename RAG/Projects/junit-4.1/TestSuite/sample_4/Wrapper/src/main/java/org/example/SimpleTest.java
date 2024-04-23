package org.example;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

public class SimpleTest extends TestCase {
    public SimpleTest(String testName) {
        super(testName);
    }

    public void testAdd() {
        assertEquals(5, new Calculator().add(3, 2));
    }

    public void testSubtract() {
        assertEquals(1, new Calculator().subtract(3, 2));
    }

    public void testMultiply() {
        assertEquals(6, new Calculator().multiply(3, 2));
    }

    public void testDivide() {
        assertEquals(1.5, new Calculator().divide(3, 2));
    }
}