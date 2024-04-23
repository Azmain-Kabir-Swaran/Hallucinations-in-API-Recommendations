package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        assertEquals(5, add(3, 2));
    }
}