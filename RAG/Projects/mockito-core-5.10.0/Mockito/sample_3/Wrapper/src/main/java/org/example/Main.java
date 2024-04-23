package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class Main {

    @Test
    public void testMethod() {
        // Mock creation, with Mockito we can mock concrete classes, not just interfaces
        List<String> mockedList = mock(List.class);

        // You can mock concrete methods as well
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenReturn("second");

        // Following statement will throw because we have not mocked the size() method
        // if (mockedList.size() > 0) System.out.println(mockedList.get(0));

        // Stubbing using when() will return different results
        System.out.println(mockedList.get(0));  // returns "first"
        System.out.println(mockedList.get(1));  // returns "second"
        System.out.println(mockedList.get(2));  // returns null = defaults to null

        // Verification using verify()
        verify(mockedList).get(0);
        verify(mockedList).get(1);

        // Verification using verify() with zero, one and multiple calls to verify
        verify(mockedList, times(3)).get(anyInt());
    }
}