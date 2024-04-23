package org.example;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import java.util.Set;

public class Main {
    public static void main(String args[]){

        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forJavaClassPath())
                .setScanners(new ResourcesScanner(), new SubTypesScanner(), new TypeAnnotationsScanner()));

        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);

        for(Class<?> clazz : allClasses)
            System.out.println(clazz.getName());
    }
}