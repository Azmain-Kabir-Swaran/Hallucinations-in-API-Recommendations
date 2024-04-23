package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    // Create the test method
    @Test
    public void testAddition() {
        // Test the addition function
        assertEquals(10, 5 + 5);
    }

    // Create another test method
    @Test
    public void testSubtraction() {
        // Test the subtraction function
        assertEquals(20, 30 - 10);
    }
}