package org.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class TestClass {
    @Test
    public void testMyMethod() {
        // Create a mock object implementing MyInterface
        MyInterface myMock = mock(MyInterface.class);
        
        // Use the mock
        myMock.myMethod();

        // Verify that myMethod was called on the mock object
        verify(myMock, times(1)).myMethod();
    }
}