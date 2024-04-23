package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Main {

    private int x, y, result;
    
    @Before
    public void setup() {
        x = 10;
        y = 20;
        result = 30;
    }

    @Test
    public void testAddition() {
        assertEquals(result, x + y);
    }
}