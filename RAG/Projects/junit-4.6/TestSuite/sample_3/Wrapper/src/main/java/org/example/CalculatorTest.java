package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(2, calculator.add(1, 1));
        assertNotEquals(5, calculator.add(1, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }
}