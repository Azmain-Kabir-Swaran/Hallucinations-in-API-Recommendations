package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

public class Main {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("", new SubTypesScanner(false));
        Set<Class<? extends Object>> classes = reflections.getSubTypesOf(Object.class);
        for (Class<?> aClass : classes) {
            System.out.println(aClass.getName());
        }
    }
}