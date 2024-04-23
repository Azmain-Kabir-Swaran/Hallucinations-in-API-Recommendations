package org.example;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class Main extends TestCase {
    
    public Main(String name) {
        super(name);
    }

    public static void main(String args[]) {
        TestSuite suite = new TestSuite(Main.class);
        junit.textui.TestRunner.run(suite);
    }

    public void testMethod() {
        // Your test code here.
    }
}