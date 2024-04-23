package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.TestResult;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Main {
    @RunWith(Suite.class)
    @SuiteClasses({Test1.class, Test2.class})
    public static class TestSuite {}

    public static class Test1 {
        @Test
        public void test1(TestResult result) {
            Assert.assertEquals("Test1 failed", "Hello", "Hi");
            System.out.println("test1 method executing");
            result.addFailure(new Throwable("Test1 failed"));
        }
    }

    public static class Test2 {
        @Test
        public void test2(TestResult result) {
            Assert.assertEquals("Test2 failed", "Hello", "Hello");
            System.out.println("test2 method executing");
            result.addFailure(new Throwable("Test2 failed"));
        }
    }
}