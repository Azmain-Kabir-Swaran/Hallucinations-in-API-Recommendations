package org.example;

import org.junit.Rule;
import org.junit_4_0.rules.TestName;
import org.junit_4_0.TestFailure;
import org.junit_4_0.Assert;

public class Main {
    @Rule
    public TestName name = new TestName();
    
    @Test
    public void testMethod() {
        try {
            // your test code here
            Assert.assertEquals("foo", "bar");
        } catch (Throwable t) {
            TestFailure.record(name.getMethodName(), t);
        }
    }
}