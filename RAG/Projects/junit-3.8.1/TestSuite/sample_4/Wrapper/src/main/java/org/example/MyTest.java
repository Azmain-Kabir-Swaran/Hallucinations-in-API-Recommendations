package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyTest extends TestCase {
    public MyTest(String name) {
        super(name);
    }

    public void testAdd() {
        assertEquals(2, 1+1);
    }
}