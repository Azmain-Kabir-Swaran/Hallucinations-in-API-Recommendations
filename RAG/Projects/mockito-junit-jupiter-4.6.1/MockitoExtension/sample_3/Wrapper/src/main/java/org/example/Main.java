package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Main {

    @Mock
    private MyMockedClass myMockedClass;

    @Test
    void testMethod() {
        // your test here
    }

    static class MyMockedClass {
        // Methods for your mocked class
    }
}