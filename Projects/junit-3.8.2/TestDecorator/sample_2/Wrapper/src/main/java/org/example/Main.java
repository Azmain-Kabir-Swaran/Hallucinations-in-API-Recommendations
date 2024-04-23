package org.example;


import org.junit.TestDecorator;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

public class Main {
    
    @Test
    public void myFirstTest() {
        System.out.println("This is my first JUnit test.");
        // add your test code here
    }
    
    public static void main(String[] args) {
        BlockJUnit4ClassRunner runner = new BlockJUnit4ClassRunner(new TestDecorator());
        Main main = new Main();
        runner.run(main);
    }
}