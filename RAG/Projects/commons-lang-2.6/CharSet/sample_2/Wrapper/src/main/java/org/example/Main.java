package org.example;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSet;

public class Main {

    public static void main(String[] args) {

        CharSet set = new CharSet();
        set.add('A');
        set.add('B');

        String result = StringUtils.repeat("*", set.size());

        System.out.println(result);
    }
}