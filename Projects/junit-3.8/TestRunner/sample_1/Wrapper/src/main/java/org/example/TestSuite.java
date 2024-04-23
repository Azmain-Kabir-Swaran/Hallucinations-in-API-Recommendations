package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite { }

public class TestClass1 extends TestCase {
    public TestClass1(String testName) {
        super(testName);
    }

    public void testMethod() {
        assertEquals(1, 1);
    }
}