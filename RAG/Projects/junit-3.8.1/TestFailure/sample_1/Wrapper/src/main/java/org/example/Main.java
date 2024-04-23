package org.example;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class Main {
    @Test
    public void test() {
        // Your test code here
    }

    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.run(Main.class);
        for (Failure failure : jUnitCore.getFailures()) {
            System.out.println(failure.getMessage());
        }
    }
}