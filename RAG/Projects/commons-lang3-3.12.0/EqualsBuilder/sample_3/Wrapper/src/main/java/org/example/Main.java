package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        
        if (new EqualsBuilder().append(object1, object2).isEquals()) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}