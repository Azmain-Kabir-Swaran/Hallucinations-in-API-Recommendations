package org.example;


import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext();
        // your code here
        context.close();
    }
}