package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class Main {
    @Mock
    List mockedList;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testMethod() {
        //using mock object - no need to mock a list here
        mockedList.add("some");
        mockedList.add("elements");
        verify(mockedList).add("some");
        verify(mockedList).add("elements");
    }
}