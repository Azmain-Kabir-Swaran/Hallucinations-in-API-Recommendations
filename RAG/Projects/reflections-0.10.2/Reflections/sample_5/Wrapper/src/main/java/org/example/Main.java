package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.scanners.SubTypesScanner;

public class Main {
    public static void main(String[] args) {
        Reflections reflections = new Reflections(new ConfigurationBuilder()
        .setScanners(new SubTypesScanner(false), new ResourcesScanner())
        .setUrls(ClasspathHelper.forJavaClassPath()));

        System.out.println("Classes found: " + reflections.getSubTypesOf(Object.class).size());
        for (Class<?> clazz : reflections.getSubTypesOf(Object.class)) {
            System.out.println(clazz.getName());
        }
    }
}