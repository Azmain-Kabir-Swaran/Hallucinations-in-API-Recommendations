package org.example;


import junit.textui.TestRunner;
import junit.framework.TestCase;

public class Main extends TestCase {

    public Main(String name) {
        super(name);
    }

    public void testAdd() {
        assertEquals(1 + 1, 2);
    }

    public void testMultiply() {
        assertEquals(3 * 2, 6);
    }

    public static void main(String[] args) {
        TestRunner.run(Main.class);
    }
}