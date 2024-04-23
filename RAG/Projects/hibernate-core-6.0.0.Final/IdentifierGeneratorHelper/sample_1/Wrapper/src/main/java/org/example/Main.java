package org.example;


import org.hibernate.id.IdentifierGeneratorHelper;

public class Main {
    public static void main(String[] args) {
        IdentifierGeneratorHelper.INSTANCE.generate();
        // rest of your code here...
    }
}