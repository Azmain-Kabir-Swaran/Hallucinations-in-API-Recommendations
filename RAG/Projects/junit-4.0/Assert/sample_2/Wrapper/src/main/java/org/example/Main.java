package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void test() {
        int actual = 5;
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
}