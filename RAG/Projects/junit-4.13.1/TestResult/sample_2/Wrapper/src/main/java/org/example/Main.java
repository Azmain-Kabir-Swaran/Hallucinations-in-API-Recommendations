package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    public static class TestClass {
        public String concatenate(String one, String two) {
            return one + two;
        }
    }

    @Test
    public void testConcatenate() {
        TestClass tester = new TestClass();
        assertEquals("applebob", tester.concatenate("apple", "bob"));
    }

    public static void main(String args[]) {
        TestClass test = new TestClass();
        System.out.println(test.concatenate("hello", " world"));
    }
}