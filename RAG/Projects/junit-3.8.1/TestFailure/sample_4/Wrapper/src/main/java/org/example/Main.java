package org.example;


import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;

public class Main extends TestCase {

    public static void main(String[] args) {
        TestResult result = new TestResult();
        Main test = new Main("test");
        test.run(result);

        TestFailure[] failures = result.failures();
        int failureCount = failures.length;
        for (int i = 0; i < failureCount; i++) {
            TestFailure failure = failures[i];
            System.out.println(failure.toString());
        }
    }

    public Main(String name) {
        super(name);
    }

    public void test() {
        // Implement the test you want
    }
}