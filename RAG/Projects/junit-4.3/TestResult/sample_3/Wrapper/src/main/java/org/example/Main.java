package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Main {

    @Parameterized.Parameter
    public String input;

    @Test
    public void test() {
        TestResult result = new TestResult(null);
        // test implementation here
    }

}