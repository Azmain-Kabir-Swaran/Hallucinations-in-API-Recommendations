package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClass2 extends TestCase {

    public TestClass2(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestClass2.class);
    }

    public void testMethod() {
        // Testing Code
    }
}