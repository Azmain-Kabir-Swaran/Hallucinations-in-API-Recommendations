package org.example;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import java.util.List;

public class Main {
    @Mock
    private List<String> mockedList;

    public static void main(String[] args) {
        System.out.println("Running main method");
        // Code here will execute when main method runs
    }

    // Test method using @Mock List<String> mockedList
    public void testMethod() {
        System.out.println("Testing method");
        Mockito.when(mockedList.get(0)).thenReturn("hello");
        System.out.println(mockedList.get(0));
    }
}