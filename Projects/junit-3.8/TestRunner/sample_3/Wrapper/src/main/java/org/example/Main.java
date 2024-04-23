package org.example;


import junit.textui.TestRunner;
import junit.framework.TestCase;

public class Main extends TestCase {
    public Main(String name) {
        super(name);
    }

    public void testAdd() {
        int expected = 2;
        int actual = 1+1;
        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        TestRunner.run(Main.class);
    }
}