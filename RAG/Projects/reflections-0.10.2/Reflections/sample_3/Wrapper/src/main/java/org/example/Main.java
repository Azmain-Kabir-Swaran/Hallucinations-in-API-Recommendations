package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // create reflection config
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forJavaClassPath())
                .filterInputsBy(new FilterBuilder().includePackage("org.reflections"))
                .setScanners(new SubTypesScanner(), new ResourcesScanner(), new TypeAnnotationsScanner()));

        // get all classes in a specific package
        Set<Class<?>> allClassesInPackage = reflections.getSubTypesOf(Object.class);
        for(Class<?> c : allClassesInPackage) {
            System.out.println(c.getName());
        }
    }
}