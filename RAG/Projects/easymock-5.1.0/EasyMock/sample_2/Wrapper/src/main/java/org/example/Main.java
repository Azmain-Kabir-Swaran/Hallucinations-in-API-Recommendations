package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

public class Main {

    @TestSubject
    MyTestSubject myTestSubject = new MyTestSubject();

    @Mock
    MyTestSubject mockTestSubject;

    @Test
    public void testMethod() {
        // Setup Expectations
        EasyMock.expect(mockTestSubject.myMethod()).andReturn("Hello");

        // Activate Mock
        EasyMock.replay(mockTestSubject);

        // Call method which returns result from mock
        String result = myTestSubject.myMethod();
        System.out.println(result); // Expected Output: Hello

        // Verify method calls
        EasyMock.verify(mockTestSubject);
    }
}