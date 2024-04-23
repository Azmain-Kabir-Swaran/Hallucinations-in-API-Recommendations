package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main{
    @Test
    public void test() {
        String str = "Hello";
        assertEquals("Hello", str); // passing test if "str" equals "Hello"
    }
}