package org.example;

import junit.framework.TestCase;

public class TestExample extends TestCase {

    public TestExample(String name) {
        super(name);
    }

    public void testAddition() {
        int a = 5;
        int b = 3;
        int expected = 8;
        int result = a + b;
        assertEquals(expected, result);
    }
}