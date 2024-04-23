package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest2 {

    @Test
    public void test2() {
        assertEquals("test2 failed",10,10);
    }
}