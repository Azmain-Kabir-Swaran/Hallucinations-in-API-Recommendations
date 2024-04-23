package org.example;


import junit.framework.TestCase;
import junit.textui.TestRunner;

public class Main extends TestCase {

    public void testHelloWorld(){
        assertTrue(true);
    }

    public static void main(String[] args) {
        TestRunner.run(Main.class);
    }

}