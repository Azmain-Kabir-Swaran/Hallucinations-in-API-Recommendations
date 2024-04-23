package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running tests from Main class...");
    }
    
    @Test
    public void testAdd() {
        assertEquals(2, Main.add(1, 1));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}