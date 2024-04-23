package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.scanners.ResourcesScanner;
import java.lang.reflect.Modifier;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .setUrls(ClasspathHelper.forJavaClassPath()));
        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
        for (Class<?> aClass : allClasses) {
            if (!Modifier.isAbstract(aClass.getModifiers()) && aClass.getCanonicalName().startsWith("yourPackage")) {
                System.out.println(aClass.getName());
            }
        }
    }
}