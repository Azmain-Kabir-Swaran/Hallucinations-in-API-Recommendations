package org.example;


import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        CharSet chars = new CharSet(null);
        boolean result = StringUtils.isBlank(null);

        System.out.println("Result: " + result);
    }
}