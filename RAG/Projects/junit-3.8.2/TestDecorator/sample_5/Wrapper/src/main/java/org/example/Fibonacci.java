package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}