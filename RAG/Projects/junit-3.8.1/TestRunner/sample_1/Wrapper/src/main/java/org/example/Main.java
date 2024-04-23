package org.example;


import junit.framework.TestCase;
import junit.textui.TestRunner;

public class Main extends TestCase {
    public void testAdd() {
        int a = 5;
        int b = 6;
        int result = a + b;
        assertEquals(result, 11);
    }
    
    public static void main(String[] args) {
        TestRunner.run(Main.class);
    }
}