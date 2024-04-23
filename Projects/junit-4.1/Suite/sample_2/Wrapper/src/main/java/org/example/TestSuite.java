package org.example;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }
}