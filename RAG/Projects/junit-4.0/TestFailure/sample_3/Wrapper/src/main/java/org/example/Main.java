package org.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.internal.runners.model.EachWithFds;

public class Main {
    public static class Sub extends EachWithFds {
        @Test
        public void test1() {
            throw new RuntimeException("This test failed");
        }
    }
    public static class SubFailure extends EachWithFds {
        @Test
        public void test1() {
            fail();
        }
    }

    public static void main(String[] args) {
        // Execution starts here
        System.out.println("This is a simple Java program that uses JUnit's TestFailure API. Execution starts here.");
    }

    public static void fail() {
        throw new RuntimeException("Test failed");
    }
}