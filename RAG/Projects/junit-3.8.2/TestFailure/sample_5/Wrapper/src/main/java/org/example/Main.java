package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Main {
    // Test method to validate the sum of two numbers
    @Test
    public void testSum() {
        // Test data
        int num1 = 5;
        int num2 = 10;
        int expected = 15;

        // Invoke the method under test
        int result = num1 + num2;

        // Compare the result from the method under test with the expected result
        assertEquals(expected, result, "The sum was not calculated correctly");
    }
}