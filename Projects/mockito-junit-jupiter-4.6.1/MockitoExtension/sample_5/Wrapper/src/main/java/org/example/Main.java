package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Main {

    @Mock
    private List<String> mockedList;

    @Test
    void testMock() {
        Assertions.assertTrue(mockedList.isEmpty());
    }
}