package org.example;


import org.easymock.EasyMock;
import java.util.List;
import java.util.ArrayList;

class Main {
    List<Integer> mockedList;

    public Main() {
        mockedList = EasyMock.createMock(List.class);
    }

    public void mockMethod(){
        EasyMock.expect(mockedList.size()).andReturn(0);
        EasyMock.expect(mockedList.get(EasyMock.isA(Integer.class))).andReturn("default");
        EasyMock.expect(mockedList.add(EasyMock.isA(Integer.class))).andReturn(true);

        EasyMock.replay(mockedList);

        mockedList.size();
        mockedList.get(1);
        mockedList.add(2);

        EasyMock.verify(mockedList);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mockMethod();
    }
}