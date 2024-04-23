package org.example;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

class MathTest extends TestCase {
    public MathTest(String testName) {
        super(testName);
    }

    public void testAdd() {
        assertEquals(3, new Math().add(1, 2));
    }
}