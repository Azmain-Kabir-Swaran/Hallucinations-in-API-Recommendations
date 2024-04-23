package org.example;

import junit.framework.*;
import junit.textui.TestRunner;

public class TestSuiteExample extends TestCase {
    
    public TestSuiteExample(String name){
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTest(new TestSuiteExample("Test Case 1"));
        suite.addTest(new TestSuiteExample("Test Case 2"));

        return suite;
    }

    public void testCase1(){
        assertTrue(true);
    }

    public void testCase2(){
        assertTrue(true);
    }

    public static void main(String args[]){
        TestRunner.run(suite());
    }
}