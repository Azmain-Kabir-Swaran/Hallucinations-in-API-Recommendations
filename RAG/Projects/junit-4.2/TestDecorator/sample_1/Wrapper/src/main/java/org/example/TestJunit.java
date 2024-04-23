package org.example;

import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class TestJunit {
   
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(2, c.add(1, 1));
    }
}