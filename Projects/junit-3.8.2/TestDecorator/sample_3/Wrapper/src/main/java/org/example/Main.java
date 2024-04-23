package org.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.TestRunner;
import org.junit.decorators.JUnit4Decorator;

public class Main {
    public static void main(String[] args) {
        // Test Decoration
        TestDecorator decorator = new TestDecorator();
        decorator.decorateTestRunner();
        
        // Run with JUnit 4 decorator
        RunWith testRunner = new TestRunner();
        testRunner.run(MainTest.class);
    }
}