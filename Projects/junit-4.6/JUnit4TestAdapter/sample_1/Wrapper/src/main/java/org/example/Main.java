package org.example;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.internal.runners.JUnit4TestAdapter;

public class Main {
    static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }
    }
    
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3), "2+3 should be 5");
    }
    
    @RunWith(JUnit4TestAdapter.class)
    public class TestRunner {
        public static void main(String[] args) {
            // To get all junit4 test cases
            JUnit4TestAdapter adapter = new JUnit4TestAdapter(Main.class);
            adapter.run(null, null);
        }
    }
}