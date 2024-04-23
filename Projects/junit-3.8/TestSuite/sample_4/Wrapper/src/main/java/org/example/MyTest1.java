package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest1 {

    @Test
    public void test1() {
        assertEquals("test1 failed","abc","abc");
    }
}