package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {

    public int multiply(int a, int b) {
        return a * b;
    }

    @Test
    public void testMultiply() {
        assertEquals(6, multiply(2, 3));
    }
}