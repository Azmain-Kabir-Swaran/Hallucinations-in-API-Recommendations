package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import java.util.List;

public class Main {

    @Mock
    private List<String> mockedList;

    @Test
    public void testAdd(){
        when(mockedList.get(0)).thenReturn("First Element");
        when(mockedList.size()).thenReturn(5);
        when(mockedList.get(1)).thenThrow(new RuntimeException("Index too high"));

        assert mockedList.get(0).equals("First Element");
        assert mockedList.size() == 5;
        try{
            assert mockedList.get(1).equals("Second Element");
        }
        catch (RuntimeException e){
            assert e.getMessage().equals("Index too high");
        }
    }
}