package org.example;


import org.springframework.context.support.GenericApplicationContext;

public class Main {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();

        // Do something here using the context.
        context.refresh();
        //...

        context.close();
    }
}