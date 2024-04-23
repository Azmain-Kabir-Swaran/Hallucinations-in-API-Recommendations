package org.example;

import org.junit.*;
import org.junit.Test;
import org.junit.TestSuite;

public class MyTest {

    @Test
    public void testMethod1() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        Assert.assertEquals(2, 1 + 1);
    }
}