package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("packageName", new SubTypesScanner(false));
        Set<Class<? extends Store>> classes = reflections.getSubTypesOf(Store.class);
        for (Class<? extends Store> storeClass : classes) {
            try {
                Store store = storeClass.newInstance();
                System.out.println("Opened store: " + store);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}