package org.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class Main {

    @Rule
    public TestName name = new TestName();

    @Rule
    public TestWatcher watcher = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            System.out.println("starting " + description.getDisplayName());
            Assert.fail("failing " + description.getDisplayName());
        }
    };

    @Test
    public void test() {
        Assert.fail("forced fail");
    }
}