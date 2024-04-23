package org.example;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        // Your main function code goes here
    }

    // Sample method to test
    public static int sampleMethod(int a, int b) {
        return a + b;
    }

    @Test
    public void testSampleMethod() {
        assertEquals(5, Main.sampleMethod(2, 3));
    }
}