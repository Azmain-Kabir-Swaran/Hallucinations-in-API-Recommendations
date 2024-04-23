package org.example;

import junit.framework.TestResult;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase {

    public MainTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(MainTest.class);
    }

    public void testAdd() {
        assertEquals(5, 2 + 3);
    }
}