package org.example;


import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.IArgumentMatcher;
import org.junit.Rule;

public class Main {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    public static void main(String[] args) {
        Main obj = new Main();
        EasyMock.reportMatcher(new IArgumentMatcher<String>() {
            @Override
            public boolean matches(String argument) {
                return argument != null && argument.length() >= 3;
            }

            @Override
            public void appendTo(StringBuffer buffer) {
                buffer.append("a String with length >= 3");
            }
        });

        System.out.println("Completed");
    }
}