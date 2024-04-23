package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testAssertEquals() {
        try {
            // Use the JUnit assertEquals method to compare expected and actual result
            assertEquals("Incorrect sum", 5, 10 - 5);

        } catch (AssertionError e) {
            // Handle the AssertionFailedError
            System.out.println("Assertion failed: " + e.getMessage());
        }
    }
}