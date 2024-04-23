package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class Main {
    @Test
    public void testMock() {
        // You mock classes or interfaces here
        List mockedList = mock(List.class);

        // Stubbing: define behavior of the mock
        when(mockedList.size()).thenReturn(100);

        // Using mock in the test.
        mockedList.clear();

        // Following calls do nothing, since the list is mocked and did not define behavior for these calls.
        mockedList.add("some");
        mockedList.add("element");

        // Verification: check that methods were called as expected
        verify(mockedList).add("some");
        verify(mockedList).add("element");

        // Verification using stubs
        verify(mockedList, never()).add("some other element");
    }
}