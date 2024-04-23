package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

class TestClass {

    @Test
    public void test1() {
        assertEquals(1, 1);
    }

    @Test
    public void test2() {
        fail("This test is expected to fail");
    }

    @Test
    public void test3() {
        // Test case where result is expected to pass, but will fail for some reason
        // Let's force it to fail
        int a = 1;
        int b = 0;
        assertEquals(a/b, 1);
    }
}