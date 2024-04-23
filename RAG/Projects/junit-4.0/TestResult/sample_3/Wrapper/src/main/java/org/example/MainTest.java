package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    
    @Test
    public void testSquare(){
        Main test = new Main();
        assertEquals(9, test.square(3));
        assertEquals(4, test.square(2));
        assertEquals(0, test.square(0));
    }
}