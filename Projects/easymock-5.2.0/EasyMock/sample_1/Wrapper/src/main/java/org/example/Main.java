package org.example;


import org.easymock.EasyMock;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create an instance of List which we can control
        List<String> mockedList = EasyMock.createMock(List.class);

        // specify a behavior for get() method
        EasyMock.expect(mockedList.get(1)).andReturn("Item2");
        EasyMock.expect(mockedList.size()).andReturn(2);
        EasyMock.expect(mockedList.contains("Item2")).andReturn(true);

        // replay behavior
        EasyMock.replay(mockedList);

        // test the behavior
        System.out.println(mockedList.get(1)); // outputs: Item2
        System.out.println(mockedList.size()); // outputs: 2
        System.out.println(mockedList.contains("Item2")); // outputs: true

        // verify that everything recorded happened
        EasyMock.verify(mockedList);
    }
}