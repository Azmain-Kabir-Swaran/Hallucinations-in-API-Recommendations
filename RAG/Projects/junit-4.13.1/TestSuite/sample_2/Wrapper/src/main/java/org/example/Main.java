package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main extends TestCase {
    
    // A simple unit test case
    public void testAdd() {
        int result = 1 + 1;
        assertEquals(2, result);
    }

    // Another simple unit test case
    public void testSub() {
        int result = 5 - 3;
        assertEquals(2, result);
   }

    // Use TestSuite to combine multiple test cases into a suite
    public static Test suite() {
        TestSuite suite = new TestSuite(Main.class);
        return suite;
    }

    // main method
    public static void main(String[] args) {
        String[] testCaseArgs = {};
        junit.textui.TestRunner.run(suite());
    }
}