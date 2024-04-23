package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class Main {

    @Mock
    private List<String> mockedList;

    @InjectMocks
    private YourClass yourClass;

    @Test
    void test() {
        when(mockedList.contains("two")).thenReturn(true);
        assertTrue(yourClass.checkIfListContainsElement(mockedList, "two"));
    }

    static class YourClass {
        public boolean checkIfListContainsElement(List<String> list, String element) {
            return list.contains(element);
        }
    }
}