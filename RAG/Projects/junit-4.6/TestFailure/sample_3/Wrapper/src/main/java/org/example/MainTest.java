package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        assertEquals("Test Failed","Hello","Hello");
    }

    @Test
    public void test2() {
        assertEquals("Test Failed","World","World");
    }
}