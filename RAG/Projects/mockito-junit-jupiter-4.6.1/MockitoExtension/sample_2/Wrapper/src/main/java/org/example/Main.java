package org.example;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;

public class Main {
    public static void main(String[] args) {
        Calculator mockCalculator = Mockito.mock(Calculator.class);

        // Using mock object - in a test
        int result = mockCalculator.add(1, 2);
    }
}