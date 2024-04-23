package org.example;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Main {

    @Test
    public void testMethod() {
        // Create a mock object of TestedClass
        TestedClass testedClass = mock(TestedClass.class);

        // The method testMethod of TestedClass is being called
        testedClass.testMethod();

        // Verify that the method testMethod of TestedClass has been called exactly once
        verify(testedClass, times(1)).testMethod();
    }
}