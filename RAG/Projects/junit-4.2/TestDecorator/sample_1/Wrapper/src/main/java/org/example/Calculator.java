package org.example;

import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}