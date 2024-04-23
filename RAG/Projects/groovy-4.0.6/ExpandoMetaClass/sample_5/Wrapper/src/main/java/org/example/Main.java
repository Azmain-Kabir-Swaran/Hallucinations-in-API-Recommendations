package org.example;


import groovy.lang.Expando;
import groovy.lang.GroovyObject;

public class Main {
    public static void main(String[] args) {
        Expando expando = new Expando();
        ((GroovyObject)expando).setMetaClass(new ExpandoMetaClass(expando.getClass().getName()));
        ((GroovyObject)expando).getMetaClass().setProperty(expando, "introduction", "Hello, World!");
        System.out.println((String)expando.getIntroduction());
    }
}