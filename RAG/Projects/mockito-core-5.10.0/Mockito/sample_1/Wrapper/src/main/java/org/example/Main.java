package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class Main {
    @Test
    public void exampleTest() {
        List mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.get(0)).thenReturn("hello");
        Mockito.when(mockedList.get(1)).thenReturn("world");

        System.out.println(mockedList.get(0)); // Will print "hello"
        System.out.println(mockedList.get(1)); // Will print "world"
    }
}