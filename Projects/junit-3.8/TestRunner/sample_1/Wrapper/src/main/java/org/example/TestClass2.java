package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestClass2 extends TestCase {
    public TestClass2(String testName) {
        super(testName);
    }

    public void testMethod() {
        assertEquals("Hello", "Hello");
    }
}