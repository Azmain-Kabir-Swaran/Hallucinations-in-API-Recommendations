package org.example;


import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.easymock.IArgumentMatcher;
import java.util.List;

public class Main extends EasyMockSupport {

    public static void main(String[] args) {

        Main main = new Main();

        List<String> listMock = EasyMock.createMock(List.class);
        EasyMock.expect(listMock.add("test")).andReturn(true);
        EasyMock.expect(listMock.size()).andReturn(1);
        EasyMock.expect(listMock.get(0)).andReturn("test");
        EasyMock.replay(listMock);

        boolean result = main.useListMock(listMock);

        EasyMock.verify(listMock);

        System.out.println("Test result: " + result);
    }

    private boolean useListMock(List<String> listMock) {
        listMock.add("test");
        int size = listMock.size();
        String firstElement = listMock.get(0);

        return (size == 1) && (firstElement.equals("test"));
    }
}