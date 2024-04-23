package org.example;


import org.junit.Test;
import org.junit.TestResult;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

    @Test
    public void testMethod() {
        // Test code here
        assert(1 == 1);
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(Main.class);

        System.out.println(result.wasSuccessful());
    }

}