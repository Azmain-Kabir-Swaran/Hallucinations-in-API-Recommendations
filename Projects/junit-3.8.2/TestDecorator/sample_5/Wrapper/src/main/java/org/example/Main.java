package org.example;


import org.junit.Test;
import org.junit.TestDecorator;

public class Main {

    public static class MyTest {

        @Test
        public void test() {
            System.out.println("Testing...");
        }
    }

    public static class Decorator extends TestDecorator {

        public Decorator(Test test, TestDecorator decorator) {
            super(test, decorator);
        }

        @Override
        protected void finished(Test test) {
            System.out.println("Finished " + test.getName());
            super.finished(test);
        }
    }

    public static void main(String[] args) {
        // Creating decorator
        TestDecorator decorator = new Decorator(new MyTest(), null);
        decorator.run(new MyTest());
    }
}