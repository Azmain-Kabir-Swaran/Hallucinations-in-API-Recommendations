package org.example;


import org.apache.commons.lang.CharSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Use CharSet from commons-lang
        Set<Character> charSet = new CharSet();
        // Add some characters to the set
        charSet.add('a');
        charSet.add('b');
        charSet.add('c');
        
        // Print the size of the set
        System.out.println("Size of the set: " + charSet.size());
        
        // Other APIs can be used similarly. 
        // For example, getting the system properties:
        Properties properties = System.getProperties();
        
        // Print the size of the properties
        System.out.println("Size of the system properties: " + properties.size());
    }
}