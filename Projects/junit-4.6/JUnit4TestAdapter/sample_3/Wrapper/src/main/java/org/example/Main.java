package org.example;


import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestCase;

public class Main extends TestCase {
    public Main(String testName) {
        super(testName);
    }

    public void testAdd() {
        int result = 1 + 2;
        assertEquals(3, result);
    }

    // other test methods go here

    public static Test suite() {
        return new JUnit4TestAdapter(Main.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}