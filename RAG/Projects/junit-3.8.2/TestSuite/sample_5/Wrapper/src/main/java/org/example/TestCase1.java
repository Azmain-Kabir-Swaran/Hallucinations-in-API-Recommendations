package org.example;

import junit.framework.*;
import junit.framework.TestSuite;

public class TestCase1 extends TestCase {

    public TestCase1(String name) {
        super(name);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite(TestCase1.class);
        return suite;
    }
    
    public void test1() {
        assertEquals("a", "a");
    }
    
    public void test2() {
        assertEquals(1, 1);
    }
}