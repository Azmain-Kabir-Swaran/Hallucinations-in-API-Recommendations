package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Main {
    @Test
    public void testMainMethod() {
        // Arrange
        int num1 = 10;
        int num2 = 5;

        // Act
        int actualResult = num1 + num2;
        int expectedResult = 15;

        // Assert
        assertEquals("Addition test failed", expectedResult, actualResult);
        assertFalse("Addition test failed", expectedResult != actualResult);
    }
}