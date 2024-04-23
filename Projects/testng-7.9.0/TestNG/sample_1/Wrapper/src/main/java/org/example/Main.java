package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
    @Test
    public void sum() {
        int result = sum(1, 2);
        Assert.assertEquals(result, 3);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}