package org.example;


import junit.framework.TestCase;

public class Main extends TestCase {
    public void testAdd() {
        assertEquals(2, add(1, 1));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        TestRunner.run(Main.class);
    }
}