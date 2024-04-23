package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestClass {
    @Before
    public void setUp() {
        System.out.println("Running setup.");
    }

    @Test
    public void test1() {
        System.out.println("Running test1.");
        assert true;
    }

    @Test
    public void test2() {
        System.out.println("Running test2.");
        assert true;
    }

    @Test
    public void test3() {
        System.out.println("Running test3.");
        assert false;
    }
}