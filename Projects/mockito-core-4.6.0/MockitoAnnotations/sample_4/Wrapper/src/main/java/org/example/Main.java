package org.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;

public class Main {

    @Mock
    List<String> mockedList;

    @InjectMocks
    ListContainer listContainer;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMockCreation(){
        mockedList.add("one");
        mockedList.add("two");

        listContainer.setList(mockedList);

        assertTrue(listContainer.getList().contains("one"));
        assertTrue(listContainer.getList().contains("two"));
        assertEquals(2, listContainer.getList().size());
    }

}