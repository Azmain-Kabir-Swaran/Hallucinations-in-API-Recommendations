package org.example;


import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main extends TestCase {

    public Main(String testName) {
        super(testName);
    }

    public static TestSuite suite() {
        TestSuite suite = new TestSuite("Test for default package");
        suite.addTest(new TestCase("testAbs1") {
            public void testAbs1() {
                assertEquals(1, Math.abs(-1));
            }
        });
        suite.addTest(new TestCase("testAbs2") {
            public void testAbs2() {
                assertEquals(1, Math.abs(1));
            }
        });
        suite.addTest(new TestCase("testAbs3") {
            public void testAbs3() {
                assertEquals(5, Math.abs(-5));
            }
        });
        return suite;
    }

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(suite());
    }
}