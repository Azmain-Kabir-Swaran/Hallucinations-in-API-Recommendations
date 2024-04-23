package org.example;


import org.dom4j.DocumentException;

public class Main {

    public static void main(String[] args) {
        try {
            // Your code here...
            throw new DocumentException("This is a DocumentException");
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
    }
}