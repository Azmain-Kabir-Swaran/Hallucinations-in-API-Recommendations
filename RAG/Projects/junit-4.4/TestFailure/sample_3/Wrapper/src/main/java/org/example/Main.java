package org.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {
    @Test
    public void test() {
        Assert.assertEquals("Failure", "Message", "Message");
    }
}