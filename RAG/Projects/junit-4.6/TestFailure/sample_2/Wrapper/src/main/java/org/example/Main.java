package org.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
import org.junit.internal.runners.JUnit38ClassRunner;
import junit.framework.TestResult;
import junit.framework.AssertionFailedError;

public class Main {

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        TestResult result = new TestResult() {
            @Override
            public void addFailure(Failure failure) {
                System.out.println(failure.toString());
            }
        };
        
        runner.run(new JUnit38ClassRunner(result), MyTestClass.class);
    }

    public static class MyTestClass {

        @Test
        public void test1() {
            throw new AssertionFailedError("test1 failed");
        }

        @Test
        public void test2() {
            throw new AssertionFailedError("test2 failed");
        }

        @Test
        public void test3() {
            // test passes
        }
    }
}