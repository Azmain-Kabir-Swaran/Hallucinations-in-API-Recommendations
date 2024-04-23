package org.example;

import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {
    // Define the ExpectedException rule for verifying expected exceptions
    @Rule
    public ExpectedException exception = ExpectedException.none();

    // Define the EasyMockRule rule for testing with mocks
    @Rule
    public EasyMockRule mockingRule = new EasyMockRule(this);

    public class CustomClass {
        public String getMessage() {
            return "Hello, world!";
        }
    }

    @Test
    public void testMocking() throws Exception {
        // Create mocked instance of CustomClass
        CustomClass mockCustom = EasyMock.mock(CustomClass.class);

        // Define expected behavior of the mock
        EasyMock.expect(mockCustom.getMessage()).andReturn("Foo");

        // Replay all recorded expectations
        EasyMock.replay(mockCustom);

        // Use the mock in a test
        assert "Foo".equals(mockCustom.getMessage());

        // Verify that all recorded expectations have been met
        EasyMock.verify(mockCustom);
    }

    @Test
    public void testSystemOutPrintln() throws Exception {
        // Create a mock that we will use as System.out
        PrintStream mockOut = EasyMock.createNiceMock(PrintStream.class);

        // Define the behavior of the mock when println method is called
        EasyMock.expect(mockOut.println("Hello World")).andReturn(mockOut);

        // Tell the test what PrintStream class to use
        System.setOut(mockOut);

        // Call the method we want to test
        System.out.println("Hello World");

        // Verify that the method was called with the correct parameters
        EasyMock.verify(mockOut);
    }
}